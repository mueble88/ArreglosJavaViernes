/*

 */
package arreglos;

import paqueteDos.Heroe;

public class Arreglos {

    public static void main(String[] args) {
        // Como se utiliza una clase?
        //que es un objeto ?
        //es una variable
        
        Heroe heroe=new Heroe();
        Enemigo enemigo= new Enemigo();
        
        //accediendo a un atributo privado
        heroe.setEdad(5);
        
        //accediendo al atributo 
        enemigo.nombre="Borré";
        heroe.nombre="Lucho Diaz";
        
        System.out.println(heroe.getEdad());
        
    }
    
}
