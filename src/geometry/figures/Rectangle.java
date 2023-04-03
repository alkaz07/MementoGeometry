//import geometry.figures.PlainFigure;
package geometry.figures;

public class Rectangle extends PlainFigure {
    double width, height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    private void meow(){
        System.out.println("ìÿó-ìÿó");
    }
}
