package Test2_oop;

public class test2_oop {
    public static void main(String[] args) {
//        City bj = new City();
//        bj.setName("Beijing");
//        bj.setLatitude(39.903);
//        bj.setLongitude(116.401);
//        System.out.println(bj.getName());
//        System.out.println("location: "+bj.getLatitude()+","+bj.getLongitude());
//
//        Group g = new Group();
//        g.setName(null);
//        g.setName("xiao ming");
//        g.setName("xiao lian","xiao zhang");
//
//        Group g = new Group();
//        g.setName(null);

//        Person p = new Person();
//        int n = 15;
//        p.setAge(n);
//        System.out.println(p.getAge());
//        //�˴��޸��˱�����ֵ���������޸�ǰ���ݵ�ֵ�������λ�ý����˰󶨣���˲�Ӱ������ֵ
//        n = 20;
//        System.out.println(p.getAge());

//        Person p = new Person();
//        String[] fullname = new String[]{"Homer","Simpson"};
//        p.setName(fullname);
//        System.out.println(p.getName()); //���ΪHomer Simpson
//        fullname[0] = "Bart";   //�޸�����ָ���ַ��ֵ
//        System.out.println(p.getName());  //���ΪBart Simpson


        /*Person p = new Person();
        String bob = "Bob";
        p.setName(bob);
        System.out.println(p.getName());  //���ֵBob
        bob = "Alice";  //�޸��ַ�������ָ��
        System.out.println(p.getName());  //�������ΪBob*/

//        Person p = new Person("lisi",12);
//        System.out.println(p.getName());
//        System.out.println(p.getAge());
//
//
//        Hello he = new Hello();
//        he.hello();
//        he.hello("zhangsan");
//        he.hello("lisi",3);

        //ʵ�־�̬�ֶ��뾲̬����
        Person ming = new Person("xiao ming",12);
        Person hong = new Person("xion hong",15);
        ming.number = 88;
        System.out.println(ming.number);
        hong.number = 99;
        System.out.println(ming.number);

        //ʹ����ֱ�ӵ��þ�̬����
        Person.setNumber(99);
        System.out.println(Person.number);


    }
}

class City{
    private String name;
    private double latitude;  //γ��
    private double longitude;   //����

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getLatitude(){
        return this.latitude;
    }
    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

    public double getLongitude(){
        return  this.longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


}

class Group{

    /*    public void setName(String... names){
            this.name = names;
        }*/
    public void setName(String[] names){
    }
}

class Person{
    protected int age;
    protected String name;
    public static int number;


    //��̬����
    public static void setNumber(int value){
        number = value;
    }

//    public String getName(){
//        return this.name[0] + " " + this.name[1];
//    }
//    public void setName(String[] name){
//        this.name = name;
//    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }


    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    //���췽��
   /* public Person(){

    }*/

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //�����еķ���
    public void run(){
        System.out.println("Person.run");
    }

}

class Hello{
    public void hello(){
        System.out.println("Hello,world!");
    }
    public void hello(String name){
        System.out.println("Hello, " + name + "!");
    }
    public void hello(String name,int age){
        if(age < 18){
            System.out.println("Hi, " + name + "!");
        }else{
            System.out.println("Hello, " + name + "!");
        }
    }
}