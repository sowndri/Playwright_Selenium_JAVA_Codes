package Playwright_Example.Sessions;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Text_Selectors {

	public static void main(String[] args) {
	
		
		Playwright playwright = Playwright.create();
		Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browsercontext= browser.newContext();
		
		Page page =browsercontext.newPage();
		page.navigate("https://www.orangehrm.com/en/30-day-free-trial");
		
		Locator privacylinks = page.locator("text= Privacy Policy");
		int count = privacylinks.count();
		System.out.println("The total privacylinks are:"+ count);
		
		// It will click the first matching element in the DOM
		//privacylinks.first().click(); 
		
		for(int i=0; i<privacylinks.count();i++)
		{
			String link =privacylinks.nth(i).textContent();
			if(link.equals(" Service Privacy Policy"))
			{
				privacylinks.nth(i).click();
			}
		}
		
		
		playwright.close();
	}

}
