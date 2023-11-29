class OuterClass 
{
  int x = 25;

  class InnerClass 
{
    int y = 8;
  }
}

public class Main
 {
  public static void main(String[] args)
 {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}