package InterfaceTest;

public class Mouse implements IUSB{
    @Override
    public void openDevice() {
        System.out.println("��������");
    }


    @Override
    public void closeDevice() {
        System.out.println("�ر�������");
    }

    public void click(){
        System.out.println("�����꣡");
    }

}
