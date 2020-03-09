import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobContainerClientBuilder;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.models.BlobItem;
import com.azure.storage.blob.models.ListBlobsOptions;

public class testWasb {


    public static void main(String[] args) {
    	String accountNameStr = "accountNameStr";
    	String sasStr = "sasStr";
    	String containerNameStr = "containerNameStr"
        String connectStr = "https://"+ accountNameStr +".blob.core.windows.net/" + containerNameStr + sasStr;
        
        BlobContainerClient containerClient = new BlobContainerClientBuilder().endpoint(connectStr).buildClient();
        for (BlobItem blobItem : containerClient.listBlobsByHierarchy("TestDir/")) {
            System.out.println("\t" + blobItem.getName() +
                    "\t" + blobItem.isPrefix());
        }


    }

}
