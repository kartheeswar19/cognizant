# Exercise 1: Logging Error Messages and Warning Levels

## Objective
This exercise demonstrates basic logging with SLF4J and Logback in a Java application.

## What is SLF4J?
SLF4J (Simple Logging Facade for Java) is an abstraction layer for logging in Java applications.

## What is Logback?
Logback is a concrete logging implementation commonly used with SLF4J.

## Difference between ERROR and WARN
- ERROR: Used for serious problems that need attention.
- WARN: Used for potentially harmful situations that are not as severe as errors.

## Project structure
- src/main/java/com/example/LoggingExample.java: Contains the logger and main method.
- src/main/resources/logback.xml: Configures Logback output.
- src/test/java/com/example/LoggingExampleTest.java: Verifies the class can run.

## How to run the application
Run the following command from the project folder:

mvn exec:java -Dexec.mainClass=com.example.LoggingExample

## Expected console output
ERROR com.example.LoggingExample - This is an error message

WARN com.example.LoggingExample - This is a warning message
