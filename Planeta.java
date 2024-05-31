
/**
 * Write a description of class Planeta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planeta
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String descripción;

    /**
     * Constructor for objects of class Planeta
     */
    public Planeta(String nombre, String descripción)
    {
        this.nombre=nombre;
        this.descripción=descripción;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getDescripción(){
        return descripción;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    } 
    public void setDescripción(String descripción){
        this.descripción = descripción;
    }
    
    
}
