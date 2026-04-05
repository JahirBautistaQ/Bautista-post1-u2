package com.patrones.u2;

/**
 * Hello world!
 *
 */




public class App {
    public static void main(String[] args) {
        NotificationLogger.INSTANCE.log("EMAIL", "Jahir", "Hola mundo");
        NotificationLogger.INSTANCE.log("SMS", "Cliente", "Tu pedido fue enviado");

        NotificationLogger.INSTANCE.printAll();
    }
}

/*public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
*/