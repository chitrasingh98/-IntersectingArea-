package IntersectingArea;

import static java.lang.Math.abs;

public class control {
    public static void main(String args[]){
        Rectangle rectangle1=new Rectangle(-3.5f, 4, 1, 1);
        Rectangle rectangle2=new Rectangle(1, 3.5f ,-2.5f, -1);
        if((rectangle1.getTop()==rectangle2.getTop())&&(rectangle1.getBottom()==rectangle2.getBottom())&&
                (rectangle1.getRight()==rectangle2.getRight())&&(rectangle1.getLeft()==rectangle2.getLeft())){
            System.out.println("Area enclosed is "+rectangle1.area());

        }
else if (((rectangle1.getRight()<rectangle2.getRight() && rectangle1.getRight()>rectangle2.getLeft())||
        (rectangle1.getLeft()<rectangle2.getRight() && rectangle1.getLeft()>rectangle2.getLeft()))&&
        ((rectangle1.getBottom()<rectangle2.getTop() && rectangle1.getBottom()>rectangle2.getBottom())||
                (rectangle2.getTop()<rectangle1.getTop() && rectangle2.getTop()>rectangle1.getBottom()))||
        (((rectangle2.getRight()<rectangle1.getRight() && rectangle2.getRight()>rectangle1.getLeft())||
                (rectangle2.getLeft()<rectangle1.getRight() && rectangle2.getLeft()>rectangle1.getLeft()))&&
                ((rectangle2.getBottom()<rectangle1.getTop() && rectangle2.getBottom()>rectangle1.getBottom())||
                        (rectangle2.getTop()<rectangle1.getTop() && rectangle2.getTop()>rectangle1.getBottom())))){
    Rectangle rectangle3=new Rectangle(0,0,0,0);
    rectangle3.setTop(rectangle3.min(rectangle1.getTop(),rectangle2.getTop()));
    rectangle3.setBottom(rectangle3.max(rectangle1.getBottom(),rectangle2.getBottom()));
    rectangle3.setLeft(rectangle3.max(rectangle1.getLeft(),rectangle2.getLeft()));
    rectangle3.setRight(rectangle3.min(rectangle1.getRight(),rectangle2.getRight()));



            float area=rectangle3.area();
System.out.print("Area enclosed is "+area);

}
else System.out.print("Area enclosed is 0");

        }
    }

