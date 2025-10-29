
package Modelos;


public class Equipo{


//Constructores
    public Equipo(String nombr_equip, Piloto [] pilotos) {
        this.nombr_equip = nombr_equip;
        numero_pilotos = 0;
        this.pilot_E = pilotos;
    }
    
    public Equipo()
    {
    numero_pilotos = 0;
    }
    
//Variables de instancia
    private String nombr_equip;
    private Piloto [] pilot_E = new Piloto [4];
    private int numero_pilotos;

//Setters

    public void setNombr_equip(String nombr_equip) {
        this.nombr_equip = nombr_equip;
    }

    public void setPilot_E(Piloto[] pilot_E) {
        this.pilot_E = pilot_E;
    }

    public void setNumero_pilotos(int numero_pilotos) {
        this.numero_pilotos = numero_pilotos;
    }
    
    

//Getters

    public String getNombr_equip() {
        return nombr_equip;
    }

    public Piloto[] getPilot_E() {
        return pilot_E;
    }

    public int getNumero_pilotos() {
        return numero_pilotos;
    }

    //Metodos
    
    public void IncrementNumero_pilotos() {
    numero_pilotos++;
    }
    
    public void DecrementNumero_pilotos() {
    numero_pilotos--;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombr_equip=" + nombr_equip + ", pilot_E=" + pilot_E + ", numero_pilotos=" + numero_pilotos + '}';
    }
    
    
    
}
