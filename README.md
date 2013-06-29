The BPEL Portability Profile 
===

A tool for detecting portability issues in BPEL code. The tool has been used in this revision for an analysis of the portability characteristics of the code produced by several model-driven development approaches. The results of this analysis have been published at the [25th International Conference on Software Engineering and Knowledge Engineering](http://www.ksi.edu/seke/seke13.html). The paper is available [here](http://www.uni-bamberg.de/pi/bereich/forschung/publikationen/13-03-lenhard-wirtz/). The code analyzed is available in this repository under `src/main/resources/mappings`. To replicate the results, checkout the tool and run the command `gradlew run -Pargs="src/main/resources/mappings`.

[![Build Status](https://travis-ci.org/uniba-dsg/bpp.png)](https://travis-ci.org/uniba-dsg/bpp)

## Software Requirements
- JDK 1.7.X
  - `JAVA_HOME` should point to the jdk directory
  - `PATH` should include `JAVA_HOME/bin`

## Licensing
LGPL Version 3: http://www.gnu.org/licenses/lgpl-3.0.html

## Usage

```bash
$ gradlew run -Pargs="<ARGS>"

# usage: <path-to-files>

# Examples
$ gradlew run -Pargs="src/main/resources/language-features/basic-activities/Assign-Empty.bpel" # Checking a process definition from the test directory 
$ gradlew run -Pargs="src/main/resources/language-features/" # Checking all process definitions in the test directory 

# Utility gradle tasks
$ gradlew profile # Generates the profile document containing the test assertions
$ gradlew latex # Generates a tex file with latex tables for all test assertions

# Generate project files 
$ gradlew idea # Generates Intellij IDEA project files
$ gradlew eclipse # Generates Eclipse project files
```

## Output

For each file that is checked, the tool produces a report named BPEL_FILE_NAME-report.xml in the same directory.
This file follows the WS-I report schema.
In the root directory, two csv files are written with aggregated results and several metrics for all process definitions analyzed.
- results.csv (values separated with semicolon, preferred by MS Office)
- r-results.csv (values separated with comma, preferred by R)

## Project Structure

    src/main/java # the main source code
    src/main/resources/ # xsds for WS-I profiles and BPEL files for checking the correctness of test assertions
    src/main/generated # Java classes generated from the WS-I xsds
    src/test/java # JUnit tests for testing assertions 

# Authors 

[Joerg Lenhard](http://www.uni-bamberg.de/pi/team/lenhard-joerg/)

# Contribution Guide

- Fork
- Send Pull Request
