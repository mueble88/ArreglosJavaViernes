/*

 */
package paqueteDos;

public class Heroe {
    
    //DATOS =ATRIBUTOS = VARIABLES
    public String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad<1 && edad<120){
            this.edad = edad;
        }else{
            System.out.println("Edad invalida");
        }        
    }
    
    

    public Heroe() {
    }
    
    
   
}
