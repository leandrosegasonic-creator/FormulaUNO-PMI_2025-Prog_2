
package Modelos;

public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fecnac;
    private String nacionalidad;
    
public Persona(){//contstructor manual
        
    }
    
    Persona(String nombre, String apellido, Fecha fecnac , String nacionalidad){//constructor automatico
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecnac = fecnac;
        this.nacionalidad = nacionalidad;
    }
    
    public void Set_Nombre(String nombre){
        this.nombre = nombre
    ;}
    
    public void Set_Apellido(String apellido){
        this.apellido = apellido            
    ;}
    
    public void Set_Nacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad
    ;}
    
    public String Get_Nombre(){return
        this.nombre
    ;}
    
    public String Get_Apellido(){return
        this.apellido
    ;}
    
    public Fecha Get_Fecha(){return
        this.fecnac
    ;}
    
    public String Get_Nacionalidad(){return
        this.nacionalidad
    ;}

    public Fecha getFecnac() {
        return fecnac;
    }

    public void setFecnac(Fecha fecnac) {
        this.fecnac = fecnac;
    }
    
    
    
    @Override
    public String toString(){return
        "Nombre : "+Get_Nombre()+"\n"+
        "Apellido : "+Get_Apellido()+"\n"+
        "Fecha de Nacimiento : "+Get_Fecha()+"\n"+
        "Nacionalidad : "+Get_Nacionalidad()+"\n"
    ;}
}
