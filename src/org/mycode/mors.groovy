#!/usr/bin/groovy
package org.mycode

def checkOutFrom(repo) {
  git url: "git@github.com:jenkinsci/${repo}"
}

def print() {
  print "abc"
}
return this
