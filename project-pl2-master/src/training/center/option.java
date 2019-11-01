/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.center;

/**
 *
 * @author Andrew
 */
public interface option {
    public void loadFromFile();
    public boolean commitToFile();
    public boolean Add() ;
    public  boolean Update();
    public boolean Delete(int id);
    // private int getIndex(int id);
    // public ArrayList<Object> List() ;
    // public Objecct Search (int id) ; 
    // public boolean login(String userName, String Pass);
     
}
