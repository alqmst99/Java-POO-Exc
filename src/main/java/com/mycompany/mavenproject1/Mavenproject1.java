/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.Entity.nameProduct;
import java.util.Scanner;




public class Mavenproject1 {

    
    public static void main(String[] args) {
      nameProduct  np = new nameProduct();
        Scanner sc= new Scanner(System.in);
      int c= 0; 
       int  i =0;
      double b=0.0;
      String a="";
       while(i<6){
            System.out.println("ingrese el nombre del producto: ");
        a= sc.next();
      np.setName(a);
      System.out.println("ingrese el precio del producto: ");
        b= sc.nextDouble();
      np.setPrice(b);
      System.out.println("ingrese el Stock del producto: ");
        c= sc.nextInt();
      np.setStock(c);
        System.out.println(np.getName()+ " price: " + np.getPrice()+ " stock: " + np.getStock());
        i +=1;
       }
        
    }}
