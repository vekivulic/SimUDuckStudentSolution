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
public class NotFlyingDuck implements FlyingDuck{

    @Override
    public final void getToFly() {
        System.out.println("I cant fly");
    }
    
}
