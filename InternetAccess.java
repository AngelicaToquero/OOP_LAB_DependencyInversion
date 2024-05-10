public class InternetAccess implements LibraryResource {
    private String internetaccessName;

    public InternetAccess(String internetaccessName) {
        this.internetaccessName = internetaccessName;
    }

    @Override
    public void borrowResource(Student student) {
        System.out.println(internetaccessName + " has been granted by " + 
                            "\nName: " + student.getFirstName() + " " + student.getLastName() + 
                            "\nStudent ID: " + student.getStudentNo() + 
                            "\nProgram: " + student.getProgram());
    }
}