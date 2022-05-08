package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By buttonOne = By.id("btn_one");
	private By buttonTwo = By.id("btn_two");
	private By buttonLink = By.id("btn_link");
	private By campoFirst = By.id("first_name");
	private By checkBox = By.id("opt_three");
	private By list = By.id("select_box");
	private By exampleTwo = By.cssSelector("#select_box > option:nth-child(2)");
	
	public By getButtonOne() {
		return buttonOne;
	}
	public By getButtonTwo() {
		return buttonTwo;
	}
	public By getButtonLink() {
		return buttonLink;
	}
	public By getCampoFirst() {
		return campoFirst;
	}
	public By getCheckBox() {
		return checkBox;
	}
	public By getList() {
		return list;
	}
	public By getExampleTwo() {
		return exampleTwo;
	}

}
