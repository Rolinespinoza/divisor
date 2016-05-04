/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyestorepetitivo;

import java.util.Scanner;

/**
 *
 * @author alum.fial7
 */
public class divisores {
    public static void main(String[] args) {
        int num;
        
        Scanner br= new Scanner (System.in);
        System.out.print("ingresa un numero: ");
        num=br.nextInt();
        while(num!=0)
        {
            for (int i = 1; i <= num; i++) 
            {
                if(num%i==0)
                {
                    System.out.println(i);
                }
            }
             System.out.println("ingresa un NUEVO numero: ");
        num=br.nextInt();
        }
        
    }
}
