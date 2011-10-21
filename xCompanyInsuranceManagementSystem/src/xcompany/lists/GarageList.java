/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xcompany.lists;

import java.io.Serializable;
import java.util.ArrayList;
import xcompany.structures.Garage;

/**
 *
 * @author Alp Sayin
 */
public class GarageList implements Serializable
{
    private ArrayList<Garage> garageList;
    public GarageList()
    {
        garageList = new ArrayList<Garage>();
    }
    public ArrayList<Garage> getGarageList()
    {
        return garageList;
    }
}
