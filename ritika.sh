ant build
adb push bin/GroupChat.jar  /data/local/tmp/
adb shell uiautomator runtest /data/local/tmp/GroupChat.jar -c  com.hike.test.NewGroupChat
