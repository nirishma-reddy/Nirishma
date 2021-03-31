class shape
{
void area(int s)
{
System.out.println("Area of square:"+(s*s));
}
void area(float r)
{
System.out.println("Area of circle:"+(3.14f*r*r));
}
void area(int l,int b)
{
System.out.println("Area of rectangle:"+(l*b));
}
}
class overloading
{
public static void main(String a[])
{
shape s=new shape();
s.area(10);
s.area(10.0f);
s.area(10,20);
}
}