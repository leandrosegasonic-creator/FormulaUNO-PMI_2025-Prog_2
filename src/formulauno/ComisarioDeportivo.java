/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulauno;

/**
 *
 * @author Estudiante
 */
public class ComisarioDeportivo extends Persona{
    private int sancionesaplicadas;
    private boolean internacionalfia;
            
    ComisarioDeportivo(){
        
    }
    
    ComisarioDeportivo(String nombre, String apellido, Fecha fecnac, String nacionalidad, int sanciones, boolean internacional){
        super(nombre, apellido, fecnac, nacionalidad);
        this.sancionesaplicadas = sanciones;
        this.internacionalfia = internacional;
        
    }

    public void Set_Sancionesaplicadas(int sancionesaplicadas) {
        this.sancionesaplicadas = sancionesaplicadas;
    }

    public void Set_Internacionalfia(boolean internacionalfia) {
        this.internacionalfia = internacionalfia;
    }

    public int Get_Sancionesaplicadas(){
        return sancionesaplicadas;
    }

    public boolean Get_Internacionalfia() {
        return internacionalfia;
    }

    @Override
    public String toString() {return
        "Nombre : "+Get_Nombre()+"\n"+
        "Apellido : "+Get_Apellido()+"\n"+
        "Fecha de Nacimiento : "+Get_Fecha()+"\n"+
        "Nacionalidad : "+Get_Nacionalidad()+"\n"+
        "Sanciones Aplicadas : "+Get_Sancionesaplicadas()+"\n"+
        "Internacional Fia : "+Get_Internacionalfia()
    ;}
    
}
