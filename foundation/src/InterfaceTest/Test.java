package InterfaceTest;

import javax.naming.ldap.LdapReferralException;

public class Test {
    public static void main(String[] args) {
        /*IShape shape = new Rect(); //发生向上转型
        IShape shape1 = new Flower();

        drawMap(shape);
        drawMap(shape1);*/


        Computer computer = new Computer();
        Mouse mouse = new Mouse();
        KeyBoard keyBoard = new KeyBoard();
        computer.useDevice(mouse);
        System.out.println("=======");
        computer.useDevice(keyBoard);


    }

    public static void drawMap(IShape shape){
        shape.draw();
    }

}
