public class TestProgram {
    public static void main(String[] args) {
        Library library= new Library();
        Student student = new Student("12-34567-890" , "Toquero", "Angelica" , "BSCS");
        

        LibraryResource book = new Book("Introduction to Object Oriented Programming");
        LibraryResource capstone = new Capstone("E-Learning System");
        LibraryResource internetAccess = new InternetAccess("NEU Admin");
        LibraryResource journal = new Journal("Research Journal");
        LibraryResource newspaper = new Newspaper("The Philippine Star");
        LibraryResource thesis = new Thesis("Household Mobile Robot");
       
        library.borrowResource(student, book);
        library.borrowResource(student, capstone);
        library.borrowResource(student, internetAccess);
        library.borrowResource(student, journal);
        library.borrowResource(student, newspaper);
        library.borrowResource(student, thesis);
    }
}