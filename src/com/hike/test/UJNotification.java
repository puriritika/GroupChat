package com.hike.test;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import android.os.RemoteException;

public class UJNotification extends UiAutomatorTestCase{
	
public void test001_AppIconClick() throws UiObjectNotFoundException, InterruptedException
	
	{ 
		
		
		
		getUiDevice().openNotification();
		
			Thread.sleep(200);
		
	}


public void test002_AppIconClick() throws UiObjectNotFoundException
{
/*
		UiObject obj2 = new UiObject(new UiSelector().className("android.widget.Button").text("Say hi").index(0));
		
		if(obj2.exists())
		{
		obj2.click();
		System.out.println("hi");
		}
		
	
	
		UiObject obj3 = new UiObject(new UiSelector().text("Hi there!"));
		obj3.click();
		new UiObject(new UiSelector().resourceId("com.bsb.hike:id/send_message")).click();
		getUiDevice().pressBack();
		getUiDevice().pressBack();
		getUiDevice().pressBack();
		
		//assertNotNull(ui); 
		
		//ui.click();
*/		
	}

public void test003_AppIconClick() throws UiObjectNotFoundException
{
	
UiObject obj2 = new UiObject(new UiSelector().className("android.widget.Button").text("Add friend").index(1));

if(obj2.exists())
{
obj2.click();
System.out.println("hi");
}
getUiDevice().pressBack();
getUiDevice().pressBack();
UiObject obj3 = new UiObject(new UiSelector().className("android.widget.TextView").index(1));
obj3.click();

UiObject ut4 = new UiObject(new UiSelector().className("android.support.v7.widget.LinearLayoutCompat").index(2)).
getChild(new UiSelector().className("android.widget.TextView").index(0));
ut4.click();
ut4.setText("+9123456789");

UiObject ut5 = new UiObject(new UiSelector().text("FAVORITES"));
UiObject ut6 = new UiObject(new UiSelector().text("+9123456789"));

if(ut5.exists() && ut6.exists())
{
	new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1).
			instance(1)).click();
}

new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1).
		instance(0)).click();


}






}

