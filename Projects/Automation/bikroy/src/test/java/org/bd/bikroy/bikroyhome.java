package org.bd.bikroy;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class bikroyhome extends bikroybase{

	public static String baseurl = "https://bikroy.com/";
	
	
	@Test
	public void openurl() throws InterruptedException
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		logtracker();
		
		
	}
	@Test ( priority = 1)
	public void login() throws InterruptedException
	{
		
		
		WebElement login = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.top-container--12FJu.all.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-column--3aExp.flex--3fKk1 div.only-desktop--2pxYG:nth-child(2) nav.nav--1qSMY.background--2lR9B div.justify-content-space-between--bjSys.align-items-center--159cZ.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1 ul.nav-bar-list--201Xv:nth-child(2) li.login-icon-container--3oQMU:nth-child(2) div.justify-content-flex-start--1Xozy.align-items-center--159cZ.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1 a.header-link--woAbP.title--1NHWk.gtm-login-click.active > span.title--1NHWk.gtm-login-click"));
		
		login.click();
		
		Thread.sleep(5000);
		
	}
	
	@Test (priority =2)
	public void loginemail() throws InterruptedException
	{
		WebElement email = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.modal-overlay--3cs8Z div.focus-trap-wrapper--2kIsn div.modal-content--1umVj div.row--3Vhjr.login-container--2z_9L.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-wrap--2PCx8.flex-direction-row--27fh1.flex--3fKk1 div.sm-col-12--30zDS.lg-col-6--g-Ot_.login--hZ65g.block--3v-Ow:nth-child(2) div.container--2mwdK div.gtm-email-login:nth-child(6) button.btn--1gFez.secondary--Os-e9.background--2lR9B.small--1MQ15.button--eCUEQ.gtm-email-login > span.email-text--FbASN"));
		email.click();
		Thread.sleep(5000);
	}
	@Test (priority = 3)
	public void loginnfo() throws InterruptedException
	{
		WebElement linfo = driver.findElement(By.cssSelector("#input_email"));
		WebElement pass = driver.findElement(By.cssSelector("#input_password"));
		linfo.sendKeys("sbbrcse@gmail.com");
		pass.sendKeys("wm085233");
		
		Thread.sleep(5000);
		
		
	}
	
	@Test (priority = 4)
	public void loginbutton() throws InterruptedException
	
	{
		WebElement lgnbtn = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.modal-overlay--3cs8Z div.focus-trap-wrapper--2kIsn div.modal-content--1umVj div.row--3Vhjr.login-container--2z_9L.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-wrap--2PCx8.flex-direction-row--27fh1.flex--3fKk1 div.sm-col-12--30zDS.lg-col-6--g-Ot_.login--hZ65g.block--3v-Ow:nth-child(2) div:nth-child(1) form.form--1G_Qn:nth-child(1) div.justify-content-flex-end--jceWj.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1 div.sm-col-12--30zDS.lg-col-12--1_BS_.block--3v-Ow > button.btn--1gFez.secondary--Os-e9.background--2lR9B.small--1MQ15.gtm-login"));
		
		lgnbtn.click();
		
		Thread.sleep(5000);
	}
	
	@Test (priority = 5)
	public void locationbtn() throws InterruptedException
	
	{
		WebElement location = driver.findElement(By.xpath("//span[contains(text(),'All of Bangladesh')]"));
		location.click();
		//select.click();
		
		Thread.sleep(5000);
	}
	
	@Test (priority = 6)
	public void locationslct() throws InterruptedException
	
	{
		//WebElement location = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.top-container--12FJu.all.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-column--3aExp.flex--3fKk1 div.desktop-max-width-container--3xntY.main-content-area--o-zsx.skeleton-content--2JN5q:nth-child(3) div.search-container--1aaDi.justify-content-center--3YVEn.align-items-flex-end--Fg8OY.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1:nth-child(2) div.section--3qPXi.inner--2X7Be.justify-content-flex-end--jceWj.align-items-center--159cZ.flex-wrap-nowrap--3IpfJ.flex-direction-column--3aExp.flex--3fKk1 button.btn--1gFez.default--T8kE3.small--1MQ15.location-picker-btn--p3-uX.gtm-home-location-picker-click > span:nth-child(2)"));
		WebElement select = driver.findElement(By.cssSelector("body.bgwhite:nth-child(2) div.modal-overlay--3cs8Z.all div.focus-trap-wrapper--2kIsn div.modal-content--1umVj div.container--317sx div.row--3Vhjr.justify-content-flex-start--1Xozy.align-items-normal--vaTgD.flex-wrap-wrap--2PCx8.flex-direction-row--27fh1.flex--3fKk1 div.sm-col-12--30zDS.lg-col-6--g-Ot_.block--3v-Ow div.list-container--1szlU div.col-wrapper--EHXhG:nth-child(3) div.item-list--1jgKI ul.list--uEf0L li.list-item-wrapper--2EIpW:nth-child(1) button.list-item--2dM7Z.item--OZFrC > div.justify-content-space-between--bjSys.align-items-normal--vaTgD.flex-wrap-nowrap--3IpfJ.flex-direction-row--27fh1.flex--3fKk1"));
		select.click();
		
		
		Thread.sleep(5000);
	}
	
	
	
}
