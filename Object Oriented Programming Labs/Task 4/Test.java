import java.util.*;
public class Test
{
  public static void main(String[]args)
  {
    Scanner k=new Scanner(System.in);
    int [] a=new int[5];
    System.out.println("Enter a unique number");
    int y=k.nextInt();
    a[0]=y;
    for(int c=1;c<a.length;c++)
    {
      System.out.println("Enter a unique number");
      int x=k.nextInt();

      for(int d=0;d<c;d++)
      {
        if(a[d]==x)
        {
          System.out.println(x+" is already in among the entered numbers, enter a new unique number");
          d=c+1; //to go outside of this loop, i use this 
          c--; // to maintain number of inputs 
        }
        else if(d==c-1&&a[d]!=x)
        {
          a[c]=x;
        }
      }
    }
    for(int e=0;e<a.length;e++)
    {
      System.out.print(a[e]+" ");
    }
    System.out.println();
  }
}