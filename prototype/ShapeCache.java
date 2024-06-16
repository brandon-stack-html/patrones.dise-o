package prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, shape> shapeMap = new Hashtable<>();

    public static shape getShape(String shapeId) {
        shape cachedShape = shapeMap.get(shapeId);
        return (shape) cachedShape.clone();
    }

    // Para cada forma, se ejecuta este método para cargar los datos iniciales
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        rectangle Rectangle = new rectangle();
        Rectangle.setId("3");
        shapeMap.put(Rectangle.getId(), Rectangle);
    }
}