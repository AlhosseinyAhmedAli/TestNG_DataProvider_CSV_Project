# TestNG_DataProvider_CSV_Project
Project Overview
This project demonstrates how to use **TestNG** with a **DataProvider** that reads data from a CSV file.
It supports **parallel test execution** and is designed to be **reusable** across multiple test classes.

---

## Project Structure
```
TestNG_DataProvider_CSV_Project/
│
├── pom.xml                # Maven project configuration
├── testng.xml             # TestNG suite configuration
│
└── src/
    ├── main/
    │    └── java/          # (Empty for now, main application code would go here)
    │
    └── test/
         ├── java/          # Test source code
         │    ├── dataproviders/
         │    │     └── CSVDataProvider.java
         │    └── tests/
         │          └── LoginTest.java
         │
         └── resources/     # Test data and other resources
               └── loginData.csv
