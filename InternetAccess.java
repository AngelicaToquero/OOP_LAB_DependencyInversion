public class InternetAccess implements LibraryResource {
    private String internetaccessName;

    public InternetAccess(String internetaccessName) {
        this.internetaccessName = internetaccessName;
    }

    @Override
    public void borrow() {
        System.out.println(internetaccessName + " has been granted by a student.");
    }
}