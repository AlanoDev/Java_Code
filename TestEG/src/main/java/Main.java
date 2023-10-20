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

        //test01();//����webDrive���󣬽��л����Ķ�λ����
        //test02();//����webDrive���󣬽��л����Ķ�λ���������а���submit()��click()������
        //test03();//����getAttribute����ֵ�Ļ�ȡ
        //test04();//webDrive�İ��ֶ�λ��ʽ
        //test05();//webDrive�ļ��ֳ�������
        //test06();//�ȴ�
        //test07(); //���������
        //test08(); //��������¼�

        //page01();//ʹ��attribute��ȡԪ�����ԡ���λһ��Ԫ��
        //page02();//ʹ�ö���ܶ�λ�����㼶��λ
        //page03();//�����б���ж�λ
        //page04();//alert��conform��promote����
        page05(); //�ϴ��ļ�


    }

    //����webDrive���󣬽��л����Ķ�λ����
    private static void test01() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //�������е�����
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        //�򿪰ٶȵ���ҳ
        webDriver.get("http://www.baidu.com");
        //�ҵ��ٶ����������
        // WebElement element = webDriver.findElement(By.cssSelector(".s_ipt"));
        WebElement element1 = webDriver.findElement(By.xpath("//*[@id=\"kw\"]"));
        //�����������
        element1.sendKeys("�������");

        //�ҵ��ٶ�һ�°�ť  //���
        webDriver.findElement(By.cssSelector("#su")).click();
        sleep(3000);
        //����
        //�ҵ��������
        List<WebElement> elements = webDriver.findElements(By.cssSelector("a em"));
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());

            //������ؽ������������ԣ�˵������ͨ����������Բ�ͨ��
            if(!elements.get(i).getText().equals("�������")){
                System.out.println("���Բ�ͨ��");
                break;
            }
        }
        System.out.println("����ͨ��");

    }

    //����webDrive���󣬽��л����Ķ�λ���������а���submit()��click()������
    private static void test02() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //�������е�����
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        //�򿪰ٶȵ���ҳ
        webDriver.get("http://www.baidu.com");

        sleep(3000);
        //�ҵ��ٶ��������������Java107
        webDriver.findElement(By.cssSelector("#kw")).sendKeys("java107");
        //�ҵ��ٶ�һ�£����ύ
        //submit ����һЩ�׶ˣ���������Ԫ�ط���form��ǩ�У���ʱʵ�ֵ�Ч����clickЧ��һ�����������ڷ�form��ǩ�У���ʱʹ��submit�ᱨ��
        webDriver.findElement(By.cssSelector("#su")).submit();

        sleep(3000);
        //���
        webDriver.findElement(By.cssSelector("#kw")).clear();

    }

    //����getAttribute����ֵ�Ļ�ȡ
    private static void test03() {
        ChromeOptions options = new ChromeOptions();
        //�������е�����
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        //�򿪰ٶȵ���ҳ
        webDriver.get("http://www.baidu.com");
        //��ȡ��ǩ������ֵ
        String button_value = webDriver.findElement(By.cssSelector("#su")).getAttribute("value");
        if(button_value.equals("�ٶ�һ��")){
            System.out.println("����ͨ��");
        }else {
            System.out.println(button_value);
            System.out.println("���Բ�ͨ��");
        }
    }

    //webDrive�İ��ֶ�λ��ʽ
    public static void test04(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com/");

        //����һ webDriver.getCurrentUrl()���ص�ǰ���ʵ�ҳ���ַ
        System.out.println(webDriver.getCurrentUrl());

        //������webDrive��Ԫ�صĶ�λ
        /*
            �ٶ�������Դ�����£�
            <input id="kw" name="wd" class="s_ipt" value="" maxlength="255" autocomplete="off">

            1��id��webDriver.findElement(By.id("kw"));   ע������By.id()��������#�ţ���ʹ��selector����
            2��name��webDriver.findElement(By.name("wd")); ֱ��F12�鿴Դ���У��ҵ���Ӧname����
            3��class name��webDriver.findElement(By.className("s_ipt"));
            4��link text��webDriver.findElement(By.linkText("����")).click();
            5��partial link text��webDriver.findElement(By.partialLinkText("��")).click();
            6��tag name��webDriver.findElement(By.tagName("input")).click();    ע��element not interactable  ��λ���ǿɽ����ģ�input��ǩ̫��
            7��xpath��webDriver.findElement(By.xpath("//*[@id=\"s-hotsearch-wrapper\"]/div/a[1]/div")).click();
            8��css selector��webDriver.findElement(By.cssSelector("#kw")).sendKeys("ahhh");
         */

        //id
        //webDriver.findElement(By.id("kw")).sendKeys("hhh");

        //name
        //webDriver.findElement(By.name("wd")).sendKeys("llll");

        //class name
        //webDriver.findElement(By.className("s_ipt")).sendKeys("ooo");

        //link text
        //webDriver.findElement(By.linkText("����")).click();

        //partial link text��
        //webDriver.findElement(By.partialLinkText("��")).click();

        //tag name  ��ǩ��λ   ��λʧ�ܣ�element not interactable  ��λ���ǿɽ����ģ�input��ǩ̫��
        //webDriver.findElement(By.tagName("input")).click();

        //xpath
        //webDriver.findElement(By.xpath("//*[@id=\"s-hotsearch-wrapper\"]/div/a[1]/div")).click();

        //css selector
        webDriver.findElement(By.cssSelector("#kw")).sendKeys("ahhh");

    }

    //webDrive�ļ��ֳ�������
    public static void test05() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");

        //click�������������
       // webDriver.findElement(By.cssSelector("#su")).click();

        //sendKey()������������
        //webDriver.findElement(By.cssSelector(".s_ipt")).sendKeys("class��.");

        //clear()����������е�����
//        webDriver.findElement(By.cssSelector(".s_ipt")).sendKeys("class��.");
//        sleep(3000);
//        webDriver.findElement(By.cssSelector(".s_ipt")).clear();


        //submit()���ڱ��ϵ��ύ���ڱ�����clickЧ��һ��
        //webDriver.findElement(By.xpath("//*[@id=\"su\"]")).submit();


        //text()��ȡԪ���ı�
//        String text = webDriver.findElement(By.cssSelector("#hotsearch-content-wrapper > li:nth-child(4) > a > span.title-content-title")).getText();
//        System.out.println(text);

    }

    //�ȴ�
    public static void test06() throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");

        //ǿ�Ƶȴ� sleep()
//        webDriver.findElement(By.cssSelector("#kw")).sendKeys("����������̫����");
//        sleep(3000);
//        webDriver.findElement(By.cssSelector("#kw")).clear();
//        sleep(3000);
//        webDriver.findElement(By.cssSelector("#kw")).sendKeys("������̫����������~");


        //���ܵȴ�����ʽ�ȴ�����ʾ�ȴ�


        //��ʾ�ȴ���������ȷ��Ҫ�ȵ�ĳ��Ԫ�صĳ��ֻ�����ĳ��Ԫ�صĿɵ�����������Ȳ�����һֱ�ȣ������ڹ涨��ʱ���ڶ�û���ҵ���������Exception
        // public WebDriverWait(WebDriver driver, long timeOutInSeconds);
        // public WebDriverWait(WebDriver driver, long timeOutInSeconds, long sleepInMillis);
        //public WebDriverWait(WebDriver driver, Clock clock, Sleeper sleeper, long timeOutInSeconds, long sleepTimeOut);

//        WebDriverWait wait = new WebDriverWait(webDriver, 3000);
//        //�ȴ���Ԫ�ر�ѡ��ż���ִ�к���Ĵ���
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#bottom_layer > div > p:nth-child(8)")));
//        //�ȴ����Ƿ�����жϸ�Ԫ�ص�title��ǩΪ���ٶ�һ�£����֪�����ż���ִ�к������
//        wait.until(ExpectedConditions.titleIs("�ٶ�һ�£����֪��"));
//
//
//        //��ʽ�ȴ�
//        webDriver.findElement(By.id("kw")).sendKeys("��~");
//        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.DAYS); //��ȴ�����ʱ�䣬�����3���ڻ�ȡ��ҳ���ϵ�Ԫ�أ���ʱִ��һ�µĴ��룬������컹û���ҵ����򱨴�
//        webDriver.findElement(By.id("su")).click();
//





    }

    //���������
    public static void test07() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");

        //��������
       // webDriver.manage().window().maximize();

        //�����ȫ��
        //webDriver.manage().window().fullscreen();

        //�����������ڴ�С
//        Dimension size = webDriver.manage().window().getSize();
//        System.out.println(size);

        //�ı���������ڴ�С
        //webDriver.manage().window().setSize(new Dimension(500,1000));

//        //�������ǰ���ͺ��ˣ�forward back
//        webDriver.findElement(By.id("kw")).sendKeys("����������̫����");
//        sleep(3000);
//        webDriver.navigate().back();
//        sleep(3000);
//        webDriver.navigate().forward();
////        sleep(3000);
//        webDriver.findElement(By.id("kw")).sendKeys("����������������");

        //��������������
        Actions actions = new Actions(webDriver);
        actions.moveByOffset(0,200).perform();


        //�����л�����
        /*
            ����Ĳ���������ʹ��get�����򿪵Ĵ��ڣ��������ڲ��������д����µĴ��ڣ����´��ھͲ����Ϊ��������
            ��������Ҫʹ���µĴ��ڣ�����Ҫ���д��ڵ��л���ʹ�´��ڳ�Ϊ���ǵĲ�������
            �������ÿ��һ������ʱ�����Զ���ÿ�����ڽ��б�ʶ��Ҳ��֮Ϊ���
         */

        //ͨ��getWindowHandles ��ȡ���еĴ��ھ��
        //ͨ��getWindowHandle  ��ȡ get �������򿪵�ҳ�洰�ھ��

//        webDriver.findElement(By.linkText("����")).click();
//        System.out.println(webDriver.getWindowHandle());
//        Set<String> handles = webDriver.getWindowHandles();
//        String target_hanlde = "";
//        for(String handle:handles){
//            target_hanlde = handle;
//            System.out.println("target_handle = " + target_hanlde);
//        }
//        webDriver.switchTo().window(target_hanlde);
//
//        webDriver.findElement(By.id("ww")).sendKeys("����");





        //�رջ��˳������ close() �� quit()
        /*����
            close():��رյ�ǰ�������ڣ����ǲ�������棬Ҳ����ر�����ҳ��
            quit():ֱ���˳���������ر�����������������������
         */


        webDriver.findElement(By.linkText("����")).click();
        sleep(3000);
        //webDriver.close(); //����ҳ�����ɱ���

        webDriver.quit();


    }

    //�����¼�������¼�
    public static void test08() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.baidu.com");

//        //�����¼�
//        webDriver.findElement(By.cssSelector("#kw")).sendKeys("abcdefg");
//        webDriver.findElement(By.cssSelector("#kw")).sendKeys(Keys.CONTROL,"a");
//        webDriver.findElement(By.cssSelector("#kw")).sendKeys(Keys.CONTROL,"x");

        //����¼�
        Actions actions = new Actions(webDriver);

        WebElement news = webDriver.findElement(By.linkText("����"));

        //����Ҽ�
        actions.contextClick(news).perform();

        //˫��
        actions.doubleClick();

        sleep(3000);



    }

    //ʹ��attribute��ȡԪ�����ԡ���λһ��Ԫ��
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

    //ʹ�ö���ܶ�λ�����㼶��λ
    public static void  page02() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();

        //webDriver.get("http://localhost:63342/TestEG/src/main/web_app/frame.html?_ijt=ule348trulagc2kh58jj0kucfk&_ij_reload=RELOAD_ON_SAVE");
        //���ʲ�����������趨λ���ò���ʱ�ſɷ���
        //webDriver.findElement(By.cssSelector("body > div > div > a")).click();
//        webDriver.switchTo().frame("f1").findElement(By.cssSelector("body > div > div > a")).click();
//        sleep(3000);

        webDriver.get("http://localhost:63342/TestEG/src/main/web_app/layer.html?_ijt=2c06dp5lv7806hhh3k98r00i2v&_ij_reload=RELOAD_ON_SAVE");
        //�ȶ�λ��dropdown1�㣬��findElement����һ�㣬�ҵ�Action
        webDriver.findElement(By.id("dropdown1")).findElement(By.linkText("Action")).click();

    }

    //�����б����ѡ��:���������������Ҫ�������ζ�λ���ȶ�λ�����������������в������ٶ�λ�������������ѡ��
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

    //alert��conform��promote����
    public static void  page04() throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://localhost:63342/TestEG/src/main/web_app/alert.html?_ijt=30iglligklla33ncj134ot963c&_ij_reload=RELOAD_ON_SAVE");

        webDriver.findElement(By.tagName("input")).click();
        //ת����alert��ȡ������
        webDriver.switchTo().alert().dismiss();
        sleep(3000);

        webDriver.findElement(By.tagName("input")).click();
        webDriver.switchTo().alert().sendKeys("zhanghao is pig!");
        sleep(3000);
        webDriver.switchTo().alert().accept();

    }

    //�ϴ��ļ�
    public static void page05(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://localhost:63342/TestEG/src/main/web_app/file.html?_ijt=19garkf5osva5nvnovm9b15ns6&_ij_reload=RELOAD_ON_SAVE");

        webDriver.findElement(By.tagName("input")).sendKeys("D:\\Pictures\\Camera Roll\\2.jpg");

    }


}
