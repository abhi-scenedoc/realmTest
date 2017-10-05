# realmTest

This is just a test to show how long realm takes to return the first getInstance or getDefaultInstance call. We are noticing upto 6 seconds of delay on some devices. Even on the faster devices such as the Samsung S8, getDefaultInstance call takes 1+ seconds. To run this test, install this on a device and then check the logcat output or observe the time displayed on the screen in ms. To Perform the test again, close the application and then open it again. 
