package org.onetwo;

public class Three {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("\"https://www.facebook.com/\"");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.close();
		
	}
	}



