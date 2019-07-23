package stepdefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class pomimple {
	




	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.00.02\\Desktop\\browsers and drives\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	pageclss obj=new pageclss(driver);
	String url="http://demowebshop.tricentis.com";
	driver.get(url);
	driver.manage().window().maximize();
	obj.clicklink();
	String username="shanmathiraja2112@gmail.com";
	obj.typename(username);
	String password="shanP87602";
	obj.typepassword(password);
	obj.clicklogin();
	System.out.println("the title of the page is:"+driver.getTitle());
	

	}

	}

