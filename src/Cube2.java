public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }

    public Cube2(int side, String color) {
        this(side);
        this.color = color;
    }

    public int getSide() {
        return basicCube.getSide();
    }
    public void setSide(int n) { basicCube.setSide(n); }
    public String getColor() { return this.color; }
    public void setColor (String Color) { this.color = Color; }

    //the following methods have been started for you, but need to be completed
    public int calculateVolume() { return basicCube.calculateVolume();}
    public int calculateSurfaceArea() { return basicCube.calculateSurfaceArea();}
    public Cube2 add(Cube2 otherCube) {
        int a = otherCube.getSide(), b = basicCube.getSide();
        double c = Math.sqrt(a*a + b*b);
        if (c % 1 == 0) {
            return new Cube2((int) c,getColor());
        } else {
            throw new IllegalArgumentException();
        }
    }
    public Cube2 minus(Cube2 otherCube) {
        int a = basicCube.getSide(), b = otherCube.getSide();
        double c = Math.sqrt(a*a - b*b);
        double d = Math.sqrt(b*b - a*a);
        if (c % 1 ==0 && a>=b) {
            return new Cube2((int) c, getColor());
        } else if (b>a) {
            return new Cube2((int) d, getColor());
        } else {
            throw new IllegalArgumentException();
        }
    }
    public boolean equals(Cube2 otherCube) {
        if (otherCube.getSide()==this.getSide() && otherCube.getColor().equals(this.getColor())) {
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        return basicCube.toString().substring(0,basicCube.toString().length()-1) + ", color=\"" + this.getColor() + "\"}";
    }
}
