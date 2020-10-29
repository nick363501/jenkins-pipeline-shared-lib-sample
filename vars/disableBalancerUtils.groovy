#!/usr/bin/env groovy

def call(body) {
    echo "Disable balance New Feature"

    script:this.echo(new Sample(1, 3).toString())

    return this
}
