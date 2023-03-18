/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class App {

    public static void main(String[] args) {
        double v1,v2,v3,v,s;
       Scanner ent=new Scanner(System.in);
       System.out.print("ingresa las ventas del departamento 1: ");
        v1 = ent.nextDouble();
       System.out.print("ingresa las ventas del departamento 2: ");
        v2 = ent.nextDouble();
       System.out.print("ingresa las ventas del departamento 3: ");
        v3 = ent.nextDouble();
       System.out.print("ingresa el salario: ");
        s = ent.nextDouble();
       v=v1+v2+v3;
       if(v1>(0.33*v)){
           System.out.println("Salario departamento 1:"+(s*1.2));
       }
       else{
           System.out.println("Salario departamento 1:"+s);
       }
       if(v2>(0.33*v)){
           System.out.println("Salario departamento 2:"+(s*1.2));
       }
       else{
           System.out.println("Salario departamento 2:"+s);
       }
       if(v3>(0.33*v)){
           System.out.println("Salario departamento 3:"+(s*1.2));
       }
       else{
           System.out.println("Salario departamento 3:"+s);
       }
    }
}
