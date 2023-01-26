#!/bin/bash
javac testsamevalues/*.java
for i in {1..500000}
do
   echo $i
   echo `java testsamevalues.TestSameValues $i` >> output.csv
done 

exit
