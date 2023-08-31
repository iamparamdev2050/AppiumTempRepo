#!/bin/bash
set -ex
npm install -g appium@2.1.3
appium driver install uiautomator2
appium driver install xcuitest
appium driver install --source=npm appium-flutter-driver

appium -v
appium --log appium.log &>/dev/null &
