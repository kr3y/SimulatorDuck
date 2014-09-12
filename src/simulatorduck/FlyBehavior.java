/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulatorduck;

/**
 *
 * @author Administrator
 */
public interface FlyBehavior {
    
    public void fly();
 
    public class FlyWithWing implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("I'm Flying");
     }
    }
    public class FlyNoWay implements FlyBehavior{
       @Override
       public void fly(){
                System.out.println("I can't fly");
        }
    }
}
