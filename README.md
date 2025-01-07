
# Multithreading in Java

### A simple project demonstrating multithreading concepts in Java.

## Table of Contents
- [Project Description](#project-description)
- [Features](#features)
- [Installation](#installation)
- [How to Run](#how-to-run)
- [Dependencies](#dependencies)
- [Notes](#notes)


## Project Description
This project serves as a hands-on example to understand how multithreading works in Java. It illustrates basic thread creation using the `Runnable` interface and demonstrates key concepts like thread execution and lifecycle. The `MultithreadThing` class implements the `Runnable` interface, and the `Main` class creates and starts a thread using it.

## Features
- Creation of threads using the `Runnable` interface.
- Basic demonstration of thread execution and thread lifecycle.
- Example of using `Thread.sleep()` for pausing thread execution.
- Clear and concise code for educational purposes.

## Installation

1.  **Clone the Repository:**
    ```bash
    git clone https://github.com/cankurttekin/multithreading-in-java.git
    cd multithreading-in-java/thread-creation
    ```
2.  **Ensure you have Java installed:** This project requires Java 22. You can download it from [Oracle's website](https://www.oracle.com/java/technologies/downloads/). Verify your installation by running:
    ```bash
    java -version
    ```
3.  **Ensure you have Maven installed:** This project uses Maven for build automation. You can download it from [Maven's website](https://maven.apache.org/download.cgi). Verify your installation by running:
     ```bash
     mvn -v
     ```

## How to Run

1. **Navigate to the project root directory:**
   ```bash
   cd thread-creation
   ```

2. **Build the project:**
   ```bash
   mvn clean install
   ```

3. **Run the application:**
    ```bash
    mvn exec:java -Dexec.mainClass="org.example.Main"
    ```
   This command compiles and runs the main class which will output if the thread is alive before and after the start and thread name with a number between 0-9 in the console.

## Dependencies
-   **Java Development Kit (JDK) 22:** The core platform for running the project.
-   **Apache Maven:** Used for project building and dependency management.

## Notes

A thread is the smallest unit of execution within a process.
Multithreading in Java app enables performing multiple tasks simultaneously.

=> Thread Class and Runnable Interface
Thread Class: can be created by extending Thread class and overriding its run method. Run method defines thread's task.
Runable Interface: Runnable interface can be implemented and pass an instance of the implenting class to a Thread object.
'''Thread t1 = new Thread(new MyRunnable());'''

Thread's Lifecycle
New: Created but not started yet
Runnable: Ready to run and waiting for CPU time
Blocked: Waiting to acquire a lock or resource
Waiting: Waiting indefinetly for another thread to perform a particular task
Timed Waiting: Waiting for a specific period of time
Terminated: Completed execution or terminated due to an exception

Synchronization

Concurrency

Communication


