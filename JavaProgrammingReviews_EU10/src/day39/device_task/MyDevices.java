package day39.device_task;

import java.rmi.server.UnicastRemoteObject;

public class MyDevices {
    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("iPhone", "7S", 1000, true, true);
        Samsung samsung1 = new Samsung("Samsung", "S8", 750, true, true);
        Desktop desktop1 = new Desktop("Casper", "Excalibur", 1500, true, true);

        iphone1.turnOn();
        iphone1.call(5076387399L);

    }
}
