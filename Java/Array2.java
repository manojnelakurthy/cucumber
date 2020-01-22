package jan22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Array2 {

	public static void main(String[] args) throws Throwable{
		String login[][]=new String [5][2];
		login[0][0]="Admin";
		login[0][1]="test";
		login[1][0]="test23";
		login[1][1]="Admin";
		login[2][0]="Test564";
		login[2][1]="Admin";
		login[3][0]="Admin";
		login[3][1]="Admin";
		login[4][0]="Admin";
		login[4][1]="Admin";
		
		for(int i=0;i<login.length;i++)
		{
			System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			WebDriver driver=new ChromeDriver();
					
		
			
			driver.get("https://opensource-demo.orangehrmlive.com");
			driver.manage().window().maximize();
			driver.findElement(By.name("txtUsername")).sendKeys(login[i][0]);
			driver.findElement(By.name("txtPassword")).sendKeys(login[i][1]);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(7000);
	
		driver.close();	
	}
		
	}
}
