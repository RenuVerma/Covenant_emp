package com.csc.PageObject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class POLHomePage extends BaseUI {

	public POLHomePage() {
	}// Constructor

	public POLHomePage(WebDriver driver) {// Constructor
		super(driver);
	}

	// ----------------------------------------------------------------------------------------
	// Method for Date of Event
	@FindBy(id = "Event_DateOfEvent")
	private WebElement Event_Date;

	public POLHomePage chooseDateOfEvent(String EDate) {
		wait.explicitWaitForElement(Event_Date);
		Event_Date.sendKeys(EDate);
		return new POLHomePage();
	}

	// ----------------------------------------------------------------------------------------
	// Method for Time of Event
	@FindBy(id = "Event_TimeOfEvent")
	private WebElement Event_Time;

	public POLHomePage chooseTimeOfEvent(String ETime) {
		wait.explicitWaitForElement(Event_Time);
		Event_Time.sendKeys(ETime);
		return new POLHomePage();
	}
	// ----------------------------------------------------------------------------------------
	// Method for Event Type

	@FindBy(xpath = "/html/body/div[2]/form/div[1]/div[1]/div[2]/div[6]/div/span")
	private WebElement Event_Typee;

	@FindBy(name = "radioGroup")
	private List<WebElement> RadioChoices;

	@FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[1]")
	private WebElement Submit_Selection;

	public POLHomePage chooseEventType(String EType) {
		wait.explicitWaitForElement(Event_Typee);
		Event_Typee.click(); // Click event type search icon
		for (WebElement radiobutton : RadioChoices) {
			if (radiobutton.getAttribute("value").equals(EType)) {
				radiobutton.click(); // select event type
			}
		}
		Submit_Selection.click();
		return new POLHomePage();
	}
	// ----------------------------------------------------------------------------------------
	// Method for Choose Time Employee Began Work on the Day of Injury (hh:mm
	// AM/PM)

	@FindBy(id = "Time")
	private WebElement Emp_Time;

	public POLHomePage chooseTimeOfEmpBegin(String EmpTime) {
		wait.explicitWaitForElement(Emp_Time);
		Emp_Time.sendKeys(EmpTime);
		return new POLHomePage();
	}

	// ----------------------------------------------------------------------------------------
	// Method for Chosse Date Employer Notified (mm/dd/yyyy)

	@FindBy(id = "Last_Day")
	private WebElement Emp_Noti_Time;

	public POLHomePage chooseDateEmpNotifier(String ENDate) {
		wait.explicitWaitForElement(Emp_Noti_Time);
		Emp_Noti_Time.sendKeys(ENDate);
		return new POLHomePage();
	}

	// ----------------------------------------------------------------------------------------
	// Method for the Event Location

	@FindBy(xpath = "//html/body/div[2]/form/div[1]/div[1]/div[2]/div[23]/div/span")
	private WebElement Event_Loc;

	public POLHomePage chooseEventLocation(String ELoc) {

		Event_Loc.click(); // Click event Location search icon
		try {
			Thread.sleep(2000); // wait for the list
			for (WebElement radiobuttonloc : RadioChoices) {
				if (radiobuttonloc.getAttribute("value").equals(ELoc)) {
					radiobuttonloc.click(); // select Event Location
				}
			}
			Submit_Selection.click();
		} catch (InterruptedException e) {// TODO Auto-generated catch block

			e.printStackTrace();
		}
		return new POLHomePage();
	}

	// ----------------------------------------------------------------------------------------
	// Method for Chosse Date Employer Notified (mm/dd/yyyy)

	@FindBy(id = "Shift")
	private WebElement Emp_Shift;

	public POLHomePage chooseShift(String Shift) {
		wait.explicitWaitForElement(Emp_Shift);
		Emp_Shift.sendKeys(Shift);
		return new POLHomePage();
	}

	// ----------------------------------------------------------------------------------------
	// Method for Injured Body Part (select all that apply)

	// @FindBy(xpath =
	// "/html/body/div[2]/form/div[1]/div[1]/div[2]/div[26]/div/span")
	@FindBy(className = "glyphicon glyphicon-search")
	private WebElement Injured_body;

	public POLHomePage chooseInjuredBodyPart(String IBody) {
		System.out.println("I m in");
		wait.explicitWaitForElement(Injured_body);
		Injured_body.click(); // Click Injured Body search icon
		try {
			Thread.sleep(1000); // wait for the list
			for (WebElement radiobuttonloc : RadioChoices) {
				if (radiobuttonloc.getAttribute("value").equals(IBody)) {
					radiobuttonloc.click(); // select Injured Body
				}
			}
			Submit_Selection.click();
		} catch (InterruptedException e) {// TODO Auto-generated catch block

			e.printStackTrace();
		}
		return new POLHomePage();
	}

	// ----------------------------------------------------------------------------------------
	// Method for Was a Patient Involved?

	@FindBy(id = "Was_Patient_Involved")
	private WebElement PInvolved;

	public POLHomePage chooseWas_Patient_Involved(String PatInvolved) {
		wait.explicitWaitForElement(PInvolved);
		Select option = new Select(PInvolved);// Make new select class for the
												// drop-down element
		option.selectByVisibleText(PatInvolved);// Select the value.
		return new POLHomePage();
	}

	// ----------------------------------------------------------------------------------------
	// Method for Write How Injury Occurred

	@FindBy(id = "How_Injury_Occured")
	private WebElement HowInOcc;

	public POLHomePage WriteHowInjuryOccured(String HowInj) {
		wait.explicitWaitForElement(HowInOcc);
		HowInOcc.sendKeys(HowInj);
		return new POLHomePage();
	}

	// ----------------------------------------------------------------------------------------
	// Method for Was there a Hazard Noted?

	@FindBy(id = "Hazard")
	private WebElement HazNoted;

	public POLHomePage WriteHazardNoted(String Haznoted) {
		wait.explicitWaitForElement(HazNoted);
		Select option = new Select(HazNoted);// Make new select class for the
												// drop-down element
		option.selectByVisibleText(Haznoted);// Select the value.
		return new POLHomePage();
	}

	// ----------------------------------------------------------------------------------------
	// Method for Write Names of Witnesses

	@FindBy(id = "Witness")
	private WebElement witness;

	public POLHomePage WriteNamesOfWitnesses(String wit_Name) {
		wait.explicitWaitForElement(witness);
		witness.sendKeys(wit_Name);
		return new POLHomePage();
	}

	// ----------------------------------------------------------------------------------------
	// Method for Click on Summary Button

	@FindBy(xpath = "/html/body/div[2]/form/div[3]/a")
	private WebElement Summary;

	public POLHomePage ClickSummaryButton() {
		wait.explicitWaitForElement(Summary);
		Summary.click();
		return new POLHomePage();
	}

}
