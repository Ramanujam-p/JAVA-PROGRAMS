package pack1;
public class Access
{
  public int a = 1;
  private int b = 2;
  protected int c = 3;
  int d = 4;
  public void test()
  {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}