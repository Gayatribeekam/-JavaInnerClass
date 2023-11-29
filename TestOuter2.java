class TestOuter2
{
static int data=1983075;
static class inner
{
void msg(){System.out.println("data is"+data);}
}
public static void main(String[]args)
{
TestOuter2.inner.msg();
}
}