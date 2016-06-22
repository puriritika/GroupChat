package com.hike.test;

import android.util.Log;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiWatcher;

public class UiWatchers {
	
//	//public void test008_UiWatcherRegister() throws UiObjectNotFoundException
//	{
//	// Register watcher
//		
//	UiDevice.getInstance().registerWatcher("Hi", okCloseDialogWatcher);
//
//	// Run watcher
//	UiDevice.getInstance().runWatchers();
//	
//	}
//
//	public void test009_GroupChatTextEnter() throws UiObjectNotFoundException
//
//	{
//		new UiObject(new UiSelector().className("android.widget.EditText").index(0)).setText("Hi");	
//
//		
//	}	
	
	
	
	//Product pop up for Just for laugh
	
		UiWatcher okCloseDialogWatcher = new UiWatcher() {
			
			public boolean checkForCondition() {
				UiObject okCloseDialog = new UiObject(new UiSelector().textStartsWith("Just For Laughs"));
				if(okCloseDialog.exists()){
					Log.w("New Group", "Found the example OK/Cancel dialog");
					UiObject okButton = new UiObject(new UiSelector().descriptionContains("cross"));
					try {
						okButton.click();
					} catch (UiObjectNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					return (okCloseDialog.waitUntilGone(25000));
				}
				return false;
			}
		};
		
//Multiple Admins
		
		
UiWatcher okClDialogWatcher = new UiWatcher() {
			
			public boolean checkForCondition() {
				UiObject okClDialog = new UiObject(new UiSelector().textStartsWith("Multiple Admins"));
				if(okClDialog.exists()){
					Log.w("New Group", "Found the example OK/Cancel dialog");
					UiObject okButton = new UiObject(new UiSelector().descriptionContains("GOT IT"));
					try {
						okButton.click();
					} catch (UiObjectNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					return (okClDialog.waitUntilGone(25000));
				}
				return false;
			}
		};
}
