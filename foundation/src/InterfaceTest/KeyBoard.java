package InterfaceTest;

public class KeyBoard implements IUSB{
    @Override
    public void openDevice() {
        System.out.println("�򿪼���");
    }

    @Override
    public void closeDevice() {
        System.out.println("�رռ���");
    }

    public void inPut(){
        System.out.println("�û�����");
    }
}
