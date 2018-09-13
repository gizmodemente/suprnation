# Suprnation triangle minimal Path 

This project has been created by Fernando de Los Ríos in order to give a solution to the suprnation technical challenge. This solution has been performed using Scala as programming language an sbt as build tool.

## Repository structure

In this repository you can find the final solution merged in master branch, and also you can find two branches with the work performed in this challenge.

In the fancyWay branch I tried to solve the challenge using a structure with options parameter and tail recursion, but the solution have performance and memory issues. I leave this branch in the repository only for showing the previous job before to reach a acceptable solution.

In the listWay branch, you can find the same solution that I merged to master. This solution take advantage of arithmetical properties to work directly over the lists and avoid the performance issues. This solution meet the requested load requirement and can be work with more than 500 rows (load tests has been included) 

## Solution design

If you look the packaging of this project, you can note that I segregate the domain (model an operation definitions) and infrastructure (implementation). This way to manage the packages in the project follow the principles of hexagonal architecture, an advanced way of n-layer design paradigm used in domain driven design.

The main advantage of this architecture is maintain the domain isolated and only change implementations and api's packages. Maybe in a small project like this it's hard to show the advantages but if you compare the different branches you can find that the package domain don't need to change when implementations changes and this can be useful in more complex domains to maintain a clean code.

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