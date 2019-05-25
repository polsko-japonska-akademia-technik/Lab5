/*
Autorzy: Aleksander Mojzych, Adrian Matyszczak 25.05.2019
 */


public class MyRectangle {

    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2){
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public String toString() {
        return "Rectangle @ " + topLeft + ", " + bottomRight;
    }

    public double getCircumference(){
        return 2*topLeft.distance()+2*bottomRight.distance();
    }

    public double getArea(){
        return topLeft.distance()*bottomRight.distance();
    }
}
