#!/usr/bin/env groovy

package com.myorg

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
