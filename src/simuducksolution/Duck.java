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
public interface Duck {
public abstract void performFly();

public abstract void performQuack();

public abstract void performDisplay();

 public void setFlyable(FlyingDuck flyable) ;
    

    public QuackableDuck getQuakable();

    public void setQuakable(QuackableDuck quakable);

    
    }

