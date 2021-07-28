package stereotipoDonna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExecutionDonnaStereotipoDonna {

	private static WebDriver driver;
	private static ChromeOptions options;
	private static WebDriverWait wait;
	private static JavascriptExecutor js;
	private static Random random;



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"chromedriver.exe");

		options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-web-security");
		options.addArguments("disable-infobars");
		options.addArguments("--disable-extensions");
		// options.addArguments("--user-data-dir=/tmp/chrome-sesh");
		options.addArguments("--allow-running-insecure-content");
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		// disablad google save credentials
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);

		driver = new ChromeDriver(options);
		wait = new WebDriverWait(driver, 10);

		random = new Random();
		js = (JavascriptExecutor) driver;

			nhi();
			Thread.sleep(2000);
			webMD();
			Thread.sleep(2000);
			caseVacanze();
			Thread.sleep(2000);
			linkedin();
			Thread.sleep(2000);
			euronics();
			Thread.sleep(2000);
			foodJustEat();
			Thread.sleep(2000);
			booking();
			Thread.sleep(2000);
			libero();
			Thread.sleep(2000);
			facebook();
			Thread.sleep(2000);
			google();
			Thread.sleep(2000);
			 instagram();
			 Thread.sleep(2000);
			 amazon();
			 Thread.sleep(2000);
			 samsung();
			 Thread.sleep(2000);
			 monsterJob();
			 Thread.sleep(2000);
			 newYorkTimes();
			 Thread.sleep(2000);

			 driver.quit();

	}

	public static void linkedin() throws InterruptedException {
		//Keys job
		String listResJobs[] = {"estetista", "truccatrice", "babysitter", "dogsitter", "cassiera", "postina", "cameriera",
				"badante", "donna pulizie", "massaggiatrice","rappresentante avon" };
		int randJobs = random.nextInt(listResJobs.length);

		driver.get("https://www.linkedin.com/");
		try {
			//Login
			driver.findElement(By.linkText("Accedi")).click();
			driver.findElement(By.id("username")).click();
			driver.findElement(By.id("username")).sendKeys("francescafrida92@gmail.com");
			driver.findElement(By.id("password")).click();
			driver.findElement(By.id("password")).sendKeys("Francesca92!");
			driver.findElement(By.cssSelector(".btn__primary--large")).click();
			try {
				//Button "non ora"
				driver.findElement(By.xpath("/html/body/div/main/div/section/footer/form[1]/button")).click();
			} catch (Exception e) {

			}
			//End login
			Thread.sleep(5000);

			//Search Job
			String job = listResJobs[randJobs];
			driver.findElement(By.xpath("/html/body/div[6]/header/div/div/div/div[1]/input")).sendKeys(job.toString() + Keys.ENTER);
			//End search Job
		}catch (Exception e){

		}
	}


	public static void caseVacanze() throws InterruptedException{
		String listTrip[] = { "Milan", "Rome", "Vinice", "London", "Berlin", "Dublin", "Naples", "Madrid", "Vienna",
				"Tokyo", "New york", "Boston", "Buenos Aires", "Toronto", "Lisbon", "Atene", "Oslo", "Moscow", "Sydney",
				"Ginevra", "Paris", "Mancester", "Firenze", "Varsavia", "Amsterdam", "Helsinki", "Sofia", "Lussemburgo",
				"Copenaghen", "Libiana", "Bucarest", "Budapest", "Los Angeles", "Miami", "Zagrabria", "Barcellona" };
		int randTrip = random.nextInt(listTrip.length);

		driver.get("https://www.casevacanza.it/");

		//Coockie Button
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[2]/div[2]/button[2]")).click();

		//Search
		String city = listTrip[randTrip];
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[1]/section/div/div[3]/div/form/div[1]/div/div/div[2]/div/input")).sendKeys(city.toString() + Keys.ENTER);

		//Button Search
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[1]/section/div/div[3]/div/form/div[4]/button")).click();

	}


	public static void euronics() throws InterruptedException {
		driver.get("https://www.euronics.it/");

		String listElettrodomestici[] = { "Epilatore",  "Lavatrice", "Pc", "Pentole",  "Cellulare", "Frigorifero", "lavastoviglie",
				"asciugatrice"};
		int randEl = random.nextInt(listElettrodomestici.length);
		String elettrodomestico = listElettrodomestici[randEl];

		Thread.sleep(4000);
		try {
			//Cookie button
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/button[2]")).click();

			//Login
			{
				WebElement element = driver.findElement(By.cssSelector(".mainMenu__service--order > .mainMenu__link"));
				Actions builder = new Actions(driver);
				builder.moveToElement(element).perform();
			}
			driver.findElement(By.cssSelector(".mainMenu__arrow")).click();
			driver.findElement(By.id("miniUserId")).click();
			driver.findElement(By.id("miniUserId")).click();
			driver.findElement(By.id("miniUserId")).sendKeys("francescafrida92@gmail.com");
			driver.findElement(By.id("miniPassword")).click();
			{
				WebElement element = driver.findElement(By.id("miniPassword"));
				Actions builder = new Actions(driver);
				builder.doubleClick(element).perform();
			}
			driver.findElement(By.id("miniPassword")).click();
			driver.findElement(By.id("miniPassword")).sendKeys("Francesca92!");
			driver.findElement(By.cssSelector(".button--lightBlue:nth-child(1)")).click();
			//End Login

			Thread.sleep(2000);
			driver.findElement(By.name("q")).click();
			driver.findElement(By.name("q")).sendKeys(elettrodomestico.toString());
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		}catch (Exception e){

		}
	}


	public static void foodJustEat() throws InterruptedException {
		try {
			// Launch JustEat
			driver.get("https://www.justeat.it/");

			// Cookie button
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"/html/body/app/div/div[2]/div/div/div/div/div[2]/button[1]")))
					.click();

			// Click on "Accedi" button
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("/html/body/app/div/header/div[2]/nav/div/ul/li[2]/a"))).click();

			// Credential
			wait.until(ExpectedConditions.elementToBeClickable(By.id("Email"))).sendKeys("francescafrida92@gmail.com");
			wait.until(ExpectedConditions.elementToBeClickable(By.id("Password"))).sendKeys("Francesca92!");
			driver.findElement(By.cssSelector("#loginForm > fieldset > button")).click();

			// Searching by address
			wait.until(ExpectedConditions.elementToBeClickable(By.name("postcode")))
					.sendKeys("Via Leone IV, 12, 00192, Roma");
			wait.until(ExpectedConditions.elementToBeClickable(By.className("Suggestions_shell_2SD1H"))).click();

			// clicking on the first result
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"/html/body/main/div[6]/div/main/div/div[2]/div/div[5]/div[1]/div/div[1]/section/a/div[3]/h3")))
					.click();
			// Scrolling
			for (int j = 0; j < 150; j++) {
				js.executeScript("window.scrollBy(0,100)");
			}

			driver.navigate().back();

			// Scrolling all the restaurant
			for (int j = 0; j < 150; j++) {
				js.executeScript("window.scrollBy(0,100)");
			}
		}catch (Exception e){

		}


	}

	public static void booking(){
		String listTrip[] = { "Milan", "Rome", "Vinice", "London", "Berlin", "Dublin", "Naples", "Madrid", "Vienna",
				"Tokyo", "New york", "Boston", "Buenos Aires", "Toronto", "Lisbon", "Atene", "Oslo", "Moscow", "Sydney",
				"Ginevra", "Paris", "Mancester", "Firenze", "Varsavia", "Amsterdam", "Helsinki", "Sofia", "Lussemburgo",
				"Copenaghen", "Libiana", "Bucarest", "Budapest", "Los Angeles", "Miami", "Zagrabria", "Barcellona" };
		int randTrip = random.nextInt(listTrip.length);

		driver.get("https://www.booking.com/index.it.html");
		try {
			// Cookie button
			wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler"))).click();

			// Access button
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
					"#b2indexPage > header > nav.bui-header__bar > div.bui-group.bui-button-group.bui-group--inline.bui-group--align-end.bui-group--vertical-align-middle > div:nth-child(6) > a")))
					.click();

			// Credential
			wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("francescafrida92@gmail.com");
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
					"#root > div > div.app > div.access-container.bui_font_body > div > div > div > div > div > div > form > div:nth-child(3) > button")))
					.click();

			wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("Francesca92!");
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
					"#root > div > div.app > div.access-container.bui_font_body > div > div > div > div > div > div > form > button")))
					.click();

			// Search bar
			String keyTrip = listTrip[randTrip];

			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ss"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ss"))).sendKeys(keyTrip.toString());
			driver.findElement(By.cssSelector(
					"#frm > div.xp__fieldset.js--sb-fieldset.accommodation > div.xp__button > div.sb-searchbox-submit-col.-submit-button > button"))
					.click();
			// hiding a left panel
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
					"#frm > div:nth-child(9) > div > div.sb-dates__grid.u-clearfix > div.sb-dates__col.--checkin-field.xp__date-time > div > div > div > div.sb-date-field__display")))
					.click();

			// clicking on the first result
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
					"#hotellist_inner > div:nth-child(1) > div.sr_item_content.sr_item_content_slider_wrapper > div.sr_property_block_main_row > div.sr_item_main_block > div.sr-hotel__title-wrap > h3 > a")))
					.click();

			// Scrolling home page
			for (int i = 0; i < 250; i++) {
				js.executeScript("window.scrollBy(0,100)");
			}
		}catch (Exception e){

		}
	}


	public static void libero(){
		driver.get("https://www.libero.it/");
		try {
			driver.findElement(By.cssSelector(".iubenda-cs-accept-btn")).click();}catch (Exception e){

		}
		js.executeScript("window.scrollTo(0,851.2000122070312)");
		js.executeScript("window.scrollTo(0,3331.199951171875)");
		js.executeScript("window.scrollTo(0,5782.39990234375)");
		js.executeScript("window.scrollTo(0,0)");

	}


	public static void nhi() throws InterruptedException {
		String listNHI[] = {  "pregnacy", "cancer", "breast cancer", "ovarian cancer", "covid"};
		int randNHI= random.nextInt(listNHI.length);
		String keyNHI = listNHI[randNHI];

		driver.get("https://www.nih.gov/");
		Thread.sleep(2000);
		driver.findElement(By.id("query")).click();
		driver.findElement(By.id("query")).sendKeys(keyNHI.toString());
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.cssSelector("h1 > img")).click();
	}


	public static void webMD() throws InterruptedException {
		String listWebMD[] = {  "pregnacy", "cancer", "breast cancer", "ovarian cancer", "covid"};

		int randwebMD= random.nextInt(listWebMD.length);
		String keyWebMD = listWebMD[randwebMD];
		driver.get("https://www.webmd.com/");
		try {
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
			js.executeScript("window.scrollTo(0,987.2000122070312)");
			js.executeScript("window.scrollTo(0,2097.60009765625)");
			js.executeScript("window.scrollTo(0,4813.60009765625)");
			js.executeScript("window.scrollTo(0,4669.60009765625)");
			driver.findElement(By.id("global-nav-search")).click();
			driver.findElement(By.id("global-nav-search")).click();
			driver.findElement(By.id("global-nav-search")).sendKeys(keyWebMD.toString());
			driver.findElement(By.id("global-nav-search")).sendKeys(Keys.ENTER);
			js.executeScript("window.scrollTo(0,987.2000122070312)");
			js.executeScript("window.scrollTo(0,2097.60009765625)");
			js.executeScript("window.scrollTo(0,4813.60009765625)");
			js.executeScript("window.scrollTo(0,4669.60009765625)");
		}catch (Exception e){

		}

	}



	public static void facebook() throws InterruptedException {
		// KEYS FACEBOOK DONNA
		String listResFB[] = { "demi lovato", "kylie jenner", "Jendall jenner", "nails art", "makeup", "clio makeup",
				"alpha woman", "fatti in casa con benedetta", "ricette dolci", "justin bieber", "one direction",
				"harry styles", "bella hadid", "unghie", "tatoo", "hair styles", "outfit", "chiara ferragni", "fedez",
				"gucci", "versace", "louis vitton", "kylie jenner", "kim hardashian", "make-up", "make up artist",
				"make up art", "pandora", "shown mandes", "camilla cabello", "ricette", "puppies", "ricette dolci",
				"one direction", "netflix", "amazon", "louis vitton", "dior", "chanel", "Miley Cyrus",
				"outfit aesthetc", "tumblr", "vintage", "aesthetic" };
		int randFB = random.nextInt(listResFB.length);

		// Launch Facebook

		driver.get("https://www.facebook.com/");
		try {

			try {
				// Cookie button
				driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")).click();
			} catch (Exception e) {

			}


			// LOGIN CREDENTIALS FACEBOOK
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys("FrancescaFrida92@gmail.com"); // Email
			// section
			wait.until(ExpectedConditions.elementToBeClickable(By.id("pass"))).sendKeys("Francesca92!"); // Password sections

			// Login button
			driver.findElement(By.name("login")).click();

			Thread.sleep(2000);

			//Like
			try {
				driver.findElement(By.cssSelector(".pfnyh3mw > .pq6dq46d > .hu5pjgll")).click();
				Thread.sleep(5000);
			} catch (Exception e) {

			}


			driver.get("https://www.facebook.com/marketplace/?ref=bookmark");
			driver.navigate().back();

			// Research on the Facebook's bar with a random string
			String keyFB = new String();
			keyFB = listResFB[randFB];
			Thread.sleep(2000);

			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input"))).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input"))
					.sendKeys(keyFB.toString());
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input"))
					.sendKeys(Keys.ENTER);

			// wait 4 sec
			Thread.sleep(4000);

			// scrolling
			for (int i = 0; i < 300; i++) {
				js.executeScript("window.scrollBy(0,100)");

			}
			// wait 4 sec
			Thread.sleep(2000);

			// Back to home page
			driver.navigate().back();

			Thread.sleep(3000);


			// POSTING SOMETHING
			WebElement post = driver.findElement(By.xpath(
					"/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[1]/div"));
			post.click();

			// "stato d'animo" button
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[1]/div[2]/div/div[3]/div/span/div/div/div[1]/div/div/div[1]")))
					.click();
			Thread.sleep(2000);

			try {
				// Chosing a state of mood (Stato d'animo)
				int randStati = random.nextInt(driver.findElements(By.tagName("li")).size());
				driver.findElements(By.tagName("li")).get(randStati).click();


				// "Publica" button
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[2]/div/div")))
						.click();

			} catch (Exception e) {
				driver.navigate().back();
			}

			Thread.sleep(3000);

			// END POSTING SOMETHING

			// Click on the first story & look for 10 seconds
			try {
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div")))
						.click();
			} catch (Exception e) {
			}

			Thread.sleep(10000);

			// Back to home page
			driver.navigate().back();

			// scrolling home
			for (int i = 0; i < 350; i++) {
				js.executeScript("window.scrollBy(0,100)");

			}

			//Logout
			try {
				driver.findElement(By.cssSelector(".oajrlxb2:nth-child(1) > .s45kfl79:nth-child(1)")).click();
				driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span")).click();
			} catch (Exception e) {

			}
		}catch (Exception e){

		}
		//End Logout
	}


	public static void google() throws InterruptedException {
		// KEYS GOOGLE RESEARCH
		String listResGoogle[] = { "nails art", "outfit ispire", "sephora", "notino", "douglas", "become a mother",
				"top most used name for babis", "blue eye makeup", "my boyfriend cheat on me?", "shein", "zara",
				"sore cycle remedies", "best product for cleaning dust", "job online", "woman job", "luois vitton bag",
				"versace", "louis vitton", "dior", "chanel", "zara", "gym", "cook a cake", "how to make a pizza",
				"dolce e gabbana", "valentino", "calvin klein", "makeup", "eye palette nude", "eye balette", "blush",
				"bronzer", "eye concealer", "lipstick", "makeup remover", "highlighters", "face brushers", "hairdryer",
				"hair straightener", "tray for sweets", "necklaces", "earrings", "nail polishes", "oven",
				"vacuum cleaner", "women's perfumes", "self care", "product for the perfect skin care",
				"household cleaning products", "pregnancy test", "straight hair arrangements", "bags", "lips scrub",
				"lace bras", "sexy underwear", "robot vacuum cleaner", "washing machines", "windows cleaner",
				"dust cleaner", "woman cheap bags", "lipgross", "caffe", "Office products", "shopping bag",
				"make up tutorial", "nails tutorial", "hair style", "cute puppies", "bebies", "socks", "mixer",
				"kids costume", "romance book", "coffee machine", "tablet", "backbag for kids", "woman sunglasses",
				"best product for skin care", "hair product", "outfit aesthetic", "vintage", "aesthetic",
				"sweet recipes", "cook tips" };
		int randGoogle = random.nextInt(listResGoogle.length);

		// KEY GOOGLE RESEARCH (GENERICS)
		String listResGoogle2[] = { "headache solution", "lactose intolerant", "backache", "solutions the head",
				"translation from English to Italian", "pc lento", "who to change wifi password",
				"10 most visited city", "how to cook perfect speghetti", "travelleing",
				"the most visited city in the world", "netflix", "youtube", "trip to italy", "amazonvideo",
				"travelling", "the most visited city in the world", "how to lose weight", "woman best job",
				"best jobs for a woman", "best woman degree", "best degree", "university or collage",
				"wish", "aliexpress", "What is my ip?", "is degree important?","univerity", "job", "find job",
				"how to get pregnant", "how to download youtube videos", "how to delete instagram account",
				"how many days till christmas", "how many days in a year", "how many people are in the world",
				"how many calories in a banana", "how to change gmail password", "how to calculate percentage",
				"how to kiss good", "how to fell aspleep fast", "donwload a film", "how to learn a new language" };
		int randGoogle2 = random.nextInt(listResGoogle2.length);

		// Launch Google
		driver.get("https://google.com");

			// Cookie button
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div[3]/button[2]/div")).click();

			Thread.sleep(2000);



			// Picking a random string form listResGoogle and research it on Google
			String keyGoogle = listResGoogle[randGoogle];
			driver.findElement(By.name("q")).sendKeys(keyGoogle.toString() + Keys.ENTER);
			resultGoogle();

			// Cleaning the search
			driver.findElement(By.name("q")).clear();

			// Picking a random string form listResGoogle2 and research it on Google
			String KeyGoogle2 = listResGoogle2[randGoogle2];
			driver.findElement(By.name("q")).sendKeys(KeyGoogle2.toString() + Keys.ENTER);
			resultGoogle();
		}

		public static void instagram() throws InterruptedException {
			String listResInsta[] = {"harry styles", "bella hadid", "nails", "tatoo", "zayn malik", "outfit",
					"chiara ferragni", "fedez", "babys", "gucci", "versace", "louis vitton", "kylie jenner", "clio makeup",
					"kim hardashian", "make-up", "make up artist", "make up", "pandora", "begs", "shown mandes",
					"camilla cabello", "ricette", "puppies", "lips", "netflix", "amazon", "beyonce", "justin bieber",
					"medison beer", "victoria secret", "shein", "louis vitton", "dior", "chanel", "one direction",
					"sephora", "duglas", "zara", "notino", "my baby", "mamme", "Rebord Baby by Ellis & Jenny",
					"funny video", "tiktok", "charlie damelio", "elle", "vogue", "dolce e gabbana", "valentino",
					"calvin klein", "make up tutorial", "nails tutorial", "hair style", "outfit of the day", "funny video",
					"cute puppies"};
			int randInsta = random.nextInt(listResInsta.length);
			try{
				// Launch Instagram
				driver.navigate().to("https://instagram.com/");

				Thread.sleep(2000);

				// LAUNCH INSTAGRAM
				driver.get("https://www.instagram.com/");

				// Cookie button
				try {
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/button[1]")))
							.click();
				} catch (Exception e) {

				}


				try {

					// CREDENTIAL INSTAGRAM

					wait.until(ExpectedConditions.elementToBeClickable(By.name("username")))
							.sendKeys("FrancescaFrida92@gmail.com");
					wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("Francesca92!");

					// "Accedi" button
					try {
						wait.until(ExpectedConditions.elementToBeClickable(
								By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div/form/div/div[3]/button"))).submit();
					} catch (Exception e) {
						wait.until(ExpectedConditions.elementToBeClickable(
								By.xpath("/html/body/div[1]/section/main/article/div[2]/div[1]/div/form/div/div[3]/button/div"))).submit();
					}

				} catch (Exception e) {
					// TODO: handle exception
				}
				Thread.sleep(10000); // wait loading the page

				// Click on an story & look for 10 seconds
				try {
					wait.until(ExpectedConditions.elementToBeClickable(By.className("OE3OK"))).click();
				} catch (Exception e) {

				}
				Thread.sleep(5000);
				// Back in home page from stories
				driver.navigate().back();

				// Scrolling home page
				for (int i = 0; i < 150; i++) {
					js.executeScript("window.scrollBy(0,100)");
					// driver.findElement(By.xpath("/html/body/div[1]/section/main/section/div/div[2]/div/article[1]/div[3]/section[1]/span[1]/button")).click();
				}

				// Picking a random string form listResInsta and research it on Instagram's bar
				String KeyInsta = new String();
				KeyInsta = listResInsta[randInsta];
				Thread.sleep(5000);

				// Searching the random string
				driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[2]/input"))
						.sendKeys(KeyInsta.toString());
				// wait loading results
				Thread.sleep(4000);

				// Click on the first result
				driver.findElement(
						By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/a")).click();

				// wait loading the page
				Thread.sleep(4000);

				// Following the page of the random result
				try {
					WebElement button = driver.findElement(By.tagName("button"));

					// click on the "Segui" button
					if (button.getText().equals("Segui")) {
						button.click();
					}
				} catch (Exception e) {
				}
				// Remain on the searched page for 8 seconds
				Thread.sleep(8000);

				// Back in home page
				driver.navigate().back();

				// Following someone (on the right panel)
				try {
					wait.until(ExpectedConditions.elementToBeClickable(By
							.xpath("/html/body/div[1]/section/main/section/div[3]/div[2]/div[2]/div/div/div/div[1]/div[3]/button")))
							.click();
				} catch (Exception e) {
					driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/button[2]")).click();
				}


				// Clicking the "Esplora" button
				driver.findElement(By.cssSelector(
						"#react-root > section > nav > div._8MQSO.Cx7Bp > div > div > div.ctQZg > div > div:nth-child(3) > a"))
						.click();

				// Clicking on the first pic
				try {
					wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
							"#react-root > section > main > div > div.K6yM_ > div > div:nth-child(1) > div:nth-child(2) > div > a > div.eLAPa > div._9AhH0")))
							.click();
					// clicking like to 5 pics
					Actions actionObject = new Actions(driver);

					for (int i = 0; i < 5; i++) {
						wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
								"body > div._2dDPU.CkGkG > div.zZYga > div > article > div.eo2As > section.ltpMr.Slqrh > span.fr66n > button > div > span > svg")))
								.click();

						Thread.sleep(2000);

						// Clicking the right arrow to go to the next photo
						actionObject = actionObject.sendKeys(Keys.ARROW_RIGHT);
						actionObject.perform();
					}

				} catch (Exception e) {
					driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/button[2]")).click();
				}


				// Clicking the "home" button
				driver.navigate().to("https://instagram.com/");
				try {
					driver.findElement(By.cssSelector(".Fifk5 .\\_6q-tv")).click();
					driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[3]/div/div[5]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div")).click();
				} catch (Exception e) {

				}
		}catch(Exception e){

		}

	}


	public static void amazon() throws InterruptedException {

		String listResAmazon[] = { "makeup", "eye palette nude", "eye balette", "blush", "bronzer", "eye concealer",
				"lipstick", "makeup remover", "highlighters", "face brushers", "hairdryer", "hair straightener",
				"tray for sweets", "necklaces", "earrings", "nail polishes", "oven", "vacuum cleaner", "woman perfumes",
				"self care", "product for the perfect skin care", "household cleaning products", "pregnancy test",
				"straight hair arrangements", "bags", "lips scrub", "lace bras", "sexy underwear",
				"robot vacuum cleaner", "washing machines", "windows cleaner", "dust cleaner", "woman cheap bags",
				"lipgross", "caffe", "Office products", "shopping bag", "socks", "mixer", "kids costume", "tablet" };
		int randAmazon = random.nextInt(listResAmazon.length);

		driver.get("https://www.amazon.it/");
		try {
			// Cookie button
			//wait.until(ExpectedConditions.elementToBeClickable(By.id("sp-cc-accept"))).click();

			// "Accedi" button
			driver.findElement(By.id("nav-link-accountList")).click();

			// Creditial
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ap_email"))).sendKeys("FrancescaFrida92@gmail.com");
			driver.findElement(By.id("continue")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("ap_password"))).sendKeys("Francesca92!");
			driver.findElement(By.id("signInSubmit")).click();


			String keyAmazon = listResAmazon[randAmazon];
			// Search bar
			driver.findElement(By.id("twotabsearchtextbox")).click();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(keyAmazon.toString() + Keys.ENTER);

			// finding a product & add it in the cart
			try {
				driver.findElement(By.xpath(
						"/html/body/div[1]/div[2]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/span/a/div/img"))
						.click();
				// Add to cart the product
				driver.findElement(By.name("submit.add-to-cart")).click();

			} catch (Exception e) {
				try {
					driver.findElement(By.xpath(
							"/html/body/div[1]/div[2]/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/span/a/div/img"))
							.click();
					// Add to cart the product
					driver.findElement(By.name("submit.add-to-cart")).click();
				} catch (Exception ee) {


				}
			}

			Thread.sleep(3000);
			//Aggiungi copertura
			try {
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]/div[4]/div[1]/div[8]/div/div[1]/div[1]/div/div/div[2]/div/div/div[2]/div/div[3]/div/span[2]/span/input")).click();
			} catch (Exception eee) {

			}
			// Back to home

			wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-logo-sprites"))).click();


			//Scrolling home page
			for (int i = 0; i < 150; i++) {
				js.executeScript("window.scrollBy(0,100)");
			}

			Actions builder = new Actions(driver);
			builder.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
			driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[2]/a[18]/span")).click();
		}catch (Exception e){

		}
	}

	public static void samsung() throws InterruptedException {
		driver.get("https://www.samsung.com/it/");
		try {
			// Cookie button
			try {
				wait.until(ExpectedConditions.elementToBeClickable(By.id("truste-consent-button"))).click();
			} catch (Exception e) {

			}

			// Login button
			driver.findElement(By.className("gnb__login-btn")).click();

			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
					"#wrap > div.gnb.js-mobile-open > nav > div > div > div.gnb__menu-wrap > div > div.gnb__sub > ul.gnb__utility > li.gnb__login.before-login-context > div > ul > li:nth-child(1) > a")))
					.click();
			// Credetial
			wait.until(ExpectedConditions.elementToBeClickable(By.id("iptLgnPlnID")))
					.sendKeys("FrancescaFrida92@gmail.com");
			wait.until(ExpectedConditions.elementToBeClickable(By.id("iptLgnPlnPD"))).sendKeys("Francesca92!");

			driver.findElement(By.className("one-btn-container")).click();

			// "Non ora" button
			wait.until(ExpectedConditions.elementToBeClickable(By.id("btnNotNow"))).click();
			//Informative del Samsung Account aggiornate "Accetto" Button
			try {
				wait.until(ExpectedConditions.elementToBeClickable(By.id("terms"))).click();
			} catch (Exception e) {
			}

			// Finding search bar
			driver.findElement(By.linkText("Ricerca")).click();
			driver.findElement(By.id("gnb-search-keyword")).click();

			driver.findElement(By.id("gnb-search-keyword")).sendKeys("Galaxy");
			driver.findElement(By.id("gnb-search-keyword")).sendKeys(Keys.ENTER);


			// Click on the first result
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
					"#all > div > div.result__panel > div.result-list > ul > li:nth-child(1) > div > div.result-item__content > h3 > a")))
					.click();

			Thread.sleep(4000);

			driver.navigate().back();

			Thread.sleep(2000);

			// Scrolling home page
			for (int i = 0; i < 150; i++) {
				js.executeScript("window.scrollBy(0,100)");
			}
			driver.findElement(By.linkText("Apri il mio menu")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/nav/div/div/div[2]/div/div[2]/ul[2]/li[4]/div/ul/li[6]/a")).click();
		}catch (Exception e){

		}
	}

	public static void monsterJob() throws InterruptedException {
		// KEY GOOGLE RESEARCH (GENERICS)
		String listResJobs[] = { "parrucchiera", "estetista", "truccatrice", "babysitter", "dogsitter", "cassiera",
				"commessa", "postina", "segretaria", "sarta", "cameriera", "badante", "donna pulizie", "massaggiatrice",
				"domestica", "animatrice", "operatrice call center", "operatrice socio sanitario",
				"rappresentante avon" };
		int randJobs = random.nextInt(listResJobs.length);

		// Launching Monster
		driver.get("https://www.monster.it/");

		// Waiting to load cookie section
		Thread.sleep(5000);

		// Cookie button
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler"))).click();
		}catch (Exception e){

		}


		// Login button
		driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > div > div:nth-child(4) > div > a"))
				.click();
		//Credenziali MonsterJob
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("login-tab"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("email"))).sendKeys("FrancescaFrida92@gmail.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("Francesca92!");


		driver.findElement(By.id("email-button")).click();

		try {
			driver.findElement(By.id("email-button")).click();
		} catch (Exception e) {
		}

		Thread.sleep(4000);

		// searching a random job from listResJobs
		String keyJobs = listResJobs[randJobs];
		driver.findElement(By
				.xpath("/html/body/div[1]/div[1]/header/div/div[3]/div/div/div[2]/form/div/div[1]/div/div/label/div/input"))
				.sendKeys(keyJobs.toString()+Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div/div/div[2]/form/div/div[2]/div/div/label/div/input")).sendKeys("Lombardia"+ Keys.ENTER);

		Thread.sleep(5000);

		{
			WebElement element = driver.findElement(By.cssSelector(".sc-eishCr > .MuiSvgIcon-root"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		driver.findElement(By.cssSelector(".sc-eishCr > .MuiSvgIcon-root")).click();

	}

	public static void newYorkTimes() {
		driver.get("https://www.nytimes.com/");
		// Cookie button
		wait.until(ExpectedConditions.elementToBeClickable(By.className("css-aovwtd"))).click();

		// Scrolling
		for (int i = 0; i < 150; i++) {
			js.executeScript("window.scrollBy(0,100)");
		}

	}



	// this method is called by "google" 
	public static void resultGoogle() {

		// List of all the link of the page by CLASS NAME (NO ANNUNCI)
		List<WebElement> links = driver.findElements(By.className("yuRUbf"));
		// List of url's links
		List<String> url = new ArrayList<String>();
		for (int z = 0; z < links.size(); z++) {
			url.add(links.get(z).findElement(By.tagName("a")).getAttribute("href"));
		}

		// Visit the first and the second link
		int k = 0;
		while (k != 2) {
			driver.get(url.get(k));
			for (int i = 0; i < 150; i++) {
				js.executeScript("window.scrollBy(0,200)");
			}
			driver.navigate().back();

			k++;
		}

	}
}
