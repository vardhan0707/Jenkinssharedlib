#!/usr/bin/env groovy

package com.myorg

#file name and class name imported in Jenkinsfile must be same
class VersCl
{
  static String foo = "bar"
  static String retVer(){
   return "1.1.1"
  }

  String findVer(){
    return "2.0.0"
  }
}
