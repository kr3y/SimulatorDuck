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
public interface QuackBehavior {
    
    public void quack();
    
    public class Quack implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("Quack");
        }
    }
    
    public class MuteQuack implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("<<Silence>>");
        }
    }
    public class Squeak implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("Squeck");
    }
    }
   
}
