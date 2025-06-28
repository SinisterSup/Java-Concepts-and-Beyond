package oops3;

public class UploadService {
    CloudProvider myCloudProvider;

    public UploadService(CloudProvider cloudProvider) {
        this.myCloudProvider = cloudProvider;
    }
    public void handleFileUpload(String filename) {
        myCloudProvider.uploadBlob(filename);
    }
}
