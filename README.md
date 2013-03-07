The BPEL Portability Profile 
===

A tool for detecting portability issues in BPEL code


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
$ gradlew run -Pargs="src/main/test/language-features/basic-activities/Assign-Empty.bpel" # Checking a process definition from the test directory 
$ gradlew run -Pargs="src/main/test/language-features/" # Checking all process definitions in the test directory 

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
In the root directory, two csv files are written with aggregated results and several metrics for all process defintions analysed.
- results.csv (values separated with semicolon, preferred by MS Office)
- r-results.csv (values separated with comma, preferred by R)

## Project Structure

    src/main/tests/ # the bpel files used for checking correctness of the test assertions
    src/main/java # the main source code
    src/main/resources/ # xsds for WS-I profiles
    src/main/generated # Java classes generated from the WS-I xsds

# Authors 

[Joerg Lenhard](http://www.uni-bamberg.de/pi/team/lenhard-joerg/)

# Contribution Guide

- Fork
- Send Pull Request