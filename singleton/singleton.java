package singleton;

public class singleton {
    // Paso 1: Crear una instancia estática privada de la clase.
    private static singleton uniqueInstance;

    // Paso 2: Hacer el constructor privado para que no se pueda instanciar la clase desde fuera.
    private singleton() {
        // Código de inicialización.
    }

    // Paso 3: Proporcionar un método estático público que devuelva la única instancia de la clase.
    public static singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new singleton();
        }
        return uniqueInstance;
    }

    // Otros métodos de la clase.
    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }
}


