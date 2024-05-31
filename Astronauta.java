import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Astronauta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Astronauta
{
    private String nombre;
    private String especialidad;
    private List<Mision> misionesParticipadas = new ArrayList<>();
    private List<Planeta> planetasVisitados = new ArrayList<>();

    /**
     * Constructor for objects of class Astronauta
     */
    public Astronauta(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    } 
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    
    public void agregarMision(Mision mision) {
        misionesParticipadas.add(mision);
    }

    public void agregarPlanetaVisitado(Planeta planeta) {
        planetasVisitados.add(planeta);
    }

    
    public boolean validarEspecialidad() {
        if (especialidad.equals("Piloto")) {
            return misionesParticipadas.size() >= 1 && planetasVisitados.size() >= 1;
        } else if (especialidad.equals("Científico")) {
            return misionesParticipadas.size() >= 2 && planetasVisitados.size() >= 2;
        } else if (especialidad.equals("Ingeniero")) {
            return misionesParticipadas.size() >= 3 && planetasVisitados.size() >= 3;
        } else {
            return false;
        }
    }

}
