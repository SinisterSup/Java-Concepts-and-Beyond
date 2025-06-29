# Library Management System

This is a simple console-based Library Management System built in Java. This project serves as a practical exercise for learning and applying fundamental Object-Oriented Programming (OOP) concepts.

## Features

* **Book Management:** Manage different types of books (`NovelBook`, `TextBook`).
* **User Management:** Register and manage different types of users (`Member`, `Librarian`).
* **Borrowing & Returning:** Simulate the lending and returning of books.
* **Unique ID Generation:** Each user is assigned a unique ID upon creation.
* **Abstraction:** The `Book` and `User` classes are abstract, providing a blueprint for their subclasses.
* **Inheritance:** `NovelBook` and `TextBook` inherit from `Book`, and `Member` and `Librarian` inherit from `User`.
* **Polymorphism:** Methods like `displayDashboard()` and `displayBookDetails()` are overridden in subclasses to provide specific behaviors.
* **Interfaces:** The `Lendable` interface defines the behavior for items that can be borrowed.

-----------------------------------------------

## To-Do: Milestone C

The following features are planned for implementation to enhance the system:

* **Set Up Collections:** Implement `bookInventory` and `registeredUsers` collections in `LibraryManagementSystem` to manage data.
* **Implement Search Functionality:** Add methods to search for books by title, author, or type.
* **Integrate Book and User Management:** Implement logic to add books and register users in the `Main` class.
* **Demonstrate Lending Functionality:** Add logic to handle various lending scenarios, such as when a book is already borrowed or a user exceeds their limit.
* **Manage Returns:** Implement the functionality to return a book and update its availability status.
* **Advanced Features:** Add methods to display all books and users, and demonstrate the search functionality.