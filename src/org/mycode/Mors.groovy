#!/usr/bin/groovy
package org.mycode

class Mors {
def checkOutFrom(repo) {
  git url: "git@github.com:jenkinsci/${repo}"
}

def print() {
  print "abc"
}
}
