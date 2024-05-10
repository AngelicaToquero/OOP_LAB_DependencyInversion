# OOP_LAB_DependencyInversion
The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

Create a repository in your GitHub account. Put your solution there. In the readMe file must include the problem statement, UML Class Diagram of Proposed solution.

Make sure you have a TestProgram that will validate the proposed refactored codes.


UML Class Diagram 

![OOP](https://github.com/AngelicaToquero/OOP_LAB_DependencyInversion/assets/152822754/9d72337f-6d52-4375-bf38-e8579f9f8f27)

