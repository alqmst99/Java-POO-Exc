/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.Entity.nameProduct;
import java.util.Scanner;




public class Mavenproject1 {

    
    public static void main(String[] args) {
      nameProduct  np = new nameProduct();//crecion de objeto 
        Scanner sc= new Scanner(System.in); // creacion de ingresp de datos
        //declaracion de las variables
      int c= 0; 
       int  i =0;
      double b=0.0;
      String a="";
      //estructura iterada para el ingreso de datos
       while(i<6){ //sentencia while con contador
           //ingreso de datos
            System.out.println("ingrese el nombre del producto: ");
        a= sc.next();
      np.setName(a);//guardado en el objeto
      System.out.println("ingrese el precio del producto: ");
        b= sc.nextDouble();
      np.setPrice(b);
      System.out.println("ingrese el Stock del producto: ");
        c= sc.nextInt();
      np.setStock(c);
      //impresion de los datos cargados
        System.out.println(np.getName()+ " price: " + np.getPrice()+ " stock: " + np.getStock());
        i +=1;//suma el contador
       }
        
    }}
