#!/bin/bash

JENKINS_URL="http://jenkins.local:8080"
JOB_NAME="deploy-app"
USER="jenkins_user"
API_TOKEN="your_token_here"
curl -X POST "$JENKINS_URL/job/$JOB_NAME/build" \
  --user "$USER:$API_TOKEN"