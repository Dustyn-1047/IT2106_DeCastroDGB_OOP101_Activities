import java.util.Scanner;

public class AreaOfRectangle { 
    public static void main(String[] args) {
        double length = 0; 
        double width = 0; 
        double area = length * width; 
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();

        area = length * width;

        System.out.println("The area of the rectangle is: " + area);
        scanner.close();
    }
    
    
}
