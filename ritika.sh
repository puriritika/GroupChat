ant build
#adb push bin/GroupChat.jar  /data/local/tmp/
adb push bin/UJNotification.jar  /data/local/tmp/

adb shell uiautomator runtest /data/local/tmp/UJNotification.jar -c  com.hike.test.UJNotifications

#adb shell uiautomator runtest /data/local/tmp/UJNotification.jar -c  com.hike.test.Notifications
#adb shell uiautomator runtest /data/local/tmp/GroupChat.jar -c  com.hike.test.NewGroupChat


