/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.black_friday;

import java.util.Scanner;

/**
 *
 * @author cheet
 */
public class Black_Friday {

    public static void main(String[] args) {
        
        String[][] productos = new String[10][3];
        Scanner captura = new Scanner(System.in);
        int opcion;
        //llenamos el vector
        
        for(int i = 0;i<3;i++){
            productos[i][0] = String.valueOf(i);
            System.out.println("introduce el nombre del producto");
            productos[i][1] = captura.nextLine();
            System.out.println("introduce precio");
            Productos[i][2] = captura.nextLine();
            
        }
        //preguntamos si es normal, preblack o black friday
        
        System.out.println("presione 1 para dia normal");
        System.out.println("presione 1 para dia normal");
        System.out.println("presione 1 para dia normal");
        System.out.println("presione 1 para dia normal");
        opcion = captura.nextInt();
        
        switch(opcion){
               
            case 1: {
                        for(int i = 0; i < 3; i++){
                            System.out.println("id: " + productos[i][0]);
                            System.out.println("nombre: " + productos[i][1]);
                            System.out.println("precio: " + productos[i][2]);
                        }
                        break;
            }
            case 2: {
                
            }
            case 3: {
                
            }
            case 4: {
                
            }
        }
    }
}
