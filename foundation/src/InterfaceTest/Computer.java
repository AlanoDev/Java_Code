package InterfaceTest;

public class Computer {
    public void open(){
        System.out.println("开机");
    }
    public void close(){
        System.out.println("关机");
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
