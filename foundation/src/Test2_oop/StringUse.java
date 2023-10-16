package Test2_oop;

import java.util.Arrays;
import java.util.StringJoiner;


public class StringUse {
    public static void main(String[] args) {

//        String s1 = "hello";
//        String s2 = "Hello";
//        //使用equals进行字符串比较，equalsIgnoreCase()表示忽略大小写的比较
//        System.out.println(s1.equalsIgnoreCase(s2));  //true
//
//        //contain()方法的参数是CharSequence而不是String，CharSequence是String的父类
//        System.out.println(s1.contains("he"));  //true
//
//        //indexOf(“”)返回指定的字符串所在当前字符串中的位置，下标从0开始
//        System.out.println(s1.indexOf("l"));  //2
//        System.out.println(s1.lastIndexOf("l"));  //3
//        System.out.println(s1.startsWith("he")); //true  判断是否以“”开头
//        System.out.println(s1.endsWith("lo"));  //true  判断是否以“”结尾
//
//        System.out.println("Hello".substring(2));  //"llo" 从第2个位置开始截取
//        System.out.println("Hello".substring(2,4));  //“ll"  从第2个位置截取到第4个位置
//
//        //String还提供许多自带的方法，例如：trim()、strip()去除前后端的空格
//        String s3 = "   \u3000\tHello\r\n ";  //\u3000为中文空格
//        System.out.println(s3.trim()); //“    Hello"  注：并未改变字符串的内容，而是返回一个新的字符串
//        System.out.println(s3.strip());//"Hello"  与trim()的区别在与会将类似中文字符的空格也去除
//
//        //isEmpty()和isBlank()判断字符串是否为空，是否只包含空格
//        System.out.println("".isEmpty()); // true
//        System.out.println("  ".isEmpty()); //false
//        System.out.println(" \n".isBlank());  //true
//        System.out.println("\nhello".isBlank()); //false
//
//        //替换字符replace()方法
//        String s = "hello";
//        System.out.println(s.replace('l', 'n')); //henno 所有的l都将被替换
//
//        //分割字符串
//        String s4 = "A,B,C,D";
//        String[] ss = s.split("\\,"); //{"A","B","C","D"}
//
//        //join()
//        String[] arr = {"A","B","C"};
//        String s5 = String.join("***",arr);  //"A***B***C"
//
//        //类型转换
//        System.out.println(String.valueOf(123)); //"123"
//        System.out.println(String.valueOf(45.6)); //"45.67"
//
//        //将字符串转换成其他类型
//        int n1 = Integer.parseInt("134");  //123
//        System.out.println("n1 = " + n1);
//        int n2 = Integer.parseInt("ff",16);  //按十六进制转换
//
//        boolean b1 = Boolean.parseBoolean("true"); //true
//        boolean b2 = Boolean.parseBoolean("false");
//
//        //要特别注意，Integer有个getInteger(String)方法，它不是将字符串转换为int，而是把该字符串对应的系统变量转换为Integer：
//        System.out.println(Integer.getInteger("java.version")); //版本号，11
//
//        //实现string和char[]类型的转换
//        char[] cs = "Hello".toCharArray();  //String -> char[]
//        String s6 = new String(cs);     //char[] -> String，复制的一份
//        System.out.println(s6);
//        cs[0] = 'X';  //  改变其值不会影响拷贝的String字符
//        System.out.println(s6);// Hello  此处不会更改，
//        System.out.println(Arrays.toString(cs));  //[X,e,l,l,o]
//


//        //保证score成绩的安全，不会因为外部数据的改变而产生不安全行为
//        int[] scores = new int[]{88,77,51,66};
//        Score s  = new Score(scores);
//        s.printScores();
//        scores[2] = 99;
//        s.printScores();


//        //StringBuilder的使用
//        StringBuilder sb = new StringBuilder(1024);
//        for (int i = 0; i < 1000; i++) {
//            sb.append(i);
//            sb.append(',');
//        }
//        String s = sb.toString();
//        System.out.println(s);
//
//        //StringBuilder链式操作
//        StringBuilder sb1 = new StringBuilder(1024);
//        sb1.append("Mr ").append("Bob ").append("!").insert(0,"Hello, ");
//        String ss = sb1.toString();
//        System.out.println(ss);


//        //使用StringBuilder实现一个Insert语句
//        String[] fields = {"name","position","salary"};
//        String table = "employee";
//        String insert = builderInsertSql(table,fields);
//        System.out.println(insert);
//        String s = "INSERT INTO employee (name,position,salary) VALUES (?,?,?)";
//        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");

//        //使用StringJoiner方法
//        String[] names = {"Bob","Alice","Grace"};
//        var sj = new StringJoiner(", ","Hello ","!");
//        for (String name:names) {
//            sj.add(name);
//        }
//        System.out.println(sj);
//
//        //String中的join方法，实现拼接
//        String[] arr = {"bob","alice","grace"};
//        String sss = String.join(",",arr);
//        System.out.println(sss);

//        //使用StringJoiner进行拼接
//        String[] fields = {"name","position","salary"};
//        String table = "employee";
//        String select = builderSelectSql(table,fields);
//        System.out.println(select);
//        System.out.println("SELECT name,position,salary FROM employee".equals(select) ? "测试成功" : "测试失败");


        Weekday day = Weekday.SUN;
        if(day == Weekday.SAT || day == Weekday.SUN){
            System.out.println("Work at home!");
        }else{
            System.out.println("Work at office!");
        }



    }

//      //使用StringBuilder实现insert语句拼接，实现静态方法
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


//    //使用StringJoiner进行拼接
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
        //拷贝一份，不直接引用传入的scores成绩，即可避免外部数组改变，引起不安全变化
        this.scores = scores.clone();
    }

    public void printScores(){
        System.out.println(Arrays.toString(scores));
    }
}

enum Weekday{
    SUN,MON,TUE,WED,THU,FRI,SAT;
}
