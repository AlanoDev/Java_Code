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


        Person p = new Person();
        String bob = "Bob";
        p.setName(bob);
        System.out.println(p.getName());  //���ֵBob
        bob = "Alice";  //�޸��ַ�������ָ��
        System.out.println(p.getName());  //�������ΪBob


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
    private String[] name;

/*    public void setName(String... names){
        this.name = names;
    }*/
    public void setName(String[] names){
        this.name = names;
    }
}

class Person{
    private int age;
    private String name;

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
}