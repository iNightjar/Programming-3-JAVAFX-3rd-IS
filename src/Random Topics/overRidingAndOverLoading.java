/**  // example on overriding
import java.lang.String;
public class overRidingAndOverLoading {
    public static void main(String[] args) {
        two example = new two();
        example.func(10);
        example.func(10.1);
    }
}
    class one{
        public void func(double var){
            System.out.println(var);
        }
    }
    class two extends one{
        // this method overrides the method func in class one
        public void func(double var){
            System.out.println(var * 2);
        }
    }

**/
/**  // example on overloading
public class overRidingAndOverLoading{
    public static void main(String[] args) {
        two exampleTwo = new two();
        exampleTwo.func(10.1);
        exampleTwo.func(10);
    }
}
class one{
    public void func(double number)
    {
        System.out.println(number * 2 );
    }
}
class two extends one{
 public void func(int  number)
    {
        // this method overlaods the method func in class one
        System.out.println(number * 2 );
    }
}
**/