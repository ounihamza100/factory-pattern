/**
 * @author Hamza.Ouni
 */
public class ComplexShapeFactory extends ShapeFactory {
    public Shape getShape(int shapeId) {
        Shape shape = null;
        if(shapeId == Const.SHAPE_HEXAGON) {
            shape = new Hexagon();//complex shape
        }
        else{
            // drop an error
        };
        return shape;

    }
}
