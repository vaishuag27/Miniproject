package org.test;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Project extends Read
{


public static void main(String[] args) throws IOException
  {
	System.setProperty("webdriver.chrome.driver",
			"D:\\VAISHNAVI\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	File f1 =new File("C:\\Users\\Anuj\\eclipse\\java project\\MiniProj\\txtFolder");
	boolean b = f1.mkdir();
	System.out.println("Folder is Created."+b);
	File f2 = new File("C:\\Users\\Anuj\\eclipse\\java project\\MiniProj\\txtFolder\\write.txt");
	boolean c = f2.createNewFile();
	System.out.println("Text File Created."+c);
	Actions acc = new Actions (driver);
	Robot r = null;
	try {
		r = new Robot();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String rw = getData();

	for(int i= 0; i<=2;i++);
	{
	
		
		
	driver.get("https://www.amazon.in/");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String title = driver.getTitle();
	System.out.println(title);
	
	
	
	driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
	
	WebElement txtMail = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
	txtMail.sendKeys("8208542657");
	
	WebElement continuebtn =driver.findElement(By.xpath("//*[@id=\"continue\"]"));
	continuebtn.click();
	
	WebElement txtpwd = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
	txtpwd.sendKeys("Vgadewar27");
	
	WebElement signinbtn =driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
	signinbtn.click();
	
	WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	searchbox.click();
	
	WebElement input = driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']"));
	input.sendKeys("Oneplus mobile(rw[i])");
	
    r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	WebElement phn = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span"));
     phn.click();
    r.keyPress(KeyEvent.VK_ENTER);
 	r.keyRelease(KeyEvent.VK_ENTER);
 	WebElement cart =driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
	cart.click();
	
	
	System.out.println("-------------------------------------------------------------------------------");
	
	WebElement input2 = driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']"));
	input2.sendKeys("Nokia mobile");
	
    r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("-------------------------------------------------------------------------------");
	
	WebElement input3 = driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']"));
	input3.sendKeys("Samsung mobile");
	
    r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String pwid = driver.getWindowHandle();
	System.out.println(pwid);
	
	Set<String> all = driver.getWindowHandles();
	System.out.println(all);
	
	List<String> items = new ArrayList<String>();
	items.addAll(all);
	
	for(String x : all)
	{
	if(!pwid.equals(x)) 
	{
		driver.switchTo().window(x);
		
	}
	}
	
	
	
}
}

private static String getData() {
	// TODO Auto-generated method stub
	return null;
	
	
	
	
}
}