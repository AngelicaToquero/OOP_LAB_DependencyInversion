public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("12-34567-890", "Toquero", "Angelica", "BSCS");

        LibraryResource[] resources = {
                new Book("Introduction to Object Oriented Programming"),
                new Capstone("E-Learning System"),
                new InternetAccess("NEU Admin"),
                new Journal("Research Journal"),
                new Newspaper("The Philippine Star"),
                new Thesis("Household Mobile Robot")
        };

        for (LibraryResource resource : resources) {
            Library library = new Library(resource);
            library.borrowResource(student);
        }
    }
}