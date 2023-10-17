package InterfaceTest;

public class KeyBoard implements IUSB{
    @Override
    public void openDevice() {
        System.out.println("´ò¿ª¼üÅÌ");
    }

    @Override
    public void closeDevice() {
        System.out.println("¹Ø±Õ¼üÅÌ");
    }

    public void inPut(){
        System.out.println("ÇÃ»÷¼üÅÌ");
    }
}
