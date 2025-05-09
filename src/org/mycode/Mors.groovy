#!/usr/bin/groovy
package org.mycode.Mors

class Mors {

def checkOutFrom(repo) {
  git url: "git@github.com:jenkinsci/${repo}"
}

def print() {
  out.println("abc")
}
}
