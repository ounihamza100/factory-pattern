/**
 * @author Hamza.Ouni
 */
public class SimpleShapeFactory extends ShapeFactory {
    public Shape getShape(int shapeId) {
        if(shapeId == 2)
            return new Square();
        if(shapeId == 1 ) {
            return new Circle();
        }
        return null;

    }
}
