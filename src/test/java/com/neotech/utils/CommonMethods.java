package com.neotech.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
import com.neotech.testbase.PageInitializer;

public class CommonMethods extends PageInitializer {

	/**
	 * This method clears the text of a web element and sends the text parameter to
	 * it
	 * 
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * This method pauses the execution for a certain amount of time
	 * 
	 * @param seconds
	 */
	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method selects a value from a radio button list or checkbox list
	 * 
	 * @param elementList
	 * @param selectValue
	 */
	public static void clickRadioOrCheckbox(List<WebElement> elementList, String selectValue) {

		for (WebElement el : elementList) {

			String value = el.getDomProperty("value");

			if (value == null || value.isBlank()) {
				value = el.getText();
			}

			if (value != null && value.trim().equals(selectValue) && el.isEnabled()) {

				click(el);
				break;
			}
		}
	}

	/**
	 * This method selects an item from a dropdown using the index
	 * 
	 * @param element
	 * @param visibleText
	 */
	public static void selectDropdown(WebElement element, int index) {
		try {
			Select sl = new Select(element);
			sl.selectByIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method selects an item from a dropdown using the visible text
	 * 
	 * @param element
	 * @param visibleText
	 */
	public static void selectDropdown(WebElement element, String visibleText) {
		try {
			Select sl = new Select(element);
			sl.selectByVisibleText(visibleText);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	/**
//	 * This method selects an item from custom dropdown using option text.
//	 * 
//	 * @param dropdownButton
//	 * @param optionText
//	 */
//	public static void selectCustomDropdown(WebElement dropdown, String value) {
//
//		try {
//
//			// open dropdown
//			click(dropdown);
//
//			// wait + click visible option directly (GLOBAL search)
//			WebElement option = driver.findElement(By.xpath("//span[normalize-space()='" + value + "']"));
//
//			click(waitForClickability(option));
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * This method selects an item from custom dropdown using option text.
	 * 
	 * @param dropdownButton
	 * @param optionText
	 */
	public static void selectCustomDropdown(WebElement dropdown, String value) {

		try {

			click(dropdown);

			String menuId = dropdown.getAttribute("data-activates");

			WebElement wrapper = driver.findElement(By.id(menuId));

			WebElement option = waitForClickability(
					wrapper.findElement(By.xpath(".//span[normalize-space()='" + value + "']")));

			click(option);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method selects an item from custom dropdown using option text.
	 * 
	 * @param dropdownButton
	 * @param optionText
	 */
	public static void selectBootstrapDropdown(WebElement dropdown, String optionText) {

		try {

			click(dropdown);

			WebElement wrapper = dropdown.findElement(By.xpath("./ancestor::div[contains(@class,'bootstrap-select')]"));

			WebElement option = waitForClickability(wrapper.findElement(By
					.xpath(".//a[contains(@class,'dropdown-item')][.//span[normalize-space()='" + optionText + "']]")));

			click(option);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method selects an item from custom dropdown using option text.
	 * 
	 * @param dropdownButton
	 * @param optionText
	 */
	public static void selectBootstrapDropdown2(WebElement dropdown, String optionText) {

		try {

			// 1. open dropdown
			click(dropdown);

			// 2. wait dropdown menu
			WebElement option = driver
					.findElement(By.xpath("//div[contains(@class,'dropdown-menu') and contains(@class,'show')]"
							+ "//a[.//span[normalize-space()='" + optionText + "']]"));

			click(option);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method selects an item from custom dropdown using option text.
	 * 
	 * @param dropdownButton
	 * @param optionText
	 */
	public void selectActionDropdown(WebElement dropdown, String optionText) {

		try {

			// icon click
			WebElement icon = dropdown.findElement(By.tagName("i"));
			click(icon);

			String menuId = dropdown.getAttribute("data-activates");

			WebElement wrapper = driver.findElement(By.id(menuId));

			WebElement option = waitForClickability(
					wrapper.findElement(By.xpath(".//a[normalize-space()='" + optionText + "']")));

			click(option);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method accepts an alert if it is present in page. Otherwise the
	 * exception is handled: NoAlertPresentException
	 */
	public static void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method dismisses an alert if it is present in page. Otherwise the
	 * exception is handled: NoAlertPresentException
	 */
	public static void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method returns the text of an alert. If there is no alert in page, it
	 * returns null.
	 * 
	 * @return
	 */
	public static String getAlertText() {
		try {
			Alert alert = driver.switchTo().alert();
			return alert.getText();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * This method sends the provided text to the alert. If not alert is present in
	 * page, the exception is handled.
	 * 
	 * @param text
	 */
	public static void sendAlertText(String text) {
		try {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method switches to the frame whose id or name is provided. If the frame
	 * does not exist, the exception is handled.
	 * 
	 * @param nameOrId
	 */
	public static void switchToFrame(String nameOrId) {
		try {
			driver.switchTo().frame(nameOrId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method switches to the frame whose index is provided. If the frame does
	 * not exist, the exception is handled.
	 * 
	 * @param nameOrId
	 */
	public static void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method switches to the frame whose WebElement is provided. If the frame
	 * does not exist, the exception is handled.
	 * 
	 * @param nameOrId
	 */
	public static void switchToFrame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method switches to the child window if exists
	 */
	public static void switchToChildWindow() {
		String mainWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			if (!handle.equals(mainWindow)) {
				driver.switchTo().window(handle);
			}
		}
	}

	/**
	 * This method creates and returns a WebDriverWait object using the default wait
	 * time under Constants
	 * 
	 * @return
	 */
	public static WebDriverWait getWaitObject() {
		return new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
	}

	/**
	 * This method creates and returns a WebDriverWait object using the provided
	 * wait time
	 * 
	 * @return
	 */
	public static WebDriverWait getWaitObject(int secondsToWait) {
		return new WebDriverWait(driver, Duration.ofSeconds(secondsToWait));
	}

	/**
	 * This method will wait for an element to be visible.
	 * 
	 * @param element
	 * @return
	 */
	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method waits until the provided element is clickable in page.
	 * 
	 * @param locator
	 * @return
	 */
	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method clicks on the provided web element after making sure it is
	 * clickable.
	 * 
	 * @param element
	 */
	public static void click(WebElement element) {
		waitForClickability(element);
		element.click();
	}

	/**
	 * This method will cast the driver to a JavascriptExecutor object
	 * 
	 * @return
	 */
	public static JavascriptExecutor getJSObject() {
		return (JavascriptExecutor) driver;
	}

	/**
	 * This method will click on an element using the JavascriptExecuter
	 * 
	 * @param element
	 */
	public static void jsClick(WebElement element) {
		getJSObject().executeScript("arguments[0].click()", element);
	}

	/**
	 * This method scrolls the page down using the pixels parameter
	 * 
	 * @param pixels
	 */
	public static void scrollDown(int pixels) {
		getJSObject().executeScript("window.scrollBy(0," + pixels + ")");
	}

	/**
	 * This method scrolls the page up using the pixels parameter
	 * 
	 * @param pixels
	 */
	public static void scrollUp(int pixels) {
		getJSObject().executeScript("window.scrollBy(0,-" + pixels + ")");
	}

	/**
	 * This method scrolls the page until the web element is visible in page
	 * 
	 * @param element
	 */
	public static void scrollToElement(WebElement element) {
		getJSObject().executeScript("arguments[0].scrollIntoView(true)", element);
	}

	/**
	 * This method selects the day from a list of days
	 * 
	 * @param days
	 * @param selectedDay
	 */
	public static void selectCalendarDay(List<WebElement> days, String selectedDay) {
		for (WebElement day : days) {
			if (day.getText().equals(selectedDay)) {
				if (day.isEnabled()) {
					click(day);
					break;
				} else {
					System.out.println("This day is not enabled!!!");
					break;
				}
			}
		}
	}

	/**
	 * This method selects the day from a calendar
	 * 
	 * @param calender
	 * @param month
	 * @param day
	 * @param year
	 */
	public static void selectCalendarDate(WebElement calendar, String month, String day, String year) {

		try {

			click(calendar);

			WebElement widget = calendar
					.findElement(By.xpath("./ancestor::span[contains(@class,'hidden-date-widget')]"));

			// year
			click(waitForClickability(
					widget.findElement(By.xpath(".//div[contains(@class,'picker__select--year')]//input"))));

			click(waitForClickability(widget
					.findElement(By.xpath(".//ul[contains(@style,'display: block')]//span[text()='" + year + "']"))));

			// month
			click(waitForClickability(
					widget.findElement(By.xpath(".//div[contains(@class,'picker__select--month')]//input"))));

			click(waitForClickability(widget
					.findElement(By.xpath(".//ul[contains(@style,'display: block')]//span[text()='" + month + "']"))));

			// day
			click(waitForClickability(widget.findElement(
					By.xpath(".//div[contains(@class,'picker__day--infocus') and text()='" + day + "']"))));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Not Working!!
	public static void selectBoostrapCalendarDate(WebElement calendarInput, String month, String day, String year) {
		try {

			// open calendar
			click(calendarInput);

			WebElement picker = driver.findElement(By.xpath("//div[contains(@class,'picker--opened')]"));

			// MONTH (Select class)
			WebElement monthSelect = picker.findElement(By.cssSelector("select.picker__select--month"));
			Select monthDropdown = new Select(monthSelect);
			monthDropdown.selectByVisibleText(month);

			// YEAR (Select class)
			WebElement yearSelect = picker.findElement(By.cssSelector("select.picker__select--year"));
			Select yearDropdown = new Select(yearSelect);
			yearDropdown.selectByVisibleText(year);

			// DAY
			WebElement dayElement = picker
					.findElement(By.xpath(".//div[contains(@class,'picker__day--infocus') and text()='" + day + "']"));

			click(dayElement);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will take a screenshot saves it in the screenshots folder with
	 * the given fileName.
	 * 
	 * @param fileName
	 */
	public static String takeScreenshot(String fileName) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		String destination = Constants.SCREENSHOT_FILEPATH + fileName + getTimeStamp() + ".png";

		try {
			Files.copy(source, new File(destination));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return destination;
	}

	/**
	 * This method returns the current timestamp in the format of
	 * yyyy-MM-dd_HH-mm-ss
	 * 
	 * @return
	 */
	public static String getTimeStamp() {
		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");

		return sdf.format(date);
	}

}
