package geometry.figures;
public class Square extends Rectangle{
    double side;
    public Square(double a) {
        super(a, a);
        side=a;
    }

    public void sayMeow(){
        meow();
    }
}
