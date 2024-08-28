package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		WebElement image=driver.findElement(By.xpath("//img[@id='drag7']"));
		WebElement box=driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(image, box).perform();
		
		Thread.sleep(2000);
		a.dragAndDrop(box, image).perform();
	}

}
