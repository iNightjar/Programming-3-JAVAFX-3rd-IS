/** 
import java.util.*;
import java.util.Set;
public class rectangle{
    private double length;
    private double width;
    public rectangle(double lengthValue,double widthValue)
    {
        this.length = lengthValue;
        this.width = widthValue;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length value: ");
        double lengthValue = input.nextDouble();
        System.out.println("Enter width value: ");
        double widthValue = input.nextDouble();
        rectangle exampleOfRectangle = new rectangle(lengthValue, widthValue);
        System.out.println("the area of the rectangle is: " 
        + exampleOfRectangle.getLength() * exampleOfRectangle.getWidth());
    }
}

*/