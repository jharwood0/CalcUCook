package calcucook;


import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josh
 */
public class FoodTimeComparator implements Comparator<Food>
{
    @Override
    public int compare(Food p1, Food p2)
    {
        return p2.getTime() - p1.getTime();
    }
}
