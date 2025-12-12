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
            menuBanda(banda);
            menuPrincipal();
            
        }else if(opcion == 2){
            System.out.println("Saliendo del programa");
            
        }else{
            menuPrincipal();
        }
    }
    public static void menuBanda(ArrayList<MusicM> banda){
        System.out.println("1. Ingresar Musico");
        System.out.println("2. Listar Detalles del Musico");
        System.out.println("3. Play Song");
        System.out.println("4. Eliminar Musico");
        System.out.println("5. Reset");
        System.out.println("Ingrese una opcion: ");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        
        switch(opcion){
            
            case 1->{
                System.out.println("Ingresar Musico");
                
                System.out.println("Ingrese el nombre del musico: ");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese el ID: ");
                String ID = entrada.nextLine();
                System.out.println("Ingrese la edad: ");
                int edad = entrada.nextInt();
                System.out.println("Ingrese el instrumento que tocara: ");
                String instrumento = entrada.nextLine();
                banda.add(new MusicM(nombre, ID, edad, instrumento));
                System.out.println("Musico Agregado");
  
            }
            
            case 2->{
                if(banda.isEmpty()){
                    System.out.println("No hay musicos");
                    
                }else{
                    for(int i = 0; i < banda.size(); i++){
                        System.out.println(i + " . " + banda.get(i).getNombre());
                        
                    }
                    System.out.println("Indice");
                    int indice = entrada.nextInt();
                    entrada.nextLine();
                    
                    if(indice >= 0 && indice < banda.size()){
                        MusicM m = banda.get(indice);
                        System.out.println("Nombre: " + m.getNombre());
                        System.out.println("ID: " + m.getID());
                        System.out.println("Edad: " + m.getEdad());
                        System.out.println("Instrumento: " + m.getInstrumento());
                    }else{
                        System.out.println("Indice invalido");
                    }
                }
   
            }
            
            case 3->{
                if(banda.isEmpty()){
                    System.out.println("No hay musicos");
                }else{
                    banda.get(0).PlaySong();
                }
            }
            
            case 4->{
                if(banda.isEmpty()){
                    System.out.println("No hay musicos");
                }else{
                    for(int i = 0; i < banda.size(); i++){
                        System.out.println(i + " . " + banda.get(i). getNombre());
                    }
                    System.out.println("Eliminar: ");
                    int eliminar = entrada.nextInt();
                    entrada.nextLine();
                    
                    if(eliminar >= 0 && eliminar < banda.size()){
                        banda.remove(eliminar);
                        System.out.println("Eliminado");
                    }else{
                        System.out.println("Indice invalido");
                    }
                }
            }
            
            case 5->{
                banda.clear();
                System.out.println("Banda reiniciada");
            }
            
        }
        System.out.println("Desea seguir editando la banda [s/n]: ");
        char resp = entrada.next().charAt(0);
        entrada.nextLine();
        if(resp == 's' || resp == 'S'){
            menuBanda(banda);
        }
    }
    
}
