import java.util.Scanner;
class calculatorusingswitch
{
public static void main(String[]args)
{

int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter first n0:");
a=sc.nextInt();
System.out.println("enter second no:");
b=sc.nextInt();
System.out.println("press 1 for->add"+'\n'+" press 2 for->sub"+'\n'+ "press 3 for->multi"+'\n'+" press 4 for-> divide");
c= sc.nextInt();
switch(c)
{
case 1:
System.out.println("addition is:"+(a+b));
break;
case 2:
System.out.println("subtraction is:"+(a-b));
break;
case 3:
System.out.println("Multiplication is:"+(a*b));
break;
case 4:
System.out.println("Divide is:"+(a/2));
break;
default:
System.out.println("invalid input");
}
}
}