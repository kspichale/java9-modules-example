#!/bin/sh

javac -d out/module.api/ --source-path module.api/src/  $(find module.api/src -name '*.java')
javac -d out/module.mysql/ --module-path out/  --source-path module.mysql/src/  $(find module.mysql/src/ -name '*.java')
javac -d out/module.client/ --module-path out/  --source-path module.client/src/  $(find module.client/src/ -name '*.java')