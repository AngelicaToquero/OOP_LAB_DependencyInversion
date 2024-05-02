public class InternetAccess implements LibraryResource {
    @Override
    public void borrow() {
        System.out.println("Internet access has been granted to a student.");
    }
}