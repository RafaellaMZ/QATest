package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String appUrl, String descricaopasso) {

		System.setProperty("webdriver.chrome.driver", "C:\\DRIVER\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(appUrl);

		driver.manage().window().maximize();
	}

	public void fecharNavegador(String descriPasso) {

		driver.quit();

	}

	public void escrever(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}

	public void submit(By elemento) {

		driver.findElement(elemento).submit();

	}

	public void clicar(By elemento) {

		driver.findElement(elemento).click();

	}

	public void screenShot(String nome) throws IOException {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File desFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(srcFile, desFile);

	}

	public boolean validarAusencia(By elemento) {

		try {
			driver.findElement(elemento);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}

	}

	public void scroll() {

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)", "");
	}
	
	public void aguardar () throws InterruptedException {
		Thread.sleep(20000);
	}

}
