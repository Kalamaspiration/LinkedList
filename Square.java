/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author GK
 */
public  class Square extends Shape {
    
    Square(double side)
    {
        
        this.value = side;
        
        
    }
    
    @Override
    
    double calculatearea()
    {
        return value*value;
    }
    
}
