package shapes;

import org.w3c.dom.css.Rect;

public class Square extends Quadrilateral {
    public Square(double side){
        super(side,side);
    }


    public double getArea(){
        System.out.println("Square implementation of area");
        return length * length;
    }

    public double getPerimeter(){
        System.out.println("Square implementation of perimeter");
        return 4 * length;
    }

    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }
}
