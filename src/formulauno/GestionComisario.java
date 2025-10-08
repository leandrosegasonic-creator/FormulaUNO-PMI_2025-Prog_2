/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulauno;
//a
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class GestionComisario implements Gestion<ComisarioDeportivo>{
    private List<ComisarioDeportivo> list = new ArrayList<>();

    @Override
    public void Carga(ComisarioDeportivo o) {
        list.add(o);
    }

    @Override
    public void Modificar(ComisarioDeportivo o, int i) {
        list.set(i, o);
    }

    @Override
    public void Eliminar(int i) {
        list.remove(i);
    }
    
    
}
