package com.priceline;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class PricelineSlidertest 
{
			
	WebDriver firefox=new FirefoxDriver();

	@Test(priority=1)
	public void openBrowser() throws InterruptedException
	{
		
	firefox.get("https://www.priceline.com/home/");
		
	Thread.sleep(2000);

	}

	@Test(priority=2)
	public void testSlider() throws InterruptedException
	{
		
	firefox.findElement(By.xpath(".//*[@id='search-products']/div/div[1]/button[1]")).click();
		Thread.sleep(2000);
		
	firefox.findElement(By.xpath(".//*[@id='search-products']/div/div[1]/button[2]")).click();
		Thread.sleep(2000);
		
	firefox.findElement(By.xpath(".//*[@id='search-products']/div/div[1]/button[3]")).click();
		Thread.sleep(2000);
		
	firefox.findElement(By.xpath(".//*[@id='search-products']/div/div[1]/button[4]")).click();
		Thread.sleep(2000);
		
	firefox.findElement(By.xpath(".//*[@id='search-products']/div/div[1]/button[5]")).click();

	}
	}
