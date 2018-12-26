# quickTests
Creates small programming environments, ideal for quick tests.

## About
* Make a 'Hello World!' program in various languages with a single command.
* Language templates can be added/modified in the 'src' folder.
* Optional second parameter sets your test's folder name.
* Ideal for testing small functionalities/behaviours fast.
* Set up a project in seconds. Save time, profit!

## Supporting new languages
Each supported language is a folder that lives under the 'src' folder, with its:
- start.sh (optional)
- run.sh (optional)
- main code file(s)

## Install it
- use fish
- git clone https://github.com/miguelPerezOntiveros/quickTests.git
- have 'sublime' set up as a command and for html tests, 'live-server' as well

## Use it
- cd to the folder where you clones, and then:
```
source test html
source test c
source test php
source test cpp
source test java myFirstName
source test java
```