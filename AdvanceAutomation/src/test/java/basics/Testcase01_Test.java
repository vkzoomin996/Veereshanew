package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase01_Test extends Baseclass{
	@Test
	public void testcase() throws InterruptedException {
	driver.findElement(By.id("username")).sendKeys("admin");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	

}}
