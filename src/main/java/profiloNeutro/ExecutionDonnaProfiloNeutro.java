package profiloNeutro;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;

public class ExecutionDonnaProfiloNeutro {

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
        google();
        Thread.sleep(2000);
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
        String listResJobs[] = { "meccanico", "elettricista", "muratore", "sviluppatore", "operaio", "fattorino",
                "pizzaiolo", "corriere", "autista", "tecnico informatico", "felagname", "giardiniere", "idraulico",
                "barista", "cuoco", "cameriere", "postino", "carrozziere", "calzolaio", "arrotino", "manutentore",
                "abbracciante agricolo", "becchino", "salumiere", "parrucchierE", "estetista", "truccatrice",
                "babysitter", "dogsitter", "cassiera", "commessO", "postina", "segretariO", "sartO", "cameriera",
                "badante", "donna pulizie", "massaggiatrice", "domesticO", "animatore", "operatore call center",
                "operatore socio sanitario", "rappresentante avon" };
        int randJobs = random.nextInt(listResJobs.length);

        driver.get("https://www.linkedin.com/");
        try {
            //Login
            driver.findElement(By.linkText("Accedi")).click();
            driver.findElement(By.id("username")).click();
            driver.findElement(By.id("username")).sendKeys("NicoleLuongo1998@gmail.com");
            driver.findElement(By.id("password")).click();
            driver.findElement(By.id("password")).sendKeys("Nicole1998!");
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
            driver.findElement(By.xpath("/html/body/div[7]/header/div/div/div/div[1]/input")).sendKeys(job.toString() + Keys.ENTER);
            //End search Job
        }catch (Exception e ){

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

        String listElettrodomestici[] = { "Epilatore", "Rasoio", "Lavatrice", "Pc", "Pentole", "Smartwatch", "Cellulare", "Frigorifero", "lavastoviglie",
                "asciugatrice", "videogame", "nintendo switch", "tv"};
        int randEl = random.nextInt(listElettrodomestici.length);
        String elettrodomestico = listElettrodomestici[randEl];

        Thread.sleep(4000);

        //Cookie button
        try {
            driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/button[2]")).click();
        }catch (Exception e){}

        //Login
        {
            WebElement element = driver.findElement(By.cssSelector(".mainMenu__service--order > .mainMenu__link"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".mainMenu__arrow")).click();
        driver.findElement(By.id("miniUserId")).click();
        driver.findElement(By.id("miniUserId")).click();
        driver.findElement(By.id("miniUserId")).sendKeys("NicoleLuongo1998@gmail.com");
        driver.findElement(By.id("miniPassword")).click();
        {
            WebElement element = driver.findElement(By.id("miniPassword"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.id("miniPassword")).click();
        driver.findElement(By.id("miniPassword")).sendKeys("Nicole1998!");
        driver.findElement(By.cssSelector(".button--lightBlue:nth-child(1)")).click();
        //End Login

        Thread.sleep(2000);
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys(elettrodomestico.toString());
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
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
            wait.until(ExpectedConditions.elementToBeClickable(By.id("Email"))).sendKeys("nicoleluongo1998@gmail.com");
            wait.until(ExpectedConditions.elementToBeClickable(By.id("Password"))).sendKeys("Nicole1998!");
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

        // Cookie button
        wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler"))).click();

        // Access button
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
                "#b2indexPage > header > nav.bui-header__bar > div.bui-group.bui-button-group.bui-group--inline.bui-group--align-end.bui-group--vertical-align-middle > div:nth-child(6) > a")))
                .click();

        // Credential
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("nicoleluongo1998@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
                "#root > div > div.app > div.access-container.bui_font_body > div > div > div > div > div > div > form > div:nth-child(3) > button")))
                .click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("Nicole1998!");
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
        String listNHI[] = {  "pregnacy", "cancer", "breast cancer", "ovarian cancer", "testicular cancer", "covid"};
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
        String listWebMD[] = {  "pregnacy", "cancer", "breast cancer", "ovarian cancer", "testicular cancer", "covid"};

        int randwebMD= random.nextInt(listWebMD.length);
        String keyWebMD = listWebMD[randwebMD];
        driver.get("https://www.webmd.com/");

        try{
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
        js.executeScript("window.scrollTo(0,4669.60009765625)");}catch (Exception e){

        }

    }


    public static void facebook() throws InterruptedException {
        // KEYS FACEBOOK
        String listResFB[] = { "outfit aesthetc", "tumblr", "vintage", "aesthetic", "demi lovato", "kylie jenner",
                "Jendall jenner", "nails art", "makeup", "clio makeup", "alpha woman", "fatti in casa con benedetta",
                "ricette dolci", "justin bieber", "one direction", "harry styles", "bella hadid", "unghie", "tatoo",
                "hair styles", "outfit", "chiara ferragni", "fedez", "gucci", "versace", "louis vuitton",
                "kylie jenner", "kim hardashian", "make-up", "make up artist", "make up art", "pandora", "shown mandes",
                "camilla cabello", "ricette", "puppies", "lips", "one direction", "netflix", "amazon", "louis vitton",
                "dior", "chanel", "Miley Cyrus", "Chelsea Football Club", "cristiano ronaldo", "motorcycle", "juventus",
                "ssc napoli", "AC Milan", "inter", "fantacalcio", "WWE", "minecraft", "fortnite", "Emily Ratajkowski",
                "Belen Rodriguez", "Leo Messi", "Dark Polo Gang", "Salmo", "Fedez", "Gemitaiz", "Brawl Stars",
                "Ferrari", "Alfa Romeo", "Diletta Leotta", "Apple", "Samsung", "Hacking & Coding Tutorials",
                "Python Coding", "funny video", "tiktok", "lercio", "gameplay", "Valentino Rossi", "Milan", "Roma",
                "Lazio", "Formula 1", "Lewis Hamilton", "Sebastian Vettel", "funny video", "meme", "tiktok"};
        int randFB = random.nextInt(listResFB.length);
        try {
            // Launch Facebook

            driver.get("https://www.facebook.com/");
            try {
                // Cookie button
                driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")).click();
            } catch (Exception e) {

            }


            // LOGIN CREDENTIALS FACEBOOK
            Thread.sleep(2000);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys("NicoleLuongo1998@gmail.com"); // Email
            // section
            wait.until(ExpectedConditions.elementToBeClickable(By.id("pass"))).sendKeys("Nicole1998!"); // Password sections

            // Login button
            driver.findElement(By.name("login")).click();
            Thread.sleep(2000);

            //Like
            try {
                driver.findElement(By.cssSelector(".pfnyh3mw > .pq6dq46d > .hu5pjgll")).click();
            } catch (Exception e) {

            }

            Thread.sleep(5000);

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
                    "/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[1]/div[2]/div/div[5]/div/span/div/div/div[1]/div/div")))
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
                driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]")).click();
                driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span")).click();
            } catch (Exception e) {

            }

            //End Logout
        }catch (Exception e){

        }
    }


    public static void google() throws InterruptedException {
        // KEYS GOOGLE RESEARCH
        String listResGoogle[] = {  "outfit aesthetc", "vintage", "aesthetic", "nails art", "outfit ispire", "sephora",
                "notino", "dauglas", "become a mother", "top most used name for babis", "blue eye makeup",
                "my boyfriend cheat on me?", "how to lose weight", "shein", "zara", "sore cycle remedies",
                "best product for cleaning dust", "job online", "woman job", "luois vitton bag", "versace",
                "louis vitton", "dior", "chanel", "zara", "gym", "cook a cake", "how to make a pizza",
                "dolce e gabbana", "valentino", "calvin klein", "makeup", "eye palette nude", "eye balette", "blush",
                "bronzer", "eye concealer", "lipstick", "makeup remover", "highlighters", "face brushers", "hairdryer",
                "hair straightener", "tray for sweets", "necklaces", "earrings", "nail polishes", "oven",
                "vacuum cleaner", "women's perfumes", "self care", "product for the perfect skin care",
                "household cleaning products", "pregnancy test", "straight hair arrangements", "bags", "lips scrub",
                "lace bras", "sexy underwear", "robot vacuum cleaner", "washing machines", "windows cleaner",
                "dust cleaner", "woman cheap bags", "lipgross", "caffe", "Office products", "shopping bag",
                "make up tutorial", "nails tutorial", "hair style", "cute puppies", "bebies", "socks", "mixer",
                "kids costume", "romance book", "coffee machine", "tablet", "backbag for kids", "woman sunglasses",
                "best product for skin care", "hair product", "cook tips" };
        int randGoogle = random.nextInt(listResGoogle.length);

        // KEY GOOGLE RESEARCH (GENERICS)
        String listResGoogle2[] = {"motorcycle", "motorcycle helmets", "today football", "finding job online",
                "job announcements", "how to tell if a woman is in love with you", "online degree program", "trading",
                "what are the best degree courses for men", "assembly pc", "most sought after university courses",
                "top highest paid jobs", "video games online", "chess online", "fortinite", "brawl stars", "minecraft",
                "twitch", "streamer", "assembly pc gaming", "playstation", "ps5", "formula 1", "lactose intolerant",
                "Juventus", "Chelsea Football Club", "back pain remedies", "wifi speed test", "workout to tone muscles",
                "training courses", "Ferrari", "car sales online", "cheap travel", "workout", "gameplay", "coding",
                "how to code with java", "how to code with python", "univerity or collage",
                "best football teams in the world", "sport news", "sports pants", "boxer gloves", "laptop", "pants",
                "handphone", "gym weights", "gym clothes", "gaming", "best gamer in the world", "phone case",
                "smart watch", "smart tv", "ram", "gaming pc", "apple mac", "assembly pc kit", "smartphone",
                "work tools", "socks", "ma t-shirt", "men shirt", "gym weights", "video games", "men's wristwatch",
                "mouse pc", "keyboard pc with led", "smarphone charger", "pc charger", "sport trousers", "sport shoes",
                "printer", "mask", "batteries", "ipad", "backbag", "kit", "i7 processor", "alexa", "monitor", "wrench",
                "screwdrivers for pc", "screwdrivers", "office product", "iron nails", "ps5", "lamborghini", "opel",
                "bmw in offer", "motocycle in offer", "cars selling", "What is my ip?" };
        int randGoogle2 = random.nextInt(listResGoogle2.length);

        // Launch Google
        driver.get("https://google.com");

        // Cookie button
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/button[2]")).click();

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
        String listResInsta[] = { "harry styles", "bella hadid", "nails", "tatoo", "zayn malik", "outfit",
                "chiara ferragni", "fedez", "babys", "gucci", "versace", "louis vitton", "kylie jenner", "clio makeup",
                "kim hardashian", "make-up", "make up artist", "make up", "pandora", "begs", "shown mandes",
                "camilla cabello", "ricette", "puppies", "lips", "netflix", "amazon", "beyonce", "justin bieber",
                "medison beer", "victoria secret", "shein", "louis vitton", "dior", "chanel", "one direction",
                "sephora", "duglas", "zara", "notino", "my baby", "mamme", "Rebord Baby by Ellis & Jenny",
                "funny video", "tiktok", "charlie damelio", "elle", "vogue", "dolce e gabbana", "valentino",
                "calvin klein", "make up tutorial", "nails tutorial", "hair style", "outfit of the day", "funny video",
                "cute puppies", "Calcio", "meme", "cristiano ronaldo", "brawl stars", "minecraft", "twitch", "amazon",
                "netflix", "streamer", "fortnite", "Leo Messi", "Diletta Leotta", "Gaming", "Opel", "trash",
                "calciatori", "playstation", "ps5", "formula 1", "Ferrari", "BMW", "Lamborghini", "Gemitaiz", "Salmo",
                "Dark Polo Gang", "Lorenzo Insigne", "Gigi Buffon", "Alessandro Del Piero", "Ferrari", "motori",
                "pugilato", "WWE", "bmw", "rand rover", "belen rodriguez", "Emily Ratajkowski", "Chelsea Football Club",
                "cristiano ronaldo", "moto", "juventus", "ssc napoli", "AC Milan", "inter", "fantacalcio", "WWE",
                "Belen Rodriguez", "Leo Messi", "Dark Polo Gang", "Salmo", "Fedez", "Gemitaiz", "Brawl Stars",
                "Ferrari", "Alfa Romeo", "Diletta Leotta", "Ferrari", "coding", "meme", "tiktok", "funny clip",
                "funny video"};
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
        }catch (Exception e){

        }




        try {

            // CREDENTIAL INSTAGRAM

            wait.until(ExpectedConditions.elementToBeClickable(By.name("username")))
                    .sendKeys("NicoleLuongo1998@gmail.com");
            wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("Nicole1998!");

            // "Accedi" button
            try {
                wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div/form/div/div[3]/button"))).submit();
            }catch (Exception e){
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
        }catch (Exception e){
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
                actionObject.perform();}

        }catch (Exception e){
            driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/button[2]")).click();
        }



        // Clicking the "home" button
        driver.navigate().to("https://instagram.com/");
        try{
        driver.findElement(By.cssSelector(".Fifk5 .\\_6q-tv")).click();
        driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[3]/div/div[5]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div")).click();}
        catch (Exception e ){

        }}catch (Exception e ){

        }
    }


    public static void amazon() throws InterruptedException {

        String listResAmazon[] = { "makeup", "eye palette nude", "eye balette", "blush", "bronzer", "eye concealer",
                "lipstick", "makeup remover", "highlighters", "face brushers", "hairdryer", "hair straightener",
                "tray for sweets", "necklaces", "earrings", "nail polishes", "oven", "vacuum cleaner", "woman perfumes",
                "self care", "product for the perfect skin care", "household cleaning products", "pregnancy test",
                "straight hair arrangements", "bags", "lips scrub", "lace bras", "sexy underwear",
                "robot vacuum cleaner", "washing machines", "windows cleaner", "dust cleaner", "woman cheap bags",
                "lipgross", "caffe", "Office products", "shopping bag", "socks", "mixer", "kids costume",
                "coffee machine", "tablet", "sports pants", "boxer gloves", "laptop", "pants", "handphone",
                "gym weights", "gym clothes", "tv", "gaming", "phone case", "samrt watch", "smart tv", "ram",
                "gaming pc", "apple mac", "assembly pc kit", "smartphone", "work tools", "socks", "ma t-shirt",
                "men shirt", "gym weights", "video games", "men's wristwatch", "mouse pc", "keyboard pc with led",
                "smarphone charger", "pc charger", "sport trousers", "sport shoes", "printer", "mask", "batteries",
                "ipad", "backbag", "kit", "i7 processor", "alexa", "monitor", "wrench", "screwdrivers for pc",
                "screwdrivers", "office product", "iron nails", "ps5" };
        int randAmazon = random.nextInt(listResAmazon.length);

        driver.get("https://www.amazon.it/");
        try {
            // Cookie button
            try {
                wait.until(ExpectedConditions.elementToBeClickable(By.id("sp-cc-accept"))).click();
            } catch (Exception e) {

            }


            // "Accedi" button
            driver.findElement(By.id("nav-link-accountList")).click();

            // Creditial
            wait.until(ExpectedConditions.elementToBeClickable(By.id("ap_email"))).sendKeys("NicoleLuongo1998@gmail.com");
            driver.findElement(By.id("continue")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("ap_password"))).sendKeys("Nicole1998!");
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
            try {
                builder.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
                driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[2]/a[18]/span")).click();
            } catch (Exception e) {

            }
        }catch (Exception e){

        }


    }

    public static void samsung() throws InterruptedException {
        driver.get("https://www.samsung.com/it/");

        // Cookie button
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.id("truste-consent-button"))).click();
        }catch (Exception e){

        }

        // Login button
        driver.findElement(By.className("gnb__login-btn")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
                "#wrap > div.gnb.js-mobile-open > nav > div > div > div.gnb__menu-wrap > div > div.gnb__sub > ul.gnb__utility > li.gnb__login.before-login-context > div > ul > li:nth-child(1) > a")))
                .click();
        // Credetial
        wait.until(ExpectedConditions.elementToBeClickable(By.id("iptLgnPlnID")))
                .sendKeys("NicoleLuongo1998@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("iptLgnPlnPD"))).sendKeys("Nicole1998!");

        driver.findElement(By.className("one-btn-container")).click();

        // "Non ora" button
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btnNotNow"))).click();
        //Informative del Samsung Account aggiornate "Accetto" Button
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.id("terms"))).click();
        }catch (Exception e){}

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

    }

    public static void monsterJob() throws InterruptedException {
        // KEY JoB RESEARCH (GENERICS)
        String listResJobs[] = { "meccanico", "elettricista", "muratore", "sviluppatore", "operaio", "fattorino",
                "pizzaiolo", "corriere", "autista", "tecnico informatico", "felagname", "giardiniere", "idraulico",
                "barista", "cuoco", "cameriere", "postino", "carrozziere", "calzolaio", "arrotino", "manutentore",
                "abbracciante agricolo", "becchino", "salumiere", "parrucchierE", "estetista", "truccatrice",
                "babysitter", "dogsitter", "cassiera", "commessO", "postina", "segretariO", "sartO", "cameriera",
                "badante", "donna pulizie", "massaggiatrice", "domesticO", "animatore", "operatore call center",
                "operatore socio sanitario", "rappresentante avon" };
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
        wait.until(ExpectedConditions.elementToBeClickable(By.name("email"))).sendKeys("NicoleLuongo1998@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("Nicole1998!");


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
