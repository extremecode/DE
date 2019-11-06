#!/bin/bash

ARTIFACTS_PATH=$1
TEST_REPORT_PATH=$2

echo $ARTIFACTS_PATH $TEST_REPORT_PATH

mkdir -p $ARTIFACTS_PATH $TEST_REPORT_PATH
find . -type f -name '*.jar' -exec cp -at $ARTIFACTS_PATH {} +
find . -type f -path '*surefire-reports*/*' -name '*.xml' -exec cp -at $TEST_REPORT_PATH {} +

exit 0