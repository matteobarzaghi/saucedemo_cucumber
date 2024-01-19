Saucedemo Cucumber Jenkins Project
Overview
This project is a test automation framework using Selenium WebDriver, Cucumber, and Maven. It's designed to automate tests for web applications, specifically for the Saucedemo website.

Prerequisites
Java (Version 8 or higher)
Maven
Git
Chrome Browser
Project Structure
src/test/java
actions: Contains classes for user actions.
driver: WebDriver setup and management.
runner: Cucumber test runner classes.
stepdefinitions: Step definitions for Cucumber.
src/test/resources
features: Cucumber feature files describing test scenarios.
lib
chromedriver.exe: ChromeDriver for Selenium tests.
pom.xml: Maven Project Object Model file for dependencies and configurations.
Setup
Clone the repository.
Ensure Chrome is installed and chromedriver.exe is compatible with your Chrome version.
Run mvn clean install to install dependencies.
Running Tests
Execute tests using Maven:

bash
Copy code
mvn test
Or, run the Cucumber test runner class from your IDE.
