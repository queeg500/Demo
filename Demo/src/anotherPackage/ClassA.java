package anotherPackage;

public class ClassA
{
   private final int i;
   
   public ClassA( int i )
   {
      this.i = i;
   }
   
   @Override
   public String toString()
   {
      return Integer.toString( i );
   }
}
