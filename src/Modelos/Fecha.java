
package Modelos;

import java.util.InputMismatchException;

public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
   public  Fecha(){
        
    }
    
    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public void Set_Dia(int dia) throws InputMismatchException{
        this.dia = dia;
    }
    
    public void Set_Mes(int mes) throws InputMismatchException{
        this.mes = mes;
    }
    
    public void Set_Año(int año) throws InputMismatchException{
        this.año = año;
    }
    
    public int Get_Dia(){return
        this.dia;
    }
    
    public int Get_Mes(){return
        this.mes;
    }
    
    public int Get_Año(){return
        this.año;
    }
    
    @Override
    public String toString(){return
        Get_Dia()+" / "+Get_Mes()+" / "+Get_Año()
    ;}
}
