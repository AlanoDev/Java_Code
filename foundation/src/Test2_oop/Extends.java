package Test2_oop;

public class Extends {
    public static void main(String[] args) {

        Person p = new Student("zhangsan",15,89);

        p.run();//��������ת�ͣ�����Student.run


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

    //���췽��
    public Student(String name,int age,int score){
       // super();//�ڵ���ʱ�������Զ����ø���Ĺ��췽������������û��Ĭ�ϵĹ��췽��ʱ�������ø��������Ӧ�Ĺ��췽��
        super(name,age);  //�����У�ֻ�д��εĹ��죬����贫������Ĳ���
        this.score = score;
    }

    @Override   //����븸���еķ����Ƿ񹹳���д
    public void run() {
        System.out.println("Student.run");  //��д�����еķ���
    }
}