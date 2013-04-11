package demo;

public class Class2
{
   private final String s;
   
   public Class2()
   {
      this( "" );
   }
   
   public Class2( String s )
   {
      this.s = s;
   }
   
   @Override
   public String toString()
   {
      return s;
   }
}
