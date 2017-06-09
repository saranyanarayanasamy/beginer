import java.io.*;
import java.util.*;
public class large
{
public static void main(String arg[])
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b[]=new Int[a];
for(int k=0;k<a;k++)
{
b[k]=sacn.nextInt();
}
int max=b[0];
for(int i=0;i<a;i++)
{
  if(max<b[i])
  {
    max=b[i];
  }
}
System.out.println("the number is "+max);
}
}

