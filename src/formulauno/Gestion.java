/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulauno;

/**
 *
 * @author Estudiante
 * @param <G>
 */
public interface Gestion<G>{
    /*El sistema debe permitir almacenar y operar sobre la información relacionada con pilotos,
comisarios y equipos. Debe permitir las operaciones:
1. Carga: Agregar nuevo piloto/comisario.
2. Modificación: Editar información existente de piloto/comisario.
3. Eliminación: Remover piloto/comisario.
Nota: Los equipos están predefinidos; puede permitirse alta/baja de pilotos dentro de esos
equipos.*/
    
    public void Carga(G o);
    
    public void Modificar(G o, int i);

    public void Eliminar(int i);
    
}
