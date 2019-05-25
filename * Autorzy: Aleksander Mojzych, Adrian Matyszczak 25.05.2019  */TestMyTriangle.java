/*
Autorzy: Aleksander Mojzych, Adrian Matyszczak 25.05.2019
 */

public class TestMyTriangle {

        public static void main(String[] args)
        {
            MyTriangle t1 = new MyTriangle(1,1,  3,5,  6,2);
            MyTriangle t2 = new MyTriangle(new MyPoint(1,2), new MyPoint(5,5), new MyPoint(6,3));

            System.out.println("Triangle "+ t1 +" is "+ t1.getType() +" and has perimeter "+t1.getPerimeter());
            System.out.println("Triangle "+ t2 +" is "+ t2.getType() +" and has perimeter "+t2.getPerimeter());
        }
    }
