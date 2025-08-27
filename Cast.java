class A
{
 void show()
 {
    System.out.println("my name is rama");
 }
}
class B extends A
{
  @Override
  void show()
  {
    System.out.println("she is someone special to me(upcasting)");
  }
  void hello()
  {
    System.out.println("rama loves her(downcasting)");
  }
}
public class Cast {
   public static void main(String[] args)
   {
     A obj = new B();
     obj.show();
    // obj.hello(); // we can't access hello method using obj reference because it is of class A type
    if(obj instanceof B) // to avoid class cast exception we use instanceof
    {
        B obj1 = (B)obj;
        obj1.hello();
    }
    else
    {
        System.out.println("obj is not an instance of B");
    }
   } 
}
