Project Overview

PageAutomate1 is a Java-based Selenium Test Automation framework designed using the Page Object Model (POM) approach.
The framework is built to automate web application test cases such as Login, Registration validations with scalability and maintainability in mind.

This project demonstrates industry-standard automation practices including:
Page Object Model (POM)
TestNG test management
Maven dependency management
Reusable utilities and base setup

Tech Stack:-
Language: Java
Automation Tool: Selenium WebDriver
Test Framework: TestNG
Build Tool: Maven
IDE: Eclipse / VS Code
Version Control: Git & GitHub

PageAutomate1
│
├── src/main/java
│   └── wiz/web/qa
│       ├── base        → WebDriver initialization & setup
│       ├── config      → Configuration handling
│       ├── pages       → Page classes (POM)
│       └── utils       → Utility/helper methods
│
├── src/test/java
│   └── wiz/web/qa/testcases
│       ├── LoginPageTest.java
│       ├── RegisterPageTest.java
│       └── HomePage.java
│
├── src/test/resources
│
├── pom.xml             → Maven dependencies
├── testng.xml          → TestNG execution file
└── README.md

Key Features:-
Page Object Model (POM) for better readability and reusability
Centralized WebDriver setup
Test execution using TestNG
Easy test execution using testng.xml
Scalable structure to add more test cases and pages
Clean separation of test logic and page logic

How to Run the Tests:-
Prerequisites
Java JDK (21 or above)
Maven installed
Chrome browser
IDE (Eclipse / VS Code)

Steps:-
Clone the repository:
git clone https://github.com/harshit03-12/DemoProject.git
Navigate to project directory:
cd DemoProject
Run tests using Maven:
mvn test

Test Coverage:- 
basics of-
Login functionality
User registration flow

Author
Harshit Gupta
Senior QA Engineer
🔗 GitHub: https://github.com/harshit03-12
