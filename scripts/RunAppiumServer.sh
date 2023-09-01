#!/bin/bash
set -ex
npm install -g appium
# appium driver install uiautomator2
appium driver install xcuitest
appium doctor --ios
appium driver install --source=npm appium-flutter-driver

appium -v
appium &
