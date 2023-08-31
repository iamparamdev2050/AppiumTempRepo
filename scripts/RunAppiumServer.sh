#!/bin/bash
set -ex
npm install -g appium
# appium driver install uiautomator2
appium driver install xcuitest
appium driver run xcuitest build-wda
appium driver install --source=npm appium-flutter-driver

appium -v
appium &
