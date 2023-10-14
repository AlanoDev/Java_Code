import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        for(String arg : args){
            System.out.println(arg);
        }

//        String s = """
//                    select * from
//                    users
//                    where id > 100
//                    order by name desc
//                """;
//        System.out.println(s);
//        //输出
//        /*
//        select * from
//        users
//        where id > 100
//        order by name desc
//         */
//
//        String a = "hello";
//        String t = a;
//        a = "world";
//        System.out.println(t);//t为hello
//
//        int b =  72;
//        int c = 105;
//        int d = 65281;
//        String e = ""+(char)b+(char)c+(char)d;
//        System.out.println(e);
//
//        String[] names = {"abc","xyz","zoo"};
//        String ar = names[1];
//        names[1]= "cat";
//        System.out.println("ar = " + ar);
//
//
//        System.out.println("小明，请输入你上次的期末考试成绩:");
//        Scanner sc = new Scanner(System.in);
//        float oldScore = sc.nextFloat();
//        System.out.println("请输入你本次期末考试成绩：");
//        float newScore = sc.nextFloat();
//        float ret = (newScore - oldScore)/oldScore;
//        System.out.printf("你本次的成绩提高了%.2f",ret);
//
//        //Switch语句新用法
//        String fruit = "apple";
//        switch (fruit){
//            case "apple" -> System.out.println("Select apple");
//            case "banana" -> System.out.println("Select banana");
//            case "mango" -> {
//                System.out.println("select mango");
//                System.out.println("Good choice!");
//            }
//            default -> System.out.println("No fruit selected");
//
//        }
//
//
//        //Switch返回值old
//        int opt;
//        switch (fruit){
//            case "apple":
//                opt = 1;
//                break;
//            case "pear":
//            case "mango":
//                opt = 2;
//                break;
//            default:
//                opt  = 0;
//                break;
//        }
//
//        //Switch新用法可以不使用break，并且可以直接返回值
//        String fruit1 = "apple";
//        int opt1 = switch (fruit1){
//            case "apple" -> 1;
//            case "pear","mango"->2;
//            default -> 0;
//        }; //此处赋值语句需要以；结束
//        System.out.println("opt1 = " + opt1);
//
//        //当返回值比较多时，可以使用yield作为Switch语句的返回值
//        int opt2 = switch (fruit1){
//            case "apple" -> 1;
//            case "pear","mango" ->2;
//            default -> {
//                int code = fruit.hashCode();
//                yield code;//yield 表示Switch语句返回值
//            }
//        };
//        System.out.println("opt2 = " + opt2);
//
//        //do……while语句
//        int sum = 0;
//        int n = 1;
//        do{
//            sum = sum+n;
//            n++;
//        }while(n<=100);*/
//
//        //for……each
//        int[] ns = {1,4,9,16,25};
//        int sumNum = 0;
//        for(int x:ns){
//            sumNum += x;
//        }
//        System.out.println(sumNum);
//
//        //倒叙输出数组
//        for(int i = ns.length-1;i>=0;i--){
//            System.out.println(ns[i]+",");
//        }
//
//
//        //break 语句跳出自身循环
//        for(int i = 1;i<=10;i++){
//            System.out.println("i = " + i);
//            for(int j = 1; j<=10; j++){
//                System.out.println("j = " + j);
//                if (j >= i){
//                    break;
//                }
//            }
//            //break 跳出他自己的当前循环，到这里
//            System.out.println("breaked");
//        }
//
//        //continue循环 ,实现求1-10之间奇数和
//        for(int i = 1; i<=10;i++){
//            System.out.println("begin i = " + i);
//            if( i % 2 == 0){
//                continue;
//            }
//            sum = sum + i;
//            System.out.println("end i = " +i);
//        }
//        System.out.println(sum);

/*
        //数组降序排序
        int[] ns = {28,12,89,73,65,18,96,50,8,36};
        System.out.println("排序前："+ Arrays.toString(ns));
        for(int i = 0 ; i < ns.length - 1; i++){
            for (int j = 1; j < ns.length-i;j++){
                if(ns[j-1]<ns[j]){
                    int temp = ns[j];
                    ns[j] = ns[j-1];
                    ns[j-1] = temp;
                }
            }
        }
        System.out.println("排序后："+Arrays.toString(ns));
*/


        //定义二维数组
        int[][] arr = {{1,2,3,4},{5,6},{7,8,9}};

/*
        //打印二维数组
        for (int[] ar:arr) {
            for(int n: ar){
                System.out.print(n);
                System.out.print(',');
            }
            System.out.println();
        }
*/
        //  System.out.println(Arrays.deepToString(arr));


       /* //用二维数组表示的学生成绩如下
        int[][] scores = {
                {82,90,91},
                {68,72,64},
                {95,91,89},
                {67,52,60},
                {79,81,85},
        };
        //计算学生的全部平均成绩
        int sum = 0;
        int count = 0;
        for (int[] ns:scores) {
            for(int n : ns){
                sum += n;
                count++;
            }
        }

        double average = sum/count;
        System.out.println(average);*/

    }
}
