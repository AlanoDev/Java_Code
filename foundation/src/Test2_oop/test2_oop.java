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
//        //此处修改了变量的值，但变量修改前传递的值已与参数位置进行了绑定，因此不影响对象的值
//        n = 20;
//        System.out.println(p.getAge());

//        Person p = new Person();
//        String[] fullname = new String[]{"Homer","Simpson"};
//        p.setName(fullname);
//        System.out.println(p.getName()); //输出为Homer Simpson
//        fullname[0] = "Bart";   //修改引用指向地址的值
//        System.out.println(p.getName());  //输出为Bart Simpson


        Person p = new Person();
        String bob = "Bob";
        p.setName(bob);
        System.out.println(p.getName());  //输出值Bob
        bob = "Alice";  //修改字符串类型指向
        System.out.println(p.getName());  //输出依旧为Bob


    }
}

class City{
    private String name;
    private double latitude;  //纬度
    private double longitude;   //经度

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