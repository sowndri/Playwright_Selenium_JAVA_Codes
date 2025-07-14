package Playwright_Example.Sessions;
import com.microsoft.playwright.*;

public class Playwright_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Playwright playwright = Playwright.create();
	Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	Page page = browser.newPage();
	page.navigate("https://www.google.co.in/");
	String title = page.title();
	System.out.println("The title of the page:"+title);
	String url= page.url();
	System.out.println("The url of the page:"+url);
	browser.close();
	playwright.close();
	}

}
