package Playwright_Example.Sessions;
import java.nio.file.Paths;
import com.microsoft.playwright.*;
public class TraceView_Inspection {

	public static void main(String[] args) {
		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
					.setHeadless(false));
			BrowserContext context = browser.newContext();
			
			context.tracing().start(new Tracing.StartOptions()
					.setScreenshots(true)
					.setSnapshots(true));
			
			Page page8 = context.newPage();
			page8.navigate("https://www.flipkart.com/"); 
			
			context.tracing().stop(new Tracing.StopOptions()
					.setPath(Paths.get("trace.zip")));


		}




	}

}

