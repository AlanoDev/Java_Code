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
//        //���
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
//        System.out.println(t);//tΪhello
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
//        System.out.println("С�������������ϴε���ĩ���Գɼ�:");
//        Scanner sc = new Scanner(System.in);
//        float oldScore = sc.nextFloat();
//        System.out.println("�������㱾����ĩ���Գɼ���");
//        float newScore = sc.nextFloat();
//        float ret = (newScore - oldScore)/oldScore;
//        System.out.printf("�㱾�εĳɼ������%.2f",ret);
//
//        //Switch������÷�
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
//        //Switch����ֵold
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
//        //Switch���÷����Բ�ʹ��break�����ҿ���ֱ�ӷ���ֵ
//        String fruit1 = "apple";
//        int opt1 = switch (fruit1){
//            case "apple" -> 1;
//            case "pear","mango"->2;
//            default -> 0;
//        }; //�˴���ֵ�����Ҫ�ԣ�����
//        System.out.println("opt1 = " + opt1);
//
//        //������ֵ�Ƚ϶�ʱ������ʹ��yield��ΪSwitch���ķ���ֵ
//        int opt2 = switch (fruit1){
//            case "apple" -> 1;
//            case "pear","mango" ->2;
//            default -> {
//                int code = fruit.hashCode();
//                yield code;//yield ��ʾSwitch��䷵��ֵ
//            }
//        };
//        System.out.println("opt2 = " + opt2);
//
//        //do����while���
//        int sum = 0;
//        int n = 1;
//        do{
//            sum = sum+n;
//            n++;
//        }while(n<=100);*/
//
//        //for����each
//        int[] ns = {1,4,9,16,25};
//        int sumNum = 0;
//        for(int x:ns){
//            sumNum += x;
//        }
//        System.out.println(sumNum);
//
//        //�����������
//        for(int i = ns.length-1;i>=0;i--){
//            System.out.println(ns[i]+",");
//        }
//
//
//        //break �����������ѭ��
//        for(int i = 1;i<=10;i++){
//            System.out.println("i = " + i);
//            for(int j = 1; j<=10; j++){
//                System.out.println("j = " + j);
//                if (j >= i){
//                    break;
//                }
//            }
//            //break �������Լ��ĵ�ǰѭ����������
//            System.out.println("breaked");
//        }
//
//        //continueѭ�� ,ʵ����1-10֮��������
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
        //���齵������
        int[] ns = {28,12,89,73,65,18,96,50,8,36};
        System.out.println("����ǰ��"+ Arrays.toString(ns));
        for(int i = 0 ; i < ns.length - 1; i++){
            for (int j = 1; j < ns.length-i;j++){
                if(ns[j-1]<ns[j]){
                    int temp = ns[j];
                    ns[j] = ns[j-1];
                    ns[j-1] = temp;
                }
            }
        }
        System.out.println("�����"+Arrays.toString(ns));
*/


        //�����ά����
        int[][] arr = {{1,2,3,4},{5,6},{7,8,9}};

/*
        //��ӡ��ά����
        for (int[] ar:arr) {
            for(int n: ar){
                System.out.print(n);
                System.out.print(',');
            }
            System.out.println();
        }
*/
        //  System.out.println(Arrays.deepToString(arr));


       /* //�ö�ά�����ʾ��ѧ���ɼ�����
        int[][] scores = {
                {82,90,91},
                {68,72,64},
                {95,91,89},
                {67,52,60},
                {79,81,85},
        };
        //����ѧ����ȫ��ƽ���ɼ�
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
