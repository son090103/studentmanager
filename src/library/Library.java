/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.util.Scanner;

/**
 *
 * @author son
 */
public class Library {
    public int getInt(String mess){
        System.out.println(mess);
        Scanner sc= new Scanner(System.in);
        return sc.nextInt();
    }
    public String getString(String mess){
        System.out.println(mess);
        Scanner sc= new Scanner(System.in);
        return sc.nextLine();
    }
      public static Integer getInt(String promt, int min, int max)
    {
        Integer a = null;
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print(promt + ": ");
            try
            {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= min && a <= max)
                {
                    break;
                }
            }
            catch (Exception e)
            {
                System.out.println("Please enter a number between " + min + " and " + max);
            }
        }
        return a;
    }
}
