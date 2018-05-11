# Basic Spring Concepts

This sample shows the basics of how the Spring Framework gives us testable code that encourages Cohesion principles and Dependancy Abstraction

## Concepts Demonstrated

The application has an Order Service. The Repository that backs the service can change it's implementations by simply setting a different profile when running the application.

- Spring provides an easy way to set up dependancies based on Profiles
- Spring allows for Interface to be "injected" as dependancies, this makes it easy to change implementations
- The Application Context creates all references and their dependancies for us
- Dependancies can be supplied when references are constructed
- An Application Context can run in JUnit, Profiles can be set in Tests to "wire" in different dependancies

## What this means for Testing?

- Due to the ease in which dependancies can be changed, its easy to Mock out different services when testing
