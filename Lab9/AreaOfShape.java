import java.util.Scanner;
interface Shape{
 Scanner s=new Scanner(System.in);
 void getArea();
}
class Retangle implements Shape{

public void getArea(){
System.out.print("Enter the Length of the Retangle : ");
int length = s.nextInt();
System.out.print("Enter the Breadth of the Retangle : ");
int breadth = s.nextInt();
System.out.println("The area of the rectange is :" + (length * breadth));
}}
class Circle implements Shape{
public void getArea(){
System.out.print("Enter the radius of the Circle: ");
int radius =s.nextInt();
double pi = 3.142,area;
area=pi*radius*radius;
System.out.println("The area of the Circle is: " + area);
}
}
class Triangle implements Shape{
public void getArea(){
System.out.print("Enter the Breadth of the Retangle : ");
int base = s.nextInt();
System.out.print("Enter the Height of the Retangle : " );
int height = s.nextInt();

System.out.println("The area of the Triangle is : " + (base*height )/2);
}
}
class AreaOfShape{
public static void main(String [] args){
 Shape s = new Retangle();
 s.getArea();
 Shape sh = new Circle();
 sh.getArea();
 Shape sha = new Triangle();
 sha.getArea();
}
}
