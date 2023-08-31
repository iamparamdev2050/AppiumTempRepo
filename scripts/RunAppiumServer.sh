#!/bin/bash
set -ex
npm uninstall -g appium
npm install -g appium
# appium driver install uiautomator2
appium driver install xcuitest
appium driver install --source=npm appium-flutter-driver

appium -v
appium --log appium.log &>/dev/null &
