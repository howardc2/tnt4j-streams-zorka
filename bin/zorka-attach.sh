#! /bin/bash
RUNDIR=`pwd`
export PATH=$PATH;"$JAVA_HOME/jre/bin/"
CLASSPATH="$RUNDIR/../lib/*:$RUNDIR/../lib_dep/*";"%JAVA_HOME%/lib/tools.jar"
java -classpath ${CLASSPATH} com.jkoolcloud.tnt4j.streams.utils.ZorkaAttach $1 $2
tnt4j-streams.sh $3