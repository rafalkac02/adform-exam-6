# Challenge #6

Table of contents
1. [About The Project](#about-the-project)
    - [Adform's exam](#adforms-exam)
    - [Project description](#project-description)
2. [Getting Started](#getting-started)
3. [Usage](#usage)
4. [Troubleshooting](#troubleshooting)


## About the Project

### Adform's exam
This project is a part of a final exam after 3-months of Scala Academy at [Adform](https://site.adform.com/). The exam consists of 7 exercises. You can navigate to them in Exam TOC below.

<details>
  <summary>Exam TOC</summary>

1. [Challenge #1](https://github.com/rafalkac02/adform-exam-1)
2. [Challenge #2](https://github.com/rafalkac02/adform-exam-2)
3. [Challenge #3](https://github.com/rafalkac02/adform-exam-3)
4. [Challenge #4](https://github.com/rafalkac02/adform-exam-4)
5. [Challenge #5](https://github.com/rafalkac02/adform-exam-5)
6. [Challenge #6](https://github.com/rafalkac02/adform-exam-6)
7. [Challenge #7](https://github.com/rafalkac02/adform-exam-7)
</details>

### Project description
Task description
```text
Write a program that reads a file, transforms it and saves the results to another file.
The file contains in each line key-value pair where key is a number of type Long and value is number of type Double.
Transformation is called normalization. The transformation must scale all values to fit the [-1; 1] interval. Where max is 1, min -1. The output file must preserve the input file’s key-value order. The file can contain billions of rows and may not fit in memory. For sample values: [1000.0, 2000.0, 100.0, 10000.0] the result is: [-0.818182, -0.616162, -1, 1]
normalization expression: ((x - min) * 2 / (max - min)) - 1
⚠️ Important: only pure scala is allowed ⚠️
- Expected results
- Publish code to a github repo
- Don’t forget about README with proper structure

```

## Getting Started
The project is built with:
- Scala
- sbt

## Usage
- Clone the repository to the chosen directory with `git clone https://github.com/rafalkac02/adform-exam-6` command.
- Run the application with `sbt run <args(0)> <args(1)> <args(2)> ` command in the same directory
- Test the application with `sbt test` command

## Troubleshooting
- Make sure that your project does not contain outdated project files using:
```
sbt clean
```
- Make sure that your environment variables are set properly, including `JAVA_HOME`
