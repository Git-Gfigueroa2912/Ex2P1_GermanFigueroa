/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1_germanfigueroa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gafm2
 */
public class Ex2P1_GermanFigueroa {
     public static Scanner entrada = new Scanner(System.in);
     public static ArrayList<MusicM> banda = new ArrayList<>();
     
    public static void main(String[] args) {
        menuPrincipal();
    }
    public static void menuPrincipal(){
        System.out.println("1. Let´s Make Music");
        System.out.println("2. Salir");
        System.out.println("Ingrese una opcion: ");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        
        if(opcion == 1){
            menuBanda();
            menuPrincipal();
            
        }else if(opcion == 2){
            System.out.println("Saliendo del programa");
            
        }else{
            menuPrincipal();
        }
    }
    
}
