package com.patrones.u2;

/**
 * Hello world!
 *
 */






/* Punto 5 correccion para no pausar ejecucion 

public class App {
    public static void main(String[] args) {

        Notifier email = NotifierFactory.create("email");
        Notifier sms = NotifierFactory.create("sms");

        email.send("correo@gmail.com", "Hola desde factory");
        sms.send("3001234567", "Hola desde factory");

        // Manejo del error (forma correcta)
        try {
            Notifier error = NotifierFactory.create("whatsapp");
            error.send("Jahir", "Esto no debería enviarse");
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR CONTROLADO: " + e.getMessage());
        }

        NotificationLogger.INSTANCE.printAll();
    }
}




/* Punto 5 demostracion de que la facory valida tipos 
public class App {
    public static void main(String[] args) {

        Notifier email = NotifierFactory.create("email");
        Notifier sms = NotifierFactory.create("sms");

        email.send("correo@gmail.com", "Hola desde factory");
        sms.send("3001234567", "Hola desde factory");

        // Esto debe lanzar error (Checkpoint 2)
        Notifier error = NotifierFactory.create("whatsapp");

        NotificationLogger.INSTANCE.printAll();
    }
}





/*
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
*/



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