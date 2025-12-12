/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_germanfigueroa;

/**
 *
 * @author gafm2
 */
public class MusicM {
    private String nombre;
    private String ID;
    private int edad;
    private String instrumento;
    
    public MusicM(String nombre, String ID, int edad, String instrumento){
        this.nombre = nombre;
        this.ID = ID;
        this.edad = edad;
        this.instrumento = instrumento;
    }
    public String getNombre() {return nombre;}
    public String getID() {return ID;}
    public int getEdad() {return edad;}
    public String getInstrumento() {return instrumento;}
    
    public void PlaySong(){
        System.out.println(nombre + " esta tocando " + instrumento);
        System.out.println("Got a feeling that I'm goin' under");
        System.out.println("But I know that I'll make it out alive");
        System.out.println("If I quit calling you my lover");
        System.out.println("And move on");
    }
}
