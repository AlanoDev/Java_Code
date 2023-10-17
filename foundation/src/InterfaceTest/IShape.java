package InterfaceTest;

public interface IShape {
    //接口的一些相关特性
//    //灰色并斜体显示，表示默认为public static final的字段
//    public static final String name = "a";
//    //与上面语句相同
//    String name1 = "a";
//
//    //不能又构造方法，报错
///*    public IShape(){
//
//    }*/

    //默认为抽象方法，实现接口 必须重写
    void draw();

    //java8后的特性default
    default public void fun(){
        System.out.println("默认的，实现接口时，可不重写");
    }

}

class Rect implements IShape{

    @Override
    public void draw() {
        System.out.println("画矩形！");
    }
}

class Flower implements IShape{
    @Override
    public void draw() {
        System.out.println("画?！");
    }
}
