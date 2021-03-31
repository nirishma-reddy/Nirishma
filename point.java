class point
{
double x;
double y;
point(double x,double y)
{
this.x=x;
this.y=y;
}
public static double distance(point p1,point p2)
{
double pdistance;
double xdiff=p2.x-p1.x;
double ydiff=p2.y-p1.y;
double SumOfSquares=Math.pow(xdiff,2)+Math.pow(ydiff,2);
pdistance=Math.sqrt(SumOfSquares);
return pdistance;
}
public static void main(String a[])
{
point p1=new point(10,20);
point p2=new point(5,10);
double distance=distance(p1,p2);
System.out.println(distance);
}
}