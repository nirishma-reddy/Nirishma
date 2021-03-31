import java.until.Scanner;
class Armstrongnumber
{
public static void main(String [] args);
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the n value:");
int n = sc.nextInt();
int temp = n;
int r,sum =0;
while(n!=0)
{
r = n%10;
sum = sum * 10+r*r*r;
n=n/10;
}
if(temp == sum)
{
System.out.print("The given number is Armstrong number:");
}
else
{
System.out.println("The given number is Armstrong number is:");
}
}

