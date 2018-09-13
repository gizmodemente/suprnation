# Suprnation triangle minimal Path 

This project has been created by Fernando de Los Ríos in order to give a solution to the suprnation technical challenge. This solution has been performed using Scala as programming language an sbt as build tool.

## Getting Started

### Prerequisites

In order to build and run the project, you need a computer with Scala and sbt installed. You can check this using the following commands:

```
> scala -version
> sbt about
```

### Installing

To run this project only needs clone this repository:

```
https://github.com/gizmodemente/suprnation.git
```

Then enter to project folder an build the package:

```
sbt package
```

In the _target/scala-2.12_ directory inside the project folder, you can find the file .jar to execute with:

```
scala suprnation_2.12-0.1.jar
```

If you have a file with Input data the command must be like this:

```
cat data.txt |scala suprnation_2.12-0.1.jar

```

The normal output of this program is something like this:

```
Minimal path is: 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 = 20
```


## Running the tests

To run the project tests only needs execute the command:

```
sbt test
```

### Testing services

Two services has been implemented to solve the challenge. 

The first one is the service that have to read the data from an Input source and validate this data. The related test to this service validate different inputs in order to enter in calculation or fail for bad input.

The second service calculate the minimal path and return it. The related test check this functionality and one extra test has been added for load testing.

## Author

* **Fernando de los Rios Fernandez** 