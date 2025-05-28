public abstract class Geometry {
    public float area;
    public float circumference;

    public void recalculate() {
        System.out.println("recalc from geometry");
    }

    public abstract void showArea();
}
