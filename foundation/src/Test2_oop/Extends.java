package Test2_oop;

public class Extends {
    public static void main(String[] args) {

        Person p = new Student("zhangsan",15,89);

        p.run();//发生向下转型，返回Student.run


        /*Student s = (Student) new Person("lisi",19);
        s.getScore();*/

//        if(p instanceof Student){
//            Student s = (Student) p;
//        }




    }
}

class Student extends Person{
    protected int score;

    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }

    //构造方法
    public Student(String name,int age,int score){
       // super();//在调用时编译器自动调用父类的构造方法，当父类中没有默认的构造方法时，需设置父类带参相应的构造方法
        super(name,age);  //父类中，只有带参的构造，因此需传入所需的参数
        this.score = score;
    }

    @Override   //检查与父类中的方法是否构成重写
    public void run() {
        System.out.println("Student.run");  //重写父类中的方法
    }
}