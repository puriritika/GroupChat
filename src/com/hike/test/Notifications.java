package com.hike.test;
import android.graphics.Rect;
import android.os.RemoteException;
import android.util.Log;

import com.android.uiautomator.core.UiCollection;
import com.android.uiautomator.core.UiDevice;



import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiWatcher;
import com.android.uiautomator.testrunner.*;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiScrollable;


public class Notifications extends UiAutomatorTestCase{
	public void test001() throws UiObjectNotFoundException 
	{
		getUiDevice().pressHome();
		getUiDevice().openNotification();
		
		
	}
	
	public void test002() throws UiObjectNotFoundException 
	{
		
		UiCollection list = new UiCollection(new UiSelector().className("android.view.View").index(1).instance(1));
		System.out.println("Clicked finally!!" + list.getChildCount());
		//UiObject notif699 = list.getChildByText(new UiSelector(), "Below Rs.699!");
		UiObject notif699 = list.getChildByText(new UiSelector().className("android.widget.TextView"), "hi");
		
		
			//UiObject obj = list.getChild(new UiSelector().className("android.widget.TextView").index(0).instance(4).text("+919999683956"));
		
		if(notif699.exists())
		{
			notif699.click();
		}	
			
//			int p = list.getChildCount();
//			
//			System.out.println("About to click");
//			
//			
//			if(obj.exists())
//			{'
//				System.out.println("Clicked finally!!");
//				obj.clickAndWaitForNewWindow();
//			}
			//obj.getChild(new UiSelector().className("android.widget.TextView").index(0).instance(2).text("+919999683956")).click();
			
		
	}
	
	
	public void test003() throws UiObjectNotFoundException 
	{
		
		UiCollection list = new UiCollection(new UiSelector().className("android.view.View").index(1).instance(1));
		System.out.println("Clicked finally!!" + list.getChildCount());
		//UiObject notif699 = list.getChildByText(new UiSelector(), "Below Rs.699!");
		UiObject notif = list.getChildByText(new UiSelector().className("android.widget.TextView"), "+919015215290");
		
		
			//UiObject obj = list.getChild(new UiSelector().className("android.widget.TextView").index(0).instance(4).text("+919999683956"));
		
			notif.click();

	}
	
	public void test004() throws UiObjectNotFoundException, InterruptedException 
	{
		
		UiCollection list = new UiCollection(new UiSelector().className("android.view.View").index(1).instance(1));
		System.out.println("Clicked finally!!" + list.getChildCount());
		//UiObject notif699 = list.getChildByText(new UiSelector(), "Below Rs.699!");
		UiObject notif12 = list.getChildByText(new UiSelector().className("android.widget.TextView"), "hike");
		notif12.click();
		
		
		
		//Thread.sleep(100);
		
		for (int i=0;i<20;i++)
		{
		UiObject img = new UiObject(new UiSelector().className("android.widget.ImageButton"));
		Rect r = img.getVisibleBounds();
		int h = r.height();
		int w = r.width();
		
		
		System.out.println("Height and width are:" + h + ", "+ w);
		Thread.sleep(100);
		}
			//UiObject obj = list.getChild(new UiSelector().className("android.widget.TextView").index(0).instance(4).text("+919999683956"));
		
		

	}
}
