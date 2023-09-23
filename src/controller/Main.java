/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


/**
 *
 * @author son
 */
public class Main{
    public static void main(String[] args) {
        String title="Menu";
        String mc[]={"Create","Find and Sort","Delete and update","report","Exit"};
        controller c= new controller(title, mc);
        c.run();
    }
}
