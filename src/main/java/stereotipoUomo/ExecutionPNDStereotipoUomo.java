package stereotipoUomo;


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

public class ExecutionPNDStereotipoUomo {

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

    public static void facebook() throws InterruptedException {
        // KEYS FACEBOOK
        String listResFB[] = {"Valentino Rossi", "Leonardo Bonucci", "Juventus", "Moto", "Gemitaiz", "motogp",
                "calcio", "Basket", "Giorgio Chiellini", "Alessandro Del Piero", "Mark Zuckerberg", "meme", "Salmo", "lercio",
                "GamePlay", "Messi", "Cristiano Ronaldo", "Donnarumma", "Rum", "Whisky", "Ferrari",
                "Lamborghini", "Idee regalo", "Fantasy", "Assasin's Creed", "Favij", "Gta", "La casa di carta", "Ibiza",
                "Maurizio Merluzzo", "cosplay", "manga", "Rock and Roll", "Claudio Marchisio", "Diletta Leotta", "Quelli che il calcio",
                "Gillette", "Buffon", "Samsung"};
        int randFB = random.nextInt(listResFB.length);

        // Launch Facebook

        driver.get("https://www.facebook.com/");
        try {
            // Cookie button
            driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")).click();}catch (Exception e){

        }


        // LOGIN CREDENTIALS FACEBOOK
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys("marraluca1998@gmail.com"); // Email
        // section
        wait.until(ExpectedConditions.elementToBeClickable(By.id("pass"))).sendKeys("Luca1998!"); // Password sections

        // Login button
        driver.findElement(By.name("login")).click();

        Thread.sleep(2000);
        
        //Like
        try{
            driver.findElement(By.cssSelector(".pfnyh3mw > .pq6dq46d > .hu5pjgll")).click();
            Thread.sleep(5000);
        }catch (Exception e){

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
        }catch (Exception e){

        }
        //End Logout
    }


    public static void google() throws InterruptedException {
        // KEYS GOOGLE RESEARCH
        String listResGoogle[] = { "Gameplay di Favij", "motorcycle", "motorcycle helmets", "today football", "finding job online",
                "job announcements", "how to tell if a woman is in love with you", "online degree program", "trading",
                "assembly pc", "video games online", "chess online", "fortinite", "brawl stars", "minecraft", "twitch",
                "streamer", "assembly pc gaming", "playstation", "ps5", "formula 1", "lactose intolerant", "Juventus",
                "Chelsea Football Club", "back pain remedies", "wifi speed test", "workout to tone muscles",
                "training courses", "Ferrari", "car sales online", "cheap travel", "workout", "gameplay", "coding",
                "how to code with java", "how to code with python", "univerity or collage",
                "best football teams in the world", "sport news", "sports pants", "boxer gloves", "laptop", "pants",
                "handphone", "gym weights", "gym clothes", "gaming", "best gamer in the world", "smart watch",
                "smart tv", "ram", "gaming pc", "apple mac", "assembly pc kit", "smartphone", "work tools", "socks",
                "ma t-shirt", "men shirt", "gym weights", "video games", "men's wristwatch", "mouse pc",
                "keyboard pc with led", "smarphone charger", "pc charger", "sport trousers", "sport shoes", "printer",
                "mask", "batteries", "ipad", "backbag", "kit", "i7 processor", "alexa", "monitor", "wrench",
                "screwdrivers for pc", "screwdrivers", "office product", "iron nails", "ps5", "lamborghini", "opel",
                "bmw in offer", "motocycle in offer", "cars selling" };
        int randGoogle = random.nextInt(listResGoogle.length);

        // KEY GOOGLE RESEARCH (GENERICS)
        String listResGoogle2[] = { "headache solution", "lactose intolerant", "backache", "solutions the head",
                "translation from English to Italian", "pc lento", "who to change wifi password",
                "10 most visited city", "how to cook perfect speghetti", "travelleing",
                "the most visited city in the world", "netflix", "youtube", "trip to italy", "amazonvideo",
                "travelling", "the most visited city in the world", "how to lose weight", "is degree important","find fob",
                "what are the best degree courses for men", "most sought after university courses",
                "top men highest paid jobs", "top best jobs", "wish", "aliexpress", "What is my ip?",
                "how to download youtube videos", "how to delete instagram account", "how many days till christmas",
                "how many days in a year", "how many people are in the world", "how many calories in a banana",
                "how to change gmail password", "how to calculate percentage", "how to create a website", "how to kiss",
                "how to fell aspleep fast", "donwload a film", "how to learn a new language"  };
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
        String listResInsta[] = { "Valentino Rossi", "Leonardo Bonucci", "Juventus", "Moto", "Gemitaiz", "motogp",
                "calcio", "Basket", "Giorgio Chiellini", "Alessandro Del Piero", "Mark Zuckerberg", "meme", "Salmo", "lercio",
                "GamePlay", "Messi", "Cristiano Ronaldo", "Donnarumma", "Rum", "Whisky", "Ferrari",
                "Lamborghini", "Idee regalo", "Fantasy", "Assasin's Creed", "Favij", "Gta", "La casa di carta", "Ibiza",
                "Maurizio Merluzzo", "cosplay", "manga", "Rock and Roll", "Claudio Marchisio", "Diletta Leotta", "Quelli che il calcio",
                "Gillette", "Buffon", "Samsung" };
        int randInsta = random.nextInt(listResInsta.length);

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
                    .sendKeys("marraluca1998@gmail.com");
            wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("Luca1998!");

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

        try {
            driver.findElement(By.cssSelector(".Fifk5 .\\_6q-tv")).click();
            driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[3]/div/div[5]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div")).click();
        }
        catch (Exception e){

        }

    }


    public static void amazon() throws InterruptedException {

        String listResAmazon[] = { "rasoio", "olio per la barba", "scarpe da calcio", "Assasin's Creed", "Playstation 4", "Set per cocktail",
                "Maglia Juventus", "Regali per la fidanzata", "Bilanciere", "Preservativi", "Mutande uomo", "Camicie uomo",
                "Sedie da gamer", "Joystick", "Gel", "Prodotti Gillette", "Pop", "Cuffie Gamer", "profumo da uomo",
                "Manubri palestra", "Trapano", "Cassetta attrezzi", "Cacciavite elettrico",
                "modellini automobili", "Completo Napoli", "Nivea Men", "pistola colla a caldo", "pinza fustellatrice",
                "One Million", "Olio macchine", "tuta dragonball", "sega elettrica", "motosega",
                "Pinza", "Fifa 2021", "Dark Souls 3", "Final Fantasy VII remake", "Super Mario", "Fortnite", "Abbonamento Playstation", "Abbonamento X-Box" };
        int randAmazon = random.nextInt(listResAmazon.length);

        driver.get("https://www.amazon.it/");

        // Cookie button
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("sp-cc-accept"))).click();

        // "Accedi" button
        driver.findElement(By.id("nav-link-accountList")).click();

        // Creditial
        wait.until(ExpectedConditions.elementToBeClickable(By.id("ap_email"))).sendKeys("marraluca1998@gmail.com");
        driver.findElement(By.id("continue")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("ap_password"))).sendKeys("Luca1998!");
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
            try{
                driver.findElement(By.xpath(
                        "/html/body/div[1]/div[2]/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/span/a/div/img"))
                        .click();
                // Add to cart the product
                driver.findElement(By.name("submit.add-to-cart")).click();}
            catch (Exception ee){


            }
        }

        Thread.sleep(3000);
        //Aggiungi copertura
        try {
            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]/div[4]/div[1]/div[8]/div/div[1]/div[1]/div/div/div[2]/div/div/div[2]/div/div[3]/div/span[2]/span/input")).click();
        }
        catch (Exception eee){

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
                .sendKeys("marraluca1998@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("iptLgnPlnPD"))).sendKeys("Luca1998!");

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
        // KEY GOOGLE RESEARCH (GENERICS)
        String listResJobs[] = {"meccanico", "elettricista", "muratore", "sviluppatore", "operaio", "fattorino",
                "pizzaiolo", "corriere", "autista", "tecnico informatico", "felagname", "giardiniere", "idraulico",
                "barista", "cuoco", "cameriere", "postino", "carrozziere", "calzolaio", "arrotino", "manutentore",
                "abbracciante agricolo", "becchino", "salumiere", "manager", "buttafuori", "programmatore senior", "project manager"};
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
        wait.until(ExpectedConditions.elementToBeClickable(By.name("email"))).sendKeys("marraluca1998@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("Luca1998!");


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