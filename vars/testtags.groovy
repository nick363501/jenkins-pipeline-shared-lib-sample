#!/usr/bin/env groovy

def call(body) {
    echo "Start Deploy"
    echo "${BUILD_URL}"
    echo "${JOB_URL}"
}
