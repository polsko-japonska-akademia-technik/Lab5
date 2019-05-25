/*
Autorzy: Aleksander Mojzych, Adrian Matyszczak 25.05.2019
 */

public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle(){

    }

    public MyCircle(int x, int y, int radius){
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX(){
        return this.center.getX();
    }

    public void setCenterX(int x){
        this.center.setX(x);
    }

    public int getCenterY(){
        return this.center.getY();
    }

    public void setCenterY(int y){
        this.center.setY(y);
    }

    public int[] getCenterXY(){
        int[] results = new int[2];
        results [0] = this.center.getX();
        results [1] = this.center.getY();
        return  results;
    }

    public void setCenterXY(int x, int y){
        this.center.setXY(x, y);
    }

    public String toString(){
        return "MyCircle = " + this.center + " r =" + this.radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return Math.PI * 2 * radius;
    }

    public double distance(MyCircle another){
        return center.distance(another.center);
    }
}
