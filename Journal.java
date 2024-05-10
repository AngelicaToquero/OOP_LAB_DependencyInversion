public class Journal implements LibraryResource {
    private String journalTitle;

    public Journal(String journalTitle) {
        this.journalTitle = journalTitle;
    }

    @Override
        public void borrowResource(Student student) {
            System.out.println(journalTitle + " has been borrowed by " + 
                                "\nName: " + student.getFirstName() + " " + student.getLastName() + 
                                "\nStudent ID: " + student.getStudentNo() + 
                                "\nProgram: " + student.getProgram());
    }
}