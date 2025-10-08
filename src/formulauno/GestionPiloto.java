/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulauno;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class GestionPiloto implements Gestion<Piloto>{
    List<Piloto> list = new ArrayList<>();

    @Override
    public void Carga(Piloto o) {
        list.add(o);
    }

    @Override
    public void Modificar(Piloto o, int i) {
        list.set(i, o);
    }

    @Override
    public void Eliminar(int i) {
        list.remove(i);
    }
    
}
