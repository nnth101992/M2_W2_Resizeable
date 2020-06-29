public class Circle extends Shape implements Resizeable{
    private  double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.round((radius*radius*Math.PI)*1000)/1000;
    }

    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + getRadius() + ", area=" + getArea() + ", which is a subclass of " + super.toString();
    }


    @Override
    public void resize(double percent) {
        this.radius = this.radius * (percent / 100 + 1);
    }
}
