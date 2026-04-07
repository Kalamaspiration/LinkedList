/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shape;

import java.util.Scanner;

/**
 *
 * @author GK
 */
public abstract class Shape {
    
    double value;
    
    abstract double calculatearea();
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        boolean start = true;
        
        do
            
        {
            
        

            System.out.println("Shape Area Calculator ");

            System.out.println("1.Circle");

            System.out.println("2.Square");

            System.out.println("3.Exit");

            int choice = sc.nextInt();

            System.out.println("Enter the choice");
        
            switch(choice)
            {

                case 1 ->                 {

                    System.out.println("Enter the Circle Radius :");
                    
                    double radius = sc.nextDouble();

                    Circle c = new Circle(radius);

                    System.out.println("Circle Area "  + c.calculatearea());

                }


                case 2 ->                 {

                    System.out.println("Enter the Square Side");
                    
                    double side = sc.nextDouble();

                    Square s = new Square(side);

                    System.out.println("Square Area" + s.calculatearea());

                }


                case 3 ->                 {
                 
                    start=false;

                    System.out.println("EXITING ..");

                }


                default ->                 {

                    System.out.println("INVALID CHOICE TRY AGAIN");

                }
                
            }
            
            
                
         }while(start);
        
    }
    
}
        
      
