import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Geometry circle = new Circle(7f);
        Geometry square = new Square(10f);

        

        ArrayList<Geometry> geometries = new ArrayList<>();
        geometries.add(circle);
        geometries.add(square);
        geometries.add(new Circle(5f));
        geometries.add(new Square(3f));

        for (Geometry g : geometries) {
            g.showArea();
        }

        Square s = new Square(4f);
        s.draw();

        ArrayList<IDrawable> drawables = new ArrayList<>();
        drawables.add(new Triangle());
        drawables.add(new Square(5f));
        drawables.add(new Kucing());

        Kucing k1 = new Kucing();
        Kucing k2 = new Kucing();
        Stone stone = new Stone();

        //k1.eat(stone);
        stone.eat(k1);
        k1.eat(k2);
    }
}
