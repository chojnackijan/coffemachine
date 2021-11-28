package LearnJavaBasic;

import LearnJavaBasic.Drive.Drive;
import LearnJavaBasic.Drive.HDDDrive;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Drive drive;
    private USBDevice usbDevice;
    private Headphones headphones;
    private Monitor monitor;

    List<USBDevice>usbDevices = new ArrayList<>();




    public USBDevice getUsbDevice() {
        return usbDevice;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Computer(Drive drive, USBDevice usbDevice, Headphones headphones, Monitor monitor) {
        this.drive = drive;
        this.usbDevice = usbDevice;
        this.headphones = headphones;
        this.monitor = monitor;

    }
}
