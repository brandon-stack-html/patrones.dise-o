// Producto abstracto A
interface Button {
    void paint();
}

// Producto abstracto B
interface Checkbox {
    void paint();
}

// Producto concreto A1
class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Render a button in a Windows style.");
    }
}

// Producto concreto A2
class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Render a button in a macOS style.");
    }
}

// Producto concreto B1
class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Render a checkbox in a Windows style.");
    }
}

// Producto concreto B2
class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Render a checkbox in a macOS style.");
    }
}

// Fábrica abstracta
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Fábrica concreta para Windows
class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

// Fábrica concreta para macOS
class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

// Clase Cliente que utiliza el patrón Abstract Factory
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        Application app = new Application(factory);
        app.paint();
    }
}
