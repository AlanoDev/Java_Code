import java.util.Scanner;

public class JDst {
    public static void main(String[] args) {
        boolean flag = true;
        while(flag){
            int num = (int)(Math.random()*3);  //��������ɣ�randomȡ��Ϊdouble����0-1֮��
            //   System.out.println(num);
            String[] arr = {"����","ʯͷ","��"};
            System.out.println("����������Ҫ����ȭ��");
            Scanner sc = new Scanner(System.in);
            String opt = sc.nextLine();
            String opt1 = arr[num];
            switch (opt) {
                case "����" -> {
                    System.out.println("�ҳ����ǣ�" + opt1);
                    if ("����".equals(opt1)) {
                        System.out.println("������ƽ������������Ҫ�������ȣ�");
                    } else if ("ʯͷ".equals(opt1)) {
                        System.out.println("��Ӯ�������������������ȣ�");
                    } else {
                        System.out.println("��ϲ�㣬��Ӯ�������ҳԼ��ȣ�");
                    }
                }
                case "ʯͷ" -> {
                    System.out.println("�ҳ����ǣ�" + opt1);
                    if ("ʯͷ".equals(opt1)) {
                        System.out.println("������ƽ������������Ҫ�������ȣ�");
                    } else if ("��".equals(opt1)) {
                        System.out.println("��Ӯ�������������������ȣ�");
                    } else {
                        System.out.println("��ϲ�㣬��Ӯ�������ҳԼ��ȣ�");
                    }
                }
                case "��" -> {
                    System.out.println("�ҳ����ǣ�" + opt1);
                    if ("��".equals(opt1)) {
                        System.out.println("������ƽ������������Ҫ�������ȣ�");
                    } else if ("����".equals(opt1)) {
                        System.out.println("��Ӯ�������������������ȣ�");
                    } else {
                        System.out.println("��ϲ�㣬��Ӯ�������ҳԼ��ȣ�");
                    }
                }
                case "q" ->{
                    flag = false;
                    System.out.println("�����˳���");
                }
            }
        }

    }
}
