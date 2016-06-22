package com.hike.test; 

import android.os.RemoteException;
import android.util.Log;

import com.android.uiautomator.core.UiDevice;



import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiWatcher;
import com.android.uiautomator.testrunner.*;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.core.UiScrollable;

public class NewGroupChat extends UiAutomatorTestCase

{

	public void test001_AppClick() throws UiObjectNotFoundException
	
	{ 
		
		
		
		getUiDevice().pressHome();
		UiObject ui = new UiObject(new UiSelector().descriptionContains("Apps"));
		assertNotNull(ui); 
		
		ui.click();
		
	}
	


public void test002_hikeOpen() throws UiObjectNotFoundException

{
	
	
	
	UiScrollable scr = new UiScrollable(new UiSelector());
	scr.setAsHorizontalList();
	UiObject dt = scr.getChildByText(new UiSelector().className("android.widget.TextView"), "hike");
	//UiObject st = scr.scrollIntoView(new UiSelector().className("android.widget.TextView"), "hike");
	//assertNotNull(dt);
	dt.click();
	
	
	
}
	
	public void test003_OverflowMenuClick() throws UiObjectNotFoundException

	{

		try {
			getUiDevice().setOrientationNatural();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		// for accessing the 3 dot menu
		if(new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.widget.FrameLayout").index(0)). 
				getChild(new UiSelector().className("android.view.View").index(0)).
				getChild(new UiSelector().className("android.support.v7.widget.LinearLayoutCompat").index(1)).
				getChild(new UiSelector().className("android.widget.RelativeLayout")).exists())
		{
			new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
			getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
			getChild(new UiSelector().className("android.widget.FrameLayout").index(0)).
			getChild(new UiSelector().className("android.view.View").index(0)).
			getChild(new UiSelector().className("android.widget.FrameLayout").index(0)). 
			getChild(new UiSelector().className("android.view.View").index(0)).
			getChild(new UiSelector().className("android.support.v7.widget.LinearLayoutCompat").index(1)).
			getChild(new UiSelector().className("android.widget.RelativeLayout").index(3)).click();
		}



		else
		{
			System.out.println("Wrong input");
		}

	}


	//New group chat element click
	public void test004_NewGroupOptionClick() throws UiObjectNotFoundException

	{
		UiObject rs = new UiObject(new UiSelector().className("android.widget.FrameLayout").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(0)).
				getChild(new UiSelector().className("android.widget.ListView").index(0)).
				getChild(new UiSelector().className("android.widget.LinearLayout").index(1));
		
		//rs.exists()

		assertNotNull(rs);
		rs.click();
//		if(assertNotNull(rs))
//		{
//			rs.click();
//		}
//		else
//		{
//			System.out.println("Incorect input");
//		}
//
//	}
	}

	//Group chat creation screen

	public void test005_GroupChatNameEnter() throws UiObjectNotFoundException, InterruptedException

	{
		System.out.println("setting group name");



		new UiObject(new UiSelector().text("Name the group")).setText("Test");

		/*UiDevice ut = UiDevice.getInstance();
	    ut.pressBack();*/



		System.out.println("Umang, sleep 3000 before");
		Thread.sleep(3000);
		System.out.println("Umang, sleep 3000 after");


		UiObject next_1 = new UiObject(new UiSelector().className("android.widget.RelativeLayout").index(1));
		if(next_1.exists())
		{
			System.out.println("Umang, existing");
		}
		else 
		{
			System.out.println("Umang,not existing");
		}
		UiObject next_2 = next_1.getChild(new UiSelector().resourceId("com.bsb.hike:id/done_container").index(1));



		if(next_2.exists())
		{
			System.out.println("click on next");
			next_2.click();	
		}

		else
		{
			System.out.println("Incorect input");
		}
		System.out.println("Umang, sleep 4000 before");
		Thread.sleep(4000);	
		System.out.println("Umang, sleep 4000 before");
	}

	public void test006_GroupChatMemberAddition() throws UiObjectNotFoundException
	{



		UiObject st = new UiObject(new UiSelector().className("android.widget.CheckBox"));


		if(!st.isChecked())
		{

			st.click();
		}


		else
		{
			System.out.println("Wrong input");
		}

		UiObject st4 = new UiObject(new UiSelector().className("android.widget.CheckBox").instance(1));

		
		st4.click();

		System.out.println("Second user entered");




	}

	public void test007_GroupChatDoneButtonClick() throws UiObjectNotFoundException

	{
		System.out.println("Entered in queue");

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		UiObject rs = new UiObject(new UiSelector().className("android.widget.RelativeLayout").index(0)).
				getChild(new UiSelector().resourceId("com.bsb.hike:id/done_container").index(2));




		if(rs.exists())
		{
			System.out.println("Button Click");
			rs.click();
		}



		System.out.println("Success");

	}


public void test008_UiWatcherRegister() throws UiObjectNotFoundException
	{
	// Register watcher
		
	UiDevice.getInstance().registerWatcher("Hi", okCancelDialogWatcher);

	// Run watcher
	UiDevice.getInstance().runWatchers();
	
	}

	public void test009_GroupChatTextEnter() throws UiObjectNotFoundException

	{
		new UiObject(new UiSelector().className("android.widget.EditText").index(0)).setText("Hi");	

		
	}	
	


	public void test010_GroupChatSendMsg() throws UiObjectNotFoundException

	{
		System.out.println("About to click send button");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		new UiObject(new UiSelector().className("android.widget.RelativeLayout").index(2)).
//		getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).
//		getChild(new UiSelector().resourceId("com.bsb.hike:id/send_message")).click();
		
		//Press button to send Message
		
		new UiObject(new UiSelector().description("Press button to send Message")).click();

		System.out.println("clicked on send button");


	}
	
	UiWatcher okCancelDialogWatcher = new UiWatcher() {
		@Override
		public boolean checkForCondition() {
			UiObject okCancelDialog = new UiObject(new UiSelector().textStartsWith("Regional Keyboard"));
			if(okCancelDialog.exists()){
				Log.w("New Group", "Found the example OK/Cancel dialog");
				UiObject okButton = new UiObject(new UiSelector().descriptionContains("image_close"));
				try {
					okButton.click();
				} catch (UiObjectNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return (okCancelDialog.waitUntilGone(25000));
			}
			return false;
		}
	};
	
	
	
	//Attachment menu click

	public void test011_GroupChatAttachmentMenuClick() throws UiObjectNotFoundException 
	{

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		new UiObject(new UiSelector().className("android.support.v7.widget.LinearLayoutCompat").index(2)).
//		getChild(new UiSelector().resourceId("com.bsb.hike:id/attachment").index(0)).click();
		
		new UiObject(new UiSelector().resourceId("com.bsb.hike:id/attachment").index(1)).click();
	}

//	//Gallery button click
	public void test012_GroupChatGalleryOptionClick() throws UiObjectNotFoundException
	{

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1).instance(0)).click();

		/*new UiObject(new UiSelector().className("android.support.v7.widget.RecyclerView").index(0)).
		getChild(new UiSelector().className("android.widget.RelativeLayout").index(0)).click();*/
	}

	public void test013_GroupChatImageClickFinally() throws UiObjectNotFoundException
	{

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		new UiObject(new UiSelector().className("android.widget.LinearLayout").instance(0).index(1)).click();
	}

//Selecting element from Photo screen

	public void test014_GroupChatPhotoEditor() throws UiObjectNotFoundException
	{

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		new UiObject(new UiSelector().className("android.view.View").index(0).instance(1)).click();
		
	}

//	Selecting image from All Photos Screen
//	
	public void test015_GroupChatPhotoSelection() throws UiObjectNotFoundException
	{

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		new UiObject(new UiSelector().className("android.view.View").index(0).instance(1)).click();
		
	}

	//Send button click for image
	
	public void test016_GroupChatSendButtonClick() throws UiObjectNotFoundException,InterruptedException
	{

		Thread.sleep(4000);
		

		new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1).instance(0)).click();

	}

	//Click of Send button in Image Quality
	
	public void test017_GroupChatSendBtnClk() throws UiObjectNotFoundException
	{

		try {
		Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		new UiObject(new UiSelector().className("android.widget.Button").text("SEND")).click();

	}

	public void test018_GroupChatStickerButtonClick() throws UiObjectNotFoundException

	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		UiObject ds1 = new UiObject(new UiSelector().resourceId("com.bsb.hike:id/sticker_btn").index(0));
			
		
		
		if(ds1.exists())
		{
			System.out.println("About to click on the 3 dot menu");
			ds1.click();
		}



	}

 public void test019_GroupChatOverflowMenuClick() throws UiObjectNotFoundException

	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		UiObject ds2 = new UiObject(new UiSelector().resourceId("com.bsb.hike:id/overflowmenu"));

		System.out.println("About to click on the 3 dot menu");
	    ds2.click();
		


}
	
	public void test020_GroupChatGroupInfoClick() throws UiObjectNotFoundException

	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		UiObject ds3 = new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1));
		
		
        assertNotNull(ds3);
		System.out.println("About to click on the Group info option");
	    ds3.click();

	}

public void test021_GroupChatScrollGroupChatInfo() throws UiObjectNotFoundException

	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		UiScrollable scroll =  new UiScrollable(new UiSelector().className("android.widget.ListView"));

		UiObject ds3 = scroll.getChildByText(new UiSelector().className("android.widget.TextView"), "ADD A MEMBER") ;

		if(ds3.exists())
{
	System.out.println("Scrolling the page begins..");
	//ds3.click();
}

	}

public void test022_GroupChatMemberRemoval() throws UiObjectNotFoundException

	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//UiScrollable scroll =  new UiScrollable(new UiSelector().className("android.widget.ListView"));


		System.out.println("Long tapping the member..");

		UiObject ds4 = new UiObject(new UiSelector().className("android.widget.RelativeLayout").index(0).instance(5));

		ds4.longClick();


}

	public void test023_GroupChatMemberRemovalDialogClick() throws UiObjectNotFoundException

	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//UiScrollable scroll1 =  new UiScrollable(new UiSelector().className("android.widget.ListView"));

		UiObject ds5 = new UiObject(new UiSelector().className("android.widget.TextView").text("Remove from group"));

		if(ds5.exists())
			ds5.click();
		else
			System.out.println("failed");	

	}

public void test024_GroupChatYesButtonClick() throws UiObjectNotFoundException
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//UiScrollable scroll1 =  new UiScrollable(new UiSelector().className("android.widget.ListView"));

		UiObject ds6 = new UiObject(new UiSelector().className("android.widget.Button").text("YES"));

		if(ds6.exists())
			ds6.click();
		else
			System.out.println("failed");




	}
	
public void test025_GroupChatMemberAddition() throws UiObjectNotFoundException

	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//UiScrollable scroll1 =  new UiScrollable(new UiSelector().className("android.widget.ListView"));

		UiObject ds7 = new UiObject(new UiSelector().className("android.widget.TextView").text("ADD A MEMBER"));

		if(ds7.exists())
			ds7.click();
		else
			System.out.println("failed");

	}

public void test026_GroupChatGroupInfoScrollability() throws UiObjectNotFoundException

	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//UiScrollable scroll1 =  new UiScrollable(new UiSelector().className("android.widget.ListView"));

		UiObject ds8 = new UiObject(new UiSelector().className("android.widget.CheckBox").index(0).instance(0));

		if(ds8.exists())
			ds8.click();
		else
			System.out.println("failed");

}

public void test027_GroupChatDoneButtonClick() throws UiObjectNotFoundException

{
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//UiScrollable scroll1 =  new UiScrollable(new UiSelector().className("android.widget.ListView"));

		UiObject ds9 = new UiObject(new UiSelector().className("android.widget.LinearLayout").index(2));

		if(ds9.exists())
			ds9.click();
		else
			System.out.println("failed");
        UiDevice deviceInstance = UiDevice.getInstance();
        deviceInstance.pressBack();
        deviceInstance.pressBack();
        deviceInstance.openNotification();
       
}

      public void test028_GroupChatAppExit() throws UiObjectNotFoundException
        {
       	
           UiDevice deviceInstance = UiDevice.getInstance();
           deviceInstance.pressBack();
           deviceInstance.pressBack();
           deviceInstance.openNotification();
        
           UiObject p = new UiObject (new UiSelector().resourceId("com.android.systemui:id/notification_stack_scroller").index(1));
           int t = p.getChildCount();
           System.out.println(t + " No. of children are");
           
        for(int i=0; i<=t; i++){

			

			UiObject s = p.getChild(new UiSelector().className("android.widget.FrameLayout").index(i)).getChild(new UiSelector()
			.className("android.widget.TextView").index(0));

			String str = s.getText();
			//assertEquals(s,"hike");
			
			System.out.println("Text in notification is = " + str);

			if(str.equals("hike") || (str.equals("Tester"))){

				s.click();
				break;
		}

}

}

}















