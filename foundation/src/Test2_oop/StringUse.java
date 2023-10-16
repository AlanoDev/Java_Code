package Test2_oop;

import java.util.Arrays;
import java.util.StringJoiner;


public class StringUse {
    public static void main(String[] args) {

//        String s1 = "hello";
//        String s2 = "Hello";
//        //ʹ��equals�����ַ����Ƚϣ�equalsIgnoreCase()��ʾ���Դ�Сд�ıȽ�
//        System.out.println(s1.equalsIgnoreCase(s2));  //true
//
//        //contain()�����Ĳ�����CharSequence������String��CharSequence��String�ĸ���
//        System.out.println(s1.contains("he"));  //true
//
//        //indexOf(����)����ָ�����ַ������ڵ�ǰ�ַ����е�λ�ã��±��0��ʼ
//        System.out.println(s1.indexOf("l"));  //2
//        System.out.println(s1.lastIndexOf("l"));  //3
//        System.out.println(s1.startsWith("he")); //true  �ж��Ƿ��ԡ�����ͷ
//        System.out.println(s1.endsWith("lo"));  //true  �ж��Ƿ��ԡ�����β
//
//        System.out.println("Hello".substring(2));  //"llo" �ӵ�2��λ�ÿ�ʼ��ȡ
//        System.out.println("Hello".substring(2,4));  //��ll"  �ӵ�2��λ�ý�ȡ����4��λ��
//
//        //String���ṩ����Դ��ķ��������磺trim()��strip()ȥ��ǰ��˵Ŀո�
//        String s3 = "   \u3000\tHello\r\n ";  //\u3000Ϊ���Ŀո�
//        System.out.println(s3.trim()); //��    Hello"  ע����δ�ı��ַ��������ݣ����Ƿ���һ���µ��ַ���
//        System.out.println(s3.strip());//"Hello"  ��trim()����������Ὣ���������ַ��Ŀո�Ҳȥ��
//
//        //isEmpty()��isBlank()�ж��ַ����Ƿ�Ϊ�գ��Ƿ�ֻ�����ո�
//        System.out.println("".isEmpty()); // true
//        System.out.println("  ".isEmpty()); //false
//        System.out.println(" \n".isBlank());  //true
//        System.out.println("\nhello".isBlank()); //false
//
//        //�滻�ַ�replace()����
//        String s = "hello";
//        System.out.println(s.replace('l', 'n')); //henno ���е�l�������滻
//
//        //�ָ��ַ���
//        String s4 = "A,B,C,D";
//        String[] ss = s.split("\\,"); //{"A","B","C","D"}
//
//        //join()
//        String[] arr = {"A","B","C"};
//        String s5 = String.join("***",arr);  //"A***B***C"
//
//        //����ת��
//        System.out.println(String.valueOf(123)); //"123"
//        System.out.println(String.valueOf(45.6)); //"45.67"
//
//        //���ַ���ת������������
//        int n1 = Integer.parseInt("134");  //123
//        System.out.println("n1 = " + n1);
//        int n2 = Integer.parseInt("ff",16);  //��ʮ������ת��
//
//        boolean b1 = Boolean.parseBoolean("true"); //true
//        boolean b2 = Boolean.parseBoolean("false");
//
//        //Ҫ�ر�ע�⣬Integer�и�getInteger(String)�����������ǽ��ַ���ת��Ϊint�����ǰѸ��ַ�����Ӧ��ϵͳ����ת��ΪInteger��
//        System.out.println(Integer.getInteger("java.version")); //�汾�ţ�11
//
//        //ʵ��string��char[]���͵�ת��
//        char[] cs = "Hello".toCharArray();  //String -> char[]
//        String s6 = new String(cs);     //char[] -> String�����Ƶ�һ��
//        System.out.println(s6);
//        cs[0] = 'X';  //  �ı���ֵ����Ӱ�쿽����String�ַ�
//        System.out.println(s6);// Hello  �˴�������ģ�
//        System.out.println(Arrays.toString(cs));  //[X,e,l,l,o]
//


//        //��֤score�ɼ��İ�ȫ��������Ϊ�ⲿ���ݵĸı����������ȫ��Ϊ
//        int[] scores = new int[]{88,77,51,66};
//        Score s  = new Score(scores);
//        s.printScores();
//        scores[2] = 99;
//        s.printScores();


//        //StringBuilder��ʹ��
//        StringBuilder sb = new StringBuilder(1024);
//        for (int i = 0; i < 1000; i++) {
//            sb.append(i);
//            sb.append(',');
//        }
//        String s = sb.toString();
//        System.out.println(s);
//
//        //StringBuilder��ʽ����
//        StringBuilder sb1 = new StringBuilder(1024);
//        sb1.append("Mr ").append("Bob ").append("!").insert(0,"Hello, ");
//        String ss = sb1.toString();
//        System.out.println(ss);


//        //ʹ��StringBuilderʵ��һ��Insert���
//        String[] fields = {"name","position","salary"};
//        String table = "employee";
//        String insert = builderInsertSql(table,fields);
//        System.out.println(insert);
//        String s = "INSERT INTO employee (name,position,salary) VALUES (?,?,?)";
//        System.out.println(s.equals(insert) ? "���Գɹ�" : "����ʧ��");

//        //ʹ��StringJoiner����
//        String[] names = {"Bob","Alice","Grace"};
//        var sj = new StringJoiner(", ","Hello ","!");
//        for (String name:names) {
//            sj.add(name);
//        }
//        System.out.println(sj);
//
//        //String�е�join������ʵ��ƴ��
//        String[] arr = {"bob","alice","grace"};
//        String sss = String.join(",",arr);
//        System.out.println(sss);

//        //ʹ��StringJoiner����ƴ��
//        String[] fields = {"name","position","salary"};
//        String table = "employee";
//        String select = builderSelectSql(table,fields);
//        System.out.println(select);
//        System.out.println("SELECT name,position,salary FROM employee".equals(select) ? "���Գɹ�" : "����ʧ��");


        Weekday day = Weekday.SUN;
        if(day == Weekday.SAT || day == Weekday.SUN){
            System.out.println("Work at home!");
        }else{
            System.out.println("Work at office!");
        }



    }

//      //ʹ��StringBuilderʵ��insert���ƴ�ӣ�ʵ�־�̬����
//    static String builderInsertSql(String table,String[] fields){
//
//        StringBuilder s = new StringBuilder(1024);
//
//        s.append("INSERT INTO ").append(table).append(" ").append("(");
//        for (String name:fields) {
//            s.append(name).append(",");
//        }
//        s.delete(s.length()-1,s.length());
//        s.append(") ").append("VALUES (?,?,?)");
//        return s.toString();
//    }


//    //ʹ��StringJoiner����ƴ��
//        static String builderSelectSql(String table,String[] fields){
//            StringBuilder s = new StringBuilder(1024);
//            StringJoiner j = new StringJoiner(",");
//            for (String sj:fields) {
//                j.add(sj);
//            }
//            s.append("SELECT ").append(j).append(" FROM ").append(table);
//            return s.toString();
//        }




}

class Score{
    private int[] scores;
    public Score(int[] scores){
        //����һ�ݣ���ֱ�����ô����scores�ɼ������ɱ����ⲿ����ı䣬���𲻰�ȫ�仯
        this.scores = scores.clone();
    }

    public void printScores(){
        System.out.println(Arrays.toString(scores));
    }
}

enum Weekday{
    SUN,MON,TUE,WED,THU,FRI,SAT;
}
