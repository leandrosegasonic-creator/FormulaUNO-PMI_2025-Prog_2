
package Modelos;

import java.util.ArrayList;
import java.util.List;

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
