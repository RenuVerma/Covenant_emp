package com.csc.testCases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;


import CoHealthNew.CoHealth.Intializer;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppTest
{
	public static Intializer test;

	@BeforeClass
	public static void startTest(){
		test = new Intializer("chrome");
	}
	
	@Test
	public void CheckLoginPage(){
		test.loginPage.launchApplication("http://localhost/Shell Web Form Covenant Employee/WebForm/PageBuilder.aspx");//Launch URL
		test.loginPage.logIn("00004","05/15/1981");//Enter the credentials
		}
	
	@Test
	public void HomePage(){
		    test.homePage.chooseDateOfEvent("08/14/2007"); //Choose Date of Event
		    test.homePage.chooseTimeOfEvent("01:00PM"); //Choose Date of Event
			test.homePage.chooseEventType("0002: Struck By"); //Choose Event Type
			test.homePage.chooseTimeOfEmpBegin("03:00PM"); //Choose Time Employee Began Work on the Day of Injury (hh:mm AM/PM)
			test.homePage.chooseDateEmpNotifier("08/14/2037"); //Choose Date Employer Notified (mm/dd/yyyy)
			test.homePage.chooseEventLocation("CATH: Cath Lab"); //Choose Event Location
			test.homePage.chooseShift("General"); //Choose Shift
			//test.homePage.chooseInjuredBodyPart("1100: Skull"); //Choose Shift
			test.homePage.chooseWas_Patient_Involved("1: No"); //Choose Person Involved
			test.homePage.WriteHowInjuryOccured("Due to the rainy season"); //Write How Injury Occurred
			test.homePage.WriteHazardNoted("N: No"); //Write Was there a Hazard Noted?
			test.homePage.WriteNamesOfWitnesses("Joseph Jhon"); //Write Names of Witnesses
			test.homePage.ClickSummaryButton(); //Write Names of Witnesses
			
	}
//	@AfterClass
//	public static void closeSession (){
//		System.out.println("Close");
//		test.loginPage.closeBrowser();
//	}
//	
	
}
