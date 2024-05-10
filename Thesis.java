public class Thesis implements LibraryResource {
    private String thesisTitle;

    public Thesis(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
        public void borrowResource(Student student) {
            System.out.println(thesisTitle + " has been borrowed by " + 
                                "\nName: " + student.getFirstName() + " " + student.getLastName() + 
                                "\nStudent ID: " + student.getStudentNo() + 
                                "\nProgram: " + student.getProgram());
    }
}