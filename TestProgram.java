public class TestProgram {
    public static void main(String[] args) {
       
        Student student = new Student("22-10329-294" , "Toquero", "Angelica" , "BSCS");

        LibraryResource book = new Book("Introduction to Object Oriented Programming");
        student.borrowResource(book);

        LibraryResource thesis = new Thesis("Household Mobile Robot");
        student.borrowResource(thesis);

        LibraryResource capstone = new Capstone("E-Learning System");
        student.borrowResource(capstone);

        LibraryResource internetAccess = new InternetAccess("NEU Admin");
        student.borrowResource(internetAccess);

        LibraryResource journal = new Journal("Research Journal");
        student.borrowResource(journal);

        LibraryResource newspaper = new Newspaper("The Philippine Star");
        student.borrowResource(newspaper);
    }
}