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