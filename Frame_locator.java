package Playwright_Example.Sessions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Frame_locator {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser Browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext browsercontext = Browser.newContext();
		Page page = browsercontext.newPage();
		
		page.navigate("https://www.londonfreelance.org/courses/frames/index.html");
		
		String text =page.frameLocator("frame[name ='main']").locator("h2").textContent();
		System.out.println(text);
		
		
		//String text = page.frame("main").locator("h2").textContent();
		//System.out.println(text);
		
		
	}

}
