package oops3;

public class AWSCloudProvider implements CloudProvider {
    @Override
    public void uploadBlob(String filename) {
        System.out.println("Calling AWS API, using s3 bucket ---> ");
        System.out.println(" --- Initiating upload --- ");
        System.out.println("Uploading the file to " + filename);
        System.out.println("Upload successful");
    }
}
