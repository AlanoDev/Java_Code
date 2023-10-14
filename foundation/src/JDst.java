import java.util.Scanner;

public class JDst {
    public static void main(String[] args) {
        boolean flag = true;
        while(flag){
            int num = (int)(Math.random()*3);  //随机数生成，random取整为double类型0-1之间
            //   System.out.println(num);
            String[] arr = {"剪刀","石头","布"};
            System.out.println("请输入您将要出的拳：");
            Scanner sc = new Scanner(System.in);
            String opt = sc.nextLine();
            String opt1 = arr[num];
            switch (opt) {
                case "剪刀" -> {
                    System.out.println("我出的是：" + opt1);
                    if ("剪刀".equals(opt1)) {
                        System.out.println("我们是平手诶，所以你要给我买鸡腿！");
                    } else if ("石头".equals(opt1)) {
                        System.out.println("我赢啦，你输啦，给我买鸡腿！");
                    } else {
                        System.out.println("恭喜你，你赢啦，请我吃鸡腿！");
                    }
                }
                case "石头" -> {
                    System.out.println("我出的是：" + opt1);
                    if ("石头".equals(opt1)) {
                        System.out.println("我们是平手诶，所以你要给我买鸡腿！");
                    } else if ("布".equals(opt1)) {
                        System.out.println("我赢啦，你输啦，给我买鸡腿！");
                    } else {
                        System.out.println("恭喜你，你赢啦，请我吃鸡腿！");
                    }
                }
                case "布" -> {
                    System.out.println("我出的是：" + opt1);
                    if ("布".equals(opt1)) {
                        System.out.println("我们是平手诶，所以你要给我买鸡腿！");
                    } else if ("剪刀".equals(opt1)) {
                        System.out.println("我赢啦，你输啦，给我买鸡腿！");
                    } else {
                        System.out.println("恭喜你，你赢啦，请我吃鸡腿！");
                    }
                }
                case "q" ->{
                    flag = false;
                    System.out.println("即将退出！");
                }
            }
        }

    }
}
