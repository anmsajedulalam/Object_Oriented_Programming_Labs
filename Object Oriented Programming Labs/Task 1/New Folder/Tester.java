public class Tester
{
  public static void main(String[]args)
  {
    int a[]={10,20,6};
    System.out.println(firstLast6(a));
  }
  public static boolean firstLast6(int[]n)
  {
    if(n[0]==6||n[n.length-1]==6)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}