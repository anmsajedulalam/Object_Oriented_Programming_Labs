public class Test{
  public static int [] removeOdd (int [] input){
  int x=0;
  for(int i=0;i<input.length;i++)
  {
    if(input[i]%2==0)
    {
      x++;
    }
  }
  int compact[]=new int [x];
//  for(int j=0,int d=0;d<compact.length,j<input.length;j++, )//why this line doesnt work
 int e=0;
  for(int j=0;j<input.length;j++)
  {
    if(input[j]%2==0)
    {
      compact[e]=input[j];
      e++;
    }
    }
  
  return compact;
  }
  public static void main(String [] args){
    int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
    for (int i = 0; i < mixedArray.length; i++) {
      System.out.print(mixedArray[i] + " ");
    }
    System.out.println();
    int [] noOdd = removeOdd(mixedArray);
    for (int i = 0; i < noOdd.length; i++) {
      System.out.print(noOdd[i] + " ");
    }    
  }
}