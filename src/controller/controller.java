/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import menu.Menu;

/**
 *
 * @author son
 */
public class controller extends Menu{
    public StudentManagement s= new StudentManagement();
    public ArrayList arr = new ArrayList();
    public controller(String title,String mc[]){
        super(title, mc);
    }
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                s.create();
                break;
            case 2: 
                s.sort();
                break;
            case 3: 
                s.delete();
//                s.display();
                break;
            case 4:
                s.report();
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
