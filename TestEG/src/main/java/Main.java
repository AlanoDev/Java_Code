import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.swing.*;
import javax.swing.text.Element;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //test01();//创建webDrive对象，进行基本的定位操作
        //test02();//创建webDrive对象，进行基本的定位操作，其中包含submit()和click()的区别
        //test03();//包含getAttribute属性值的获取
        //test04();//webDrive的八种定位方式
        //test05();//webDrive的几种常见操作
        //test06();//等待
        //test07(); //浏览器操作
        //test08(); //键盘鼠标事件

        //page01();//使用attribute获取元素属性、定位一组元素
        //page02();//使用多层框架定位、多层层级定位
        //page03();//下拉列表进行定位
        //page04();//alert、conform、promote处理
        page05(); //上传文件


    }

    //创建webDrive对象，进行基本的定位操作
    private static void test01() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //允许所有的请求
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        //打开百度的首页
        webDriver.get("http://www.baidu.com");
        //找到百度搜索输入框
        // WebElement element = webDriver.findElement(By.cssSelector(".s_ipt"));
        WebElement element1 = webDriver.findElement(By.xpath("//*[@id=\"kw\"]"));
        //输入软件测试
        element1.sendKeys("软件测试");

        //找到百度一下按钮  //点击
        webDriver.findElement(By.cssSelector("#su")).click();
        sleep(3000);
        //检验
        //找到搜索结果
        List<WebElement> elements = webDriver.findElements(By.cssSelector("a em"));
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());

            //如果返回结果包含软件测试，说明测试通过，否则测试不通过
            if(!elements.get(i).getText().equals("软件测试")){
                System.out.println("测试不通过");
                break;
            }
        }
        System.out.println("测试通过");

    }

    //创建webDrive对象，进行基本的定位操作，其中包含submit()和click()的区别
    private static void test02() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //允许所有的请求
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        //打开百度的首页
        webDriver.get("http://www.baidu.com");

        sleep(3000);
        //找到百度搜索输入框，输入Java107
        webDriver.findElement(By.cssSelector("#kw")).sendKeys("java107");
        //找到百度一下，并提交
        //submit 存在一些弊端，如果点击的元素放在form标签中，此时实现的效果和click效果一样，但若放在非form标签中，此时使用submit会报错
        webDriver.findElement(By.cssSelector("#su")).submit();

        sleep(3000);
        //清空
        webDriver.findElement(By.cssSelector("#kw")).clear();

    }

    //包含getAttribute属性值的获取
    private static void test03() {
        ChromeOptions options = new ChromeOptions();
        //允许所有的请求
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        //打开百度的首页
        webDriver.get("http://www.baidu.com");
        //获取标签的属性值
        String button_value = webDriver.findElement(By.cssSelector("#su")).getAttribute("value");
        if(button_value.equals("百度一下")){
            System.out.println("测试通过");
        }else {
            System.out.println(button_value);
            System.out.println("测试不通过");
        }
    }

    //webDrive的八种定位方式
    public static void test04(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com/");

        //方法一 webDriver.getCurrentUrl()返回当前访问的页面地址
        System.out.println(webDriver.getCurrentUrl());

        //方法二webDrive中元素的定位
        /*
            百度搜索框源码如下：
            <input id="kw" name="wd" class="s_ipt" value="" maxlength="255" autocomplete="off">

            1、id：webDriver.findElement(By.id("kw"));   注：其中By.id()不用输入#号，若使用selector才需
            2、name：webDriver.findElement(By.name("wd")); 直接F12查看源码中，找到对应name即可
            3、class name：webDriver.findElement(By.className("s_ipt"));
            4、link text：webDriver.findElement(By.linkText("新闻")).click();
            5、partial link text：webDriver.findElement(By.partialLinkText("新")).click();
            6、tag name：webDriver.findElement(By.tagName("input")).click();    注：element not interactable  定位不是可交互的，input标签太多
            7、xpath：webDriver.findElement(By.xpath("//*[@id=\"s-hotsearch-wrapper\"]/div/a[1]/div")).click();
            8、css selector：webDriver.findElement(By.cssSelector("#kw")).sendKeys("ahhh");
         */

        //id
        //webDriver.findElement(By.id("kw")).sendKeys("hhh");

        //name
        //webDriver.findElement(By.name("wd")).sendKeys("llll");

        //class name
        //webDriver.findElement(By.className("s_ipt")).sendKeys("ooo");

        //link text
        //webDriver.findElement(By.linkText("新闻")).click();

        //partial link text：
        //webDriver.findElement(By.partialLinkText("新")).click();

        //tag name  标签定位   定位失败：element not interactable  定位不是可交互的，input标签太多
        //webDriver.findElement(By.tagName("input")).click();

        //xpath
        //webDriver.findElement(By.xpath("//*[@id=\"s-hotsearch-wrapper\"]/div/a[1]/div")).click();

        //css selector
        webDriver.findElement(By.cssSelector("#kw")).sendKeys("ahhh");

    }

    //webDrive的几种常见操作
    public static void test05() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");

        //click操作，点击操作
       // webDriver.findElement(By.cssSelector("#su")).click();

        //sendKey()搜索框中输入
        //webDriver.findElement(By.cssSelector(".s_ipt")).sendKeys("class用.");

        //clear()清楚搜索框中的内容
//        webDriver.findElement(By.cssSelector(".s_ipt")).sendKeys("class用.");
//        sleep(3000);
//        webDriver.findElement(By.cssSelector(".s_ipt")).clear();


        //submit()用于表单上的提交，在表单中与click效果一样
        //webDriver.findElement(By.xpath("//*[@id=\"su\"]")).submit();


        //text()获取元素文本
//        String text = webDriver.findElement(By.cssSelector("#hotsearch-content-wrapper > li:nth-child(4) > a > span.title-content-title")).getText();
//        System.out.println(text);

    }

    //等待
    public static void test06() throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");

        //强制等待 sleep()
//        webDriver.findElement(By.cssSelector("#kw")).sendKeys("啦啦啦，种太阳！");
//        sleep(3000);
//        webDriver.findElement(By.cssSelector("#kw")).clear();
//        sleep(3000);
//        webDriver.findElement(By.cssSelector("#kw")).sendKeys("重新种太阳！呜呜呜~");


        //智能等待：隐式等待、显示等待


        //显示等待：就是明确的要等到某个元素的出现或者是某个元素的可点击等条件，等不到就一直等，除非在规定的时间内都没有找到，就跳出Exception
        // public WebDriverWait(WebDriver driver, long timeOutInSeconds);
        // public WebDriverWait(WebDriver driver, long timeOutInSeconds, long sleepInMillis);
        //public WebDriverWait(WebDriver driver, Clock clock, Sleeper sleeper, long timeOutInSeconds, long sleepTimeOut);

//        WebDriverWait wait = new WebDriverWait(webDriver, 3000);
//        //等待该元素被选择才继续执行后面的代码
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#bottom_layer > div > p:nth-child(8)")));
//        //等待至是否可以判断该元素的title标签为“百度一下，你就知道”才继续执行后面代码
//        wait.until(ExpectedConditions.titleIs("百度一下，你就知道"));
//
//
//        //隐式等待
//        webDriver.findElement(By.id("kw")).sendKeys("咦~");
//        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.DAYS); //最长等待三天时间，如果在3天内获取到页面上的元素，此时执行一下的代码，如果三天还没有找到，则报错
//        webDriver.findElement(By.id("su")).click();
//





    }

    //浏览器操作
    public static void test07() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");

        //浏览器最大化
       // webDriver.manage().window().maximize();

        //浏览器全屏
        //webDriver.manage().window().fullscreen();

        //输出浏览器窗口大小
//        Dimension size = webDriver.manage().window().getSize();
//        System.out.println(size);

        //改变浏览器窗口大小
        //webDriver.manage().window().setSize(new Dimension(500,1000));

//        //浏览器的前进和后退，forward back
//        webDriver.findElement(By.id("kw")).sendKeys("啦啦啦，种太阳！");
//        sleep(3000);
//        webDriver.navigate().back();
//        sleep(3000);
//        webDriver.navigate().forward();
////        sleep(3000);
//        webDriver.findElement(By.id("kw")).sendKeys("啦啦啦，种月亮！");

        //滚动条滑动操作
        Actions actions = new Actions(webDriver);
        actions.moveByOffset(0,200).perform();


        //窗口切换操作
        /*
            最初的操作窗口是使用get方法打开的窗口，当我们在操作窗口中打开了新的窗口，该新窗口就不会变为操作窗口
            我们若需要使用新的窗口，则需要进行窗口的切换，使新窗口成为我们的操作窗口
            当浏览器每打开一个窗口时，会自动给每个窗口进行标识，也称之为句柄
         */

        //通过getWindowHandles 获取所有的窗口句柄
        //通过getWindowHandle  获取 get 方法所打开的页面窗口句柄

//        webDriver.findElement(By.linkText("新闻")).click();
//        System.out.println(webDriver.getWindowHandle());
//        Set<String> handles = webDriver.getWindowHandles();
//        String target_hanlde = "";
//        for(String handle:handles){
//            target_hanlde = handle;
//            System.out.println("target_handle = " + target_hanlde);
//        }
//        webDriver.switchTo().window(target_hanlde);
//
//        webDriver.findElement(By.id("ww")).sendKeys("今天");





        //关闭或退出浏览器 close() 或 quit()
        /*区别：
            close():会关闭当前操作窗口，但是不清楚缓存，也不会关闭其他页面
            quit():直接退出浏览器，关闭整个浏览器，并且清除缓存
         */


        webDriver.findElement(By.linkText("新闻")).click();
        sleep(3000);
        //webDriver.close(); //新闻页面依旧保存

        webDriver.quit();


    }

    //键盘事件和鼠标事件
    public static void test08() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");

//        //键盘事件
//        webDriver.findElement(By.cssSelector("#kw")).sendKeys("abcdefg");
//        webDriver.findElement(By.cssSelector("#kw")).sendKeys(Keys.CONTROL,"a");
//        webDriver.findElement(By.cssSelector("#kw")).sendKeys(Keys.CONTROL,"x");

        //鼠标事件
        Actions actions = new Actions(webDriver);

        WebElement news = webDriver.findElement(By.linkText("新闻"));

        //鼠标右键
        actions.contextClick(news).perform();

        //双击
        actions.doubleClick();

        sleep(3000);



    }

    //使用attribute获取元素属性、定位一组元素
    public static void page01(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://localhost:63342/TestEG/src/main/web_app/form.html?_ijt=bgua2vqkfi11nsi9oq9bes1f6s&_ij_reload=RELOAD_ON_SAVE");

        List<WebElement> checkBoxs = webDriver.findElements(By.tagName("input"));

        for (WebElement checkbox:checkBoxs) {
            if(checkbox.getAttribute("type").equals("checkbox")){
                checkbox.click();
            }
        }

    }

    //使用多层框架定位、多层层级定位
    public static void  page02() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();

        //webDriver.get("http://localhost:63342/TestEG/src/main/web_app/frame.html?_ijt=ule348trulagc2kh58jj0kucfk&_ij_reload=RELOAD_ON_SAVE");
        //访问不到，多层框架需定位到该层框架时才可访问
        //webDriver.findElement(By.cssSelector("body > div > div > a")).click();
//        webDriver.switchTo().frame("f1").findElement(By.cssSelector("body > div > div > a")).click();
//        sleep(3000);

        webDriver.get("http://localhost:63342/TestEG/src/main/web_app/layer.html?_ijt=2c06dp5lv7806hhh3k98r00i2v&_ij_reload=RELOAD_ON_SAVE");
        //先定位到dropdown1层，再findElement到下一层，找到Action
        webDriver.findElement(By.id("dropdown1")).findElement(By.linkText("Action")).click();

    }

    //下拉列表进行选择:下拉框里的内容需要进行两次定位，先定位到下拉框对下拉框进行操作后，再定位到下拉框内里的选项
    public static void page03() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://localhost:63342/TestEG/src/main/web_app/pull_down.html?_ijt=k4hsncfrgp6p48veefsmsn7rkt&_ij_reload=RELOAD_ON_SAVE");

        WebElement element = webDriver.findElement(By.id("ShippingMethod"));
        //element.findElement(By.xpath("//*[@id=\"ShippingMethod\"]/option[4]")).click();

        List<WebElement> options = element.findElements(By.tagName("option"));

        for (WebElement option : options) {
            if(option.getAttribute("value").equals("9.03")){
                option.click();
            }
        }
        sleep(3000);
    }

    //alert、conform、promote处理
    public static void  page04() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://localhost:63342/TestEG/src/main/web_app/alert.html?_ijt=30iglligklla33ncj134ot963c&_ij_reload=RELOAD_ON_SAVE");

        webDriver.findElement(By.tagName("input")).click();
        //转换到alert，取消输入
        webDriver.switchTo().alert().dismiss();
        sleep(3000);

        webDriver.findElement(By.tagName("input")).click();
        webDriver.switchTo().alert().sendKeys("zhanghao is pig!");
        sleep(3000);
        webDriver.switchTo().alert().accept();

    }

    //上传文件
    public static void page05(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://localhost:63342/TestEG/src/main/web_app/file.html?_ijt=19garkf5osva5nvnovm9b15ns6&_ij_reload=RELOAD_ON_SAVE");

        webDriver.findElement(By.tagName("input")).sendKeys("D:\\Pictures\\Camera Roll\\2.jpg");

    }


}
