package com.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomObjectModel extends BaseClass {
	
	public PomObjectModel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement userName;
	public WebElement getUserName() {
		return userName;
	}
	public void setUserName(WebElement userName) {
		this.userName = userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}
	public WebElement getLogin() {
		return Login;
	}
	public void setLogin(WebElement login) {
		Login = login;
	}
	@FindBy(id="pass")
	private WebElement passWord;
    @FindBy(name="login")	
    private WebElement Login;
}
