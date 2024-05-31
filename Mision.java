import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Mision here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mision {
    private String nombre;
    private Fecha fechaInicio;
    private Fecha fechaFin;
    private Nave naveAsociada;
    public List<Astronauta> astronautas = new ArrayList<>();
    public List<Planeta> planetasExplorados = new ArrayList<>();

    public Mision(String nombre, Fecha fechaInicio, Fecha fechaFin, Nave naveAsociada) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.naveAsociada = naveAsociada;
    }
    
    public String getNombre(){
        return nombre;
    }
    public Fecha getFechaInicio(){
        return fechaInicio;
    }
    public Fecha getFechaFin(){
        return fechaFin;
    }
    public Nave getNaveAsociada(){
        return naveAsociada;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFechaInicio(Fecha fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    public void setFechaFin(Fecha fechaFin){
        this.fechaFin = fechaFin;
    }
    public void setNaveAsociada(Nave naveAsociada){
        this.naveAsociada = naveAsociada;
    }
    

    public void agregarAstronauta(Astronauta astronauta) {
        astronautas.add(astronauta);
    }

    public void agregarPlanetaExplorado(Planeta planeta) {
        planetasExplorados.add(planeta);
    }

    
    public int misionesParticipadas(Astronauta astronauta) {
        int count = 0;
        for (Astronauta a : astronautas) {
            if (a.equals(astronauta)) {
                count++;
            }
        }
        return count;
    }

}
