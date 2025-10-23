
package Modelos;


public class Equipo{


//Constructores
    public Equipo(String nombr_equip) {
        this.nombr_equip = nombr_equip;
    }
    
//Variables de instancia
    private String nombr_equip;
    private Piloto [] pilot_E = new Piloto [4];

//Setters

    public void setNombr_equip(String nombr_equip) {
        this.nombr_equip = nombr_equip;
    }

    public void setPilot_E(Piloto[] pilot_E) {
        this.pilot_E = pilot_E;
    }

//Getters

    public String getNombr_equip() {
        return nombr_equip;
    }

    public Piloto[] getPilot_E() {
        return pilot_E;
    }

}

