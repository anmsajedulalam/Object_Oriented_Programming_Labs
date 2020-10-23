import java.util.*;
public class Tester
{
  public static void main(String[]args)
  {
    Scanner k=new Scanner(System.in);
    int d=k.nextInt();
    int e=k.nextInt();
    Test t=new Test();
    System.out.println(t.season(d,e));
  }
}