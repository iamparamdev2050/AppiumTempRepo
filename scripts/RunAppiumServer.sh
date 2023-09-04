#!/bin/bash
set -ex
npm install -g appium
npm install @appium/doctor --location=global
appium driver install uiautomator2
appium driver install chromium
appium driver install xcuitest
appium driver install --source=npm appium-flutter-driver
ls /Users/runner/.appium
appium -v
appium driver list --installed
appium-doctor --ios
appium  &
