# Lab 4: Collections, Performance, and Immutability

## Description & Objectives
This repository contains solutions for Java Lab 4. The objectives are to explore collection benchmarking, safe collection iteration, map modifications, unmodifiable wrappers, and immutable class design using JUnit 5 test suites.

## Structure & Tasks Completed
* **StringPerformance**: Measures `String` vs `StringBuilder` runtime performance.
* **CourseManager**: Demonstrates safe element removal using `Iterator.remove()`.
* **TreasureMap**: Performs safe update and lookup operations on Java `Map` keys.
* **Zoo**: Demonstrates read-only list encapsulation using `Collections.unmodifiableList()`.
* **StudentDirectory**: Encapsulates student IDs using an unmodifiable `Set` wrapper.
* **Point**: Implements a fully immutable 2D coordinate class using `final` fields and defensive copying (`moveBy`).

## How to Run Code and Tests

### Running the Application
1. Open the project in NetBeans (or any Java IDE).
2. Right-click `Main.java` in `src/main/java/lab4/`.
3. Select **Run File** (`Shift + F6`).

### Running the JUnit Tests
1. In the **Projects** tab, locate the `Test Packages` directory (`src/test/java/lab4/`).
2. Right-click the `lab4` package under `Test Packages` (or any individual test file like `StudentDirectoryTest.java`).
3. Select **Test Package** or **Test File** (`Alt + F6`).
4. View the green **100% Passed** results in the NetBeans **Test Results** window.
