
package Modelos;

import Modelos.Fecha;
import Modelos.Persona;
import java.util.InputMismatchException;

public class Piloto extends Persona{
   //Constructores
    public Piloto(String nombre, String apellido, Fecha fecnac, String nacionalidad, int num_auto, String rol, int puntos, int podios, int pole, int vueltas_rapidas, int penalizaciones, int abandonos, Boolean licencia_FIA) {
        super(nombre, apellido, fecnac, nacionalidad);
        this.num_auto = num_auto;
        this.rol = rol;
        this.puntos = puntos;
        this.podios = podios;
        this.pole = pole;
        this.vueltas_rapidas = vueltas_rapidas;
        this.penalizaciones = penalizaciones;
        this.abandonos = abandonos;
        this.licencia_FIA = licencia_FIA;
}


//Variables de instancia
private int num_auto;
private String rol;
private int puntos;
private int podios;
private int pole;
private int vueltas_rapidas;
private int penalizaciones;
private int abandonos;
private boolean licencia_FIA;

//Setters

public void setNum_auto(int num_auto) throws InputMismatchException{
    this.num_auto = num_auto;
}

public void setRol(String rol) {
    this.rol = rol;
}

public void setPuntos(int puntos) throws InputMismatchException{
    this.puntos = puntos;
}

public void setPodios(int podios) throws InputMismatchException{
    this.podios = podios;
}

public void setPole(int pole) throws InputMismatchException{
    this.pole = pole;
}

public void setVueltas_rapidas(int vueltas_rapidas) throws InputMismatchException{
    this.vueltas_rapidas = vueltas_rapidas;
}

public void setPenalizaciones(int penalizaciones) throws InputMismatchException{
    this.penalizaciones = penalizaciones;
}

public void setAbandonos(int abandonos) throws InputMismatchException{
    this.abandonos = abandonos;
}

public void setLicencia_FIA(Boolean licencia_FIA) throws InputMismatchException{
    this.licencia_FIA = licencia_FIA;
}

//Getters

public int getNum_auto() {
    return num_auto;
    }

public String getRol() {
    return rol;
    }

public int getPuntos() {
    return puntos;
    }

public int getPodios() {
    return podios;
    }

public int getPole() {
    return pole;
    }

public int getVueltas_rapidas() {
    return vueltas_rapidas;
    }

public int getPenalizaciones() {
    return penalizaciones;
    }

public int getAbandonos() {
    return abandonos;
    }

public Boolean getLicencia_FIA() {
    return licencia_FIA;
}

}
