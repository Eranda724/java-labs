abstract class Shape{
int length, width, radius;
double pi;

Shape(int length, int width){
this.length = length;
this.width = width;
}
Shape(int length){
this.length = length;
this.width = width;
}
Shape(int radius){
this.radius = radius;
pi = Math.PI;
}
public int findPerimeter(){
return 2*(length+width);
}
public double findPerimeter(){
return 2*(pi*radius);
}
public int findArea(){
return length+width;
}
public int findArea(){
return 2*(pi*radius*radius);
}}

class ShapeApp{
public static void main(String args[]){
Shape RECT = new Shape(6,8);
System.out.println("The perimeter of rectangle is : "+RECT.findPerimeter());
System.out.println("The area of rectangle is : "+RECT.findArea());

Shape SQUARE = new Shape(6);
System.out.println("The perimeter of square is : "+SQUARE.findPerimeter());
System.out.println("The area of square is : "+SQUARE.findArea());

Shape CIRCLE = new Shape(5);
System.out.println("The perimeter of circle is : "+CIRCLE.findPerimeter());
System.out.println("The area of circle is : "+CIRCLE.findArea());

}}