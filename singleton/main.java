package singleton;

// Ejemplo de uso
public class main {
    public static void main(String[] args) {
        // Obtener la única instancia del Singleton
        singleton Singleton = singleton.getInstance();
        
        // Llamar al método de la clase Singleton
        Singleton.showMessage();
    }
}

