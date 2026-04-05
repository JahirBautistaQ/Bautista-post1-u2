# Bautista-post1-u2
Actividad Post-Contenido 1 / Unidad 2

# Proyecto: Patrones de Diseño - Singleton y Factory Method

## Descripción
Este proyecto implementa dos patrones de diseño creacionales:
- Singleton (usando enum)
- Factory Method (con registro dinámico)

## Patrones implementados

### Singleton
Se implementó usando enum en `NotificationLogger`, garantizando:
- Una sola instancia
- Thread-safe por diseño de la JVM

### Factory Method
Se implementó en `NotifierFactory` usando:
- Map<String, Supplier<Notifier>>
- Registro dinámico (OCP)

## Ejecución

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.patrones.u2.Main"
Si no funciona ejecutando "mvn exec:java -Dexec.mainClass="com.patrones.u2.Main"" por favor hacerlo directamente del icono RUN
Imagen adjunta de evidencia ![alt text](image-1.png)