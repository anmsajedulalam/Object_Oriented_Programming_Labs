import java.util.*;
public class Test
{
  public static void main(String[]args)
  {
    int a[]=new int[10];
    Scanner k=new Scanner(System.in);
    for(int c=0;c<10;c++)
    {
      a[c]=k.nextInt();
    }
    display(a,10);
    square(a,10);
    display(a,10);
  }
  public static void display(int x[], int y)
  {
    for(int i=0;i<x.length;i++)
    {
      System.out.print(x[i]+" ");
    }
    System.out.println();
  }
  public static int [] square(int x[],int y)
  {
    for(int j=0;j<x.length;j++)
    {
      x[j]=x[j]*x[j];
    }
    return x;
  }
}