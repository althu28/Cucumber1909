package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass {

	public Pojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@type=\"text\"]")
	public WebElement searchbar;

	public WebElement getSearchbar() {
		return searchbar;
	}
	
	
}
