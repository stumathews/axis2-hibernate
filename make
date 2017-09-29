#!/bin/bash

rm -Rf build/
rm ../../repository/services/StuartMathewsService.aar
#cp *.xml build/classes
ant generate.service
ctags -R src/

