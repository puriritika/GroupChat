package com.hike.test; 

import android.os.RemoteException;

import com.android.uiautomator.core.UiDevice;



import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.testrunner.*;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiScrollable;

public class NewGroupChat extends UiAutomatorTestCase

{

	public void test001() throws UiObjectNotFoundException
	
	{ 
		
		
		
		getUiDevice().pressHome();
		UiObject ui = new UiObject(new UiSelector().descriptionContains("Apps"));
		ui.click();
		
	}
	


public void test002() throws UiObjectNotFoundException

{
	
	
	
	UiScrollable scr = new UiScrollable(new UiSelector());
	UiObject dt = scr.getChildByText(new UiSelector().className("android.widget.TextView"), "hike");
	dt.click();
	
	
	
}
	
//	public void testAutomation() throws UiObjectNotFoundException
//
//	{
//
//		try {
//			getUiDevice().setOrientationNatural();
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		//mdevice.setOrientationNatural();
//
//		// for accessing the 3 dot menu
//		if(new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
//				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
//				getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
//				getChild(new UiSelector().className("android.view.View").index(0)).
//				getChild(new UiSelector().className("android.widget.FrameLayout").index(0)). 
//				getChild(new UiSelector().className("android.view.View").index(0)).
//				getChild(new UiSelector().className("android.support.v7.widget.LinearLayoutCompat").index(1)).
//				getChild(new UiSelector().className("android.widget.RelativeLayout")).exists())
//		{
//			new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
//			getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
//			getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
//			getChild(new UiSelector().className("android.view.View").index(0)).
//			getChild(new UiSelector().className("android.widget.FrameLayout").index(0)). 
//			getChild(new UiSelector().className("android.view.View").index(0)).
//			getChild(new UiSelector().className("android.support.v7.widget.LinearLayoutCompat").index(1)).
//			getChild(new UiSelector().className("android.widget.RelativeLayout").index(3)).click();
//		}
//
//
//
//		else
//		{
//			System.out.println("Wrong input");
//		}
//
//	}
//
//
//	//New group chat element click
//	public void testElementClick() throws UiObjectNotFoundException
//
//	{
//		UiObject rs = new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
//				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
//				getChild(new UiSelector().className("android.widget.ListView").index(0)).
//				getChild(new UiSelector().className("android.widget.LinearLayout").index(1));
//
//		if(rs.exists())
//		{
//			rs.click();
//		}
//		else
//		{
//			System.out.println("Incorect input");
//		}
//
//	}
//
//	//Group chat creation screen
//
//	public void testNameEnter() throws UiObjectNotFoundException, InterruptedException
//
//	{
//		System.out.println("setting group name");
//
//
//
//		new UiObject(new UiSelector().text("Name the group")).setText("Test");
//
//		/*UiDevice ut = UiDevice.getInstance();
//	    ut.pressBack();*/
//
//
//
//		System.out.println("Umang, sleep 3000 before");
//		Thread.sleep(3000);
//		System.out.println("Umang, sleep 3000 after");
//
//
//		UiObject next_1 = new UiObject(new UiSelector().className("android.widget.RelativeLayout").index(1));
//		if(next_1.exists())
//		{
//			System.out.println("Umang, existing");
//		}
//		else 
//		{
//			System.out.println("Umang,not existing");
//		}
//		UiObject next_2 = next_1.getChild(new UiSelector().resourceId("com.bsb.hike:id/done_container").index(1));
//
//
//
//		if(next_2.exists())
//		{
//			System.out.println("click on next");
//			next_2.click();	
//		}
//
//		else
//		{
//			System.out.println("Incorect input");
//		}
//		System.out.println("Umang, sleep 4000 before");
//		Thread.sleep(4000);	
//		System.out.println("Umang, sleep 4000 before");
//	}
//
//
//
//
//	public void testPMemberAddition() throws UiObjectNotFoundException
//	{
//
//
//
//		UiObject st = new UiObject(new UiSelector().className("android.widget.CheckBox"));
//
//
//		if(!st.isChecked())
//		{
//
//			st.click();
//		}
//
//
//		else
//		{
//			System.out.println("Wrong input");
//		}
//
//		UiObject st4 = new UiObject(new UiSelector().className("android.widget.CheckBox").instance(1));
//
//		/*new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
//				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
//				getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
//				getChild(new UiSelector().className("android.view.View").index(0)).
//				getChild(new UiSelector().className("android.widget.FrameLayout").index(1)).
//				getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
//				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
//				getChild(new UiSelector().className("android.widget.ListView").index(2)).
//				getChild(new UiSelector().className("android.widget.RelativeLayout").index(2)).
//				getChild(new UiSelector().className("android.widget.RelativeLayout").index(2)).
//				getChild(new UiSelector().className("android.widget.CheckBox").index(0)).click();*/
//		st4.click();
//
//		System.out.println("Second user entered");
//
//
//
//
//	}
//
//	public void testQDoneButtonClick() throws UiObjectNotFoundException
//
//	{
//		System.out.println("Entered in queue");
//
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//
//		UiObject rs = new UiObject(new UiSelector().className("android.widget.RelativeLayout").index(0)).
//				getChild(new UiSelector().resourceId("com.bsb.hike:id/done_container").index(2));
//
//
//
//
//		if(rs.exists())
//		{
//			System.out.println("Button Click");
//			rs.click();
//		}
//
//
//
//		System.out.println("Success");
//
//	}
//
//
//
//
//	public void testRTextEnter() throws UiObjectNotFoundException
//
//	{
//		new UiObject(new UiSelector().className("android.widget.EditText").index(0)).setText("Hi");	
//
//		
//	}	
//
//
//	public void testSSendMsg() throws UiObjectNotFoundException
//
//	{
//		System.out.println("About to click send button");
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		new UiObject(new UiSelector().className("android.widget.RelativeLayout").index(2)).
//		getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
//		getChild(new UiSelector().resourceId("com.bsb.hike:id/send_message")).click();
//
//		System.out.println("clicked on send button");
//
//
//	}
//
//	//Attachment menu click
//
//	public void testTSendImage() throws UiObjectNotFoundException 
//	{
//
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		new UiObject(new UiSelector().className("android.support.v7.widget.LinearLayoutCompat").index(2)).
//		getChild(new UiSelector().resourceId("com.bsb.hike:id/attachment").index(1)).click();
//	}
//
//	
//
//	
//	//Gallery button click
//	public void testUGalleryOptionClick() throws UiObjectNotFoundException
//	{
//
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1).instance(0)).click();
//
//		/*new UiObject(new UiSelector().className("android.support.v7.widget.RecyclerView").index(0)).
//		getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).click();*/
//	}
//
////	public void testUImageClickFinally() throws UiObjectNotFoundException
////	{
////
////		try {
////			Thread.sleep(4000);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////
////		new UiObject(new UiSelector().className("android.widget.LinearLayout").instance(0).index(1)).click();
////	}
//
//
//	//Selecting element from Photo screen
//	
//	public void testVPhotoEditor() throws UiObjectNotFoundException
//	{
//
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		new UiObject(new UiSelector().className("android.view.View").index(0).instance(1)).click();
//		
//	}
//
//	//Selecting image from All Photos Screen
//	
//	public void testWPhotoSelection() throws UiObjectNotFoundException
//	{
//
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		new UiObject(new UiSelector().className("android.view.View").index(0).instance(1)).click();
//		
//	}
//
//	//Send button click for image
//	
//	public void testXSendButtonClick() throws UiObjectNotFoundException
//	{
//
//		try {
//		Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1).instance(0)).click();
//
//	}
//
//	
//	//Click of Send button in Image Quality
//	
//	public void testYSendBtnClk() throws UiObjectNotFoundException
//	{
//
//		try {
//		Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		
//		new UiObject(new UiSelector().className("android.widget.Button").text("SEND")).click();
//
//	}
//
//	public void testZ02TverflowMenuClick() throws UiObjectNotFoundException
//
//	{
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//
//		UiObject ds1 = new UiObject(new UiSelector().resourceId("com.bsb.hike:id/sticker_btn").index(0));
//			
//		
//		
//		if(ds1.exists())
//		{
//			System.out.println("About to click on the 3 dot menu");
//			ds1.click();
//		}
//
//
//
//	}
//
//
//	public void testZ03UverflowMenuClick() throws UiObjectNotFoundException
//
//	{
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		UiObject ds2 = new UiObject(new UiSelector().resourceId("com.bsb.hike:id/overflowmenu").index(2));
//
//		System.out.println("About to click on the 3 dot menu");
//	    ds2.click();
//		
//
//
//	}
//	
//	public void testZ04UverflowMenuClick() throws UiObjectNotFoundException
//
//	{
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		UiObject ds3 = new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1));
//
//		System.out.println("About to click on the Group info option");
//	    ds3.click();
//		
//
//
//	}
//	
//
//public void testZ05VverflowMenuClick() throws UiObjectNotFoundException
//
//	{
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//		UiScrollable scroll =  new UiScrollable(new UiSelector().className("android.widget.ListView"));
//
//		UiObject ds3 = scroll.getChildByText(new UiSelector().className("android.widget.TextView"), "ADD A MEMBER") ;
//
//		if(ds3.exists())
//{
//	System.out.println("Scrolling the page begins..");
//	//ds3.click();
//}
//
//	}
//
//public void testZ06YverflowMenuClick() throws UiObjectNotFoundException
//
//	{
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//		//UiScrollable scroll =  new UiScrollable(new UiSelector().className("android.widget.ListView"));
//
//
//		System.out.println("Long tapping the member..");
//
//		UiObject ds4 = new UiObject(new UiSelector().className("android.widget.RelativeLayout").index(0).instance(5));
//
//		ds4.longClick();
//
//
//}
//
//	public void testZ07ZverflowMenuClick() throws UiObjectNotFoundException
//
//	{
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//		//UiScrollable scroll1 =  new UiScrollable(new UiSelector().className("android.widget.ListView"));
//
//		UiObject ds5 = new UiObject(new UiSelector().className("android.widget.TextView").text("Remove from group"));
//
//		if(ds5.exists())
//			ds5.click();
//		else
//			System.out.println("failed");	
//
//	}
//
//	public void testZ08ZverflowMenuClick() throws UiObjectNotFoundException
//	{
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//		//UiScrollable scroll1 =  new UiScrollable(new UiSelector().className("android.widget.ListView"));
//
//		UiObject ds6 = new UiObject(new UiSelector().className("android.widget.Button").text("YES"));
//
//		if(ds6.exists())
//			ds6.click();
//		else
//			System.out.println("failed");
//
//
//
//
//	}
//	
//public void testZ09ZverflowMenuClick() throws UiObjectNotFoundException
//
//	{
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//		//UiScrollable scroll1 =  new UiScrollable(new UiSelector().className("android.widget.ListView"));
//
//		UiObject ds7 = new UiObject(new UiSelector().className("android.widget.TextView").text("ADD A MEMBER"));
//
//		if(ds7.exists())
//			ds7.click();
//		else
//			System.out.println("failed");
//
//
//
//
//	}
//
//public void testZ10ZverflowMenuClick() throws UiObjectNotFoundException
//
//	{
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//		//UiScrollable scroll1 =  new UiScrollable(new UiSelector().className("android.widget.ListView"));
//
//		UiObject ds8 = new UiObject(new UiSelector().className("android.widget.CheckBox").index(0).instance(0));
//
//		if(ds8.exists())
//			ds8.click();
//		else
//			System.out.println("failed");
//
//
//
//
//}
//
//public void testZ11ZverflowMenuClick() throws UiObjectNotFoundException
//
//{
//	try {
//		Thread.sleep(4000);
//	} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//		//UiScrollable scroll1 =  new UiScrollable(new UiSelector().className("android.widget.ListView"));
//
//		UiObject ds9 = new UiObject(new UiSelector().className("android.widget.LinearLayout").index(2));
//
//		if(ds9.exists())
//			ds9.click();
//		else
//			System.out.println("failed");
//
//        UiDevice deviceInstance = UiDevice.getInstance();
//        deviceInstance.pressBack();
//        deviceInstance.pressBack();
//        deviceInstance.openNotification();
//        
//}

//        public void testZ12ZverflowMenuClick() throws UiObjectNotFoundException
//        {
//        	
//           UiDevice deviceInstance = UiDevice.getInstance();
//           deviceInstance.pressBack();
//           deviceInstance.pressBack();
//           deviceInstance.openNotification();
//        
//           UiObject p = new UiObject (new UiSelector().resourceId("com.android.systemui:id/notification_stack_scroller").index(1));
//           int t = p.getChildCount();
//           System.out.println(t + " No. of children are");
//           
//        for(int i=0; i<=t; i++){
//
//			
//
//			UiObject s = p.getChild(new UiSelector().className("android.widget.FrameLayout").index(i)).getChild(new UiSelector()
//			.className("android.widget.TextView").index(0));
//
//			String str = s.getText();
//			
//			System.out.println("Text in notification is = " + str);
//
//			if(str.equals("hike") || (str.equals("Tester"))){
//
//				s.click();
//				break;
//		}
//
//}
//
//}

}















