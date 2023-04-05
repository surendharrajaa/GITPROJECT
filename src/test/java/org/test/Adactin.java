package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions ops= new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(ops);
	driver.get("https://adactinhotelapp.com/");
	File eloc=new File("C:\\Users\\lakshmipathy\\eclipse-workspace\\MavenProject\\Excel\\Adactin.xlsx");
	FileInputStream fin=new FileInputStream(eloc);
	Workbook s=new XSSFWorkbook(fin);
	Sheet w = s.getSheet("Data");
	Row c = w.getRow(0);
	Cell t = c.getCell(0);
	String clval = t.getStringCellValue();
	Row o = w.getRow(1);
	Cell u = o.getCell(0);
	String nval = u.getStringCellValue();
	Row p = w.getRow(2);
	Cell l = p.getCell(0);
	String mval = l.getStringCellValue();
	Row a = w.getRow(3);
	Cell k = a.getCell(0);
	String bval = k.getStringCellValue();
	Row i = w.getRow(4);
	Cell d = i.getCell(0);
	String xval = d.getStringCellValue();
	Row h = w.getRow(5);
	Cell kl = h.getCell(0);
	String sval = kl.getStringCellValue();
	WebElement txtuser = driver.findElement(By.id("username"));
	txtuser.sendKeys(clval);
	System.out.println(clval);
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys(nval);
	System.out.println(nval);
	WebElement Lgn = driver.findElement(By.id("login"));
	Lgn.click();
	WebElement name = driver.findElement(By.id("location"));	
	Select j=new Select(name);
	j.selectByValue(mval);
	System.out.println(mval);
	WebElement hotel = driver.findElement(By.id("hotels"));	
	Select e=new Select(hotel);
	e.selectByValue(bval);
	System.out.println(bval);
	WebElement room = driver.findElement(By.id("room_type"));	
	Select q=new Select(room);
	q.selectByValue(xval);
	System.out.println(xval);
	WebElement rooms = driver.findElement(By.id("room_nos"));	
	Select r=new Select(rooms);
	r.selectByVisibleText(sval);
	System.out.println(sval);
	
	Row y = w.getRow(6);
	Cell kp = y.getCell(0);
	String gval = kp.getStringCellValue();
	WebElement adult = driver.findElement(By.id("adult_room"));	
	Select xx=new Select(adult);
	r.selectByVisibleText(gval);
	System.out.println(gval);
	
	Row z = w.getRow(7);
	Cell kj = z.getCell(0);
	String hval = kj.getStringCellValue();
	WebElement child = driver.findElement(By.id("child_room"));	
	Select ay =new Select(adult);
	r.selectByVisibleText(hval);
	System.out.println(hval);
	
	WebElement sub = driver.findElement(By.id("Submit"));
	sub.click();
	WebElement btn = driver.findElement(By.id("radiobutton_0"));
	btn.click();
	WebElement con = driver.findElement(By.id("continue"));
	con.click();
	
	

	
	
	
}
}
