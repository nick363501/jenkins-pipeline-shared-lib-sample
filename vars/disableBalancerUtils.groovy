#!/usr/bin/env groovy

def call(body) {
    echo "Disable balancer Master Branch"

    script:this.echo(new Sample(1, 3).toString())

    return this
}
