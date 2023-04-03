package geometry.figures;

import geometry.Point;

public class Circle extends PlainFigure {
   double radius;
   Point center;
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public Circle(Point c ,double r) {
        this.radius = r;
        this.center = c;
    }
    //++++
    public Circle(double x, double y, double r)
    {
        center= new Point(x,y);
        radius= r;
    }

    public boolean intersectWith (Circle other)
    {
        double dist=this.center.getDistanceTo(other.center); //todo
        if (dist > this.radius + other.radius)
            return false;
        else {
            double maxRad, minRad;
            if(this.radius > other.radius)
            {
                maxRad = this.radius;
                minRad = other.radius;
            }
            else{
                maxRad = other.radius;
                minRad = this.radius;
            }
            if (dist+minRad < maxRad)
                return false;
            else
                return true;
        }
    }

}


