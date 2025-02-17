package Lab6;

import java.util.Scanner;
public class Shape {
    int find_area(int height, int Width){
        return height*Width;
    }
}

class Square extends Shape{
    
}
class Rectangle extends Shape{

}

class Shapemain{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Square's Arm: ");
        int SqArm = scanner.nextInt();
        System.out.print("Input Rectangle's height: ");
        int Height = scanner.nextInt();
        System.out.print("Input rectangle's Width: ");
        int Width = scanner.nextInt();
        
        Square Sqr = new Square();
        Rectangle rec = new Rectangle();

        int areaOfSqr = Sqr.find_area(SqArm, SqArm);
        int areaOfrec = rec.find_area(Height, Width);

        System.out.println("Area of Square = "+areaOfSqr+ " Area of Rectangle ="+ areaOfrec);
        scanner.close();
    }

}