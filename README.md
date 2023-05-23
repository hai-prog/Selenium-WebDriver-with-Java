# Selenium TestNG Maven the-internet Project

This project is a Selenium automation script for testing the functionality of the "the-internet" website (https://the-internet.herokuapp.com/). It is developed using Java programming language and follows the Page Object Model (POM) design pattern. TestNG testing framework and Maven build tool are used for project management.

## Table of Contents
- [Project Overview](#project-overview)
- [Requirements](#requirements)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)

## Project Overview
The "the-internet" website is a test website that provides various scenarios to practice web automation using Selenium. This project demonstrates how to automate different tasks on the website using Selenium with Java and follows the Page Object Model design pattern. It utilizes the TestNG testing framework for test execution and Maven for dependency management and project configuration.

The main objective of this project is to provide a reference implementation of Selenium automation with TestNG and Maven, following the Page Object Model (POM) design pattern. It showcases how to organize and structure your automation code using page classes, improving code maintainability, reusability, and readability.
## Requirements
To run this project, you need to have the following requirements installed on your system:
- Java Development Kit (JDK) (version 8 or higher)
- Selenium Java dependancy
- TestNG dependancy
- Maven build tool

## Installation
1. Clone the project repository to your local machine:
 git clone https://github.com/your-username/selenium-automationexercise.git
 
2. Import the project into your preferred Java IDE (e.g., Eclipse, IntelliJ IDEA).

3. Configure the Selenium Java in your project:
- Add the Selenium Java library to your project's classpath.


## Project Structure
The project structure is organized as follows:

- The `pages` directory contains the page classes corresponding to each web page in the AutomationExercise website. Each page class encapsulates the elements and actions related to a specific page.
- The `tests` directory contains separate packages for different test scenarios:
  - The `frames` package contains test scripts related to login functionality.
  - The `hover` package contains test scripts related to registration functionality.
  - The `login` package contains test scripts related to product-related functionality.
  - etc..
- The `utils` directory contains utility classes, such as `WebDriverUtils.java`, which provides common methods and functions related to the WebDriver setup and configuration.
