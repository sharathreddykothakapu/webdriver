package webdriver31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class webdriver31 {
	@Test(enabled=false)
	public void dragAndDrop1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRI CHARAN REDDY\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver d1;
		d1 = new ChromeDriver();
	    d1.get("http://www.leafground.com/pages/drag.html");

	    //Draged and droped 
	    WebElement element1 = d1.findElement(By.xpath("//*[@id=\"draggable\"]"));
	    Actions builder = new Actions(d1);
	    builder.dragAndDropBy(element1, 250,250)
	    		             .release(element1)
	    		             .build()
	    		             .perform();
	    
	    	    
}
	
	@Test(enabled=false)
	public void DragAndDrop2() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRI CHARAN REDDY\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver d1;
		d1 = new ChromeDriver();
	    d1.get("http://www.leafground.com/pages/drop.html");

	    //Draged and droped in targated element
	    WebElement element1 = d1.findElement(By.xpath("//*[@id=\"draggable\"]"));
	    WebElement element2 = d1.findElement(By.xpath("//*[@id=\"droppable\"]"));
	    
	    Actions builder = new Actions(d1);
	    
	    builder.dragAndDrop(element1, element2)
	    		             .build()
	    		             .perform();
	    
	}
	@Test(enabled=false)
	public void OL() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRI CHARAN REDDY\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver d1;
		d1 = new ChromeDriver();
	    d1.get("http://demo.automationtesting.in/Selectable.html");
	   
	    
	    d1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	    List<WebElement> elements = d1.findElements(By.xpath("//*[@id=\"Serialize\"]/ul/li"));
	   
	    Actions select = new Actions(d1);
	    select.keyDown(Keys.CONTROL)
	    .click(elements.get(0))
	    .click(elements.get(1))
	    .click(elements.get(3))
	    .click(elements.get(4))
	    .click(elements.get(6)).build().perform();
	    }
	
	@Test
	public void UL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SRI CHARAN REDDY\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver d1;
		d1 = new ChromeDriver();
	    d1.get("http://demo.automationtesting.in/AutoComplete.html");
	    
	  
	    WebElement ele1= d1.findElement(By.xpath("//*[@id=\"searchbox\"]"));
	    ele1.sendKeys("ind");
	    Thread.sleep(3000);
	    List<WebElement>elements1 = d1.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
	    for(WebElement el:elements1) {
	    	if(el.getText().equalsIgnoreCase("India")) {
	    		el.click();
	    		System.out.println(el);
	    		break;
	    		
	   	}
	  }
	    
	}
}