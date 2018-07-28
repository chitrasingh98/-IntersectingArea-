package IntersectingArea;

public class Rectangle {
  private float  bottom;
  private float top;
  private float right;
  private float left;
  Rectangle(float x1,float y1,float x2,float y2){
     if(y1<=y2) { bottom=y1;top=y2;}
     else {bottom=y2;top=y1;}
     if(x1<=x2) {left=x1;right=x2;}
     else {left=x2;right=x1;}
      System.out.print("Area enclosed is "+this.area());

  }
     public float getBottom() {
        return bottom;
    }
    public float getLeft() {
        return left;
    }
    public float getRight() {
        return right;
    }
    public float getTop() {
        return top;
    }
    public void setBottom(float bottom) {
        this.bottom = bottom;
    }
    public void setLeft(float left) {
        this.left = left;
    }
    public void setTop(float top) {
        this.top = top;
    }
    public void setRight(float right) {
        this.right = right;
    }
    public float min(float a,float b){if(a<b)return a;
  else return b;}
  public float max(float a,float b){if(a>b)return a;
  else return b;}
  public float area(){

      float area=(this.getTop()-this.getBottom())*(this.getRight()-this.getLeft());
      return area;
  }
}
