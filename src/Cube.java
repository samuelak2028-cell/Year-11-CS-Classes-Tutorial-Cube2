public class Cube {
    private int Side;
    private void less1 (int side){
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        } else {
            Side = side;
        }
    }
    public Cube() {
        Side = 1;
    }
    public Cube(int n) {
        less1(n);
    }
    public int getSide() {
        return Side;
    }
    public void setSide(int n) {
        less1(n);
    }
    public int calculateSurfaceArea() {
        return Side*Side*6;
    }
    public int calculateVolume() {
        return Side*Side*Side;
    }
    public String toString() {
        return "Cube{side=" + Side + "}";
    }
}