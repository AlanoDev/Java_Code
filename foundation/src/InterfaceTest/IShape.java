package InterfaceTest;

public interface IShape {
    //�ӿڵ�һЩ�������
//    //��ɫ��б����ʾ����ʾĬ��Ϊpublic static final���ֶ�
//    public static final String name = "a";
//    //�����������ͬ
//    String name1 = "a";
//
//    //�����ֹ��췽��������
///*    public IShape(){
//
//    }*/

    //Ĭ��Ϊ���󷽷���ʵ�ֽӿ� ������д
    void draw();

    //java8�������default
    default public void fun(){
        System.out.println("Ĭ�ϵģ�ʵ�ֽӿ�ʱ���ɲ���д");
    }

}

class Rect implements IShape{

    @Override
    public void draw() {
        System.out.println("�����Σ�");
    }
}

class Flower implements IShape{
    @Override
    public void draw() {
        System.out.println("��?��");
    }
}
