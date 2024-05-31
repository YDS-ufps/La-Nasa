import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String tipo;
    private int capacidad;
    private List<Mision> misionesAsignadas = new ArrayList<>();

    
    public Nave(String nombre, String tipo, int capacidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String gettipo(){
        return tipo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    } 
    public void settipo(String descripción){
        this.tipo = tipo;
    }
        
    
     public void asignarMision(Mision mision) {
        misionesAsignadas.add(mision);
    }

    
    public boolean validarCapacidad() {
        int totalAstronautas = 0;
        for (Mision mision : misionesAsignadas) {
            totalAstronautas += mision.astronautas.size();
        }
        return totalAstronautas <= capacidad;
    }
}
