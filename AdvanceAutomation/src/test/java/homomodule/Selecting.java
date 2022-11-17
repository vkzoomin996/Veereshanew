package homomodule;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import GenericUtility.BaseClass;

public class Selecting extends BaseClass{
	@Test
	public void demo12154545() throws InterruptedException, IOException {
	WebElement elem = driver.findElement(By.name("checkBoxOption1"));
	//elem.click();
	assertEquals(elem.isSelected(),true);
	logger.log(Status.PASS, "passed");		
	}
}
