package InterfaceTest;

public class Computer {
    public void open(){
        System.out.println("����");
    }
    public void close(){
        System.out.println("�ػ�");
    }

    public void useDevice(IUSB usb){
        usb.openDevice();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }else if(usb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.inPut();
        }
        usb.closeDevice();
    }



}
