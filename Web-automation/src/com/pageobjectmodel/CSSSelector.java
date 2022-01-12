package com.pageobjectmodel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
//		absoluteCSSpath();
//		relativCSSUsingTagnameAlone();
//		 relativeCSSUsingTagNameWithIdAttributeValue();
//		relativeCSSUsingIDAtrribute();
//		relativeCSSUsingTagNameWithClassAtrribute();
//		relativeCSSUsingClassAtrribute();
//		relativeCSSUsingTagNameWithAtrributeNameAndValue();
//		relativeCSSUsingTagNameWithMultipleAtrributeNameAndValue();
//		relativeCSSUsingAtrributeNameAndValue();
//		relativeCSSUsingParentElementReference();
//		relativeCSSUsingchildReference();
		relativeCSSUsingSiblingConcept();
		
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("E:\\notes\\selenium\\cssselector_02_nov_2021\\CSSSelector_02_NOV_2021\\Sample.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void absoluteCSSpath()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case 1:Identify the element based on <tagNamae>
	 *  <Syantax>:
	 *    <taagName>
	 */
	static void relativCSSUsingTagnameAlone()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("input")).sendKeys("Demo");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case 2:Identify Based on<tagName> with id attributvalue
	 * Syantx:
	 *  <tagName>#<id attribute value>
	 */
	static void relativeCSSUsingTagNameWithIdAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("Demo");
	}
	/**
	 * Case 3:  identify based on <tagName> with id attribute value
	 * Syntax:
	 * #<id attribute value>
	 */
	static void relativeCSSUsingIDAtrribute()
	{
		oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("demo");
	}
	/**
	 * Case 4:  identify based on <tagName> with class attribute value
	 * Syntax:
	 * <tagName>.<class attribute value>
	 */
	static void relativeCSSUsingTagNameWithClassAtrribute()
	{
		oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("demo");
	}
	/**
	 * Case 5:  identify based on class attribute value
	 * Syntax:
	 * .<class attribute value>
	 */
	static void relativeCSSUsingClassAtrribute()
	{
		oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("demo");
	}
	/**
	 * Case 6:  identify based on tagname with attribute name and value
	 * Syntax:
	 * <tagName>[attribute name='attribute value']
	 */
	static void relativeCSSUsingTagNameWithAtrributeNameAndValue()
	{
		oBrowser.findElement(By.cssSelector("input[id='btn1submit1button1']")).click();
	}
	/**
	 * Case 7:  identify based on tagname with Multiple attribute name and value
	 * Syntax:
	 * <tagName>[attribute name='attribute value'][attribute name='attribute value']
	 */
	static void relativeCSSUsingTagNameWithMultipleAtrributeNameAndValue()
	{
		oBrowser.findElement(By.cssSelector("input[id='btn1submit1button1'][name='submit1btn1']")).click();
	}
	/**
	 * Case 8:  identify based on attribute name and value
	 * Syntax:
	 * *[attribute name='attribute value']
	 */
	static void relativeCSSUsingAtrributeNameAndValue()
	{
		oBrowser.findElement(By.cssSelector("*[name='submit1btn1']")).click();
	}
	/**
	 * Case 9:  identify based on parent element reference
	 * Syntax:
	 * <parent Element> > <child Element>
	 */
	static void relativeCSSUsingParentElementReference()
	{
		oBrowser.findElement(By.cssSelector("form#frm2>input")).click();
	}
	/**
	 * Case 10:  identify based on nth child reference
	 * Syntax:
	 * nth-child (parent Element)
	 */
	static void relativeCSSUsingchildReference()
	{
		oBrowser.findElement(By.cssSelector("form # frm3>:nth-child(5)")).sendKeys("Demo1");
	}
	/**
	 * Case 11:  identify based on sibling cocept
	 * Syntax:
	 * <tagName>+<tagName>+N
	 */
	static void relativeCSSUsingSiblingConcept()
	{
		oBrowser.findElement(By.cssSelector("form#frm3>input+input+input")).sendKeys("Demo1");
	}
}
