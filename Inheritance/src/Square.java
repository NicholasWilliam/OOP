
public class Square extends Geometry implements IDrawable {
    public  float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public void showArea() {
        
    }

    @Override
    public void draw() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
