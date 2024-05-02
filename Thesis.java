public class Thesis implements LibraryResource {
    private String thesistitle;

    public Thesis(String thesistitle) {
        this.thesistitle = thesistitle;
    }

    @Override
    public void borrow() {
        System.out.println(thesistitle + " has been borrowed by a student.");
    }
}