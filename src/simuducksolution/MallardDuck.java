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
public class MallardDuck implements Duck {
    private FlyingDuck flyable;
    private QuackableDuck quakable;
   

    public MallardDuck(FlyingDuck flyable, QuackableDuck quakable ) {
        this.flyable = flyable;
        this.quakable = quakable;
        
    }
    
    

    @Override
    public void performFly() {
        flyable.getToFly();
    }

    @Override
    public void performQuack() {
        quakable.getToQuack();
    }

    

    public FlyingDuck getFlyable() {
        return flyable;
    }

    public void setFlyable(FlyingDuck flyable) {
        if (flyable== null) {
            throw new IllegalArgumentException("Object can't be null");
        }
        this.flyable = flyable;
    }

    public QuackableDuck getQuakable() {
        return quakable;
    }

    public void setQuakable(QuackableDuck quakable) {
        if (quakable== null) {
            throw new IllegalArgumentException("Object can't be null");
        }
        this.quakable = quakable;
    }

    @Override
    public void performDisplay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
}
