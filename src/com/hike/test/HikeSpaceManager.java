package com.hike.test;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import android.os.RemoteException;

public class HikeSpaceManager extends UiAutomatorTestCase {


	
	
	



	
public void test001_AppIconClick() throws UiObjectNotFoundException
	
	{ 
		
		
		
		getUiDevice().pressHome();
		UiObject ui = new UiObject(new UiSelector().descriptionContains("Apps"));
	
		assertNotNull(ui); 
		
		ui.click();
		
	}
	


public void test002_hikeClick() throws UiObjectNotFoundException

{

	UiScrollable st = new UiScrollable(new UiSelector());
	st.setAsVerticalList();
	UiObject ut = st.getChildByText(new UiSelector().className("android.widget.TextView"), "hike");
	ut.click();
	
}

public void test003_SettingsClick() throws UiObjectNotFoundException

{

	
	UiObject ust = new UiObject(new UiSelector().className("android.widget.RelativeLayout").index(2));
	ust.click();
	
}

public void test004_GearClick() throws UiObjectNotFoundException

{

	
	UiObject ust = new UiObject(new UiSelector().resourceId("com.bsb.hike:id/settings").index(0));
	ust.click();
	
}

public void test005_SpaceManagerClick() throws UiObjectNotFoundException

{

	UiScrollable st = new UiScrollable(new UiSelector().className("android.widget.ListView").index(0).instance(0));
	
	UiObject urt = st.getChildByText(new UiSelector().className("android.widget.TextView"), "Manage Space");
			
			//getChildByDescription(new UiSelector().className("android.widget.TextView"), "Manage Space");
	
	
	if(urt.exists())
	{
		
		urt.click();
	}
	//UiObject urt = st.getChildByDescription(new UiSelector().className("com.bsb.hike:id/item"), "Manage Space");
		//	new UiObject(new UiSelector().className("android.widget.LinearLayout").index(3).instance(0));
	
	
	
}

public void test006_BackClick() throws UiObjectNotFoundException

{
	UiObject ut = new UiObject(new UiSelector().text("Cheers! There are no more items to delete now."));
	
	if(ut.exists())
	{
		getUiDevice().pressBack();
		getUiDevice().pressBack();
		
	}
	
	
	
}

public void test007_HomeButton() throws UiObjectNotFoundException

{
	UiObject rust = new UiObject(new UiSelector().className("android.widget.LinearLayout").index(4).
			className("android.widget.LinearLayout").index(0).className("android.widget.RelativeLayout").index(1).instance(1));
	
	if(rust.exists())
	{
		rust.click();
		System.out.println("bye");
	}
	
	System.out.println("hi");
	
	
}

public void test008_SearchButtonClick() throws UiObjectNotFoundException

{
	UiObject rst = new UiObject(new UiSelector().resourceId("com.bsb.hike:id/search"));
	
	if(rst.exists())
	{
		rst.click();
		System.out.println("bye");
	}
	
	
	System.out.println("hi");
	
	
}

public void test009_TextEnter() throws UiObjectNotFoundException

{
	UiObject rst = new UiObject(new UiSelector().resourceId("com.bsb.hike:id/search_src_text"));
	
	if(rst.exists())
	{
		rst.click();
		System.out.println("bye");
		rst.setText("viral");
	}
	
	
	System.out.println("hi");
	
	
}

public void test010_ChatSelection() throws UiObjectNotFoundException, InterruptedException

{
	UiObject rst = new UiObject(new UiSelector().className("android.widget.LinearLayout").index(0).instance(4));
	
	if(rst.exists())
	{
		rst.click();
		rst.wait(100);
		System.out.println("bye");
		
	}
	
	
	System.out.println("hi");
	
	
}

public void test011_MediaDownload() throws UiObjectNotFoundException

{
	  
        UiObject ts = new UiObject(new UiSelector().className("android.widget.ListView").index(0).instance(0));
       // UiObject pt = ts.getChild(new UiSelector().className("android.widget.ImageView").index(0));
       // UiObject p = new UiObject (new UiSelector().className("android.widget.ScrollView").index(4));
          // UiObject st = new UiObject(new UiSelector());
           int t = ts.getChildCount();
           System.out.println(t + " No. of children are");
         
}           
           /*
	 *
        for(int i=0; i<=t; i++){

			

			UiObject s = p.getChild(new UiSelector().className("android.widget.FrameLayout").index(i)).getChild(new UiSelector()
			.className("android.widget.TextView").index(0));

			String str = s.getText();
			//assertEquals(s,"hike");
			
			System.out.println("Text in notification is = " + str);

			if(str.equals("hike") || (str.equals("Tester"))){

				s.click();
				break;
	 * 
	 * 
	 */
	
	
	
/*	
	UiObject rst = new UiObject(new UiSelector().resourceId("com.bsb.hike:id/file_thumb").index(0));
	
	UiObject sst = new UiObject(new UiSelector().className("android.view.View").index(0).instance(1));
		
	if(sst.exists())
	{

		sst.click();
		System.out.println("bye");
		
	}
	
	
	System.out.println("hi");
	
	
}

public void test012_SpaceManagerScreen() throws UiObjectNotFoundException

{
	getUiDevice().pressBack();
	
	UiObject rust = new UiObject(new UiSelector().className("android.widget.LinearLayout").index(4).
			className("android.widget.LinearLayout").index(0).className("android.widget.RelativeLayout").index(2).instance(0));
	
	if(rust.exists())
	{
		rust.click();
		System.out.println("bye");
	}
	
	UiObject ust = new UiObject(new UiSelector().resourceId("com.bsb.hike:id/settings").index(0));
	ust.click();
	
	
UiScrollable st = new UiScrollable(new UiSelector().className("android.widget.ListView").index(0).instance(0));
	
	UiObject urt = st.getChildByText(new UiSelector().className("android.widget.TextView"), "Manage Space");
			
			//getChildByDescription(new UiSelector().className("android.widget.TextView"), "Manage Space");
	
	
	if(urt.exists())
	{
		
		urt.click();
	}
	
	
}

public void test013_SpaceManagerScreen_ItemsDeleted() throws UiObjectNotFoundException

{
	
	
	UiObject ust = new UiObject(new UiSelector().text("Just For Laugh Images"));
	
	if(ust.exists())
	{
		UiObject obj1 = new UiObject(new UiSelector().className("android.widget.RelativeLayout").index(2));
		obj1.click();
		
	}
	
		
	
}

public void test014_DeletebuttonVerification() throws UiObjectNotFoundException

{
	
	
	UiObject obj2 = new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1));
	
	if(obj2.exists())
	{
	obj2.click();	
	}
	

}

public void test015_DeleteDialogVerification() throws UiObjectNotFoundException

{
	
	
	UiObject obj2 = new UiObject(new UiSelector().text("Delete Data"));
	
	new UiObject(new UiSelector().text("NO")).click();
	
     new UiObject(new UiSelector().className("android.widget.LinearLayout").index(1)).click();
	
	

	
		//UiObject obj3 = new UiObject(new UiSelector().text("You are about to delete 30 KB of data from your device.Deleted items cannot be recovered.Do you wish to continue?");
		
		
		new UiObject(new UiSelector().resourceId("com.bsb.hike:id/btn_positive")).click();
		
		getUiDevice().pressBack();
		getUiDevice().pressBack();
		
		UiObject rust = new UiObject(new UiSelector().className("android.widget.LinearLayout").index(4).
				className("android.widget.LinearLayout").index(0).className("android.widget.RelativeLayout").index(1).instance(1));
		
		if(rust.exists())
		{
			rust.click();
			System.out.println("bye");
		}	
		
		
		

}

public void test016_TipClick() throws UiObjectNotFoundException

{
	
	UiObject obj3 = new UiObject(new UiSelector().resourceId("com.bsb.hike:id/atomic_tip_body_text").text("Wish +91678967890 a very Happy Birthday!!!"));
	
	
	UiObject obj2 = new UiObject(new UiSelector().resourceId("com.bsb.hike:id/all_content").index(0));
	
	UiObject obj4 = new UiObject(new UiSelector().resourceId("com.bsb.hike:id/close_tip").index(2));
	
	
	
	if(obj2.exists() && obj3.exists() && obj4.exists())
	{
	obj2.click();
	}
	
	

}	

public void test017_SettingsIconClick() throws UiObjectNotFoundException
{

	
getUiDevice().pressHome();
UiObject ui = new UiObject(new UiSelector().text("Settings"));
ui.click();
UiScrollable st = new UiScrollable(new UiSelector().className("android.widget.FrameLayout").index(1));
st.setAsVerticalList();
UiObject ut = st.getChildByText(new UiSelector().className("android.widget.TextView"), "Apps");
ut.click();

	UiObject rust = new UiObject(new UiSelector().className("android.widget.LinearLayout").index(4).
			className("android.widget.LinearLayout").index(0).className("android.widget.RelativeLayout").index(1).instance(1));
	
	if(rust.exists())
	{
		rust.click();
		System.out.println("bye");
	}	
	
getUiDevice().pressHome();

UiObject str = new UiObject(new UiSelector().text("Settings"));
if(str.exists())
{
	str.click();
}

UiScrollable str1 = new UiScrollable(new UiSelector().className("android.widget.ScrollView"));
//UiObject str2 = str1.getChildByText("android.widget.TextView", "Apps");
UiObject str3 =	str1.getChildByText(new UiSelector().className("android.widget.TextView"), "Apps");
//UiObject obj34 = str1.getChild("android.widget.LinearLayout");
str3.click();

}

public void test018_hikeAppClick() throws UiObjectNotFoundException
{


UiScrollable str4 = new UiScrollable(new UiSelector().className("android.widget.ListView"));
UiObject str12 = str4.getChildByText(new UiSelector().className("android.widget.TextView"), "hike");
str12.click();


}

public void test019_ManageSpaceClick() throws UiObjectNotFoundException
{


new UiObject(new UiSelector().text("Storage")).click();
new UiObject(new UiSelector().text("Manage space")).click();



}*/


}



