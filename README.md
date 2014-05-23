The BPEL Portability Profile 
===

A tool for detecting portability issues in BPEL code

[![Build Status](https://travis-ci.org/uniba-dsg/bpp.png)](https://travis-ci.org/uniba-dsg/bpp)

## Software Requirements
bpp is tested for support on JDK 1.8.X
- `JAVA_HOME` should point to the jdk directory
- `PATH` should include `JAVA_HOME/bin`

## Licensing
LGPL Version 3: http://www.gnu.org/licenses/lgpl-3.0.html

## Usage

### Portability Analysis
bpp executes in the context of gradle build.
To perform a portability analysis of a BPEL process or all of the processes located in a certain directory, just point bpp to that path using `gradlew run`.
```bash
$ gradlew run -Pargs="<ARGS>"

# usage: <path-to-files>

# Examples
$ gradlew run -Pargs="src/main/resources/language-features/basic-activities/Assign-Empty.bpel" # Checking a process definition from the test directory 
$ gradlew run -Pargs="src/main/resources/language-features/" # Checking all process definitions in the test directory 

# If you use the strict (-s) option, the tool will only parse files with the http://docs.oasis-open.org/wsbpel/2.0/process/executable namespace
$ gradlew run -Pargs="src/main/resources/language-features/ -s" # Checking all process definitions with the proper BPEL namespace in the test directory 
````
### Utility Tasks
bpp also provides several utility tasks you can execute
```bash
# Utility gradle tasks
$ gradlew profile # Generates the profile document containing the test assertions
$ gradlew latex # Generates a tex file with latex tables for all test assertions
$ gradlew jar # Builds an executable jar from the source to be found in `/build/libs`

# Generate project files 
$ gradlew idea # Generates Intellij IDEA project files
$ gradlew eclipse # Generates Eclipse project files
```

## Output

For each file that is checked, the tool produces a report named `BPEL_FILE_NAME-report.xml` in the same directory.
This file follows the WS-I report schema.
In the root directory, two `csv` files are written with aggregated results and several metrics for all process definitions analyzed.
- `results.csv` (values separated with semicolon, preferred by MS Office)
- `r-results.csv` (values separated with comma, preferred by R)

Example of a report file:
```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<report xmlns="http://www.ws-i.org/testing/2009/03/report/" name="BPEL Portability Profile Test Report" timestamp="2014-05-23T09:48:57.905+02:00">
    <analyzer>
        <profile>
            <name>BPEL Portability Profile 1.0</name>
            <revision>$Revision: 1.0 $</revision>
            <implementer name="Distributed Systems Group" location="http://www.uni-bamberg.de/en/pi"/>
        </profile>
        <environment>
            <operatingSystem name="Windows 7" version="6.1"/>
            <xmlParser name="JAXB" version="2.0"/>
        </environment>
        <analyzerEngine>
            <analyzerVersion>V1.0</analyzerVersion>
            <releaseDate>2012-11-22+01:00</releaseDate>
            <implementer name="Distributed Systems Group" location="http://www.uni-bamberg.de/en/pi"/>
            <xpathVersion>2.0</xpathVersion>
            <xsltEngine name="Saxon He" version="9.5.1-5"/>
            <generationTimestamp>2014-05-23T09:48:57.905+02:00</generationTimestamp>
        </analyzerEngine>
        <runConfig>
            <timestamp>2014-05-23T09:48:57.905+02:00</timestamp>
            <xsltEngine name="Saxon He" version="9.5.1-5"/>
            <docSource timestamp="2014-01-21T15:51:48.629+01:00">Assign-Empty.bpel</docSource>
            <comments>no comments</comments>
        </runConfig>
    </analyzer>
    <artifact type="message">
        <entry referenceID="Assign-Empty.bpel">
            <assertionResult id="bpp-r3-1" prescription="permitted" result="warning">
                <failureMessage xml:lang="en">The process definition uses the empty variant for a from-spec in a &lt;copy&gt; construct</failureMessage>
                <failureDetail xml:lang="en">Portability level nonportable, Degree: 9: Warning in line 20</failureDetail>
            </assertionResult>
            <assertionResult id="bpp-r3-2" prescription="permitted" result="warning">
                <failureMessage xml:lang="en">The process definition uses the empty variant for a to-spec in a &lt;copy&gt; construct.</failureMessage>
                <failureDetail xml:lang="en">Portability level nonportable, Degree: 9: Warning in line 21</failureDetail>
            </assertionResult>
            <assertionResult id="bpp-r1" prescription="permitted" result="passed"/>
            <assertionResult id="bpp-r2" prescription="permitted" result="passed"/>
            ...
            </entry>
    </artifact>
</report>
```

## Project Structure

    src/main/java # the main source code
    src/main/resources/ # xsds for WS-I profiles and BPEL files for checking the correctness of test assertions
    src/main/generated # Java classes generated from the WS-I xsds
    src/test/java # JUnit tests 

# Authors 

[Joerg Lenhard](http://www.uni-bamberg.de/pi/team/lenhard-joerg/)

# Contribution Guide

- Fork
- Send Pull Request
