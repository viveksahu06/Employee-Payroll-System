Project Name: Employee Payroll Management System

Project Description:
The Employee Payroll Management System is a Java-based program that demonstrates key Object-Oriented Programming (OOP) concepts such as inheritance, abstraction, encapsulation, and polymorphism to manage different types of employees and their payroll information.

Classes and their Responsibilities:

Employee (Abstract Class):

Represents the base class for all types of employees.
Contains data members for name and ID.
Defines an abstract method calculateSalary() that must be implemented by its subclasses.
Overrides the toString() method to provide a string representation of employee details.
FullTimeEmployee (Subclass of Employee):

Extends the Employee class to represent full-time employees.
Includes a monthly salary data member.
Implements the calculateSalary() method to calculate the salary for full-time employees based on their monthly salary.
PartTimeEmployee (Subclass of Employee):

Extends the Employee class to represent part-time employees.
Includes data members for hours worked and hourly rate.
Implements the calculateSalary() method to calculate the salary for part-time employees based on hours worked and hourly rate.
PayrollSystem:

Manages a list of Employee objects using an ArrayList.
Provides methods to add and remove employees from the list.
Offers a method to display the details of all employees in the list.
Key OOP Concepts Demonstrated:

Inheritance: The FullTimeEmployee and PartTimeEmployee classes inherit properties and methods from the base Employee class, promoting code reusability and structuring the employee hierarchy.

Abstraction: The Employee class defines an abstract method, forcing its subclasses to provide concrete implementations. This enforces the concept of abstraction where only the essential details are defined in the base class.

Encapsulation: The Employee class encapsulates data members (name and ID) by making them private and provides public getter methods to access them. This protects the data from unauthorized access.

Polymorphism: The calculateSalary() method is overridden in the FullTimeEmployee and PartTimeEmployee classes, demonstrating method overriding and polymorphism. The appropriate calculateSalary() method is called depending on the object's type.

Usage in the Main Class:

Create instances of FullTimeEmployee and PartTimeEmployee with specific details.
Add these employee instances to the PayrollSystem.
Display the initial employee details using displayEmployee().
Remove an employee using the removeEmployee() method.
Display the updated employee list.
Benefits:

The project demonstrates how to model real-world scenarios using OOP concepts, making the code more organized and maintainable.
It allows for easy extension of employee types by creating new subclasses.
The encapsulation of data members ensures data integrity and security.
