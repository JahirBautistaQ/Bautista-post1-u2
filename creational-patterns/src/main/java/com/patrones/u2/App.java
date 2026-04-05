package com.patrones.u2;

/**
 * Hello world!
 *
 */




public class App {
    public static void main(String[] args) {

        Notifier email = new EmailNotifier();
        Notifier sms = new SmsNotifier();
        Notifier push = new PushNotifier();

        email.send("correo@gmail.com", "Hola Email");
        sms.send("3001234567", "Hola SMS");
        push.send("user123", "Hola Push");

        NotificationLogger.INSTANCE.printAll();
    }
}

/*
Prueba 2

public class App {
    public static void main(String[] args) {
        NotificationLogger.INSTANCE.log("EMAIL", "Jahir", "Hola mundo");
        NotificationLogger.INSTANCE.log("SMS", "Cliente", "Tu pedido fue enviado");

        NotificationLogger.INSTANCE.printAll();
    }
}
*/

/*public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
*/