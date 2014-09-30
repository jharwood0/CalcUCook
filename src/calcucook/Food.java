/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcucook;

/**
 *
 * @author josh
 */
public class Food {
    private int cookingtime;
    private int id;
    private int delay;
    private String name;
    public Food(){
    
    }
    public void setTime(int cookingtime){
        this.cookingtime = cookingtime;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDelay(int delay){
        this.delay = delay;
    }
    public String getName(){
        return this.name;
    }
    public int getTime(){
        return this.cookingtime;
    }
    public int getId(){
        return this.id;
    }
    public int getDelay(){
        return this.delay;
    }
    @Override
    public String toString() {
        return ("FoodName:"+this.getName()+
                    " Cooking Time: "+ this.getTime()) +
                    " ID: "+ this.getId();
   }
}
