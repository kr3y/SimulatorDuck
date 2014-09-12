/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulatorduck;

import simulatorduck.FlyBehavior.FlyWithWing;
import simulatorduck.QuackBehavior.Quack;

/**
 *
 * @author Administrator
 */
public class MallardDuck extends Duck{
    private final String name;
    

        
    
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWing();
        this.name=("MallardDuck");
    }

    @Override
    public void display() {
        
        System.out.println(this.name + "I'm a real Mallard duck");
    }
    
    
}
