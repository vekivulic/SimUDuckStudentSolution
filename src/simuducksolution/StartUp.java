/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuducksolution;

/**
 *
 * @author vekivulic
 */
public class StartUp {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FlyingDuck flyable= new FlyWithWings();
        QuackableDuck quakable= new Quack();
        
       
        Duck duck= new WoodenDuck(
        flyable, quakable);
        
  
        duck.performFly();
        duck.performQuack();
        
        
    }
    
}
