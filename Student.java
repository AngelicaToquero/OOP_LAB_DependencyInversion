public class Student {
    private String studentNo;
    private String lastName;
    private String firstName;
    private String program;

    public Student(String studentNo, String lastName, String firstName,  String program) {
        this.studentNo = studentNo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.program = program;
    }
    

    public String getProgram() {
        return program;
    }

    public String getStudentNo() {
        return studentNo;
    }
    
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void borrowResource(LibraryResource resource) {
     resource.borrow();
    }


}
