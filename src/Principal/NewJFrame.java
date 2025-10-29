
package Principal;

import Modelos.ComisarioDeportivo;
import Modelos.Equipo;
import Modelos.Fecha;
import Modelos.Piloto;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NewJFrame.class.getName());

    static ArrayList<Equipo> Equipo_10 = new ArrayList<>();
    static ArrayList<ComisarioDeportivo> Com_Dep_6 = new ArrayList<>(); 
    static int cant_cd = 0;       
    
    public static void initEquipo()
    {
     Fecha f = new Fecha(0,0,0);
     Piloto c = new Piloto("", "", f, "", 0, 0, 0, 0, 0, 0, 0, 0, false, "");
     Piloto e[] = new Piloto[4];
     e[0] = c;
     e[1] = c;
     e[2] = c;
     e[3] = c;
     
        Equipo_10.add(new Equipo("Sony", e));
        Equipo_10.add(new Equipo("Nintendo", e));
        Equipo_10.add(new Equipo("Sega", e));
        Equipo_10.add(new Equipo("Bandai", e));
        Equipo_10.add(new Equipo("Retro", e));
        Equipo_10.add(new Equipo("Vocaloid", e));
        Equipo_10.add(new Equipo("Capcom", e));
        Equipo_10.add(new Equipo("Ubisoft", e));
        Equipo_10.add(new Equipo("Indie", e));
        Equipo_10.add(new Equipo("Cartoon", e));

    }
    

    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Formula-ONE");
        setResizable(false);
        
        addWindowListener(new java.awt.event.WindowAdapter() {
    @Override
    public void windowClosing(java.awt.event.WindowEvent e) {
        miFuncionAlCerrar();
    }
});

    }
    
private void miFuncionAlCerrar() {

//Guardar comisarios deportivos
try{
File miArchivo = new File("com_dep.txt");
if(miArchivo.createNewFile())
{
FileWriter myWriter = new FileWriter("com_dep.txt"); 
for(ComisarioDeportivo cd: Com_Dep_6)
{
myWriter.write(cd.Get_Nombre() + "\n");
myWriter.write(cd.Get_Apellido() + "\n");
myWriter.write(cd.getFecnac().Get_Dia() + "\n");
myWriter.write(cd.getFecnac().Get_Mes() + "\n");
myWriter.write(cd.getFecnac().Get_Año() + "\n");
myWriter.write(cd.Get_Nacionalidad() + "\n");
myWriter.write(cd.Get_Sancionesaplicadas() + "\n");
myWriter.write(String.valueOf(cd.Get_Internacionalfia()) + "\n");
}
myWriter.close();
System.out.println("Ejecutado");

}
else
{
FileWriter myWriter = new FileWriter("com_dep.txt");
for(ComisarioDeportivo cd: Com_Dep_6)
{
myWriter.write(cd.Get_Nombre() + "\n");
myWriter.write(cd.Get_Apellido() + "\n");
myWriter.write(cd.getFecnac().Get_Dia() + "\n");
myWriter.write(cd.getFecnac().Get_Mes() + "\n");
myWriter.write(cd.getFecnac().Get_Año() + "\n");
myWriter.write(cd.Get_Nacionalidad() + "\n");
myWriter.write(cd.Get_Sancionesaplicadas() + "\n");
myWriter.write(String.valueOf(cd.Get_Internacionalfia()) + "\n");
}
myWriter.close();
System.out.println("Ejecutado");
}
}
catch(IOException e)
{
System.out.println("Ocurrio un error");
e.printStackTrace();
}



//Guardar Pilotos
ListIterator<Equipo> it = Equipo_10.listIterator();

try{
File miArchivo = new File("equip_pil.txt");
if(miArchivo.createNewFile())
{
FileWriter myWriter = new FileWriter("equip_pil.txt"); 
for(Equipo e: Equipo_10)
{
Piloto [] p = new Piloto[4];
p = e.getPilot_E();
int i;
for(i = 0; i < e.getNumero_pilotos(); i++)
{
myWriter.write(p[i].Get_Nombre() + "\n");
myWriter.write(p[i].Get_Apellido() + "\n");
myWriter.write(p[i].getFecnac().Get_Dia() + "\n");
myWriter.write(p[i].getFecnac().Get_Mes() + "\n");
myWriter.write(p[i].getFecnac().Get_Año() + "\n");
myWriter.write(p[i].Get_Nacionalidad() + "\n");
myWriter.write(p[i].getNum_auto() + "\n");
myWriter.write(p[i].getRol() + "\n");
myWriter.write(p[i].getPuntos() + "\n");
myWriter.write(p[i].getPodios() + "\n");
myWriter.write(p[i].getPole() + "\n");
myWriter.write(p[i].getVueltas_rapidas()+ "\n");
myWriter.write(p[i].getPenalizaciones() + "\n");
myWriter.write(p[i].getAbandonos() + "\n");
myWriter.write(String.valueOf(p[i].getRol()) + "\n");
myWriter.write(p[i].getEquipo() + "\n");
}
}
myWriter.close();
System.out.println("Ejecutado");

}
else
{
FileWriter myWriter = new FileWriter("equip_pil.txt"); 
for(Equipo e: Equipo_10)
{
Piloto [] p = new Piloto[4];
p = e.getPilot_E();
int i;
for(i = 0; i < e.getNumero_pilotos(); i++)
{
myWriter.write(p[i].Get_Nombre() + "\n");
myWriter.write(p[i].Get_Apellido() + "\n");
myWriter.write(p[i].getFecnac().Get_Dia() + "\n");
myWriter.write(p[i].getFecnac().Get_Mes() + "\n");
myWriter.write(p[i].getFecnac().Get_Año() + "\n");
myWriter.write(p[i].Get_Nacionalidad() + "\n");
myWriter.write(p[i].getNum_auto() + "\n");
myWriter.write(p[i].getRol() + "\n");
myWriter.write(p[i].getPuntos() + "\n");
myWriter.write(p[i].getPodios() + "\n");
myWriter.write(p[i].getPole() + "\n");
myWriter.write(p[i].getVueltas_rapidas()+ "\n");
myWriter.write(p[i].getPenalizaciones() + "\n");
myWriter.write(p[i].getAbandonos() + "\n");
myWriter.write(String.valueOf(p[i].getRol()) + "\n");
myWriter.write(p[i].getEquipo() + "\n");
}
}
myWriter.close();
}
}
catch(IOException e)
{
System.out.println("Ocurrio un error");
e.printStackTrace();
}


//Guardar cantidad de pilotos
try{
File miArchivo = new File("cant_pil.txt");
if(miArchivo.createNewFile())
{
FileWriter myWriter = new FileWriter("cant_pil.txt");
for(Equipo e: Equipo_10)
{
myWriter.write(e.getNumero_pilotos() + "\n");
}
myWriter.close();
}
else
{
FileWriter myWriter = new FileWriter("cant_pil.txt");
for(Equipo e: Equipo_10)
{
myWriter.write(e.getNumero_pilotos() + "\n");
}
myWriter.close();
}
}
catch(IOException e)
{
System.out.println("Ocurrio un error");
e.printStackTrace();
}
 
}
    
   
 public static void CargarPilotos()
{

try{
File miArchivo = new File("equip_pil.txt");
if(miArchivo.createNewFile())
;
else
{
Scanner myReader = new Scanner(miArchivo);
for(Equipo e: Equipo_10)
{
Piloto [] p = new Piloto[4];
int i;
for(i = 0; i < e.getNumero_pilotos(); i++)
{
Fecha f = new Fecha();
Piloto p_2 = new Piloto();
String data = myReader.nextLine();
p_2.Set_Nombre(data);
data = myReader.nextLine();
p_2.Set_Apellido(data);
data = myReader.nextLine();
f.Set_Dia(Integer.parseInt(data));
data = myReader.nextLine();
f.Set_Mes(Integer.parseInt(data));
data = myReader.nextLine();
f.Set_Año(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setFecnac(f);
p_2.Set_Nacionalidad(data);
data = myReader.nextLine();
p_2.setNum_auto(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setRol(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setPuntos(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setPodios(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setPole(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setVueltas_rapidas(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setPenalizaciones(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setAbandonos(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setLicencia_FIA(Boolean.parseBoolean(data));
data = myReader.nextLine();
p_2.setEquipo(data);
p[i] = p_2;
}
e.setPilot_E(p);
}
}
}
catch(IOException e)
{
System.out.println("Ocurrio un error");
e.printStackTrace();
}
}

public static void CargarCantPil()
{
try{
File miArchivo = new File("cant_pil.txt");
if(miArchivo.createNewFile())
;
else
{
Scanner myReader = new Scanner(miArchivo);
{
for(Equipo e: Equipo_10)
{
String data = myReader.nextLine();
e.setNumero_pilotos(Integer.parseInt(data));
}
}

}
}
catch(IOException e)
{
System.out.println("Ocurrio un error");
e.printStackTrace();
}
}
 
 public static void cargar_CD()
{
try{
File miArchivo = new File("com_dep.txt");
if(miArchivo.createNewFile())
;
else
{
Scanner myReader = new Scanner(miArchivo);
while(myReader.hasNextLine())
{
Fecha f = new Fecha();
ComisarioDeportivo cd = new ComisarioDeportivo();
String data = myReader.nextLine();
cd.Set_Nombre(data);
data = myReader.nextLine();
cd.Set_Apellido(data);
data = myReader.nextLine();
f.Set_Dia(Integer.parseInt(data));
data = myReader.nextLine();
f.Set_Mes(Integer.parseInt(data));
data = myReader.nextLine();
f.Set_Año(Integer.parseInt(data));

cd.setFecnac(f);

data = myReader.nextLine();
cd.Set_Nacionalidad(data);
data = myReader.nextLine();
cd.Set_Sancionesaplicadas(Integer.parseInt(data));
data = myReader.nextLine();
cd.Set_Internacionalfia(Boolean.parseBoolean(data));
Com_Dep_6.add(cd);
}
}
}
catch(IOException e)
{
System.out.println("Ocurrio un error");
e.printStackTrace();
}
}
 



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBotonesPermanentes = new javax.swing.JPanel();
        InitButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        InfoButton = new javax.swing.JButton();
        SalirButton = new javax.swing.JButton();
        PanelContenedor = new javax.swing.JPanel();
        PanelInicio = new javax.swing.JPanel();
        TituloPrograma = new javax.swing.JLabel();
        DescripciónInicio = new javax.swing.JLabel();
        PrecargaButton = new javax.swing.JButton();
        DescripciónPrecarga1 = new javax.swing.JLabel();
        DescripciónPrecarga2 = new javax.swing.JLabel();
        PanelEditar = new javax.swing.JPanel();
        PanelBotonesEditar = new javax.swing.JPanel();
        TituloEdicion = new javax.swing.JLabel();
        ModificarButton = new javax.swing.JButton();
        CargarButton = new javax.swing.JButton();
        EliminarButton = new javax.swing.JButton();
        PanelElegirCargar = new javax.swing.JPanel();
        DescripciónCargar = new javax.swing.JLabel();
        PilotoCargarButton = new javax.swing.JButton();
        ComisarioDeportivoCargarButton = new javax.swing.JButton();
        VolverButtonElegirCargar = new javax.swing.JButton();
        PanelPilotoCargar = new javax.swing.JPanel();
        TextoPoles = new javax.swing.JLabel();
        TextoAño = new javax.swing.JLabel();
        TextoPuntos = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JLabel();
        TextoDia = new javax.swing.JLabel();
        TextoVueltasRápidas = new javax.swing.JLabel();
        TextoRol = new javax.swing.JLabel();
        TextoFecha = new javax.swing.JLabel();
        TextoPodios = new javax.swing.JLabel();
        TextoAbandonos = new javax.swing.JLabel();
        TextoTituloIngresarPiloto = new javax.swing.JLabel();
        TextoEquipo = new javax.swing.JLabel();
        TextoMes = new javax.swing.JLabel();
        TextoNumeroAuto = new javax.swing.JLabel();
        TextoLicenciaFIA = new javax.swing.JLabel();
        TextoPenalizaciones = new javax.swing.JLabel();
        TextoApellido = new javax.swing.JLabel();
        TextoCargarMesPiloto = new javax.swing.JTextField();
        TextoCargarAñoPiloto = new javax.swing.JTextField();
        TextoCargarApellidoPiloto = new javax.swing.JTextField();
        TextoCargarNombrePiloto = new javax.swing.JTextField();
        TextoCargarDiaPiloto = new javax.swing.JTextField();
        ScrollPanelRolPiloto = new javax.swing.JScrollPane();
        ListaCargarRolPiloto = new javax.swing.JList<>();
        ScrollPanelEquipoPiloto = new javax.swing.JScrollPane();
        ListaCargarEquipoPíloto = new javax.swing.JList<>();
        TextoCargarNumeroAutoPiloto = new javax.swing.JTextField();
        TextoCargarPuntosPiloto = new javax.swing.JTextField();
        TextoCargarPodiosPiloto = new javax.swing.JTextField();
        TextoCargarPolesPiloto = new javax.swing.JTextField();
        TextoCargarPenalizacionesPiloto = new javax.swing.JTextField();
        TextoCargarVueltasRapidasPiloto = new javax.swing.JTextField();
        TextoCargarAbandonosPiloto = new javax.swing.JTextField();
        CheckCargarLicenciaFIAPiloto = new javax.swing.JCheckBox();
        AplicarButtonCargarPiloto = new javax.swing.JButton();
        VolverButtonCargarPiloto = new javax.swing.JButton();
        TextoCargarNacionalidadPiloto = new javax.swing.JTextField();
        TextoNacionalidadPiloto = new javax.swing.JLabel();
        PanelComisarioDeportivoCargar = new javax.swing.JPanel();
        TextoTituloCD = new javax.swing.JLabel();
        TextoNombreCD = new javax.swing.JLabel();
        TextoCargarApellidoTextoNombreCD = new javax.swing.JLabel();
        TextoFechaCD = new javax.swing.JLabel();
        TextoDiaCD = new javax.swing.JLabel();
        TextoMesCD = new javax.swing.JLabel();
        TextoAñoCD = new javax.swing.JLabel();
        TextoNacionalidadCD = new javax.swing.JLabel();
        TextoSancionesCD = new javax.swing.JLabel();
        TextoInternacionalFIACD = new javax.swing.JLabel();
        TextoCargarNombreCD = new javax.swing.JTextField();
        TextoCargarApellidoCD = new javax.swing.JTextField();
        TextoCargarDiaCD = new javax.swing.JTextField();
        TextoCargarMesCD = new javax.swing.JTextField();
        TextoCargarAñoCD = new javax.swing.JTextField();
        TextoCargarNacionalidadCD = new javax.swing.JTextField();
        TextoCargarSancionesCD = new javax.swing.JTextField();
        CheckCargarInternacionalFIA = new javax.swing.JCheckBox();
        VolverButtonCargarCD = new javax.swing.JButton();
        AplicarButtonCargarCD = new javax.swing.JButton();
        PanelElegirModificar = new javax.swing.JPanel();
        TextoModificarElegir = new javax.swing.JLabel();
        PilotoModificarButton = new javax.swing.JButton();
        CDModificarButton = new javax.swing.JButton();
        VolverButtonElegirModificar = new javax.swing.JButton();
        PanelPilotoModificar = new javax.swing.JPanel();
        TextoDescripcionModificarPiloto = new javax.swing.JLabel();
        TítuloModificarPiloto = new javax.swing.JLabel();
        TextoNombreB = new javax.swing.JLabel();
        TextoApellidoB = new javax.swing.JLabel();
        TextoRolB = new javax.swing.JLabel();
        TextoNumeroAutoB = new javax.swing.JLabel();
        TextoPuntosB = new javax.swing.JLabel();
        TextoVueltasB = new javax.swing.JLabel();
        TextoPodiosB = new javax.swing.JLabel();
        TextoPenalizacionesB = new javax.swing.JLabel();
        TextoPolesB = new javax.swing.JLabel();
        TextoAbandonosB = new javax.swing.JLabel();
        TextoBuscarNombrePiloto = new javax.swing.JTextField();
        TextoBuscarApellidoPiloto = new javax.swing.JTextField();
        TextoModificarNumeroAutoPiloto = new javax.swing.JTextField();
        TextoModificarPolesPiloto = new javax.swing.JTextField();
        TextoModificarPuntosPiloto = new javax.swing.JTextField();
        TextoModificarPodiosPiloto = new javax.swing.JTextField();
        TextoModificarAbandonoPiloto = new javax.swing.JTextField();
        TextoModificarPenalizacionesPiloto = new javax.swing.JTextField();
        TextoModificarVueltasPiloto = new javax.swing.JTextField();
        ScrollPanelRolB = new javax.swing.JScrollPane();
        ListaModificarRolPiloto = new javax.swing.JList<>();
        VolverButtonModificarPiloto = new javax.swing.JButton();
        AplicarModificaciónPiloto = new javax.swing.JButton();
        BuscarButtonPiloto = new javax.swing.JButton();
        PanelComisarioDeportivoModificar = new javax.swing.JPanel();
        TextoSancionesb = new javax.swing.JLabel();
        TextoIntFIAb = new javax.swing.JLabel();
        TituloModCD = new javax.swing.JLabel();
        TextoNombreb = new javax.swing.JLabel();
        TextoApellidob = new javax.swing.JLabel();
        TextoDescripcionModificarCD = new javax.swing.JLabel();
        TextoModificarSancionesCD = new javax.swing.JTextField();
        TextoNombreCDBuscar = new javax.swing.JTextField();
        TextoApellidoCDBuscar = new javax.swing.JTextField();
        VolverButtonCDModificar = new javax.swing.JButton();
        AplicarButtonModificarCD = new javax.swing.JButton();
        BuscarCDModificarButton = new javax.swing.JButton();
        CheckModificarFIACD = new javax.swing.JCheckBox();
        PanelElegirEliminar = new javax.swing.JPanel();
        TituloEliminarElegir = new javax.swing.JLabel();
        ButtonPilotoEliminarElegir = new javax.swing.JButton();
        ButtonCDEliminarElegir = new javax.swing.JButton();
        VolverButtonElegirEliminar = new javax.swing.JButton();
        PanelEliminarPiloto = new javax.swing.JPanel();
        TextoNombreC = new javax.swing.JLabel();
        DescripciónEliminarPiloto = new javax.swing.JLabel();
        TextoApellidoC = new javax.swing.JLabel();
        TítuloEliminarPiloto = new javax.swing.JLabel();
        TextoEliminarApellidoPiloto = new javax.swing.JTextField();
        TextoEliminarNombrePiloto = new javax.swing.JTextField();
        ButtonEliminarPiloto = new javax.swing.JButton();
        BuscarButtonPilotoEliminar = new javax.swing.JButton();
        VolverButtonEliminarPiloto = new javax.swing.JButton();
        PanelEliminarComisarioDeportivo = new javax.swing.JPanel();
        TituloEliminarCD = new javax.swing.JLabel();
        TextoNombrec = new javax.swing.JLabel();
        DescripciónEliminarCD = new javax.swing.JLabel();
        TextoApellidoc = new javax.swing.JLabel();
        TextoEliminarApellidoCD = new javax.swing.JTextField();
        TextoEliminarNombreCD = new javax.swing.JTextField();
        BuscarButtonEliminarCD = new javax.swing.JButton();
        EliminarButtonCD = new javax.swing.JButton();
        VolverButtonEliminarCD = new javax.swing.JButton();
        PanelInfo = new javax.swing.JPanel();
        PanelBotonesInformación = new javax.swing.JPanel();
        TítuloInformación = new javax.swing.JLabel();
        ButtonInfoEquipos = new javax.swing.JButton();
        ButtonInfoCD = new javax.swing.JButton();
        ButtonInfoPilotos = new javax.swing.JButton();
        PanelMostrarEquipos = new javax.swing.JPanel();
        ButtonEquipos = new javax.swing.JLabel();
        ButtonSony = new javax.swing.JButton();
        ButtonNintendo = new javax.swing.JButton();
        ButtonBandai = new javax.swing.JButton();
        ButtonSega = new javax.swing.JButton();
        ButtonVocaloid = new javax.swing.JButton();
        ButtonRetro = new javax.swing.JButton();
        ButtonUbisoft = new javax.swing.JButton();
        ButtonCapcom = new javax.swing.JButton();
        ButtonCartoon = new javax.swing.JButton();
        ButtonIndie = new javax.swing.JButton();
        VolverButtonMostrarEquipos = new javax.swing.JButton();
        Texto_cant_sony = new javax.swing.JLabel();
        Texto_cant_Nintendo = new javax.swing.JLabel();
        Texto_cant_Retro = new javax.swing.JLabel();
        Texto_cant_Capcom = new javax.swing.JLabel();
        Texto_cant_Cartoon = new javax.swing.JLabel();
        Texto_cant_Vocaloid = new javax.swing.JLabel();
        Texto_cant_Sega = new javax.swing.JLabel();
        Texto_cant_Indie = new javax.swing.JLabel();
        Texto_cant_Ubisoft = new javax.swing.JLabel();
        Texto_cant_Bandai = new javax.swing.JLabel();
        Texto_Cant_Pil_Sony = new javax.swing.JLabel();
        Texto_Cant_Pil_Nintendo = new javax.swing.JLabel();
        Texto_Cant_Pil_Retro = new javax.swing.JLabel();
        Texto_Cant_Pil_Capcom = new javax.swing.JLabel();
        Texto_Cant_Pil_Cartoon = new javax.swing.JLabel();
        Texto_Cant_Pil_Vocaloid = new javax.swing.JLabel();
        Texto_Cant_Pil_Sega = new javax.swing.JLabel();
        Texto_Cant_Pil_Indie = new javax.swing.JLabel();
        Texto_Cant_Pil_Ubisoft = new javax.swing.JLabel();
        Texto_Cant_Pil_Bandai = new javax.swing.JLabel();
        PanelSony = new javax.swing.JPanel();
        TítuloSony = new javax.swing.JLabel();
        VolverButtonSony = new javax.swing.JButton();
        ScrollPanelSony = new javax.swing.JScrollPane();
        ListaSony = new javax.swing.JTable();
        PanelNintendo = new javax.swing.JPanel();
        TítuloNintendo = new javax.swing.JLabel();
        VolverButtonNintendo = new javax.swing.JButton();
        ScrollPanelNintendo = new javax.swing.JScrollPane();
        ListaNintendo = new javax.swing.JTable();
        PanelSega = new javax.swing.JPanel();
        TítuloSega = new javax.swing.JLabel();
        VolverButtonSega = new javax.swing.JButton();
        ScrollPanelSega = new javax.swing.JScrollPane();
        ListaSega = new javax.swing.JTable();
        PanelBandai = new javax.swing.JPanel();
        TítuloBandai = new javax.swing.JLabel();
        VolverButtonBandai = new javax.swing.JButton();
        ScrollPanelBandai = new javax.swing.JScrollPane();
        ListaBandai = new javax.swing.JTable();
        PanelRetro = new javax.swing.JPanel();
        TítuloRetro = new javax.swing.JLabel();
        VolverButtonRetro = new javax.swing.JButton();
        ScrollPanelRetro = new javax.swing.JScrollPane();
        ListaRetro = new javax.swing.JTable();
        PanelVocaloid = new javax.swing.JPanel();
        TítuloVocaloid = new javax.swing.JLabel();
        VolverButtonVocaloid = new javax.swing.JButton();
        ScrollPanelVocaloid = new javax.swing.JScrollPane();
        ListaVocaloid = new javax.swing.JTable();
        PanelCapcom = new javax.swing.JPanel();
        TítuloCapcom = new javax.swing.JLabel();
        VolverButtonCapcom = new javax.swing.JButton();
        ScrollPanelCapcom = new javax.swing.JScrollPane();
        ListaCapcom = new javax.swing.JTable();
        PanelUbisoft = new javax.swing.JPanel();
        TítuloUbisoft = new javax.swing.JLabel();
        VolverButtonSony7 = new javax.swing.JButton();
        ScrollPanelUbisoft = new javax.swing.JScrollPane();
        ListaUbisoft = new javax.swing.JTable();
        PanelIndie = new javax.swing.JPanel();
        TítuloIndie = new javax.swing.JLabel();
        VolverButtonIndie = new javax.swing.JButton();
        ScrollPanelIndie = new javax.swing.JScrollPane();
        ListaIndie = new javax.swing.JTable();
        PanelCartoon = new javax.swing.JPanel();
        TítuloSony8 = new javax.swing.JLabel();
        VolverButtonCartoon = new javax.swing.JButton();
        ScrollPanelCartoon = new javax.swing.JScrollPane();
        ListaCartoon = new javax.swing.JTable();
        PanelPilotos = new javax.swing.JPanel();
        TítuloPilotos = new javax.swing.JLabel();
        ScrollPanelPilotos = new javax.swing.JScrollPane();
        ListaPilotos = new javax.swing.JTable();
        Text_Cant_Probador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        ButtonPilotoMayorPenalizaciones = new javax.swing.JButton();
        Text_Cant_Titular = new javax.swing.JLabel();
        Text_Cant_Reserva = new javax.swing.JLabel();
        Button_Pilotos_Puntos = new javax.swing.JButton();
        TextoPuntosMayor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VolverButtonCartoon1 = new javax.swing.JButton();
        PanelMostrarComisariosDeportivos = new javax.swing.JPanel();
        TituloCDMostrar = new javax.swing.JLabel();
        VolverButtonMostrarCD = new javax.swing.JButton();
        ScrollPanelCD1 = new javax.swing.JScrollPane();
        TablaMostrarCD = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TextoFiltrarCDFIA3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(880, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelBotonesPermanentes.setBackground(new java.awt.Color(0, 0, 0));
        PanelBotonesPermanentes.setBorder(new javax.swing.border.MatteBorder(null));
        PanelBotonesPermanentes.setForeground(new java.awt.Color(0, 255, 255));
        PanelBotonesPermanentes.setPreferredSize(new java.awt.Dimension(170, 499));
        PanelBotonesPermanentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InitButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        InitButton.setForeground(new java.awt.Color(255, 255, 255));
        InitButton.setText("Inicio");
        InitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InitButton.setContentAreaFilled(false);
        InitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InitButton.setFocusable(false);
        InitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InitButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                InitButtonMouseReleased(evt);
            }
        });
        InitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InitButtonActionPerformed(evt);
            }
        });
        PanelBotonesPermanentes.add(InitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        EditButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        EditButton.setForeground(new java.awt.Color(255, 255, 255));
        EditButton.setText("Editar");
        EditButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditButton.setContentAreaFilled(false);
        EditButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditButton.setFocusable(false);
        EditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EditButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EditButtonMouseReleased(evt);
            }
        });
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        PanelBotonesPermanentes.add(EditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));

        InfoButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        InfoButton.setForeground(new java.awt.Color(255, 255, 255));
        InfoButton.setText("Informacion");
        InfoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InfoButton.setContentAreaFilled(false);
        InfoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InfoButton.setFocusable(false);
        InfoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InfoButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                InfoButtonMouseReleased(evt);
            }
        });
        InfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoButtonActionPerformed(evt);
            }
        });
        PanelBotonesPermanentes.add(InfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, -1));

        SalirButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        SalirButton.setForeground(new java.awt.Color(255, 255, 255));
        SalirButton.setText("Exportar y salir");
        SalirButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SalirButton.setContentAreaFilled(false);
        SalirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SalirButton.setFocusable(false);
        SalirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalirButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SalirButtonMouseReleased(evt);
            }
        });
        SalirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonActionPerformed(evt);
            }
        });
        PanelBotonesPermanentes.add(SalirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 150, -1));

        getContentPane().add(PanelBotonesPermanentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 179, 806));

        PanelContenedor.setBackground(new java.awt.Color(51, 51, 51));
        PanelContenedor.setBorder(new javax.swing.border.MatteBorder(null));
        PanelContenedor.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelContenedor.setLayout(new java.awt.CardLayout());

        PanelInicio.setBackground(new java.awt.Color(51, 51, 51));
        PanelInicio.setBorder(new javax.swing.border.MatteBorder(null));
        PanelInicio.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloPrograma.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        TituloPrograma.setForeground(new java.awt.Color(255, 255, 255));
        TituloPrograma.setText("FORMULA-1");
        PanelInicio.add(TituloPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        DescripciónInicio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        DescripciónInicio.setForeground(new java.awt.Color(255, 255, 255));
        DescripciónInicio.setText("¡Bienvenido al programa!");
        PanelInicio.add(DescripciónInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 277, -1));

        PrecargaButton.setBackground(new java.awt.Color(51, 51, 51));
        PrecargaButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        PrecargaButton.setForeground(new java.awt.Color(255, 255, 255));
        PrecargaButton.setText("Activar precarga de datos pre-establecidos");
        PrecargaButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PrecargaButton.setContentAreaFilled(false);
        PrecargaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PrecargaButton.setFocusable(false);
        PrecargaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PrecargaButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PrecargaButtonMouseReleased(evt);
            }
        });
        PrecargaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecargaButtonActionPerformed(evt);
            }
        });
        PanelInicio.add(PrecargaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 300, 30));

        DescripciónPrecarga1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        DescripciónPrecarga1.setForeground(new java.awt.Color(255, 255, 255));
        DescripciónPrecarga1.setText(" borrara todo lo que esté cargado actualmente.");
        PanelInicio.add(DescripciónPrecarga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 320, 40));

        DescripciónPrecarga2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        DescripciónPrecarga2.setForeground(new java.awt.Color(255, 255, 255));
        DescripciónPrecarga2.setText("Este botón almacena datos ya existentes de archivos de texto y");
        PanelInicio.add(DescripciónPrecarga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 420, 40));

        PanelContenedor.add(PanelInicio, "card2");

        PanelEditar.setBackground(new java.awt.Color(51, 51, 51));
        PanelEditar.setBorder(new javax.swing.border.MatteBorder(null));
        PanelEditar.setMinimumSize(new java.awt.Dimension(959, 800));
        PanelEditar.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelEditar.setLayout(new java.awt.CardLayout());

        PanelBotonesEditar.setBackground(new java.awt.Color(51, 51, 51));
        PanelBotonesEditar.setBorder(new javax.swing.border.MatteBorder(null));
        PanelBotonesEditar.setMinimumSize(new java.awt.Dimension(959, 800));
        PanelBotonesEditar.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelBotonesEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloEdicion.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TituloEdicion.setForeground(new java.awt.Color(255, 255, 255));
        TituloEdicion.setText("Edición");
        PanelBotonesEditar.add(TituloEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        ModificarButton.setBackground(new java.awt.Color(51, 51, 51));
        ModificarButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ModificarButton.setForeground(new java.awt.Color(255, 255, 255));
        ModificarButton.setText("Modificar");
        ModificarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarButton.setContentAreaFilled(false);
        ModificarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModificarButton.setFocusable(false);
        ModificarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ModificarButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ModificarButtonMouseReleased(evt);
            }
        });
        ModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarButtonActionPerformed(evt);
            }
        });
        PanelBotonesEditar.add(ModificarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 220, 30));

        CargarButton.setBackground(new java.awt.Color(51, 51, 51));
        CargarButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        CargarButton.setForeground(new java.awt.Color(255, 255, 255));
        CargarButton.setText("Cargar");
        CargarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CargarButton.setContentAreaFilled(false);
        CargarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CargarButton.setFocusable(false);
        CargarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CargarButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CargarButtonMouseReleased(evt);
            }
        });
        CargarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarButtonActionPerformed(evt);
            }
        });
        PanelBotonesEditar.add(CargarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, 30));

        EliminarButton.setBackground(new java.awt.Color(51, 51, 51));
        EliminarButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        EliminarButton.setForeground(new java.awt.Color(255, 255, 255));
        EliminarButton.setText("Eliminar");
        EliminarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EliminarButton.setContentAreaFilled(false);
        EliminarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EliminarButton.setFocusable(false);
        EliminarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EliminarButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EliminarButtonMouseReleased(evt);
            }
        });
        EliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarButtonActionPerformed(evt);
            }
        });
        PanelBotonesEditar.add(EliminarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 220, 30));

        PanelEditar.add(PanelBotonesEditar, "card2");

        PanelElegirCargar.setBackground(new java.awt.Color(51, 51, 51));
        PanelElegirCargar.setBorder(new javax.swing.border.MatteBorder(null));
        PanelElegirCargar.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelElegirCargar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DescripciónCargar.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        DescripciónCargar.setForeground(new java.awt.Color(255, 255, 255));
        DescripciónCargar.setText("Presione que quiere cargar ");
        PanelElegirCargar.add(DescripciónCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        PilotoCargarButton.setBackground(new java.awt.Color(51, 51, 51));
        PilotoCargarButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        PilotoCargarButton.setForeground(new java.awt.Color(255, 255, 255));
        PilotoCargarButton.setText("Piloto");
        PilotoCargarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PilotoCargarButton.setContentAreaFilled(false);
        PilotoCargarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PilotoCargarButton.setFocusable(false);
        PilotoCargarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PilotoCargarButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PilotoCargarButtonMouseReleased(evt);
            }
        });
        PilotoCargarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilotoCargarButtonActionPerformed(evt);
            }
        });
        PanelElegirCargar.add(PilotoCargarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, 30));

        ComisarioDeportivoCargarButton.setBackground(new java.awt.Color(51, 51, 51));
        ComisarioDeportivoCargarButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ComisarioDeportivoCargarButton.setForeground(new java.awt.Color(255, 255, 255));
        ComisarioDeportivoCargarButton.setText("Comisario deportivo");
        ComisarioDeportivoCargarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ComisarioDeportivoCargarButton.setContentAreaFilled(false);
        ComisarioDeportivoCargarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComisarioDeportivoCargarButton.setFocusable(false);
        ComisarioDeportivoCargarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ComisarioDeportivoCargarButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ComisarioDeportivoCargarButtonMouseReleased(evt);
            }
        });
        ComisarioDeportivoCargarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComisarioDeportivoCargarButtonActionPerformed(evt);
            }
        });
        PanelElegirCargar.add(ComisarioDeportivoCargarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 220, 30));

        VolverButtonElegirCargar.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonElegirCargar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonElegirCargar.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonElegirCargar.setText("Volver");
        VolverButtonElegirCargar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonElegirCargar.setContentAreaFilled(false);
        VolverButtonElegirCargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonElegirCargar.setFocusable(false);
        VolverButtonElegirCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VolverButtonElegirCargarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonElegirCargarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonElegirCargarMouseReleased(evt);
            }
        });
        VolverButtonElegirCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonElegirCargarActionPerformed(evt);
            }
        });
        PanelElegirCargar.add(VolverButtonElegirCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        PanelEditar.add(PanelElegirCargar, "card3");

        PanelPilotoCargar.setBackground(new java.awt.Color(51, 51, 51));
        PanelPilotoCargar.setBorder(new javax.swing.border.MatteBorder(null));
        PanelPilotoCargar.setMinimumSize(new java.awt.Dimension(959, 800));
        PanelPilotoCargar.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelPilotoCargar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoPoles.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoPoles.setForeground(new java.awt.Color(255, 255, 255));
        TextoPoles.setText("-Poles:");
        PanelPilotoCargar.add(TextoPoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 50, 30));

        TextoAño.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoAño.setForeground(new java.awt.Color(255, 255, 255));
        TextoAño.setText("Año:");
        PanelPilotoCargar.add(TextoAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 111, -1, 30));

        TextoPuntos.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoPuntos.setForeground(new java.awt.Color(255, 255, 255));
        TextoPuntos.setText("-Puntos:");
        PanelPilotoCargar.add(TextoPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, 30));

        TextoNombre.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoNombre.setForeground(new java.awt.Color(255, 255, 255));
        TextoNombre.setText("-Nombre:");
        PanelPilotoCargar.add(TextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        TextoDia.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoDia.setForeground(new java.awt.Color(255, 255, 255));
        TextoDia.setText("Dia:");
        PanelPilotoCargar.add(TextoDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 110, 30, 30));

        TextoVueltasRápidas.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoVueltasRápidas.setForeground(new java.awt.Color(255, 255, 255));
        TextoVueltasRápidas.setText("-Vueltas rápidas:");
        PanelPilotoCargar.add(TextoVueltasRápidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 110, 30));

        TextoRol.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoRol.setForeground(new java.awt.Color(255, 255, 255));
        TextoRol.setText("-Rol:");
        PanelPilotoCargar.add(TextoRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 50, -1));

        TextoFecha.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoFecha.setForeground(new java.awt.Color(255, 255, 255));
        TextoFecha.setText("-Fecha de nacimiento:");
        PanelPilotoCargar.add(TextoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        TextoPodios.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoPodios.setForeground(new java.awt.Color(255, 255, 255));
        TextoPodios.setText("-Podios:");
        PanelPilotoCargar.add(TextoPodios, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, 30));

        TextoAbandonos.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoAbandonos.setForeground(new java.awt.Color(255, 255, 255));
        TextoAbandonos.setText("-Abandonos:");
        PanelPilotoCargar.add(TextoAbandonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, 30));

        TextoTituloIngresarPiloto.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TextoTituloIngresarPiloto.setForeground(new java.awt.Color(255, 255, 255));
        TextoTituloIngresarPiloto.setText("Ingresando un piloto:");
        PanelPilotoCargar.add(TextoTituloIngresarPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        TextoEquipo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoEquipo.setForeground(new java.awt.Color(255, 255, 255));
        TextoEquipo.setText("-Equipo:");
        PanelPilotoCargar.add(TextoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        TextoMes.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoMes.setForeground(new java.awt.Color(255, 255, 255));
        TextoMes.setText("Mes:");
        PanelPilotoCargar.add(TextoMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 30, 30));

        TextoNumeroAuto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoNumeroAuto.setForeground(new java.awt.Color(255, 255, 255));
        TextoNumeroAuto.setText("-Número de auto:");
        PanelPilotoCargar.add(TextoNumeroAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, 40));

        TextoLicenciaFIA.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoLicenciaFIA.setForeground(new java.awt.Color(255, 255, 255));
        TextoLicenciaFIA.setText("-Licencia FIA:");
        PanelPilotoCargar.add(TextoLicenciaFIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, 29));

        TextoPenalizaciones.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoPenalizaciones.setForeground(new java.awt.Color(255, 255, 255));
        TextoPenalizaciones.setText("-Penalizaciones:");
        PanelPilotoCargar.add(TextoPenalizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, 30));

        TextoApellido.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoApellido.setForeground(new java.awt.Color(255, 255, 255));
        TextoApellido.setText("-Apellido:");
        PanelPilotoCargar.add(TextoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, 30));

        TextoCargarMesPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarMesPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarMesPilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(TextoCargarMesPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 30, 29));

        TextoCargarAñoPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarAñoPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarAñoPilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(TextoCargarAñoPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 90, 29));

        TextoCargarApellidoPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarApellidoPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarApellidoPilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(TextoCargarApellidoPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 150, 40));

        TextoCargarNombrePiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarNombrePiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarNombrePilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(TextoCargarNombrePiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 150, 40));

        TextoCargarDiaPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarDiaPiloto.setPreferredSize(new java.awt.Dimension(64, 30));
        TextoCargarDiaPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarDiaPilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(TextoCargarDiaPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 33, 30));

        ListaCargarRolPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ListaCargarRolPiloto.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Titular", "Reserva", "Probador" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScrollPanelRolPiloto.setViewportView(ListaCargarRolPiloto);

        PanelPilotoCargar.add(ScrollPanelRolPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 100, 90));

        ListaCargarEquipoPíloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ListaCargarEquipoPíloto.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Sony", "Nintendo", "Sega", "Bandai", "Retro", "Vocaloid", "Capcom", "Ubisoft", "Indie", "Cartoon" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScrollPanelEquipoPiloto.setViewportView(ListaCargarEquipoPíloto);

        PanelPilotoCargar.add(ScrollPanelEquipoPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 130, 110));

        TextoCargarNumeroAutoPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarNumeroAutoPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarNumeroAutoPilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(TextoCargarNumeroAutoPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 170, 40));

        TextoCargarPuntosPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarPuntosPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarPuntosPilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(TextoCargarPuntosPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 60, -1));

        TextoCargarPodiosPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarPodiosPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarPodiosPilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(TextoCargarPodiosPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 60, -1));

        TextoCargarPolesPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarPolesPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarPolesPilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(TextoCargarPolesPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 60, -1));

        TextoCargarPenalizacionesPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarPenalizacionesPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarPenalizacionesPilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(TextoCargarPenalizacionesPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 60, -1));

        TextoCargarVueltasRapidasPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarVueltasRapidasPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarVueltasRapidasPilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(TextoCargarVueltasRapidasPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 60, -1));

        TextoCargarAbandonosPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarAbandonosPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarAbandonosPilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(TextoCargarAbandonosPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 60, -1));

        CheckCargarLicenciaFIAPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckCargarLicenciaFIAPilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(CheckCargarLicenciaFIAPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, 37));

        AplicarButtonCargarPiloto.setBackground(new java.awt.Color(51, 51, 51));
        AplicarButtonCargarPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        AplicarButtonCargarPiloto.setForeground(new java.awt.Color(255, 255, 255));
        AplicarButtonCargarPiloto.setText("Aplicar");
        AplicarButtonCargarPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AplicarButtonCargarPiloto.setContentAreaFilled(false);
        AplicarButtonCargarPiloto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AplicarButtonCargarPiloto.setFocusable(false);
        AplicarButtonCargarPiloto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AplicarButtonCargarPilotoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AplicarButtonCargarPilotoMouseReleased(evt);
            }
        });
        AplicarButtonCargarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AplicarButtonCargarPilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(AplicarButtonCargarPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 220, 30));

        VolverButtonCargarPiloto.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonCargarPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonCargarPiloto.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonCargarPiloto.setText("Volver");
        VolverButtonCargarPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonCargarPiloto.setContentAreaFilled(false);
        VolverButtonCargarPiloto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonCargarPiloto.setFocusable(false);
        VolverButtonCargarPiloto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonCargarPilotoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonCargarPilotoMouseReleased(evt);
            }
        });
        VolverButtonCargarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonCargarPilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(VolverButtonCargarPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        TextoCargarNacionalidadPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarNacionalidadPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarNacionalidadPilotoActionPerformed(evt);
            }
        });
        PanelPilotoCargar.add(TextoCargarNacionalidadPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 190, 40));

        TextoNacionalidadPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoNacionalidadPiloto.setForeground(new java.awt.Color(255, 255, 255));
        TextoNacionalidadPiloto.setText("-Nacionalidad:");
        PanelPilotoCargar.add(TextoNacionalidadPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, 40));

        PanelEditar.add(PanelPilotoCargar, "card4");

        PanelComisarioDeportivoCargar.setBackground(new java.awt.Color(51, 51, 51));
        PanelComisarioDeportivoCargar.setBorder(new javax.swing.border.MatteBorder(null));
        PanelComisarioDeportivoCargar.setMinimumSize(new java.awt.Dimension(959, 800));
        PanelComisarioDeportivoCargar.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelComisarioDeportivoCargar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoTituloCD.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TextoTituloCD.setForeground(new java.awt.Color(255, 255, 255));
        TextoTituloCD.setText("Ingresando un comisario deportivo:");
        PanelComisarioDeportivoCargar.add(TextoTituloCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        TextoNombreCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoNombreCD.setForeground(new java.awt.Color(255, 255, 255));
        TextoNombreCD.setText("-Nombre:");
        PanelComisarioDeportivoCargar.add(TextoNombreCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 30));

        TextoCargarApellidoTextoNombreCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarApellidoTextoNombreCD.setForeground(new java.awt.Color(255, 255, 255));
        TextoCargarApellidoTextoNombreCD.setText("-Apellido:");
        PanelComisarioDeportivoCargar.add(TextoCargarApellidoTextoNombreCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, 30));

        TextoFechaCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoFechaCD.setForeground(new java.awt.Color(255, 255, 255));
        TextoFechaCD.setText("-Fecha de nacimiento:");
        PanelComisarioDeportivoCargar.add(TextoFechaCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        TextoDiaCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoDiaCD.setForeground(new java.awt.Color(255, 255, 255));
        TextoDiaCD.setText("Dia:");
        PanelComisarioDeportivoCargar.add(TextoDiaCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        TextoMesCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoMesCD.setForeground(new java.awt.Color(255, 255, 255));
        TextoMesCD.setText("Mes:");
        PanelComisarioDeportivoCargar.add(TextoMesCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, 20));

        TextoAñoCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoAñoCD.setForeground(new java.awt.Color(255, 255, 255));
        TextoAñoCD.setText("Año:");
        PanelComisarioDeportivoCargar.add(TextoAñoCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, 20));

        TextoNacionalidadCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoNacionalidadCD.setForeground(new java.awt.Color(255, 255, 255));
        TextoNacionalidadCD.setText("-Nacionalidad:");
        PanelComisarioDeportivoCargar.add(TextoNacionalidadCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        TextoSancionesCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoSancionesCD.setForeground(new java.awt.Color(255, 255, 255));
        TextoSancionesCD.setText("-Sanciones aplicadas:");
        PanelComisarioDeportivoCargar.add(TextoSancionesCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 30));

        TextoInternacionalFIACD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoInternacionalFIACD.setForeground(new java.awt.Color(255, 255, 255));
        TextoInternacionalFIACD.setText("-Internacional FIA:");
        PanelComisarioDeportivoCargar.add(TextoInternacionalFIACD, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, 30));

        TextoCargarNombreCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarNombreCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarNombreCDActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoCargar.add(TextoCargarNombreCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 147, 40));

        TextoCargarApellidoCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarApellidoCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarApellidoCDActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoCargar.add(TextoCargarApellidoCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 198, 40));

        TextoCargarDiaCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarDiaCD.setPreferredSize(new java.awt.Dimension(64, 30));
        TextoCargarDiaCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarDiaCDActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoCargar.add(TextoCargarDiaCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 40, 29));

        TextoCargarMesCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarMesCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarMesCDActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoCargar.add(TextoCargarMesCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 40, 29));

        TextoCargarAñoCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarAñoCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarAñoCDActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoCargar.add(TextoCargarAñoCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 76, 29));

        TextoCargarNacionalidadCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoCargarNacionalidadCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCargarNacionalidadCDActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoCargar.add(TextoCargarNacionalidadCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 208, 40));

        TextoCargarSancionesCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        PanelComisarioDeportivoCargar.add(TextoCargarSancionesCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 90, 30));

        CheckCargarInternacionalFIA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CheckCargarInternacionalFIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckCargarInternacionalFIAActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoCargar.add(CheckCargarInternacionalFIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 30, 50));

        VolverButtonCargarCD.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonCargarCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonCargarCD.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonCargarCD.setText("Volver");
        VolverButtonCargarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonCargarCD.setContentAreaFilled(false);
        VolverButtonCargarCD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonCargarCD.setFocusable(false);
        VolverButtonCargarCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonCargarCDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonCargarCDMouseReleased(evt);
            }
        });
        VolverButtonCargarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonCargarCDActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoCargar.add(VolverButtonCargarCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        AplicarButtonCargarCD.setBackground(new java.awt.Color(51, 51, 51));
        AplicarButtonCargarCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        AplicarButtonCargarCD.setForeground(new java.awt.Color(255, 255, 255));
        AplicarButtonCargarCD.setText("Aplicar");
        AplicarButtonCargarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AplicarButtonCargarCD.setContentAreaFilled(false);
        AplicarButtonCargarCD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AplicarButtonCargarCD.setFocusable(false);
        AplicarButtonCargarCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AplicarButtonCargarCDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AplicarButtonCargarCDMouseReleased(evt);
            }
        });
        AplicarButtonCargarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AplicarButtonCargarCDActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoCargar.add(AplicarButtonCargarCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 220, 30));

        PanelEditar.add(PanelComisarioDeportivoCargar, "card5");

        PanelElegirModificar.setBackground(new java.awt.Color(51, 51, 51));
        PanelElegirModificar.setBorder(new javax.swing.border.MatteBorder(null));
        PanelElegirModificar.setMinimumSize(new java.awt.Dimension(957, 702));
        PanelElegirModificar.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelElegirModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoModificarElegir.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TextoModificarElegir.setForeground(new java.awt.Color(255, 255, 255));
        TextoModificarElegir.setText("Ingrese que quiere modificar ");
        PanelElegirModificar.add(TextoModificarElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        PilotoModificarButton.setBackground(new java.awt.Color(51, 51, 51));
        PilotoModificarButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        PilotoModificarButton.setForeground(new java.awt.Color(255, 255, 255));
        PilotoModificarButton.setText("Piloto");
        PilotoModificarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PilotoModificarButton.setContentAreaFilled(false);
        PilotoModificarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PilotoModificarButton.setFocusable(false);
        PilotoModificarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PilotoModificarButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PilotoModificarButtonMouseReleased(evt);
            }
        });
        PilotoModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilotoModificarButtonActionPerformed(evt);
            }
        });
        PanelElegirModificar.add(PilotoModificarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 220, 30));

        CDModificarButton.setBackground(new java.awt.Color(51, 51, 51));
        CDModificarButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        CDModificarButton.setForeground(new java.awt.Color(255, 255, 255));
        CDModificarButton.setText("Comisario deportivo");
        CDModificarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CDModificarButton.setContentAreaFilled(false);
        CDModificarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CDModificarButton.setFocusable(false);
        CDModificarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CDModificarButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CDModificarButtonMouseReleased(evt);
            }
        });
        CDModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDModificarButtonActionPerformed(evt);
            }
        });
        PanelElegirModificar.add(CDModificarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, 30));

        VolverButtonElegirModificar.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonElegirModificar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonElegirModificar.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonElegirModificar.setText("Volver");
        VolverButtonElegirModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonElegirModificar.setContentAreaFilled(false);
        VolverButtonElegirModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonElegirModificar.setFocusable(false);
        VolverButtonElegirModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonElegirModificarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonElegirModificarMouseReleased(evt);
            }
        });
        VolverButtonElegirModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonElegirModificarActionPerformed(evt);
            }
        });
        PanelElegirModificar.add(VolverButtonElegirModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        PanelEditar.add(PanelElegirModificar, "card7");

        PanelPilotoModificar.setBackground(new java.awt.Color(51, 51, 51));
        PanelPilotoModificar.setBorder(new javax.swing.border.MatteBorder(null));
        PanelPilotoModificar.setMinimumSize(new java.awt.Dimension(959, 800));
        PanelPilotoModificar.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelPilotoModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoDescripcionModificarPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoDescripcionModificarPiloto.setForeground(new java.awt.Color(255, 255, 255));
        TextoDescripcionModificarPiloto.setText("Ingrese el nombre y el apellido del piloto que desea modificar:");
        PanelPilotoModificar.add(TextoDescripcionModificarPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        TítuloModificarPiloto.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TítuloModificarPiloto.setForeground(new java.awt.Color(255, 255, 255));
        TítuloModificarPiloto.setText("Modificando un piloto");
        PanelPilotoModificar.add(TítuloModificarPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        TextoNombreB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoNombreB.setForeground(new java.awt.Color(255, 255, 255));
        TextoNombreB.setText("-Nombre: ");
        PanelPilotoModificar.add(TextoNombreB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        TextoApellidoB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoApellidoB.setForeground(new java.awt.Color(255, 255, 255));
        TextoApellidoB.setText("-Apellido:");
        PanelPilotoModificar.add(TextoApellidoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 82, -1));

        TextoRolB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoRolB.setForeground(new java.awt.Color(255, 255, 255));
        TextoRolB.setText("-Rol:");
        PanelPilotoModificar.add(TextoRolB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        TextoNumeroAutoB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoNumeroAutoB.setForeground(new java.awt.Color(255, 255, 255));
        TextoNumeroAutoB.setText("-Número de auto:");
        PanelPilotoModificar.add(TextoNumeroAutoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        TextoPuntosB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoPuntosB.setForeground(new java.awt.Color(255, 255, 255));
        TextoPuntosB.setText("-Puntos:");
        PanelPilotoModificar.add(TextoPuntosB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        TextoVueltasB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoVueltasB.setForeground(new java.awt.Color(255, 255, 255));
        TextoVueltasB.setText("-Vueltas rápidas:");
        PanelPilotoModificar.add(TextoVueltasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 120, -1));

        TextoPodiosB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoPodiosB.setForeground(new java.awt.Color(255, 255, 255));
        TextoPodiosB.setText("-Podios:");
        PanelPilotoModificar.add(TextoPodiosB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        TextoPenalizacionesB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoPenalizacionesB.setForeground(new java.awt.Color(255, 255, 255));
        TextoPenalizacionesB.setText("-Penalizaciones:");
        PanelPilotoModificar.add(TextoPenalizacionesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 125, -1));

        TextoPolesB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoPolesB.setForeground(new java.awt.Color(255, 255, 255));
        TextoPolesB.setText("-Poles:");
        PanelPilotoModificar.add(TextoPolesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        TextoAbandonosB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoAbandonosB.setForeground(new java.awt.Color(255, 255, 255));
        TextoAbandonosB.setText("-Abandonos:");
        PanelPilotoModificar.add(TextoAbandonosB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 105, -1));

        TextoBuscarNombrePiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoBuscarNombrePiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoBuscarNombrePilotoActionPerformed(evt);
            }
        });
        PanelPilotoModificar.add(TextoBuscarNombrePiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 220, 40));

        TextoBuscarApellidoPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoBuscarApellidoPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoBuscarApellidoPilotoActionPerformed(evt);
            }
        });
        PanelPilotoModificar.add(TextoBuscarApellidoPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 250, 40));

        TextoModificarNumeroAutoPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoModificarNumeroAutoPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoModificarNumeroAutoPilotoActionPerformed(evt);
            }
        });
        PanelPilotoModificar.add(TextoModificarNumeroAutoPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 286, 29));

        TextoModificarPolesPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoModificarPolesPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoModificarPolesPilotoActionPerformed(evt);
            }
        });
        PanelPilotoModificar.add(TextoModificarPolesPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 66, 29));

        TextoModificarPuntosPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoModificarPuntosPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoModificarPuntosPilotoActionPerformed(evt);
            }
        });
        PanelPilotoModificar.add(TextoModificarPuntosPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 65, 29));

        TextoModificarPodiosPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoModificarPodiosPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoModificarPodiosPilotoActionPerformed(evt);
            }
        });
        PanelPilotoModificar.add(TextoModificarPodiosPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 66, 29));

        TextoModificarAbandonoPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoModificarAbandonoPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoModificarAbandonoPilotoActionPerformed(evt);
            }
        });
        PanelPilotoModificar.add(TextoModificarAbandonoPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 70, 29));

        TextoModificarPenalizacionesPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoModificarPenalizacionesPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoModificarPenalizacionesPilotoActionPerformed(evt);
            }
        });
        PanelPilotoModificar.add(TextoModificarPenalizacionesPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 70, 29));

        TextoModificarVueltasPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoModificarVueltasPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoModificarVueltasPilotoActionPerformed(evt);
            }
        });
        PanelPilotoModificar.add(TextoModificarVueltasPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 70, 29));

        ListaModificarRolPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ListaModificarRolPiloto.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Titular", "Reserva", "Probador" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ScrollPanelRolB.setViewportView(ListaModificarRolPiloto);

        PanelPilotoModificar.add(ScrollPanelRolB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 100, 90));

        VolverButtonModificarPiloto.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonModificarPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonModificarPiloto.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonModificarPiloto.setText("Volver");
        VolverButtonModificarPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonModificarPiloto.setContentAreaFilled(false);
        VolverButtonModificarPiloto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonModificarPiloto.setFocusable(false);
        VolverButtonModificarPiloto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonModificarPilotoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonModificarPilotoMouseReleased(evt);
            }
        });
        VolverButtonModificarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonModificarPilotoActionPerformed(evt);
            }
        });
        PanelPilotoModificar.add(VolverButtonModificarPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        AplicarModificaciónPiloto.setBackground(new java.awt.Color(51, 51, 51));
        AplicarModificaciónPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        AplicarModificaciónPiloto.setForeground(new java.awt.Color(255, 255, 255));
        AplicarModificaciónPiloto.setText("Aplicar cambios");
        AplicarModificaciónPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AplicarModificaciónPiloto.setContentAreaFilled(false);
        AplicarModificaciónPiloto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AplicarModificaciónPiloto.setFocusable(false);
        AplicarModificaciónPiloto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AplicarModificaciónPilotoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AplicarModificaciónPilotoMouseReleased(evt);
            }
        });
        AplicarModificaciónPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AplicarModificaciónPilotoActionPerformed(evt);
            }
        });
        PanelPilotoModificar.add(AplicarModificaciónPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 220, 30));

        BuscarButtonPiloto.setBackground(new java.awt.Color(51, 51, 51));
        BuscarButtonPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        BuscarButtonPiloto.setForeground(new java.awt.Color(255, 255, 255));
        BuscarButtonPiloto.setText("Buscar en el programa");
        BuscarButtonPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BuscarButtonPiloto.setContentAreaFilled(false);
        BuscarButtonPiloto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarButtonPiloto.setFocusable(false);
        BuscarButtonPiloto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BuscarButtonPilotoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BuscarButtonPilotoMouseReleased(evt);
            }
        });
        BuscarButtonPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtonPilotoActionPerformed(evt);
            }
        });
        PanelPilotoModificar.add(BuscarButtonPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 220, 30));

        PanelEditar.add(PanelPilotoModificar, "card6");

        PanelComisarioDeportivoModificar.setBackground(new java.awt.Color(51, 51, 51));
        PanelComisarioDeportivoModificar.setBorder(new javax.swing.border.MatteBorder(null));
        PanelComisarioDeportivoModificar.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelComisarioDeportivoModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoSancionesb.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoSancionesb.setForeground(new java.awt.Color(255, 255, 255));
        TextoSancionesb.setText("-Sanciones aplicadas:");
        PanelComisarioDeportivoModificar.add(TextoSancionesb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, -1));

        TextoIntFIAb.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoIntFIAb.setForeground(new java.awt.Color(255, 255, 255));
        TextoIntFIAb.setText("-Internacional FIA:");
        PanelComisarioDeportivoModificar.add(TextoIntFIAb, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 150, 20));

        TituloModCD.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TituloModCD.setForeground(new java.awt.Color(255, 255, 255));
        TituloModCD.setText("Modificando un comisario deportivo:");
        PanelComisarioDeportivoModificar.add(TituloModCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        TextoNombreb.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoNombreb.setForeground(new java.awt.Color(255, 255, 255));
        TextoNombreb.setText("-Nombre:");
        PanelComisarioDeportivoModificar.add(TextoNombreb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        TextoApellidob.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoApellidob.setForeground(new java.awt.Color(255, 255, 255));
        TextoApellidob.setText("-Apellido:");
        PanelComisarioDeportivoModificar.add(TextoApellidob, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, 20));

        TextoDescripcionModificarCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoDescripcionModificarCD.setForeground(new java.awt.Color(255, 255, 255));
        TextoDescripcionModificarCD.setText("Ingrese el nombre  y el apellido del C.D. que desea modificar");
        PanelComisarioDeportivoModificar.add(TextoDescripcionModificarCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        TextoModificarSancionesCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoModificarSancionesCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoModificarSancionesCDActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoModificar.add(TextoModificarSancionesCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 97, 29));

        TextoNombreCDBuscar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoNombreCDBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNombreCDBuscarActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoModificar.add(TextoNombreCDBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 230, 40));

        TextoApellidoCDBuscar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoApellidoCDBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoApellidoCDBuscarActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoModificar.add(TextoApellidoCDBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 248, 40));

        VolverButtonCDModificar.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonCDModificar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonCDModificar.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonCDModificar.setText("Volver");
        VolverButtonCDModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonCDModificar.setContentAreaFilled(false);
        VolverButtonCDModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonCDModificar.setFocusable(false);
        VolverButtonCDModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonCDModificarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonCDModificarMouseReleased(evt);
            }
        });
        VolverButtonCDModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonCDModificarActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoModificar.add(VolverButtonCDModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        AplicarButtonModificarCD.setBackground(new java.awt.Color(51, 51, 51));
        AplicarButtonModificarCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        AplicarButtonModificarCD.setForeground(new java.awt.Color(255, 255, 255));
        AplicarButtonModificarCD.setText("Aplicar cambios");
        AplicarButtonModificarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AplicarButtonModificarCD.setContentAreaFilled(false);
        AplicarButtonModificarCD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AplicarButtonModificarCD.setFocusable(false);
        AplicarButtonModificarCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AplicarButtonModificarCDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AplicarButtonModificarCDMouseReleased(evt);
            }
        });
        AplicarButtonModificarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AplicarButtonModificarCDActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoModificar.add(AplicarButtonModificarCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 220, 30));

        BuscarCDModificarButton.setBackground(new java.awt.Color(51, 51, 51));
        BuscarCDModificarButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        BuscarCDModificarButton.setForeground(new java.awt.Color(255, 255, 255));
        BuscarCDModificarButton.setText("Buscar en el programa");
        BuscarCDModificarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BuscarCDModificarButton.setContentAreaFilled(false);
        BuscarCDModificarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarCDModificarButton.setFocusable(false);
        BuscarCDModificarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BuscarCDModificarButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BuscarCDModificarButtonMouseReleased(evt);
            }
        });
        BuscarCDModificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCDModificarButtonActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoModificar.add(BuscarCDModificarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 220, 30));

        CheckModificarFIACD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckModificarFIACDActionPerformed(evt);
            }
        });
        PanelComisarioDeportivoModificar.add(CheckModificarFIACD, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 30, 30));

        PanelEditar.add(PanelComisarioDeportivoModificar, "card8");

        PanelElegirEliminar.setBackground(new java.awt.Color(51, 51, 51));
        PanelElegirEliminar.setBorder(new javax.swing.border.MatteBorder(null));
        PanelElegirEliminar.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelElegirEliminar.setRequestFocusEnabled(false);
        PanelElegirEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloEliminarElegir.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TituloEliminarElegir.setForeground(new java.awt.Color(255, 255, 255));
        TituloEliminarElegir.setText("Ingrese que quiere eliminar ");
        PanelElegirEliminar.add(TituloEliminarElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        ButtonPilotoEliminarElegir.setBackground(new java.awt.Color(51, 51, 51));
        ButtonPilotoEliminarElegir.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonPilotoEliminarElegir.setForeground(new java.awt.Color(255, 255, 255));
        ButtonPilotoEliminarElegir.setText("Piloto");
        ButtonPilotoEliminarElegir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonPilotoEliminarElegir.setContentAreaFilled(false);
        ButtonPilotoEliminarElegir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonPilotoEliminarElegir.setFocusable(false);
        ButtonPilotoEliminarElegir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonPilotoEliminarElegirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonPilotoEliminarElegirMouseReleased(evt);
            }
        });
        ButtonPilotoEliminarElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPilotoEliminarElegirActionPerformed(evt);
            }
        });
        PanelElegirEliminar.add(ButtonPilotoEliminarElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 220, 30));

        ButtonCDEliminarElegir.setBackground(new java.awt.Color(51, 51, 51));
        ButtonCDEliminarElegir.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonCDEliminarElegir.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCDEliminarElegir.setText("Comisario deportivo");
        ButtonCDEliminarElegir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCDEliminarElegir.setContentAreaFilled(false);
        ButtonCDEliminarElegir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCDEliminarElegir.setFocusable(false);
        ButtonCDEliminarElegir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonCDEliminarElegirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonCDEliminarElegirMouseReleased(evt);
            }
        });
        ButtonCDEliminarElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCDEliminarElegirActionPerformed(evt);
            }
        });
        PanelElegirEliminar.add(ButtonCDEliminarElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, 30));

        VolverButtonElegirEliminar.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonElegirEliminar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonElegirEliminar.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonElegirEliminar.setText("Volver");
        VolverButtonElegirEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonElegirEliminar.setContentAreaFilled(false);
        VolverButtonElegirEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonElegirEliminar.setFocusable(false);
        VolverButtonElegirEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonElegirEliminarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonElegirEliminarMouseReleased(evt);
            }
        });
        VolverButtonElegirEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonElegirEliminarActionPerformed(evt);
            }
        });
        PanelElegirEliminar.add(VolverButtonElegirEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        PanelEditar.add(PanelElegirEliminar, "card9");

        PanelEliminarPiloto.setBackground(new java.awt.Color(51, 51, 51));
        PanelEliminarPiloto.setBorder(new javax.swing.border.MatteBorder(null));
        PanelEliminarPiloto.setMinimumSize(new java.awt.Dimension(959, 800));
        PanelEliminarPiloto.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelEliminarPiloto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoNombreC.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoNombreC.setForeground(new java.awt.Color(255, 255, 255));
        TextoNombreC.setText("-Nombre:");
        PanelEliminarPiloto.add(TextoNombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 103, -1, -1));

        DescripciónEliminarPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        DescripciónEliminarPiloto.setForeground(new java.awt.Color(255, 255, 255));
        DescripciónEliminarPiloto.setText("Ingrese el nombre  y el apellido del piloto que desea eliminar");
        PanelEliminarPiloto.add(DescripciónEliminarPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        TextoApellidoC.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoApellidoC.setForeground(new java.awt.Color(255, 255, 255));
        TextoApellidoC.setText("-Apellido:");
        PanelEliminarPiloto.add(TextoApellidoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        TítuloEliminarPiloto.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TítuloEliminarPiloto.setForeground(new java.awt.Color(255, 255, 255));
        TítuloEliminarPiloto.setText("Eliminando piloto");
        PanelEliminarPiloto.add(TítuloEliminarPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        TextoEliminarApellidoPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoEliminarApellidoPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoEliminarApellidoPilotoActionPerformed(evt);
            }
        });
        PanelEliminarPiloto.add(TextoEliminarApellidoPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 185, 40));

        TextoEliminarNombrePiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        PanelEliminarPiloto.add(TextoEliminarNombrePiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 197, 40));

        ButtonEliminarPiloto.setBackground(new java.awt.Color(51, 51, 51));
        ButtonEliminarPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonEliminarPiloto.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEliminarPiloto.setText("Eliminar del programa");
        ButtonEliminarPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonEliminarPiloto.setContentAreaFilled(false);
        ButtonEliminarPiloto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonEliminarPiloto.setFocusable(false);
        ButtonEliminarPiloto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonEliminarPilotoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonEliminarPilotoMouseReleased(evt);
            }
        });
        ButtonEliminarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarPilotoActionPerformed(evt);
            }
        });
        PanelEliminarPiloto.add(ButtonEliminarPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 220, 30));

        BuscarButtonPilotoEliminar.setBackground(new java.awt.Color(51, 51, 51));
        BuscarButtonPilotoEliminar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        BuscarButtonPilotoEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BuscarButtonPilotoEliminar.setText("Buscar en el programa");
        BuscarButtonPilotoEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BuscarButtonPilotoEliminar.setContentAreaFilled(false);
        BuscarButtonPilotoEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarButtonPilotoEliminar.setFocusable(false);
        BuscarButtonPilotoEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BuscarButtonPilotoEliminarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BuscarButtonPilotoEliminarMouseReleased(evt);
            }
        });
        BuscarButtonPilotoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtonPilotoEliminarActionPerformed(evt);
            }
        });
        PanelEliminarPiloto.add(BuscarButtonPilotoEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 220, 30));

        VolverButtonEliminarPiloto.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonEliminarPiloto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonEliminarPiloto.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonEliminarPiloto.setText("Volver");
        VolverButtonEliminarPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonEliminarPiloto.setContentAreaFilled(false);
        VolverButtonEliminarPiloto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonEliminarPiloto.setFocusable(false);
        VolverButtonEliminarPiloto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonEliminarPilotoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonEliminarPilotoMouseReleased(evt);
            }
        });
        VolverButtonEliminarPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonEliminarPilotoActionPerformed(evt);
            }
        });
        PanelEliminarPiloto.add(VolverButtonEliminarPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        PanelEditar.add(PanelEliminarPiloto, "card10");

        PanelEliminarComisarioDeportivo.setBackground(new java.awt.Color(51, 51, 51));
        PanelEliminarComisarioDeportivo.setBorder(new javax.swing.border.MatteBorder(null));
        PanelEliminarComisarioDeportivo.setMinimumSize(new java.awt.Dimension(959, 800));
        PanelEliminarComisarioDeportivo.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelEliminarComisarioDeportivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloEliminarCD.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TituloEliminarCD.setForeground(new java.awt.Color(255, 255, 255));
        TituloEliminarCD.setText("Eliminando comisario deportivo");
        PanelEliminarComisarioDeportivo.add(TituloEliminarCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        TextoNombrec.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoNombrec.setForeground(new java.awt.Color(255, 255, 255));
        TextoNombrec.setText("-Nombre:");
        PanelEliminarComisarioDeportivo.add(TextoNombrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 103, -1, -1));

        DescripciónEliminarCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        DescripciónEliminarCD.setForeground(new java.awt.Color(255, 255, 255));
        DescripciónEliminarCD.setText("Ingrese el nombre  y el apellido del C.D. que desea eliminar");
        PanelEliminarComisarioDeportivo.add(DescripciónEliminarCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 57, -1, -1));

        TextoApellidoc.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoApellidoc.setForeground(new java.awt.Color(255, 255, 255));
        TextoApellidoc.setText("-Apellido:");
        PanelEliminarComisarioDeportivo.add(TextoApellidoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        TextoEliminarApellidoCD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TextoEliminarApellidoCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoEliminarApellidoCDActionPerformed(evt);
            }
        });
        PanelEliminarComisarioDeportivo.add(TextoEliminarApellidoCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 185, 40));

        TextoEliminarNombreCD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PanelEliminarComisarioDeportivo.add(TextoEliminarNombreCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 197, 40));

        BuscarButtonEliminarCD.setBackground(new java.awt.Color(51, 51, 51));
        BuscarButtonEliminarCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        BuscarButtonEliminarCD.setForeground(new java.awt.Color(255, 255, 255));
        BuscarButtonEliminarCD.setText("Buscar en el programa");
        BuscarButtonEliminarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BuscarButtonEliminarCD.setContentAreaFilled(false);
        BuscarButtonEliminarCD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuscarButtonEliminarCD.setFocusable(false);
        BuscarButtonEliminarCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BuscarButtonEliminarCDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BuscarButtonEliminarCDMouseReleased(evt);
            }
        });
        BuscarButtonEliminarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtonEliminarCDActionPerformed(evt);
            }
        });
        PanelEliminarComisarioDeportivo.add(BuscarButtonEliminarCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 220, 30));

        EliminarButtonCD.setBackground(new java.awt.Color(51, 51, 51));
        EliminarButtonCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        EliminarButtonCD.setForeground(new java.awt.Color(255, 255, 255));
        EliminarButtonCD.setText("Eliminar del programa");
        EliminarButtonCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EliminarButtonCD.setContentAreaFilled(false);
        EliminarButtonCD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EliminarButtonCD.setFocusable(false);
        EliminarButtonCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EliminarButtonCDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EliminarButtonCDMouseReleased(evt);
            }
        });
        EliminarButtonCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarButtonCDActionPerformed(evt);
            }
        });
        PanelEliminarComisarioDeportivo.add(EliminarButtonCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 220, 30));

        VolverButtonEliminarCD.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonEliminarCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonEliminarCD.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonEliminarCD.setText("Volver");
        VolverButtonEliminarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonEliminarCD.setContentAreaFilled(false);
        VolverButtonEliminarCD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonEliminarCD.setFocusable(false);
        VolverButtonEliminarCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonEliminarCDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonEliminarCDMouseReleased(evt);
            }
        });
        VolverButtonEliminarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonEliminarCDActionPerformed(evt);
            }
        });
        PanelEliminarComisarioDeportivo.add(VolverButtonEliminarCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        PanelEditar.add(PanelEliminarComisarioDeportivo, "card11");

        PanelContenedor.add(PanelEditar, "card3");

        PanelInfo.setBackground(new java.awt.Color(51, 51, 51));
        PanelInfo.setBorder(new javax.swing.border.MatteBorder(null));
        PanelInfo.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelInfo.setLayout(new java.awt.CardLayout());

        PanelBotonesInformación.setBackground(new java.awt.Color(51, 51, 51));
        PanelBotonesInformación.setBorder(new javax.swing.border.MatteBorder(null));
        PanelBotonesInformación.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelBotonesInformación.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TítuloInformación.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TítuloInformación.setForeground(new java.awt.Color(255, 255, 255));
        TítuloInformación.setText("Información");
        PanelBotonesInformación.add(TítuloInformación, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        ButtonInfoEquipos.setBackground(new java.awt.Color(51, 51, 51));
        ButtonInfoEquipos.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonInfoEquipos.setForeground(new java.awt.Color(255, 255, 255));
        ButtonInfoEquipos.setText("Equipos");
        ButtonInfoEquipos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonInfoEquipos.setContentAreaFilled(false);
        ButtonInfoEquipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonInfoEquipos.setFocusable(false);
        ButtonInfoEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonInfoEquiposMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonInfoEquiposMouseReleased(evt);
            }
        });
        ButtonInfoEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInfoEquiposActionPerformed(evt);
            }
        });
        PanelBotonesInformación.add(ButtonInfoEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, 30));

        ButtonInfoCD.setBackground(new java.awt.Color(51, 51, 51));
        ButtonInfoCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonInfoCD.setForeground(new java.awt.Color(255, 255, 255));
        ButtonInfoCD.setText("Comisarios Deportivos");
        ButtonInfoCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonInfoCD.setContentAreaFilled(false);
        ButtonInfoCD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonInfoCD.setFocusable(false);
        ButtonInfoCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonInfoCDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonInfoCDMouseReleased(evt);
            }
        });
        ButtonInfoCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInfoCDActionPerformed(evt);
            }
        });
        PanelBotonesInformación.add(ButtonInfoCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 220, 30));

        ButtonInfoPilotos.setBackground(new java.awt.Color(51, 51, 51));
        ButtonInfoPilotos.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonInfoPilotos.setForeground(new java.awt.Color(255, 255, 255));
        ButtonInfoPilotos.setText("Pilotos");
        ButtonInfoPilotos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonInfoPilotos.setContentAreaFilled(false);
        ButtonInfoPilotos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonInfoPilotos.setFocusable(false);
        ButtonInfoPilotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonInfoPilotosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonInfoPilotosMouseReleased(evt);
            }
        });
        ButtonInfoPilotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInfoPilotosActionPerformed(evt);
            }
        });
        PanelBotonesInformación.add(ButtonInfoPilotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 220, 30));

        PanelInfo.add(PanelBotonesInformación, "card5");

        PanelMostrarEquipos.setBackground(new java.awt.Color(51, 51, 51));
        PanelMostrarEquipos.setBorder(new javax.swing.border.MatteBorder(null));
        PanelMostrarEquipos.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelMostrarEquipos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonEquipos.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        ButtonEquipos.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEquipos.setText("Equipos");
        PanelMostrarEquipos.add(ButtonEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        ButtonSony.setBackground(new java.awt.Color(51, 51, 51));
        ButtonSony.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonSony.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSony.setText("Sony");
        ButtonSony.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonSony.setContentAreaFilled(false);
        ButtonSony.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonSony.setFocusable(false);
        ButtonSony.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonSonyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonSonyMouseReleased(evt);
            }
        });
        ButtonSony.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSonyActionPerformed(evt);
            }
        });
        PanelMostrarEquipos.add(ButtonSony, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, 30));

        ButtonNintendo.setBackground(new java.awt.Color(51, 51, 51));
        ButtonNintendo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonNintendo.setForeground(new java.awt.Color(255, 255, 255));
        ButtonNintendo.setText("Nintendo");
        ButtonNintendo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonNintendo.setContentAreaFilled(false);
        ButtonNintendo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonNintendo.setFocusable(false);
        ButtonNintendo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonNintendoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonNintendoMouseReleased(evt);
            }
        });
        ButtonNintendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNintendoActionPerformed(evt);
            }
        });
        PanelMostrarEquipos.add(ButtonNintendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 220, 30));

        ButtonBandai.setBackground(new java.awt.Color(51, 51, 51));
        ButtonBandai.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonBandai.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBandai.setText("Bandai");
        ButtonBandai.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonBandai.setContentAreaFilled(false);
        ButtonBandai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonBandai.setFocusable(false);
        ButtonBandai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonBandaiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonBandaiMouseReleased(evt);
            }
        });
        ButtonBandai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBandaiActionPerformed(evt);
            }
        });
        PanelMostrarEquipos.add(ButtonBandai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 220, 30));

        ButtonSega.setBackground(new java.awt.Color(51, 51, 51));
        ButtonSega.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonSega.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSega.setText("Sega");
        ButtonSega.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonSega.setContentAreaFilled(false);
        ButtonSega.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonSega.setFocusable(false);
        ButtonSega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonSegaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonSegaMouseReleased(evt);
            }
        });
        ButtonSega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSegaActionPerformed(evt);
            }
        });
        PanelMostrarEquipos.add(ButtonSega, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 220, 30));

        ButtonVocaloid.setBackground(new java.awt.Color(51, 51, 51));
        ButtonVocaloid.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonVocaloid.setForeground(new java.awt.Color(255, 255, 255));
        ButtonVocaloid.setText("Vocaloid");
        ButtonVocaloid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonVocaloid.setContentAreaFilled(false);
        ButtonVocaloid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonVocaloid.setFocusable(false);
        ButtonVocaloid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonVocaloidMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonVocaloidMouseReleased(evt);
            }
        });
        ButtonVocaloid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVocaloidActionPerformed(evt);
            }
        });
        PanelMostrarEquipos.add(ButtonVocaloid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 220, 30));

        ButtonRetro.setBackground(new java.awt.Color(51, 51, 51));
        ButtonRetro.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonRetro.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRetro.setText("Retro");
        ButtonRetro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonRetro.setContentAreaFilled(false);
        ButtonRetro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonRetro.setFocusable(false);
        ButtonRetro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonRetroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonRetroMouseReleased(evt);
            }
        });
        ButtonRetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRetroActionPerformed(evt);
            }
        });
        PanelMostrarEquipos.add(ButtonRetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, 30));

        ButtonUbisoft.setBackground(new java.awt.Color(51, 51, 51));
        ButtonUbisoft.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonUbisoft.setForeground(new java.awt.Color(255, 255, 255));
        ButtonUbisoft.setText("Ubisoft");
        ButtonUbisoft.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonUbisoft.setContentAreaFilled(false);
        ButtonUbisoft.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonUbisoft.setFocusable(false);
        ButtonUbisoft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonUbisoftMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonUbisoftMouseReleased(evt);
            }
        });
        ButtonUbisoft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUbisoftActionPerformed(evt);
            }
        });
        PanelMostrarEquipos.add(ButtonUbisoft, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 220, 30));

        ButtonCapcom.setBackground(new java.awt.Color(51, 51, 51));
        ButtonCapcom.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonCapcom.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCapcom.setText("Capcom");
        ButtonCapcom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCapcom.setContentAreaFilled(false);
        ButtonCapcom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCapcom.setFocusable(false);
        ButtonCapcom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonCapcomMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonCapcomMouseReleased(evt);
            }
        });
        ButtonCapcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCapcomActionPerformed(evt);
            }
        });
        PanelMostrarEquipos.add(ButtonCapcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 220, 30));

        ButtonCartoon.setBackground(new java.awt.Color(51, 51, 51));
        ButtonCartoon.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonCartoon.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCartoon.setText("Cartoon");
        ButtonCartoon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonCartoon.setContentAreaFilled(false);
        ButtonCartoon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCartoon.setFocusable(false);
        ButtonCartoon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonCartoonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonCartoonMouseReleased(evt);
            }
        });
        ButtonCartoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCartoonActionPerformed(evt);
            }
        });
        PanelMostrarEquipos.add(ButtonCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 220, 30));

        ButtonIndie.setBackground(new java.awt.Color(51, 51, 51));
        ButtonIndie.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonIndie.setForeground(new java.awt.Color(255, 255, 255));
        ButtonIndie.setText("Indie");
        ButtonIndie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonIndie.setContentAreaFilled(false);
        ButtonIndie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonIndie.setFocusable(false);
        ButtonIndie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonIndieMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonIndieMouseReleased(evt);
            }
        });
        ButtonIndie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIndieActionPerformed(evt);
            }
        });
        PanelMostrarEquipos.add(ButtonIndie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 220, 30));

        VolverButtonMostrarEquipos.setBackground(new java.awt.Color(55, 55, 55));
        VolverButtonMostrarEquipos.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonMostrarEquipos.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonMostrarEquipos.setText("Volver");
        VolverButtonMostrarEquipos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonMostrarEquipos.setContentAreaFilled(false);
        VolverButtonMostrarEquipos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                VolverButtonMostrarEquiposMouseMoved(evt);
            }
        });
        VolverButtonMostrarEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonMostrarEquiposMousePressed(evt);
            }
        });
        VolverButtonMostrarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonMostrarEquiposActionPerformed(evt);
            }
        });
        PanelMostrarEquipos.add(VolverButtonMostrarEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        Texto_cant_sony.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Texto_cant_sony.setForeground(new java.awt.Color(255, 255, 255));
        Texto_cant_sony.setText("Cantidad de pilotos:");
        PanelMostrarEquipos.add(Texto_cant_sony, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, 30));

        Texto_cant_Nintendo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Texto_cant_Nintendo.setForeground(new java.awt.Color(255, 255, 255));
        Texto_cant_Nintendo.setText("Cantidad de pilotos:");
        PanelMostrarEquipos.add(Texto_cant_Nintendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, 30));

        Texto_cant_Retro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Texto_cant_Retro.setForeground(new java.awt.Color(255, 255, 255));
        Texto_cant_Retro.setText("Cantidad de pilotos:");
        PanelMostrarEquipos.add(Texto_cant_Retro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, 30));

        Texto_cant_Capcom.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Texto_cant_Capcom.setForeground(new java.awt.Color(255, 255, 255));
        Texto_cant_Capcom.setText("Cantidad de pilotos:");
        PanelMostrarEquipos.add(Texto_cant_Capcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, 30));

        Texto_cant_Cartoon.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Texto_cant_Cartoon.setForeground(new java.awt.Color(255, 255, 255));
        Texto_cant_Cartoon.setText("Cantidad de pilotos:");
        PanelMostrarEquipos.add(Texto_cant_Cartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, 30));

        Texto_cant_Vocaloid.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Texto_cant_Vocaloid.setForeground(new java.awt.Color(255, 255, 255));
        Texto_cant_Vocaloid.setText("Cantidad de pilotos:");
        PanelMostrarEquipos.add(Texto_cant_Vocaloid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, 30));

        Texto_cant_Sega.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Texto_cant_Sega.setForeground(new java.awt.Color(255, 255, 255));
        Texto_cant_Sega.setText("Cantidad de pilotos:");
        PanelMostrarEquipos.add(Texto_cant_Sega, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, 30));

        Texto_cant_Indie.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Texto_cant_Indie.setForeground(new java.awt.Color(255, 255, 255));
        Texto_cant_Indie.setText("Cantidad de pilotos:");
        PanelMostrarEquipos.add(Texto_cant_Indie, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, 30));

        Texto_cant_Ubisoft.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Texto_cant_Ubisoft.setForeground(new java.awt.Color(255, 255, 255));
        Texto_cant_Ubisoft.setText("Cantidad de pilotos:");
        PanelMostrarEquipos.add(Texto_cant_Ubisoft, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, 30));

        Texto_cant_Bandai.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Texto_cant_Bandai.setForeground(new java.awt.Color(255, 255, 255));
        Texto_cant_Bandai.setText("Cantidad de pilotos:");
        PanelMostrarEquipos.add(Texto_cant_Bandai, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, 30));

        Texto_Cant_Pil_Sony.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Texto_Cant_Pil_Sony.setForeground(new java.awt.Color(255, 255, 255));
        PanelMostrarEquipos.add(Texto_Cant_Pil_Sony, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 40, 30));

        Texto_Cant_Pil_Nintendo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Texto_Cant_Pil_Nintendo.setForeground(new java.awt.Color(255, 255, 255));
        PanelMostrarEquipos.add(Texto_Cant_Pil_Nintendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 40, 30));

        Texto_Cant_Pil_Retro.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Texto_Cant_Pil_Retro.setForeground(new java.awt.Color(255, 255, 255));
        PanelMostrarEquipos.add(Texto_Cant_Pil_Retro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 40, 30));

        Texto_Cant_Pil_Capcom.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Texto_Cant_Pil_Capcom.setForeground(new java.awt.Color(255, 255, 255));
        PanelMostrarEquipos.add(Texto_Cant_Pil_Capcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 40, 30));

        Texto_Cant_Pil_Cartoon.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Texto_Cant_Pil_Cartoon.setForeground(new java.awt.Color(255, 255, 255));
        PanelMostrarEquipos.add(Texto_Cant_Pil_Cartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 40, 30));

        Texto_Cant_Pil_Vocaloid.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Texto_Cant_Pil_Vocaloid.setForeground(new java.awt.Color(255, 255, 255));
        PanelMostrarEquipos.add(Texto_Cant_Pil_Vocaloid, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 40, 30));

        Texto_Cant_Pil_Sega.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Texto_Cant_Pil_Sega.setForeground(new java.awt.Color(255, 255, 255));
        PanelMostrarEquipos.add(Texto_Cant_Pil_Sega, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 40, 30));

        Texto_Cant_Pil_Indie.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Texto_Cant_Pil_Indie.setForeground(new java.awt.Color(255, 255, 255));
        PanelMostrarEquipos.add(Texto_Cant_Pil_Indie, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 40, 30));

        Texto_Cant_Pil_Ubisoft.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Texto_Cant_Pil_Ubisoft.setForeground(new java.awt.Color(255, 255, 255));
        PanelMostrarEquipos.add(Texto_Cant_Pil_Ubisoft, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 40, 30));

        Texto_Cant_Pil_Bandai.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Texto_Cant_Pil_Bandai.setForeground(new java.awt.Color(255, 255, 255));
        PanelMostrarEquipos.add(Texto_Cant_Pil_Bandai, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 40, 30));

        PanelInfo.add(PanelMostrarEquipos, "card3");

        PanelSony.setBackground(new java.awt.Color(51, 51, 51));
        PanelSony.setBorder(new javax.swing.border.MatteBorder(null));
        PanelSony.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelSony.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TítuloSony.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TítuloSony.setForeground(new java.awt.Color(255, 255, 255));
        TítuloSony.setText("Equipo Sony");
        PanelSony.add(TítuloSony, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 50));

        VolverButtonSony.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonSony.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonSony.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonSony.setText("Volver");
        VolverButtonSony.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonSony.setContentAreaFilled(false);
        VolverButtonSony.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonSony.setFocusable(false);
        VolverButtonSony.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonSonyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonSonyMouseReleased(evt);
            }
        });
        VolverButtonSony.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonSonyActionPerformed(evt);
            }
        });
        PanelSony.add(VolverButtonSony, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        ScrollPanelSony.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ScrollPanelSony.setPreferredSize(new java.awt.Dimension(150, 280));

        ListaSony.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListaSony.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Fecha de nacimiento", "Nacionalidad", "Número de auto", "Equipo", "Rol", "Puntos", "Podios", "Poles", "Vueltas rápidas", "Penalizaciones", "Abandonos", "Licencia FIA"
            }
        ));
        ListaSony.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        ListaSony.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ScrollPanelSony.setViewportView(ListaSony);
        if (ListaSony.getColumnModel().getColumnCount() > 0) {
            ListaSony.getColumnModel().getColumn(2).setPreferredWidth(130);
            ListaSony.getColumnModel().getColumn(3).setPreferredWidth(100);
            ListaSony.getColumnModel().getColumn(4).setPreferredWidth(110);
            ListaSony.getColumnModel().getColumn(10).setPreferredWidth(130);
            ListaSony.getColumnModel().getColumn(11).setPreferredWidth(120);
            ListaSony.getColumnModel().getColumn(13).setPreferredWidth(110);
        }

        PanelSony.add(ScrollPanelSony, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 110));

        PanelInfo.add(PanelSony, "card4");

        PanelNintendo.setBackground(new java.awt.Color(51, 51, 51));
        PanelNintendo.setBorder(new javax.swing.border.MatteBorder(null));
        PanelNintendo.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelNintendo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TítuloNintendo.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TítuloNintendo.setForeground(new java.awt.Color(255, 255, 255));
        TítuloNintendo.setText("Equipo Nintendo");
        PanelNintendo.add(TítuloNintendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 50));

        VolverButtonNintendo.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonNintendo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonNintendo.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonNintendo.setText("Volver");
        VolverButtonNintendo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonNintendo.setContentAreaFilled(false);
        VolverButtonNintendo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonNintendo.setFocusable(false);
        VolverButtonNintendo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonNintendoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonNintendoMouseReleased(evt);
            }
        });
        VolverButtonNintendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonNintendoActionPerformed(evt);
            }
        });
        PanelNintendo.add(VolverButtonNintendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        ScrollPanelNintendo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ScrollPanelNintendo.setPreferredSize(new java.awt.Dimension(150, 280));

        ListaNintendo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListaNintendo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Fecha de nacimiento", "Nacionalidad", "Número de auto", "Equipo", "Rol", "Puntos", "Podios", "Poles", "Vueltas rápidas", "Penalizaciones", "Abandonos", "Licencia FIA"
            }
        ));
        ListaNintendo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        ListaNintendo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ScrollPanelNintendo.setViewportView(ListaNintendo);
        if (ListaNintendo.getColumnModel().getColumnCount() > 0) {
            ListaNintendo.getColumnModel().getColumn(2).setPreferredWidth(130);
            ListaNintendo.getColumnModel().getColumn(3).setPreferredWidth(100);
            ListaNintendo.getColumnModel().getColumn(4).setPreferredWidth(110);
            ListaNintendo.getColumnModel().getColumn(10).setPreferredWidth(130);
            ListaNintendo.getColumnModel().getColumn(11).setPreferredWidth(120);
            ListaNintendo.getColumnModel().getColumn(13).setPreferredWidth(110);
        }

        PanelNintendo.add(ScrollPanelNintendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 110));

        PanelInfo.add(PanelNintendo, "card4");

        PanelSega.setBackground(new java.awt.Color(51, 51, 51));
        PanelSega.setBorder(new javax.swing.border.MatteBorder(null));
        PanelSega.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelSega.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TítuloSega.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TítuloSega.setForeground(new java.awt.Color(255, 255, 255));
        TítuloSega.setText("Equipo Sega");
        PanelSega.add(TítuloSega, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 50));

        VolverButtonSega.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonSega.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonSega.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonSega.setText("Volver");
        VolverButtonSega.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonSega.setContentAreaFilled(false);
        VolverButtonSega.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonSega.setFocusable(false);
        VolverButtonSega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonSegaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonSegaMouseReleased(evt);
            }
        });
        VolverButtonSega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonSegaActionPerformed(evt);
            }
        });
        PanelSega.add(VolverButtonSega, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        ScrollPanelSega.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ScrollPanelSega.setPreferredSize(new java.awt.Dimension(150, 280));

        ListaSega.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListaSega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Fecha de nacimiento", "Nacionalidad", "Número de auto", "Equipo", "Rol", "Puntos", "Podios", "Poles", "Vueltas rápidas", "Penalizaciones", "Abandonos", "Licencia FIA"
            }
        ));
        ListaSega.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        ListaSega.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ScrollPanelSega.setViewportView(ListaSega);
        if (ListaSega.getColumnModel().getColumnCount() > 0) {
            ListaSega.getColumnModel().getColumn(2).setPreferredWidth(130);
            ListaSega.getColumnModel().getColumn(3).setPreferredWidth(100);
            ListaSega.getColumnModel().getColumn(4).setPreferredWidth(110);
            ListaSega.getColumnModel().getColumn(10).setPreferredWidth(130);
            ListaSega.getColumnModel().getColumn(11).setPreferredWidth(120);
            ListaSega.getColumnModel().getColumn(13).setPreferredWidth(110);
        }

        PanelSega.add(ScrollPanelSega, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 110));

        PanelInfo.add(PanelSega, "card4");

        PanelBandai.setBackground(new java.awt.Color(51, 51, 51));
        PanelBandai.setBorder(new javax.swing.border.MatteBorder(null));
        PanelBandai.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelBandai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TítuloBandai.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TítuloBandai.setForeground(new java.awt.Color(255, 255, 255));
        TítuloBandai.setText("Equipo Bandai");
        PanelBandai.add(TítuloBandai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 50));

        VolverButtonBandai.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonBandai.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonBandai.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonBandai.setText("Volver");
        VolverButtonBandai.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonBandai.setContentAreaFilled(false);
        VolverButtonBandai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonBandai.setFocusable(false);
        VolverButtonBandai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonBandaiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonBandaiMouseReleased(evt);
            }
        });
        VolverButtonBandai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonBandaiActionPerformed(evt);
            }
        });
        PanelBandai.add(VolverButtonBandai, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        ScrollPanelBandai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ScrollPanelBandai.setPreferredSize(new java.awt.Dimension(150, 280));

        ListaBandai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListaBandai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Fecha de nacimiento", "Nacionalidad", "Número de auto", "Equipo", "Rol", "Puntos", "Podios", "Poles", "Vueltas rápidas", "Penalizaciones", "Abandonos", "Licencia FIA"
            }
        ));
        ListaBandai.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        ListaBandai.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ScrollPanelBandai.setViewportView(ListaBandai);
        if (ListaBandai.getColumnModel().getColumnCount() > 0) {
            ListaBandai.getColumnModel().getColumn(2).setPreferredWidth(130);
            ListaBandai.getColumnModel().getColumn(3).setPreferredWidth(100);
            ListaBandai.getColumnModel().getColumn(4).setPreferredWidth(110);
            ListaBandai.getColumnModel().getColumn(10).setPreferredWidth(130);
            ListaBandai.getColumnModel().getColumn(11).setPreferredWidth(120);
            ListaBandai.getColumnModel().getColumn(13).setPreferredWidth(110);
        }

        PanelBandai.add(ScrollPanelBandai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 110));

        PanelInfo.add(PanelBandai, "card4");

        PanelRetro.setBackground(new java.awt.Color(51, 51, 51));
        PanelRetro.setBorder(new javax.swing.border.MatteBorder(null));
        PanelRetro.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelRetro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TítuloRetro.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TítuloRetro.setForeground(new java.awt.Color(255, 255, 255));
        TítuloRetro.setText("Equipo Retro");
        PanelRetro.add(TítuloRetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 50));

        VolverButtonRetro.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonRetro.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonRetro.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonRetro.setText("Volver");
        VolverButtonRetro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonRetro.setContentAreaFilled(false);
        VolverButtonRetro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonRetro.setFocusable(false);
        VolverButtonRetro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonRetroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonRetroMouseReleased(evt);
            }
        });
        VolverButtonRetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonRetroActionPerformed(evt);
            }
        });
        PanelRetro.add(VolverButtonRetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        ScrollPanelRetro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ScrollPanelRetro.setPreferredSize(new java.awt.Dimension(150, 280));

        ListaRetro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListaRetro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Fecha de nacimiento", "Nacionalidad", "Número de auto", "Equipo", "Rol", "Puntos", "Podios", "Poles", "Vueltas rápidas", "Penalizaciones", "Abandonos", "Licencia FIA"
            }
        ));
        ListaRetro.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        ListaRetro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ScrollPanelRetro.setViewportView(ListaRetro);
        if (ListaRetro.getColumnModel().getColumnCount() > 0) {
            ListaRetro.getColumnModel().getColumn(2).setPreferredWidth(130);
            ListaRetro.getColumnModel().getColumn(3).setPreferredWidth(100);
            ListaRetro.getColumnModel().getColumn(4).setPreferredWidth(110);
            ListaRetro.getColumnModel().getColumn(10).setPreferredWidth(130);
            ListaRetro.getColumnModel().getColumn(11).setPreferredWidth(120);
            ListaRetro.getColumnModel().getColumn(13).setPreferredWidth(110);
        }

        PanelRetro.add(ScrollPanelRetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 110));

        PanelInfo.add(PanelRetro, "card4");

        PanelVocaloid.setBackground(new java.awt.Color(51, 51, 51));
        PanelVocaloid.setBorder(new javax.swing.border.MatteBorder(null));
        PanelVocaloid.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelVocaloid.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TítuloVocaloid.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TítuloVocaloid.setForeground(new java.awt.Color(255, 255, 255));
        TítuloVocaloid.setText("Equipo Vocaloid");
        PanelVocaloid.add(TítuloVocaloid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 50));

        VolverButtonVocaloid.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonVocaloid.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonVocaloid.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonVocaloid.setText("Volver");
        VolverButtonVocaloid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonVocaloid.setContentAreaFilled(false);
        VolverButtonVocaloid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonVocaloid.setFocusable(false);
        VolverButtonVocaloid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonVocaloidMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonVocaloidMouseReleased(evt);
            }
        });
        VolverButtonVocaloid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonVocaloidActionPerformed(evt);
            }
        });
        PanelVocaloid.add(VolverButtonVocaloid, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        ScrollPanelVocaloid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ScrollPanelVocaloid.setPreferredSize(new java.awt.Dimension(150, 280));

        ListaVocaloid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListaVocaloid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Fecha de nacimiento", "Nacionalidad", "Número de auto", "Equipo", "Rol", "Puntos", "Podios", "Poles", "Vueltas rápidas", "Penalizaciones", "Abandonos", "Licencia FIA"
            }
        ));
        ListaVocaloid.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        ListaVocaloid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ScrollPanelVocaloid.setViewportView(ListaVocaloid);
        if (ListaVocaloid.getColumnModel().getColumnCount() > 0) {
            ListaVocaloid.getColumnModel().getColumn(2).setPreferredWidth(130);
            ListaVocaloid.getColumnModel().getColumn(3).setPreferredWidth(100);
            ListaVocaloid.getColumnModel().getColumn(4).setPreferredWidth(110);
            ListaVocaloid.getColumnModel().getColumn(10).setPreferredWidth(130);
            ListaVocaloid.getColumnModel().getColumn(11).setPreferredWidth(120);
            ListaVocaloid.getColumnModel().getColumn(13).setPreferredWidth(110);
        }

        PanelVocaloid.add(ScrollPanelVocaloid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 110));

        PanelInfo.add(PanelVocaloid, "card4");

        PanelCapcom.setBackground(new java.awt.Color(51, 51, 51));
        PanelCapcom.setBorder(new javax.swing.border.MatteBorder(null));
        PanelCapcom.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelCapcom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TítuloCapcom.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TítuloCapcom.setForeground(new java.awt.Color(255, 255, 255));
        TítuloCapcom.setText("Equipo Capcom");
        PanelCapcom.add(TítuloCapcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 50));

        VolverButtonCapcom.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonCapcom.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonCapcom.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonCapcom.setText("Volver");
        VolverButtonCapcom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonCapcom.setContentAreaFilled(false);
        VolverButtonCapcom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonCapcom.setFocusable(false);
        VolverButtonCapcom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonCapcomMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonCapcomMouseReleased(evt);
            }
        });
        VolverButtonCapcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonCapcomActionPerformed(evt);
            }
        });
        PanelCapcom.add(VolverButtonCapcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        ScrollPanelCapcom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ScrollPanelCapcom.setPreferredSize(new java.awt.Dimension(150, 280));

        ListaCapcom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListaCapcom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Fecha de nacimiento", "Nacionalidad", "Número de auto", "Equipo", "Rol", "Puntos", "Podios", "Poles", "Vueltas rápidas", "Penalizaciones", "Abandonos", "Licencia FIA"
            }
        ));
        ListaCapcom.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        ListaCapcom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ScrollPanelCapcom.setViewportView(ListaCapcom);
        if (ListaCapcom.getColumnModel().getColumnCount() > 0) {
            ListaCapcom.getColumnModel().getColumn(2).setPreferredWidth(130);
            ListaCapcom.getColumnModel().getColumn(3).setPreferredWidth(100);
            ListaCapcom.getColumnModel().getColumn(4).setPreferredWidth(110);
            ListaCapcom.getColumnModel().getColumn(10).setPreferredWidth(130);
            ListaCapcom.getColumnModel().getColumn(11).setPreferredWidth(120);
            ListaCapcom.getColumnModel().getColumn(13).setPreferredWidth(110);
        }

        PanelCapcom.add(ScrollPanelCapcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 110));

        PanelInfo.add(PanelCapcom, "card4");

        PanelUbisoft.setBackground(new java.awt.Color(51, 51, 51));
        PanelUbisoft.setBorder(new javax.swing.border.MatteBorder(null));
        PanelUbisoft.setMinimumSize(new java.awt.Dimension(680, 499));
        PanelUbisoft.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelUbisoft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TítuloUbisoft.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TítuloUbisoft.setForeground(new java.awt.Color(255, 255, 255));
        TítuloUbisoft.setText("Equipo Ubisoft");
        PanelUbisoft.add(TítuloUbisoft, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 50));

        VolverButtonSony7.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonSony7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonSony7.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonSony7.setText("Volver");
        VolverButtonSony7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonSony7.setContentAreaFilled(false);
        VolverButtonSony7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonSony7.setFocusable(false);
        VolverButtonSony7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonSony7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonSony7MouseReleased(evt);
            }
        });
        VolverButtonSony7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonSony7ActionPerformed(evt);
            }
        });
        PanelUbisoft.add(VolverButtonSony7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        ScrollPanelUbisoft.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ScrollPanelUbisoft.setPreferredSize(new java.awt.Dimension(150, 280));

        ListaUbisoft.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListaUbisoft.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Fecha de nacimiento", "Nacionalidad", "Número de auto", "Equipo", "Rol", "Puntos", "Podios", "Poles", "Vueltas rápidas", "Penalizaciones", "Abandonos", "Licencia FIA"
            }
        ));
        ListaUbisoft.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        ListaUbisoft.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ScrollPanelUbisoft.setViewportView(ListaUbisoft);
        if (ListaUbisoft.getColumnModel().getColumnCount() > 0) {
            ListaUbisoft.getColumnModel().getColumn(2).setPreferredWidth(130);
            ListaUbisoft.getColumnModel().getColumn(3).setPreferredWidth(100);
            ListaUbisoft.getColumnModel().getColumn(4).setPreferredWidth(110);
            ListaUbisoft.getColumnModel().getColumn(10).setPreferredWidth(130);
            ListaUbisoft.getColumnModel().getColumn(11).setPreferredWidth(120);
            ListaUbisoft.getColumnModel().getColumn(13).setPreferredWidth(110);
        }

        PanelUbisoft.add(ScrollPanelUbisoft, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 110));

        PanelInfo.add(PanelUbisoft, "card4");

        PanelIndie.setBackground(new java.awt.Color(51, 51, 51));
        PanelIndie.setBorder(new javax.swing.border.MatteBorder(null));
        PanelIndie.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelIndie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TítuloIndie.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TítuloIndie.setForeground(new java.awt.Color(255, 255, 255));
        TítuloIndie.setText("Equipo Indie");
        PanelIndie.add(TítuloIndie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 50));

        VolverButtonIndie.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonIndie.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonIndie.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonIndie.setText("Volver");
        VolverButtonIndie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonIndie.setContentAreaFilled(false);
        VolverButtonIndie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonIndie.setFocusable(false);
        VolverButtonIndie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonIndieMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonIndieMouseReleased(evt);
            }
        });
        VolverButtonIndie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonIndieActionPerformed(evt);
            }
        });
        PanelIndie.add(VolverButtonIndie, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        ScrollPanelIndie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ScrollPanelIndie.setPreferredSize(new java.awt.Dimension(150, 280));

        ListaIndie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListaIndie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Fecha de nacimiento", "Nacionalidad", "Número de auto", "Equipo", "Rol", "Puntos", "Podios", "Poles", "Vueltas rápidas", "Penalizaciones", "Abandonos", "Licencia FIA"
            }
        ));
        ListaIndie.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        ListaIndie.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ScrollPanelIndie.setViewportView(ListaIndie);
        if (ListaIndie.getColumnModel().getColumnCount() > 0) {
            ListaIndie.getColumnModel().getColumn(2).setPreferredWidth(130);
            ListaIndie.getColumnModel().getColumn(3).setPreferredWidth(100);
            ListaIndie.getColumnModel().getColumn(4).setPreferredWidth(110);
            ListaIndie.getColumnModel().getColumn(10).setPreferredWidth(130);
            ListaIndie.getColumnModel().getColumn(11).setPreferredWidth(120);
            ListaIndie.getColumnModel().getColumn(13).setPreferredWidth(110);
        }

        PanelIndie.add(ScrollPanelIndie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 110));

        PanelInfo.add(PanelIndie, "card4");

        PanelCartoon.setBackground(new java.awt.Color(51, 51, 51));
        PanelCartoon.setBorder(new javax.swing.border.MatteBorder(null));
        PanelCartoon.setMinimumSize(new java.awt.Dimension(680, 499));
        PanelCartoon.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelCartoon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TítuloSony8.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TítuloSony8.setForeground(new java.awt.Color(255, 255, 255));
        TítuloSony8.setText("Equipo Cartoon");
        PanelCartoon.add(TítuloSony8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 50));

        VolverButtonCartoon.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonCartoon.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonCartoon.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonCartoon.setText("Volver");
        VolverButtonCartoon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonCartoon.setContentAreaFilled(false);
        VolverButtonCartoon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonCartoon.setFocusable(false);
        VolverButtonCartoon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonCartoonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonCartoonMouseReleased(evt);
            }
        });
        VolverButtonCartoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonCartoonActionPerformed(evt);
            }
        });
        PanelCartoon.add(VolverButtonCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        ScrollPanelCartoon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ScrollPanelCartoon.setPreferredSize(new java.awt.Dimension(150, 280));

        ListaCartoon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListaCartoon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Fecha de nacimiento", "Nacionalidad", "Número de auto", "Equipo", "Rol", "Puntos", "Podios", "Poles", "Vueltas rápidas", "Penalizaciones", "Abandonos", "Licencia FIA"
            }
        ));
        ListaCartoon.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        ListaCartoon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ListaCartoon.setFocusable(false);
        ListaCartoon.setGridColor(new java.awt.Color(255, 255, 255));
        ListaCartoon.setRowSelectionAllowed(false);
        ListaCartoon.setSelectionBackground(new java.awt.Color(204, 204, 204));
        ScrollPanelCartoon.setViewportView(ListaCartoon);
        if (ListaCartoon.getColumnModel().getColumnCount() > 0) {
            ListaCartoon.getColumnModel().getColumn(2).setPreferredWidth(130);
            ListaCartoon.getColumnModel().getColumn(3).setPreferredWidth(100);
            ListaCartoon.getColumnModel().getColumn(4).setPreferredWidth(110);
            ListaCartoon.getColumnModel().getColumn(10).setPreferredWidth(130);
            ListaCartoon.getColumnModel().getColumn(11).setPreferredWidth(120);
            ListaCartoon.getColumnModel().getColumn(13).setPreferredWidth(110);
        }

        PanelCartoon.add(ScrollPanelCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 110));

        PanelInfo.add(PanelCartoon, "card4");

        PanelPilotos.setBackground(new java.awt.Color(51, 51, 51));
        PanelPilotos.setBorder(new javax.swing.border.MatteBorder(null));
        PanelPilotos.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelPilotos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TítuloPilotos.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TítuloPilotos.setForeground(new java.awt.Color(255, 255, 255));
        TítuloPilotos.setText("Pilotos");
        PanelPilotos.add(TítuloPilotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        ScrollPanelPilotos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ScrollPanelPilotos.setPreferredSize(new java.awt.Dimension(150, 280));

        ListaPilotos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ListaPilotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Fecha de nacimiento", "Nacionalidad", "Número de auto", "Equipo", "Rol", "Puntos", "Podios", "Poles", "Vueltas rápidas", "Penalizaciones", "Abandonos", "Licencia FIA"
            }
        ));
        ListaPilotos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        ListaPilotos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ScrollPanelPilotos.setViewportView(ListaPilotos);
        if (ListaPilotos.getColumnModel().getColumnCount() > 0) {
            ListaPilotos.getColumnModel().getColumn(2).setPreferredWidth(130);
            ListaPilotos.getColumnModel().getColumn(3).setPreferredWidth(100);
            ListaPilotos.getColumnModel().getColumn(4).setPreferredWidth(110);
            ListaPilotos.getColumnModel().getColumn(10).setPreferredWidth(130);
            ListaPilotos.getColumnModel().getColumn(11).setPreferredWidth(120);
            ListaPilotos.getColumnModel().getColumn(13).setPreferredWidth(110);
        }

        PanelPilotos.add(ScrollPanelPilotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 650, 180));

        Text_Cant_Probador.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Text_Cant_Probador.setForeground(new java.awt.Color(255, 255, 255));
        PanelPilotos.add(Text_Cant_Probador, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 40, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("-Probador:");
        PanelPilotos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("-Cantidade de pilotos por rol:");
        PanelPilotos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("-Titular:");
        PanelPilotos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-Reserva:");
        PanelPilotos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, 40));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Valores normales");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PanelPilotos.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 30));

        ButtonPilotoMayorPenalizaciones.setBackground(new java.awt.Color(51, 51, 51));
        ButtonPilotoMayorPenalizaciones.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ButtonPilotoMayorPenalizaciones.setForeground(new java.awt.Color(255, 255, 255));
        ButtonPilotoMayorPenalizaciones.setText("Piloto/s con la mayor cantidad de penalizaciones");
        ButtonPilotoMayorPenalizaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonPilotoMayorPenalizaciones.setContentAreaFilled(false);
        ButtonPilotoMayorPenalizaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonPilotoMayorPenalizaciones.setFocusable(false);
        ButtonPilotoMayorPenalizaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ButtonPilotoMayorPenalizacionesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ButtonPilotoMayorPenalizacionesMouseReleased(evt);
            }
        });
        ButtonPilotoMayorPenalizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPilotoMayorPenalizacionesActionPerformed(evt);
            }
        });
        PanelPilotos.add(ButtonPilotoMayorPenalizaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 340, 30));

        Text_Cant_Titular.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Text_Cant_Titular.setForeground(new java.awt.Color(255, 255, 255));
        PanelPilotos.add(Text_Cant_Titular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 30, 40));

        Text_Cant_Reserva.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Text_Cant_Reserva.setForeground(new java.awt.Color(255, 255, 255));
        PanelPilotos.add(Text_Cant_Reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 30, 40));

        Button_Pilotos_Puntos.setBackground(new java.awt.Color(51, 51, 51));
        Button_Pilotos_Puntos.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        Button_Pilotos_Puntos.setForeground(new java.awt.Color(255, 255, 255));
        Button_Pilotos_Puntos.setText("Aplicar");
        Button_Pilotos_Puntos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button_Pilotos_Puntos.setContentAreaFilled(false);
        Button_Pilotos_Puntos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button_Pilotos_Puntos.setFocusable(false);
        Button_Pilotos_Puntos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Button_Pilotos_PuntosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Button_Pilotos_PuntosMouseReleased(evt);
            }
        });
        Button_Pilotos_Puntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Pilotos_PuntosActionPerformed(evt);
            }
        });
        PanelPilotos.add(Button_Pilotos_Puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 110, 30));

        TextoPuntosMayor.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        PanelPilotos.add(TextoPuntosMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 90, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultas:");
        PanelPilotos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pilotos que superen una cantidad de puntos:");
        PanelPilotos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 30));

        VolverButtonCartoon1.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonCartoon1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonCartoon1.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonCartoon1.setText("Volver");
        VolverButtonCartoon1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonCartoon1.setContentAreaFilled(false);
        VolverButtonCartoon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonCartoon1.setFocusable(false);
        VolverButtonCartoon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonCartoon1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonCartoon1MouseReleased(evt);
            }
        });
        VolverButtonCartoon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonCartoon1ActionPerformed(evt);
            }
        });
        PanelPilotos.add(VolverButtonCartoon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 30));

        PanelInfo.add(PanelPilotos, "card14");

        PanelMostrarComisariosDeportivos.setBackground(new java.awt.Color(51, 51, 51));
        PanelMostrarComisariosDeportivos.setBorder(new javax.swing.border.MatteBorder(null));
        PanelMostrarComisariosDeportivos.setMinimumSize(new java.awt.Dimension(680, 499));
        PanelMostrarComisariosDeportivos.setPreferredSize(new java.awt.Dimension(680, 499));
        PanelMostrarComisariosDeportivos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloCDMostrar.setFont(new java.awt.Font("Segoe UI", 0, 33)); // NOI18N
        TituloCDMostrar.setForeground(new java.awt.Color(255, 255, 255));
        TituloCDMostrar.setText("Comisarios deportivos");
        PanelMostrarComisariosDeportivos.add(TituloCDMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        VolverButtonMostrarCD.setBackground(new java.awt.Color(51, 51, 51));
        VolverButtonMostrarCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        VolverButtonMostrarCD.setForeground(new java.awt.Color(255, 255, 255));
        VolverButtonMostrarCD.setText("Volver");
        VolverButtonMostrarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VolverButtonMostrarCD.setContentAreaFilled(false);
        VolverButtonMostrarCD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VolverButtonMostrarCD.setFocusable(false);
        VolverButtonMostrarCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                VolverButtonMostrarCDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                VolverButtonMostrarCDMouseReleased(evt);
            }
        });
        VolverButtonMostrarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonMostrarCDActionPerformed(evt);
            }
        });
        PanelMostrarComisariosDeportivos.add(VolverButtonMostrarCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, -1));

        ScrollPanelCD1.setPreferredSize(new java.awt.Dimension(150, 280));

        TablaMostrarCD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TablaMostrarCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Fecha de nacimiento", "Nacionalidad", "Sanciones Aplicadas", "Internacional FIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaMostrarCD.setEnabled(false);
        ScrollPanelCD1.setViewportView(TablaMostrarCD);

        PanelMostrarComisariosDeportivos.add(ScrollPanelCD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 660, 290));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Posee");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelMostrarComisariosDeportivos.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 70, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelMostrarComisariosDeportivos.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 70, -1));

        TextoFiltrarCDFIA3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TextoFiltrarCDFIA3.setForeground(new java.awt.Color(255, 255, 255));
        TextoFiltrarCDFIA3.setText("-Filtrar por Internacional FIA:");
        PanelMostrarComisariosDeportivos.add(TextoFiltrarCDFIA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 20));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("No posee");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PanelMostrarComisariosDeportivos.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        PanelInfo.add(PanelMostrarComisariosDeportivos, "card16");

        PanelContenedor.add(PanelInfo, "card4");

        getContentPane().add(PanelContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, -4, 980, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarButtonActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelElegirModificar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ModificarButtonActionPerformed

    private void CargarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarButtonActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelElegirCargar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_CargarButtonActionPerformed

    private void EliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarButtonActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelElegirEliminar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_EliminarButtonActionPerformed

    private void PilotoCargarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilotoCargarButtonActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelPilotoCargar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_PilotoCargarButtonActionPerformed

    private void ComisarioDeportivoCargarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComisarioDeportivoCargarButtonActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelComisarioDeportivoCargar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ComisarioDeportivoCargarButtonActionPerformed

    private void VolverButtonElegirCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonElegirCargarActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelBotonesEditar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonElegirCargarActionPerformed

    private void TextoCargarMesPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarMesPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarMesPilotoActionPerformed

    private void VolverButtonCargarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonCargarPilotoActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelElegirCargar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonCargarPilotoActionPerformed

    private void TextoCargarApellidoPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarApellidoPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarApellidoPilotoActionPerformed

    private void TextoCargarNombrePilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarNombrePilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarNombrePilotoActionPerformed

    private void TextoCargarDiaPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarDiaPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarDiaPilotoActionPerformed

    private void TextoCargarAñoPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarAñoPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarAñoPilotoActionPerformed

    private void TextoCargarNumeroAutoPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarNumeroAutoPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarNumeroAutoPilotoActionPerformed

    private void TextoCargarPuntosPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarPuntosPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarPuntosPilotoActionPerformed

    private void TextoCargarPodiosPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarPodiosPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarPodiosPilotoActionPerformed

    private void TextoCargarPolesPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarPolesPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarPolesPilotoActionPerformed

    private void TextoCargarPenalizacionesPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarPenalizacionesPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarPenalizacionesPilotoActionPerformed

    private void TextoCargarVueltasRapidasPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarVueltasRapidasPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarVueltasRapidasPilotoActionPerformed

    private void TextoCargarAbandonosPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarAbandonosPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarAbandonosPilotoActionPerformed

    private void CheckCargarLicenciaFIAPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckCargarLicenciaFIAPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckCargarLicenciaFIAPilotoActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelBotonesEditar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_EditButtonActionPerformed

    private void TextoCargarNombreCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarNombreCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarNombreCDActionPerformed

    private void TextoCargarApellidoCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarApellidoCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarApellidoCDActionPerformed

    private void TextoCargarDiaCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarDiaCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarDiaCDActionPerformed

    private void TextoCargarMesCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarMesCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarMesCDActionPerformed

    private void TextoCargarAñoCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarAñoCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarAñoCDActionPerformed

    private void VolverButtonCargarCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonCargarCDActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelElegirCargar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonCargarCDActionPerformed

    private void CheckCargarInternacionalFIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckCargarInternacionalFIAActionPerformed

    }//GEN-LAST:event_CheckCargarInternacionalFIAActionPerformed

    private void PilotoModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilotoModificarButtonActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelPilotoModificar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_PilotoModificarButtonActionPerformed

    private void CDModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDModificarButtonActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelComisarioDeportivoModificar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_CDModificarButtonActionPerformed

    private void VolverButtonElegirModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonElegirModificarActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelBotonesEditar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonElegirModificarActionPerformed

    private void TextoBuscarNombrePilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoBuscarNombrePilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoBuscarNombrePilotoActionPerformed

    private void TextoBuscarApellidoPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoBuscarApellidoPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoBuscarApellidoPilotoActionPerformed

    private void BuscarButtonPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtonPilotoActionPerformed
String nombre;
String apellido;
int i, encontr = 0;
nombre = TextoBuscarNombrePiloto.getText();
apellido = TextoBuscarApellidoPiloto.getText();

if(nombre.isEmpty() || apellido.isEmpty())
{
JOptionPane.showMessageDialog(this, "Faltan campos de texto por rellenar");
return;
}

ListIterator<Equipo> it = Equipo_10.listIterator();

while(it.hasNext())
{
Equipo E_prueba = it.next();
    
for(i = 0; i < E_prueba.getNumero_pilotos(); i++)
{
Piloto [] pil = new Piloto[4];
pil = E_prueba.getPilot_E();

if(pil[i].Get_Nombre().equals(nombre) && pil[i].Get_Apellido().equals(apellido))
{
encontr = 1;
TextoModificarNumeroAutoPiloto.setText(Integer.toString(pil[i].getNum_auto()));
TextoModificarPolesPiloto.setText(Integer.toString(pil[i].getPole()));
TextoModificarPodiosPiloto.setText(Integer.toString(pil[i].getPodios()));
TextoModificarPuntosPiloto.setText(Integer.toString(pil[i].getPuntos()));
TextoModificarAbandonoPiloto.setText(Integer.toString(pil[i].getAbandonos()));
TextoModificarPenalizacionesPiloto.setText(Integer.toString(pil[i].getPenalizaciones()));
TextoModificarVueltasPiloto.setText(Integer.toString(pil[i].getVueltas_rapidas()));
ListaModificarRolPiloto.setSelectedIndex(pil[i].getRol() - 1);
}
}

}

if(encontr == 0)
JOptionPane.showMessageDialog(this, "No se ha encontrado el piloto en el programa.");
else
JOptionPane.showMessageDialog(this, "Se ha encontrado el piloto en el programa");


    }//GEN-LAST:event_BuscarButtonPilotoActionPerformed

    private void TextoModificarNumeroAutoPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoModificarNumeroAutoPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoModificarNumeroAutoPilotoActionPerformed

    private void TextoModificarPolesPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoModificarPolesPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoModificarPolesPilotoActionPerformed

    private void TextoModificarPuntosPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoModificarPuntosPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoModificarPuntosPilotoActionPerformed

    private void TextoModificarPodiosPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoModificarPodiosPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoModificarPodiosPilotoActionPerformed

    private void TextoModificarAbandonoPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoModificarAbandonoPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoModificarAbandonoPilotoActionPerformed

    private void TextoModificarPenalizacionesPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoModificarPenalizacionesPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoModificarPenalizacionesPilotoActionPerformed

    private void TextoModificarVueltasPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoModificarVueltasPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoModificarVueltasPilotoActionPerformed

    private void VolverButtonModificarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonModificarPilotoActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelElegirModificar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonModificarPilotoActionPerformed

    private void AplicarModificaciónPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AplicarModificaciónPilotoActionPerformed
String nombre;
String apellido, select_list;
int i, encontr = 0, rol_option = 0, cant_tit = 0, d;
nombre = TextoBuscarNombrePiloto.getText();
apellido = TextoBuscarApellidoPiloto.getText();

if(nombre.isEmpty() || apellido.isEmpty() || TextoModificarNumeroAutoPiloto.getText().isEmpty() || ListaModificarRolPiloto.getSelectedValue() == null || TextoModificarPolesPiloto.getText().isEmpty() || TextoModificarPodiosPiloto.getText().isEmpty()
        || TextoModificarPuntosPiloto.getText().isEmpty() || TextoModificarAbandonoPiloto.getText().isEmpty() || TextoModificarPenalizacionesPiloto.getText().isEmpty() || TextoModificarVueltasPiloto.getText().isEmpty())
{
JOptionPane.showMessageDialog(this, "Faltan campos los cuales asignar.");
return;
}

try{
Integer.parseInt(TextoModificarNumeroAutoPiloto.getText());
Integer.parseInt(TextoModificarPuntosPiloto.getText());
Integer.parseInt(TextoModificarPodiosPiloto.getText());
Integer.parseInt(TextoModificarPolesPiloto.getText());
Integer.parseInt(TextoModificarVueltasPiloto.getText());
Integer.parseInt(TextoModificarPenalizacionesPiloto.getText());
Integer.parseInt(TextoModificarAbandonoPiloto.getText());
}
catch(NumberFormatException e)
{
JOptionPane.showMessageDialog(this, "Solo puede ingresar números en aquellos campos que requieran valores numéricos.");
return;
}

ListIterator<Equipo> it = Equipo_10.listIterator();

while(it.hasNext())
{
Equipo E_prueba = it.next();


for(i = 0; i < E_prueba.getNumero_pilotos(); i++)
{
Piloto []pil = new Piloto[4];
pil = E_prueba.getPilot_E();

if(pil[i].Get_Nombre().equals(nombre) && pil[i].Get_Apellido().equals(apellido))
{
for(d = 0; d < E_prueba.getNumero_pilotos(); d++)
{
if(pil[d].getRol() == 1)
cant_tit++;
}

if(cant_tit == 2  && !ListaModificarRolPiloto.getSelectedValue().equals("Titular"))
{
JOptionPane.showMessageDialog(this, "Cada equipo debe tener un mínimo de 2 titulares, así que no puede cambiar el rol del titular.\nIngrese otro piloto con rol de titular e intenteló de nuevo.");
encontr = 2;
}
else
{
pil[i].setNum_auto(Integer.parseInt(TextoModificarNumeroAutoPiloto.getText()));
pil[i].setPuntos(Integer.parseInt(TextoModificarPuntosPiloto.getText()));
pil[i].setPodios(Integer.parseInt(TextoModificarPodiosPiloto.getText()));
pil[i].setPole(Integer.parseInt(TextoModificarPolesPiloto.getText()));
pil[i].setVueltas_rapidas(Integer.parseInt(TextoModificarVueltasPiloto.getText()));
pil[i].setPenalizaciones(Integer.parseInt(TextoModificarPenalizacionesPiloto.getText()));
pil[i].setAbandonos(Integer.parseInt(TextoModificarAbandonoPiloto.getText()));
select_list = ListaModificarRolPiloto.getSelectedValue();
switch(select_list)
{
    case "Titular": rol_option = 1;
                    break;
    case "Reserva": rol_option = 2;
                    break;
    case "Probador": rol_option = 3;
                     break;
}
pil[i].setRol(rol_option);

E_prueba.setPilot_E(pil);
it.set(E_prueba);
encontr = 1;
}
}
}

}

if(encontr == 0)
JOptionPane.showMessageDialog(this, "No se ha encontrado el piloto en el programa.");
if(encontr == 1)
JOptionPane.showMessageDialog(this, "Se ha modificado el piloto.");
    }//GEN-LAST:event_AplicarModificaciónPilotoActionPerformed

    private void VolverButtonCDModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonCDModificarActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelElegirModificar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonCDModificarActionPerformed

    private void AplicarButtonModificarCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AplicarButtonModificarCDActionPerformed
String nombre, apellido, ver_san;
int i = 0, encontr = 0;
nombre = TextoNombreCDBuscar.getText();
apellido = TextoApellidoCDBuscar.getText();
ver_san = TextoModificarSancionesCD.getText();

if(nombre.isEmpty() || apellido.isEmpty() || ver_san.isEmpty())
{
JOptionPane.showMessageDialog(this, "Faltan campos de texto por rellenar.");
return;
}

try{
Integer.parseInt(TextoModificarSancionesCD.getText());
}
catch(NumberFormatException e)
{
JOptionPane.showMessageDialog(this, "No se pueden ingresar letras en campos donde se introducen números\nIntentelo de nuevo.");
return;
}

if(Integer.parseInt(ver_san) < 0)
{
JOptionPane.showMessageDialog(this, "No se pueden ingresar valores negativos.\nIntentelo de nuevo");
return;  
}

ListIterator<ComisarioDeportivo> it = Com_Dep_6.listIterator();

while(it.hasNext())
{
ComisarioDeportivo CD_prueba = it.next();

if(CD_prueba.Get_Nombre().equals(nombre) && CD_prueba.Get_Apellido().equals(apellido))
{

CD_prueba.Set_Sancionesaplicadas(Integer.parseInt(TextoModificarSancionesCD.getText()));
CD_prueba.Set_Internacionalfia(CheckModificarFIACD.isSelected());

Com_Dep_6.set(i, CD_prueba);
encontr = 1;


}
i++;

}

if(encontr == 0)
JOptionPane.showMessageDialog(this, "No se ha encontrado el comisario deportivo en el programa.");
else
JOptionPane.showMessageDialog(this, "Se ha modificado al comisario deportivo.");
    }//GEN-LAST:event_AplicarButtonModificarCDActionPerformed

    private void TextoModificarSancionesCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoModificarSancionesCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoModificarSancionesCDActionPerformed

    private void TextoNombreCDBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNombreCDBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNombreCDBuscarActionPerformed

    private void TextoApellidoCDBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoApellidoCDBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoApellidoCDBuscarActionPerformed

    private void BuscarCDModificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCDModificarButtonActionPerformed
String nombre;
String apellido;
int i = 0, encontr = 0;


nombre = TextoNombreCDBuscar.getText();
apellido = TextoApellidoCDBuscar.getText();

if(nombre.isEmpty() || apellido.isEmpty())
{
JOptionPane.showMessageDialog(this, "Faltan campos de texto por rellenar");
return;
}

ListIterator<ComisarioDeportivo> it = Com_Dep_6.listIterator();

while(it.hasNext())
{
ComisarioDeportivo CD_prueba = it.next();

if(CD_prueba.Get_Nombre().equals(nombre) && CD_prueba.Get_Apellido().equals(apellido))
{
encontr = 1;
TextoModificarSancionesCD.setText(String.valueOf(CD_prueba.Get_Sancionesaplicadas()));
CheckModificarFIACD.setSelected(CD_prueba.Get_Internacionalfia());
}
}

if(encontr == 0)
JOptionPane.showMessageDialog(this, "No se ha encontrado el comisario deportivo en el programa.");
else
JOptionPane.showMessageDialog(this, "Se ha encontrado el comisario deportivo en el programa");
    }//GEN-LAST:event_BuscarCDModificarButtonActionPerformed

    private void CheckModificarFIACDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckModificarFIACDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckModificarFIACDActionPerformed

    private void ButtonPilotoEliminarElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPilotoEliminarElegirActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelEliminarPiloto);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ButtonPilotoEliminarElegirActionPerformed

    private void ButtonCDEliminarElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCDEliminarElegirActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelEliminarComisarioDeportivo);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ButtonCDEliminarElegirActionPerformed

    private void VolverButtonElegirEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonElegirEliminarActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelBotonesEditar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonElegirEliminarActionPerformed

    private void TextoEliminarApellidoPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoEliminarApellidoPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoEliminarApellidoPilotoActionPerformed

    private void VolverButtonEliminarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonEliminarPilotoActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelElegirEliminar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonEliminarPilotoActionPerformed

    private void TextoEliminarApellidoCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoEliminarApellidoCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoEliminarApellidoCDActionPerformed

    private void VolverButtonEliminarCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonEliminarCDActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelElegirEliminar);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonEliminarCDActionPerformed

    private void InitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InitButtonActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelInicio);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_InitButtonActionPerformed

    private void ButtonInfoCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInfoCDActionPerformed

DefaultTableModel modelo_1 = (DefaultTableModel) TablaMostrarCD.getModel();

// Limpiar la tabla antes de agregar datos (opcional)
modelo_1.setRowCount(0);

// Recorrer la lista de Comisarios Deportivos y agregar cada uno
for (ComisarioDeportivo cd : Com_Dep_6) {
    String fia_si_no = "No";
    
    if(cd.Get_Internacionalfia())
    fia_si_no = "Si";
    
    Fecha f = new Fecha();
    f = cd.getFecnac();
    
    Object[] fila = { cd.Get_Nombre(), cd.Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), cd.Get_Nacionalidad(), cd.Get_Sancionesaplicadas(), fia_si_no};
    modelo_1.addRow(fila);
}


        PanelContenedor.removeAll();
        PanelContenedor.add(PanelMostrarComisariosDeportivos);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();

    }//GEN-LAST:event_ButtonInfoCDActionPerformed

    private void ButtonInfoEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInfoEquiposActionPerformed
        Equipo e = new Equipo();
        ListIterator<Equipo> it = Equipo_10.listIterator();       
        
        e = it.next();
        Texto_Cant_Pil_Sony.setText(Integer.toString(e.getNumero_pilotos()));
        
        e = it.next();
        Texto_Cant_Pil_Nintendo.setText(Integer.toString(e.getNumero_pilotos()));
        
        e = it.next();
        Texto_Cant_Pil_Sega.setText(Integer.toString(e.getNumero_pilotos()));
        
        e = it.next();
        Texto_Cant_Pil_Bandai.setText(Integer.toString(e.getNumero_pilotos()));
        
        e = it.next();
        Texto_Cant_Pil_Retro.setText(Integer.toString(e.getNumero_pilotos()));
        
        e = it.next();
        Texto_Cant_Pil_Vocaloid.setText(Integer.toString(e.getNumero_pilotos()));
        
        e = it.next();
        Texto_Cant_Pil_Capcom.setText(Integer.toString(e.getNumero_pilotos()));
        
        e = it.next();
        Texto_Cant_Pil_Ubisoft.setText(Integer.toString(e.getNumero_pilotos()));
        
        e = it.next();
        Texto_Cant_Pil_Indie.setText(Integer.toString(e.getNumero_pilotos()));
        
        e = it.next();
        Texto_Cant_Pil_Cartoon.setText(Integer.toString(e.getNumero_pilotos()));
        
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelMostrarEquipos);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ButtonInfoEquiposActionPerformed

    private void VolverButtonMostrarEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonMostrarEquiposActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelBotonesInformación);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonMostrarEquiposActionPerformed

    private void InfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoButtonActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelBotonesInformación);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_InfoButtonActionPerformed

    private void VolverButtonSonyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonSonyActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelMostrarEquipos);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonSonyActionPerformed

    private void ButtonInfoPilotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInfoPilotosActionPerformed
int cant_tit = 0, cant_res = 0, cant_prob = 0;
        
    DefaultTableModel modelo_2 = (DefaultTableModel) ListaPilotos.getModel();

modelo_2.setRowCount(0);

for (Equipo e : Equipo_10) {
    Piloto [] p = new Piloto[4];
    int i;
    p = e.getPilot_E();
    for(i = 0; i < e.getNumero_pilotos(); i++)
    {
    String rol_select = "", fia_select = "No";
    Fecha f = new Fecha();
    f = p[i].Get_Fecha();
    
    switch(p[i].getRol())
    {
    case 1: rol_select = "Titular";
                         cant_tit++;
                         break;
    case 2: rol_select = "Reserva";
                         cant_res++;
                         break;
    case 3: rol_select = "Probador";
                         cant_prob++;
                         break;
    }
    
    if(p[i].getLicencia_FIA())
     fia_select = "Si";
    
    Object[] fila = { p[i].Get_Nombre(), p[i].Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), p[i].Get_Nacionalidad(), p[i].getNum_auto(), p[i].getEquipo(), rol_select, p[i].getPuntos(), p[i].getPodios(), p[i].getPole(), p[i].getVueltas_rapidas(), p[i].getPenalizaciones(), p[i].getAbandonos(), fia_select};
    modelo_2.addRow(fila);
    }
    
}
        Text_Cant_Titular.setText(Integer.toString(cant_tit));
        Text_Cant_Reserva.setText(Integer.toString(cant_res));
        Text_Cant_Probador.setText(Integer.toString(cant_prob));
        
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelPilotos);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ButtonInfoPilotosActionPerformed

    private void ButtonSonyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSonyActionPerformed
DefaultTableModel modelo_2 = (DefaultTableModel) ListaSony.getModel();

modelo_2.setRowCount(0);

for (Equipo e : Equipo_10) {

    if(e.getNombr_equip().equals("Sony"))
    {
    Piloto [] p = new Piloto[4];
    int i;
    p = e.getPilot_E();
    for(i = 0; i < e.getNumero_pilotos(); i++)
    {
    String rol_select = "", fia_select = "No";
    Fecha f = new Fecha();
    f = p[i].Get_Fecha();
    
    switch(p[i].getRol())
    {
    case 1: rol_select = "Titular";
                         break;
    case 2: rol_select = "Reserva";
                         break;
    case 3: rol_select = "Probador";
                         break;
    }
    
    if(p[i].getLicencia_FIA())
     fia_select = "Si";
    
    Object[] fila = { p[i].Get_Nombre(), p[i].Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), p[i].Get_Nacionalidad(), p[i].getNum_auto(), p[i].getEquipo(), rol_select, p[i].getPuntos(), p[i].getPodios(), p[i].getPole(), p[i].getVueltas_rapidas(), p[i].getPenalizaciones(), p[i].getAbandonos(), fia_select};
    modelo_2.addRow(fila);
    }
    }
}

        PanelContenedor.removeAll();
        PanelContenedor.add(PanelSony);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ButtonSonyActionPerformed

    private void TextoCargarNacionalidadCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarNacionalidadCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarNacionalidadCDActionPerformed

    private void VolverButtonNintendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonNintendoActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelMostrarEquipos);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonNintendoActionPerformed

    private void VolverButtonSegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonSegaActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelMostrarEquipos);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonSegaActionPerformed

    private void VolverButtonBandaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonBandaiActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelMostrarEquipos);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonBandaiActionPerformed

    private void VolverButtonRetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonRetroActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelMostrarEquipos);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonRetroActionPerformed

    private void VolverButtonVocaloidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonVocaloidActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelMostrarEquipos);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonVocaloidActionPerformed

    private void VolverButtonCapcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonCapcomActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelMostrarEquipos);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonCapcomActionPerformed

    private void VolverButtonSony7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonSony7ActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelMostrarEquipos);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonSony7ActionPerformed

    private void VolverButtonIndieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonIndieActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelMostrarEquipos);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonIndieActionPerformed

    private void VolverButtonCartoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonCartoonActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelMostrarEquipos);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonCartoonActionPerformed

    private void VolverButtonMostrarCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonMostrarCDActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelBotonesInformación);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonMostrarCDActionPerformed

    private void AplicarButtonCargarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AplicarButtonCargarPilotoActionPerformed
Fecha f_asign = new Fecha();
int c, nombr_rep = 0;
String prueb_1 = ListaCargarEquipoPíloto.getSelectedValue();
String prueb_2 = ListaCargarRolPiloto.getSelectedValue();
if(TextoCargarNombrePiloto.getText().isEmpty() || TextoCargarApellidoPiloto.getText().isEmpty() || TextoCargarDiaPiloto.getText().isEmpty() || TextoCargarMesPiloto.getText().isEmpty() ||
        TextoCargarAñoPiloto.getText().isEmpty() || TextoCargarNacionalidadPiloto.getText().isEmpty() || TextoCargarNumeroAutoPiloto.getText().isEmpty() || TextoCargarPuntosPiloto.getText().isEmpty() ||
        TextoCargarPuntosPiloto.getText().isEmpty() || TextoCargarPolesPiloto.getText().isEmpty() || TextoCargarVueltasRapidasPiloto.getText().isEmpty() || TextoCargarPenalizacionesPiloto.getText().isEmpty() ||
        TextoCargarAbandonosPiloto.getText().isEmpty() || prueb_1 == null || prueb_2 == null) 
{
JOptionPane.showMessageDialog(this, "Faltan campos de texto por rellenar");
return;
}

try{
Integer.parseInt(TextoCargarDiaPiloto.getText());
Integer.parseInt(TextoCargarMesPiloto.getText());
Integer.parseInt(TextoCargarAñoPiloto.getText());
Integer.parseInt(TextoCargarPuntosPiloto.getText());
Integer.parseInt(TextoCargarPodiosPiloto.getText());
Integer.parseInt(TextoCargarPolesPiloto.getText());
Integer.parseInt(TextoCargarVueltasRapidasPiloto.getText());
Integer.parseInt(TextoCargarPenalizacionesPiloto.getText());
Integer.parseInt(TextoCargarAbandonosPiloto.getText());
}
catch(NumberFormatException e)
{
JOptionPane.showMessageDialog(this, "Solo puede ingresar números en aquellos campos que requieran valores numéricos.");
return;
}
ListIterator<Equipo> it_2 = Equipo_10.listIterator();

while(it_2.hasNext())
{
Equipo e_rep = it_2.next();
Piloto [] p_rep = e_rep.getPilot_E();
for(c = 0; c < e_rep.getNumero_pilotos(); c++)
{
if(p_rep[c].Get_Nombre().equals(TextoCargarNombrePiloto.getText()) && p_rep[c].Get_Apellido().equals(TextoCargarApellidoPiloto.getText()))
nombr_rep = 1;
}
}

if(nombr_rep == 1)
JOptionPane.showMessageDialog(this, "Ya existe otro piloto con el mismo nombre y apellido.");
else
{
Piloto pil_asign = new Piloto();

String select_list;

int rol_option = 0;


f_asign.Set_Dia(Integer.parseInt(TextoCargarDiaPiloto.getText()));

f_asign.Set_Mes(Integer.parseInt(TextoCargarMesPiloto.getText()));

f_asign.Set_Año(Integer.parseInt(TextoCargarAñoPiloto.getText()));


select_list = ListaCargarRolPiloto.getSelectedValue();

switch(select_list)
{
    case "Titular": rol_option = 1;
                    break;
    case "Reserva": rol_option = 2;
                    break;
    case "Probador": rol_option = 3;
                     break;
}

select_list = ListaCargarEquipoPíloto.getSelectedValue();
ListIterator<Equipo> it = Equipo_10.listIterator();

while(it.hasNext())
{
 
Equipo E_prueba = it.next();
    
if(E_prueba.getNombr_equip().equals(select_list))
{

if(E_prueba.getNumero_pilotos() == 4)
JOptionPane.showMessageDialog(this, "No se pueden ingresar más pilotos. El equipo está lleno.");
else
{
Piloto [] P_prueba = new Piloto[4]; 
Piloto [] P_prueba_2 = E_prueba.getPilot_E();
int i;
for(i = 0; i < 4; i++)
P_prueba[i] = P_prueba_2[i];

int pos = E_prueba.getNumero_pilotos();

pil_asign.Set_Nombre(TextoCargarNombrePiloto.getText());
pil_asign.Set_Apellido(TextoCargarApellidoPiloto.getText());
pil_asign.Set_Nacionalidad(TextoCargarNacionalidadPiloto.getText());
pil_asign.setFecnac(f_asign);

pil_asign.setNum_auto(Integer.parseInt(TextoCargarNumeroAutoPiloto.getText()));

pil_asign.setEquipo(select_list);
pil_asign.setPuntos(Integer.parseInt(TextoCargarPuntosPiloto.getText()));
pil_asign.setPodios(Integer.parseInt(TextoCargarPodiosPiloto.getText()));
pil_asign.setPole(Integer.parseInt(TextoCargarPolesPiloto.getText()));
pil_asign.setVueltas_rapidas(Integer.parseInt(TextoCargarVueltasRapidasPiloto.getText()));
pil_asign.setPenalizaciones(Integer.parseInt(TextoCargarPenalizacionesPiloto.getText()));
pil_asign.setAbandonos(Integer.parseInt(TextoCargarAbandonosPiloto.getText()));
pil_asign.setLicencia_FIA(CheckCargarLicenciaFIAPiloto.isSelected());
pil_asign.setRol(rol_option);

P_prueba[pos] = pil_asign;
        
E_prueba.setPilot_E(P_prueba);
it.set(E_prueba);
E_prueba.IncrementNumero_pilotos();

JOptionPane.showMessageDialog(this, "Se ha cargado el piloto exitosamente.");

}
}

}
}
    }//GEN-LAST:event_AplicarButtonCargarPilotoActionPerformed

    private void AplicarButtonCargarCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AplicarButtonCargarCDActionPerformed
int i, iguales = 0;
ComisarioDeportivo cd_asign = new ComisarioDeportivo();
Fecha f_asign = new Fecha();

if(TextoCargarNombreCD.getText().isEmpty() || TextoCargarApellidoCD.getText().isEmpty() || TextoCargarDiaCD.getText().isEmpty() || TextoCargarMesCD.getText().isEmpty() ||
        TextoCargarAñoCD.getText().isEmpty() || TextoCargarNacionalidadCD.getText().isEmpty() || TextoCargarSancionesCD.getText().isEmpty())
{
    JOptionPane.showMessageDialog(this, "Faltan campos de texto por rellenar");
    return;
}
try{
Integer.parseInt(TextoCargarSancionesCD.getText());
Integer.parseInt(TextoCargarDiaCD.getText());
Integer.parseInt(TextoCargarMesCD.getText());
Integer.parseInt(TextoCargarAñoCD.getText());
}
catch(NumberFormatException e)
{
JOptionPane.showMessageDialog(this, "Solo puede ingresar números en aquellos campos que requieran valores numéricos.");
}

    cd_asign.Set_Nombre(TextoCargarNombreCD.getText());
    cd_asign.Set_Apellido(TextoCargarApellidoCD.getText());
    
    ListIterator<ComisarioDeportivo> it_ver = Com_Dep_6.listIterator();
    
    while(it_ver.hasNext())
    {
    ComisarioDeportivo e = it_ver.next();
    if(e.Get_Nombre().equals(cd_asign.Get_Nombre()) && e.Get_Apellido().equals(cd_asign.Get_Apellido()))
    iguales = 1;
    }
    if(iguales == 1)
    JOptionPane.showMessageDialog(this, "Ya existe otro comisario deportivo con el mismo nombre y apellido.");
    else
    {
    cd_asign.Set_Nacionalidad(TextoCargarNacionalidadCD.getText());
    cd_asign.Set_Sancionesaplicadas(Integer.parseInt(TextoCargarSancionesCD.getText()));
    cd_asign.Set_Internacionalfia(CheckCargarInternacionalFIA.isSelected());
    f_asign.Set_Dia(Integer.parseInt(TextoCargarDiaCD.getText()));
    f_asign.Set_Mes(Integer.parseInt(TextoCargarMesCD.getText()));
    f_asign.Set_Año(Integer.parseInt(TextoCargarAñoCD.getText()));
    
    cd_asign.setFecnac(f_asign);
    
    ListIterator<ComisarioDeportivo> it = Com_Dep_6.listIterator();
    
    
    
    if(cant_cd == 100)
    JOptionPane.showMessageDialog(this, "No se pueden ingresar más comisarios deportivos (limite: 100).");
    else
    {
    Com_Dep_6.add(cd_asign);
    cant_cd++;
    JOptionPane.showMessageDialog(this, "Se ha cargado el comisario deportivo exitosamente");
    }
    }
    }//GEN-LAST:event_AplicarButtonCargarCDActionPerformed

    private void BuscarButtonPilotoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtonPilotoEliminarActionPerformed
String nombre;
String apellido;
int i, encontr = 0;
nombre = TextoEliminarNombrePiloto.getText();
apellido = TextoEliminarApellidoPiloto.getText();

if(nombre.isEmpty() || apellido.isEmpty())
{
JOptionPane.showMessageDialog(this, "Faltan campos de texto por rellenar");
return;
}

ListIterator<Equipo> it = Equipo_10.listIterator();

while(it.hasNext())
{
Equipo E_prueba = it.next();
    
for(i = 0; i < E_prueba.getNumero_pilotos(); i++)
{
Piloto [] pil = new Piloto[4];
pil = E_prueba.getPilot_E();

if(pil[i].Get_Nombre().equals(nombre) && pil[i].Get_Apellido().equals(apellido))
encontr = 1;

}

}

if(encontr == 0)
JOptionPane.showMessageDialog(this, "No se encontró el piloto en el programa.");
else
JOptionPane.showMessageDialog(this, "Se encontró el piloto en el programa.");


    }//GEN-LAST:event_BuscarButtonPilotoEliminarActionPerformed

    private void BuscarButtonEliminarCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtonEliminarCDActionPerformed
String nombre;
String apellido;

int i = 0, encontr = 0;
nombre = TextoNombreCDBuscar.getText();
apellido = TextoApellidoCDBuscar.getText();

if(nombre.isEmpty() || apellido.isEmpty())
{
JOptionPane.showMessageDialog(this, "Faltan campos de texto por rellenar");
return;
}

if(nombre.isEmpty() && apellido.isEmpty())
{
JOptionPane.showMessageDialog(this, "Faltan campos de texto por rellenar");
return;
}

ListIterator<ComisarioDeportivo> it = Com_Dep_6.listIterator();

while(it.hasNext())
{
ComisarioDeportivo CD_prueba = it.next();

if(CD_prueba.Get_Nombre().equals(nombre) && CD_prueba.Get_Apellido().equals(apellido))
encontr = 1;

}

if(encontr == 0)
JOptionPane.showMessageDialog(this, "No se ha encontrado el comisario deportivo en el programa.");
else
JOptionPane.showMessageDialog(this, "Se ha encontrado el comisario deportivo en el programa");
    }//GEN-LAST:event_BuscarButtonEliminarCDActionPerformed

    private void ButtonEliminarPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarPilotoActionPerformed
String nombre;
String apellido;
int i, encontr = 0, c, d, cant_tit = 0;
nombre = TextoEliminarNombrePiloto.getText();
apellido = TextoEliminarApellidoPiloto.getText();

if(nombre.isEmpty() || apellido.isEmpty())
{
JOptionPane.showMessageDialog(this, "Faltan campos de texto por rellenar");
return;
}

ListIterator<Equipo> it = Equipo_10.listIterator();

while(it.hasNext())
{
Equipo E_prueba = it.next();

for(i = 0; i < E_prueba.getNumero_pilotos(); i++)
{
Piloto []pil = new Piloto[4];
pil = E_prueba.getPilot_E();

if(pil[i].Get_Nombre().equals(nombre) && pil[i].Get_Apellido().equals(apellido))
{
for(d = 0; d < E_prueba.getNumero_pilotos(); d++)
{
if(pil[d].getRol() == 1)
cant_tit++;
}

if(cant_tit == 2 && pil[i].getRol() == 1)
{
JOptionPane.showMessageDialog(this, "Cada equipo debe tener un mínimo de 2 titulares, así que no puede eliminarlo.\nIngrese otro piloto con rol de Titular e intenteló de nuevo.");
encontr = 2;
}
else
{
if(E_prueba.getNumero_pilotos() == 4)
{
for(c = i; c < 3; c++)
pil[c] = pil[c+1];

encontr = 1;
E_prueba.DecrementNumero_pilotos();
}
else
{
for(c = i; c < E_prueba.getNumero_pilotos(); c++)
pil[c] = pil[c+1];
encontr = 1;
E_prueba.DecrementNumero_pilotos();
}
}

}

}

}

if(encontr == 0)
JOptionPane.showMessageDialog(this, "No se encontró al piloto en el programa.");
if(encontr == 1)
JOptionPane.showMessageDialog(this, "Se ha eliminado al piloto del programa.");


    }//GEN-LAST:event_ButtonEliminarPilotoActionPerformed

    private void EliminarButtonCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarButtonCDActionPerformed
String nombre;
String apellido;
int i = 0, encontr = 0;
nombre = TextoEliminarNombreCD.getText();
apellido = TextoEliminarApellidoCD.getText();

if(nombre.isEmpty() || apellido.isEmpty())
{
JOptionPane.showMessageDialog(this, "Faltan campos de texto por rellenar");
return;
}

ListIterator<ComisarioDeportivo> it = Com_Dep_6.listIterator();

while(it.hasNext())
{
ComisarioDeportivo CD_prueba = it.next();

if(CD_prueba.Get_Nombre().equals(nombre) && CD_prueba.Get_Apellido().equals(apellido))
{
Com_Dep_6.remove(CD_prueba);

encontr = 1;
}
i++;

}

if(encontr == 0)
JOptionPane.showMessageDialog(this, "No se encontró el comisario deportivo en el programa");
else
JOptionPane.showMessageDialog(this, "Se ha eliminado el comisario deportivo en el programa");
    }//GEN-LAST:event_EliminarButtonCDActionPerformed

    private void ButtonUbisoftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUbisoftActionPerformed
DefaultTableModel modelo_2 = (DefaultTableModel) ListaUbisoft.getModel();

// Limpiar la tabla antes de agregar datos (opcional)
modelo_2.setRowCount(0);

// Recorrer la lista de Comisarios Deportivos y agregar cada uno
for (Equipo e : Equipo_10) {

    if(e.getNombr_equip().equals("Ubisoft"))
    {
    Piloto [] p = new Piloto[4];
    int i;
    p = e.getPilot_E();
    for(i = 0; i < e.getNumero_pilotos(); i++)
    {
    String rol_select = "", fia_select = "No";
    Fecha f = new Fecha();
    f = p[i].Get_Fecha();
    
    switch(p[i].getRol())
    {
    case 1: rol_select = "Titular";
                         break;
    case 2: rol_select = "Reserva";
                         break;
    case 3: rol_select = "Probador";
                         break;
    }
    
    if(p[i].getLicencia_FIA())
     fia_select = "Si";
    
    Object[] fila = { p[i].Get_Nombre(), p[i].Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), p[i].Get_Nacionalidad(), p[i].getNum_auto(), p[i].getEquipo(), rol_select, p[i].getPuntos(), p[i].getPodios(), p[i].getPole(), p[i].getVueltas_rapidas(), p[i].getPenalizaciones(), p[i].getAbandonos(), fia_select};
    modelo_2.addRow(fila);
    }
    }
}
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelUbisoft);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ButtonUbisoftActionPerformed

    private void ButtonNintendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNintendoActionPerformed

DefaultTableModel modelo_2 = (DefaultTableModel) ListaNintendo.getModel();

// Limpiar la tabla antes de agregar datos (opcional)
modelo_2.setRowCount(0);

// Recorrer la lista de Comisarios Deportivos y agregar cada uno
for (Equipo e : Equipo_10) {

    if(e.getNombr_equip().equals("Nintendo"))
    {
    Piloto [] p = new Piloto[4];
    int i;
    p = e.getPilot_E();
    for(i = 0; i < e.getNumero_pilotos(); i++)
    {
    String rol_select = "", fia_select = "No";
    Fecha f = new Fecha();
    f = p[i].Get_Fecha();
    
    switch(p[i].getRol())
    {
    case 1: rol_select = "Titular";
                         break;
    case 2: rol_select = "Reserva";
                         break;
    case 3: rol_select = "Probador";
                         break;
    }
    
    if(p[i].getLicencia_FIA())
     fia_select = "Si";
    
    Object[] fila = { p[i].Get_Nombre(), p[i].Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), p[i].Get_Nacionalidad(), p[i].getNum_auto(), p[i].getEquipo(), rol_select, p[i].getPuntos(), p[i].getPodios(), p[i].getPole(), p[i].getVueltas_rapidas(), p[i].getPenalizaciones(), p[i].getAbandonos(), fia_select};
    modelo_2.addRow(fila);
    }
    }
}
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelNintendo);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ButtonNintendoActionPerformed

    private void ButtonRetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRetroActionPerformed
DefaultTableModel modelo_2 = (DefaultTableModel) ListaRetro.getModel();

// Limpiar la tabla antes de agregar datos (opcional)
modelo_2.setRowCount(0);

// Recorrer la lista de Comisarios Deportivos y agregar cada uno
for (Equipo e : Equipo_10) {

    if(e.getNombr_equip().equals("Retro"))
    {
    Piloto [] p = new Piloto[4];
    int i;
    p = e.getPilot_E();
    for(i = 0; i < e.getNumero_pilotos(); i++)
    {
    String rol_select = "", fia_select = "No";
    Fecha f = new Fecha();
    f = p[i].Get_Fecha();
    
    switch(p[i].getRol())
    {
    case 1: rol_select = "Titular";
                         break;
    case 2: rol_select = "Reserva";
                         break;
    case 3: rol_select = "Probador";
                         break;
    }
    
    if(p[i].getLicencia_FIA())
     fia_select = "Si";
    
    Object[] fila = { p[i].Get_Nombre(), p[i].Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), p[i].Get_Nacionalidad(), p[i].getNum_auto(), p[i].getEquipo(), rol_select, p[i].getPuntos(), p[i].getPodios(), p[i].getPole(), p[i].getVueltas_rapidas(), p[i].getPenalizaciones(), p[i].getAbandonos(), fia_select};
    modelo_2.addRow(fila);
    }
    }
}
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelRetro);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ButtonRetroActionPerformed

    private void ButtonCapcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCapcomActionPerformed
DefaultTableModel modelo_2 = (DefaultTableModel) ListaCapcom.getModel();

// Limpiar la tabla antes de agregar datos (opcional)
modelo_2.setRowCount(0);

// Recorrer la lista de Comisarios Deportivos y agregar cada uno
for (Equipo e : Equipo_10) {

    if(e.getNombr_equip().equals("Capcom"))
    {
    Piloto [] p = new Piloto[4];
    int i;
    p = e.getPilot_E();
    for(i = 0; i < e.getNumero_pilotos(); i++)
    {
    String rol_select = "", fia_select = "No";
    Fecha f = new Fecha();
    f = p[i].Get_Fecha();
    
    switch(p[i].getRol())
    {
    case 1: rol_select = "Titular";
                         break;
    case 2: rol_select = "Reserva";
                         break;
    case 3: rol_select = "Probador";
                         break;
    }
    
    if(p[i].getLicencia_FIA())
     fia_select = "Si";
    
    Object[] fila = { p[i].Get_Nombre(), p[i].Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), p[i].Get_Nacionalidad(), p[i].getNum_auto(), p[i].getEquipo(), rol_select, p[i].getPuntos(), p[i].getPodios(), p[i].getPole(), p[i].getVueltas_rapidas(), p[i].getPenalizaciones(), p[i].getAbandonos(), fia_select};
    modelo_2.addRow(fila);
    }
    }
}
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelCapcom);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ButtonCapcomActionPerformed

    private void ButtonCartoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCartoonActionPerformed
DefaultTableModel modelo_2 = (DefaultTableModel) ListaCartoon.getModel();

// Limpiar la tabla antes de agregar datos (opcional)
modelo_2.setRowCount(0);

// Recorrer la lista de Comisarios Deportivos y agregar cada uno
for (Equipo e : Equipo_10) {

    if(e.getNombr_equip().equals("Cartoon"))
    {
    Piloto [] p = new Piloto[4];
    int i;
    p = e.getPilot_E();
    for(i = 0; i < e.getNumero_pilotos(); i++)
    {
    String rol_select = "", fia_select = "No";
    Fecha f = new Fecha();
    f = p[i].Get_Fecha();
    
    switch(p[i].getRol())
    {
    case 1: rol_select = "Titular";
                         break;
    case 2: rol_select = "Reserva";
                         break;
    case 3: rol_select = "Probador";
                         break;
    }
    
    if(p[i].getLicencia_FIA())
     fia_select = "Si";
    
    Object[] fila = { p[i].Get_Nombre(), p[i].Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), p[i].Get_Nacionalidad(), p[i].getNum_auto(), p[i].getEquipo(), rol_select, p[i].getPuntos(), p[i].getPodios(), p[i].getPole(), p[i].getVueltas_rapidas(), p[i].getPenalizaciones(), p[i].getAbandonos(), fia_select};
    modelo_2.addRow(fila);
    }
    }
}
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelCartoon);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ButtonCartoonActionPerformed

    private void ButtonVocaloidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVocaloidActionPerformed
DefaultTableModel modelo_2 = (DefaultTableModel) ListaVocaloid.getModel();

// Limpiar la tabla antes de agregar datos (opcional)
modelo_2.setRowCount(0);

// Recorrer la lista de Comisarios Deportivos y agregar cada uno
for (Equipo e : Equipo_10) {

    if(e.getNombr_equip().equals("Vocaloid"))
    {
    Piloto [] p = new Piloto[4];
    int i;
    p = e.getPilot_E();
    for(i = 0; i < e.getNumero_pilotos(); i++)
    {
    String rol_select = "", fia_select = "No";
    Fecha f = new Fecha();
    f = p[i].Get_Fecha();
    
    switch(p[i].getRol())
    {
    case 1: rol_select = "Titular";
                         break;
    case 2: rol_select = "Reserva";
                         break;
    case 3: rol_select = "Probador";
                         break;
    }
    
    if(p[i].getLicencia_FIA())
     fia_select = "Si";
    
    Object[] fila = { p[i].Get_Nombre(), p[i].Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), p[i].Get_Nacionalidad(), p[i].getNum_auto(), p[i].getEquipo(), rol_select, p[i].getPuntos(), p[i].getPodios(), p[i].getPole(), p[i].getVueltas_rapidas(), p[i].getPenalizaciones(), p[i].getAbandonos(), fia_select};
    modelo_2.addRow(fila);
    }
    }
}
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelVocaloid);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ButtonVocaloidActionPerformed

    private void ButtonSegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSegaActionPerformed
DefaultTableModel modelo_2 = (DefaultTableModel) ListaSega.getModel();

// Limpiar la tabla antes de agregar datos (opcional)
modelo_2.setRowCount(0);

// Recorrer la lista de Comisarios Deportivos y agregar cada uno
for (Equipo e : Equipo_10) {

    if(e.getNombr_equip().equals("Sega"))
    {
    Piloto [] p = new Piloto[4];
    int i;
    p = e.getPilot_E();
    for(i = 0; i < e.getNumero_pilotos(); i++)
    {
    String rol_select = "", fia_select = "No";
    Fecha f = new Fecha();
    f = p[i].Get_Fecha();
    
    switch(p[i].getRol())
    {
    case 1: rol_select = "Titular";
                         break;
    case 2: rol_select = "Reserva";
                         break;
    case 3: rol_select = "Probador";
                         break;
    }
    
    if(p[i].getLicencia_FIA())
     fia_select = "Si";
    
    Object[] fila = { p[i].Get_Nombre(), p[i].Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), p[i].Get_Nacionalidad(), p[i].getNum_auto(), p[i].getEquipo(), rol_select, p[i].getPuntos(), p[i].getPodios(), p[i].getPole(), p[i].getVueltas_rapidas(), p[i].getPenalizaciones(), p[i].getAbandonos(), fia_select};
    modelo_2.addRow(fila);
    }
    }
}
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelSega);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ButtonSegaActionPerformed

    private void ButtonIndieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIndieActionPerformed
DefaultTableModel modelo_2 = (DefaultTableModel) ListaIndie.getModel();

// Limpiar la tabla antes de agregar datos (opcional)
modelo_2.setRowCount(0);

// Recorrer la lista de Comisarios Deportivos y agregar cada uno
for (Equipo e : Equipo_10) {

    if(e.getNombr_equip().equals("Indie"))
    {
    Piloto [] p = new Piloto[4];
    int i;
    p = e.getPilot_E();
    for(i = 0; i < e.getNumero_pilotos(); i++)
    {
    String rol_select = "", fia_select = "No";
    Fecha f = new Fecha();
    f = p[i].Get_Fecha();
    
    switch(p[i].getRol())
    {
    case 1: rol_select = "Titular";
                         break;
    case 2: rol_select = "Reserva";
                         break;
    case 3: rol_select = "Probador";
                         break;
    }
    
    if(p[i].getLicencia_FIA())
     fia_select = "Si";
    
    Object[] fila = { p[i].Get_Nombre(), p[i].Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), p[i].Get_Nacionalidad(), p[i].getNum_auto(), p[i].getEquipo(), rol_select, p[i].getPuntos(), p[i].getPodios(), p[i].getPole(), p[i].getVueltas_rapidas(), p[i].getPenalizaciones(), p[i].getAbandonos(), fia_select};
    modelo_2.addRow(fila);
    }
    }
}
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelIndie);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ButtonIndieActionPerformed

    private void ButtonBandaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBandaiActionPerformed
DefaultTableModel modelo_2 = (DefaultTableModel) ListaBandai.getModel();

// Limpiar la tabla antes de agregar datos (opcional)
modelo_2.setRowCount(0);

// Recorrer la lista de Comisarios Deportivos y agregar cada uno
for (Equipo e : Equipo_10) {

    if(e.getNombr_equip().equals("Bandai"))
    {
    Piloto [] p = new Piloto[4];
    int i;
    p = e.getPilot_E();
    for(i = 0; i < e.getNumero_pilotos(); i++)
    {
    String rol_select = "", fia_select = "No";
    Fecha f = new Fecha();
    f = p[i].Get_Fecha();
    
    switch(p[i].getRol())
    {
    case 1: rol_select = "Titular";
                         break;
    case 2: rol_select = "Reserva";
                         break;
    case 3: rol_select = "Probador";
                         break;
    }
    
    if(p[i].getLicencia_FIA())
     fia_select = "Si";
    
    Object[] fila = { p[i].Get_Nombre(), p[i].Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), p[i].Get_Nacionalidad(), p[i].getNum_auto(), p[i].getEquipo(), rol_select, p[i].getPuntos(), p[i].getPodios(), p[i].getPole(), p[i].getVueltas_rapidas(), p[i].getPenalizaciones(), p[i].getAbandonos(), fia_select};
    modelo_2.addRow(fila);
    }
    }
}
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelBandai);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_ButtonBandaiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

DefaultTableModel modelo_2 = (DefaultTableModel) TablaMostrarCD.getModel();

// Limpiar la tabla antes de agregar datos (opcional)
modelo_2.setRowCount(0);

// Recorrer la lista de Comisarios Deportivos y agregar cada uno
for (ComisarioDeportivo cd_2 : Com_Dep_6) {
    String fia_si_no_2 = "No";
    
    if(cd_2.Get_Internacionalfia())
    {
    fia_si_no_2 = "Si";
    
    Fecha f_2 = new Fecha();
    f_2 = cd_2.getFecnac();
    
    Object[] fila2 = { cd_2.Get_Nombre(), cd_2.Get_Apellido(), f_2.Get_Dia()+"/"+f_2.Get_Mes()+"/"+f_2.Get_Año(), cd_2.Get_Nacionalidad(), cd_2.Get_Sancionesaplicadas(), fia_si_no_2};
    modelo_2.addRow(fila2);
    }
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
DefaultTableModel modelo_1 = (DefaultTableModel) TablaMostrarCD.getModel();

// Limpiar la tabla antes de agregar datos (opcional)
modelo_1.setRowCount(0);

// Recorrer la lista de Comisarios Deportivos y agregar cada uno
for (ComisarioDeportivo cd : Com_Dep_6) {
    String fia_si_no = "No";
    
    if(cd.Get_Internacionalfia())
    fia_si_no = "Si";
    
    Fecha f = new Fecha();
    f = cd.getFecnac();
    
    Object[] fila = { cd.Get_Nombre(), cd.Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), cd.Get_Nacionalidad(), cd.Get_Sancionesaplicadas(), fia_si_no};
    modelo_1.addRow(fila);
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

DefaultTableModel modelo_2 = (DefaultTableModel) TablaMostrarCD.getModel();

// Limpiar la tabla antes de agregar datos (opcional)
modelo_2.setRowCount(0);

// Recorrer la lista de Comisarios Deportivos y agregar cada uno
for (ComisarioDeportivo cd_2 : Com_Dep_6) {
    String fia_si_no_2;
    
    if(cd_2.Get_Internacionalfia() == false)
    {
    fia_si_no_2 = "No";
    
    Fecha f_2 = new Fecha();
    f_2 = cd_2.getFecnac();
    
    Object[] fila2 = { cd_2.Get_Nombre(), cd_2.Get_Apellido(), f_2.Get_Dia()+"/"+f_2.Get_Mes()+"/"+f_2.Get_Año(), cd_2.Get_Nacionalidad(), cd_2.Get_Sancionesaplicadas(), fia_si_no_2};
    modelo_2.addRow(fila2);
    }
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TextoCargarNacionalidadPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCargarNacionalidadPilotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCargarNacionalidadPilotoActionPerformed

    private void ButtonPilotoMayorPenalizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPilotoMayorPenalizacionesActionPerformed
DefaultTableModel modelo_2 = (DefaultTableModel) ListaPilotos.getModel();

// Limpiar la tabla antes de agregar datos (opcional)
modelo_2.setRowCount(0);

Piloto pil_pen = new Piloto();
pil_pen.setPenalizaciones(0);
// Recorrer la lista de Comisarios Deportivos y agregar cada uno
for (Equipo e : Equipo_10) {
    Piloto [] p = new Piloto[4];
    int i;
    p = e.getPilot_E();
    for(i = 0; i < e.getNumero_pilotos(); i++)
    {
    if(pil_pen.getPenalizaciones() < p[i].getPenalizaciones())
    pil_pen = p[i];
    }
}
        System.out.println(pil_pen.getPenalizaciones());
for(Equipo e_2 : Equipo_10)
{
Piloto [] p_2 = e_2.getPilot_E();
int c;
for(c = 0; c < e_2.getNumero_pilotos(); c++)
if(p_2[c].getPenalizaciones() == pil_pen.getPenalizaciones())
{
    String rol_select = "", fia_select = "No";
    Fecha f = new Fecha();
    f = p_2[c].Get_Fecha();
    
    switch(p_2[c].getRol())
    {
    case 1: rol_select = "Titular";
                         break;
    case 2: rol_select = "Reserva";
                         break;
    case 3: rol_select = "Probador";
                         break;
    }
    
    if(p_2[c].getLicencia_FIA())
     fia_select = "Si";
    
    Object[] fila = { p_2[c].Get_Nombre(), p_2[c].Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), p_2[c].Get_Nacionalidad(), p_2[c].getNum_auto(), p_2[c].getEquipo(), rol_select, p_2[c].getPuntos(), p_2[c].getPodios(), p_2[c].getPole(), p_2[c].getVueltas_rapidas(), p_2[c].getPenalizaciones(), p_2[c].getAbandonos(), fia_select};
    modelo_2.addRow(fila);
}
}
    }//GEN-LAST:event_ButtonPilotoMayorPenalizacionesActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
DefaultTableModel modelo_2 = (DefaultTableModel) ListaPilotos.getModel();

modelo_2.setRowCount(0);

for (Equipo e : Equipo_10) {
    Piloto [] p = new Piloto[4];
    int i;
    p = e.getPilot_E();
    for(i = 0; i < e.getNumero_pilotos(); i++)
    {
    String rol_select = "", fia_select = "No";
    Fecha f = new Fecha();
    f = p[i].Get_Fecha();
    
    switch(p[i].getRol())
    {
    case 1: rol_select = "Titular";
                         break;
    case 2: rol_select = "Reserva";
                         break;
    case 3: rol_select = "Probador";
                         break;
    }
    
    if(p[i].getLicencia_FIA())
     fia_select = "Si";
    
    Object[] fila = { p[i].Get_Nombre(), p[i].Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), p[i].Get_Nacionalidad(), p[i].getNum_auto(), p[i].getEquipo(), rol_select, p[i].getPuntos(), p[i].getPodios(), p[i].getPole(), p[i].getVueltas_rapidas(), p[i].getPenalizaciones(), p[i].getAbandonos(), fia_select};
    modelo_2.addRow(fila);
    }
    
}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Button_Pilotos_PuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Pilotos_PuntosActionPerformed

if(TextoPuntosMayor.getText().isEmpty())
{
JOptionPane.showMessageDialog(this, "Primero ingrese un número en el campo de texto.");
return;
}

DefaultTableModel modelo_2 = (DefaultTableModel) ListaPilotos.getModel();

modelo_2.setRowCount(0);
int punt_comp;

try{
punt_comp = Integer.parseInt(TextoPuntosMayor.getText());
}
catch(NumberFormatException e)
{
JOptionPane.showMessageDialog(this, "Solo puede ingresar números en este campo.");
return;
}

for (Equipo e : Equipo_10) {
    Piloto [] p = new Piloto[4];
    int i;
    p = e.getPilot_E();
    for(i = 0; i < e.getNumero_pilotos(); i++)
    {
    if(p[i].getPuntos() > punt_comp)
    {
    String rol_select = "", fia_select = "No";
    Fecha f = new Fecha();
    f = p[i].Get_Fecha();
    
    switch(p[i].getRol())
    {
    case 1: rol_select = "Titular";
                         break;
    case 2: rol_select = "Reserva";
                         break;
    case 3: rol_select = "Probador";
                         break;
    }
    
    if(p[i].getLicencia_FIA())
     fia_select = "Si";
    
    Object[] fila = { p[i].Get_Nombre(), p[i].Get_Apellido(), f.Get_Dia()+"/"+f.Get_Mes()+"/"+f.Get_Año(), p[i].Get_Nacionalidad(), p[i].getNum_auto(), p[i].getEquipo(), rol_select, p[i].getPuntos(), p[i].getPodios(), p[i].getPole(), p[i].getVueltas_rapidas(), p[i].getPenalizaciones(), p[i].getAbandonos(), fia_select};
    modelo_2.addRow(fila);
    }
    }
    
}
    }//GEN-LAST:event_Button_Pilotos_PuntosActionPerformed

    private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonActionPerformed

//Guardar comisarios deportivos
try{
File miArchivo = new File("com_dep.txt");
if(miArchivo.createNewFile())
{
FileWriter myWriter = new FileWriter("com_dep.txt"); 
for(ComisarioDeportivo cd: Com_Dep_6)
{
myWriter.write(cd.Get_Nombre() + "\n");
myWriter.write(cd.Get_Apellido() + "\n");
myWriter.write(cd.getFecnac().Get_Dia() + "\n");
myWriter.write(cd.getFecnac().Get_Mes() + "\n");
myWriter.write(cd.getFecnac().Get_Año() + "\n");
myWriter.write(cd.Get_Nacionalidad() + "\n");
myWriter.write(cd.Get_Sancionesaplicadas() + "\n");
myWriter.write(String.valueOf(cd.Get_Internacionalfia()) + "\n");
}
myWriter.close();
System.out.println("Ejecutado");

}
else
{
FileWriter myWriter = new FileWriter("com_dep.txt");
for(ComisarioDeportivo cd: Com_Dep_6)
{
myWriter.write(cd.Get_Nombre() + "\n");
myWriter.write(cd.Get_Apellido() + "\n");
myWriter.write(cd.getFecnac().Get_Dia() + "\n");
myWriter.write(cd.getFecnac().Get_Mes() + "\n");
myWriter.write(cd.getFecnac().Get_Año() + "\n");
myWriter.write(cd.Get_Nacionalidad() + "\n");
myWriter.write(cd.Get_Sancionesaplicadas() + "\n");
myWriter.write(String.valueOf(cd.Get_Internacionalfia()) + "\n");
}
myWriter.close();
System.out.println("Ejecutado");
}
}
catch(IOException e)
{
System.out.println("Ocurrio un error");
e.printStackTrace();
}



//Guardar Pilotos
ListIterator<Equipo> it = Equipo_10.listIterator();

try{
File miArchivo = new File("equip_pil.txt");
if(miArchivo.createNewFile())
{
FileWriter myWriter = new FileWriter("equip_pil.txt"); 
for(Equipo e: Equipo_10)
{
Piloto [] p = new Piloto[4];
p = e.getPilot_E();
int i;
for(i = 0; i < e.getNumero_pilotos(); i++)
{
myWriter.write(p[i].Get_Nombre() + "\n");
myWriter.write(p[i].Get_Apellido() + "\n");
myWriter.write(p[i].getFecnac().Get_Dia() + "\n");
myWriter.write(p[i].getFecnac().Get_Mes() + "\n");
myWriter.write(p[i].getFecnac().Get_Año() + "\n");
myWriter.write(p[i].Get_Nacionalidad() + "\n");
myWriter.write(p[i].getNum_auto() + "\n");
myWriter.write(p[i].getRol() + "\n");
myWriter.write(p[i].getPuntos() + "\n");
myWriter.write(p[i].getPodios() + "\n");
myWriter.write(p[i].getPole() + "\n");
myWriter.write(p[i].getVueltas_rapidas()+ "\n");
myWriter.write(p[i].getPenalizaciones() + "\n");
myWriter.write(p[i].getAbandonos() + "\n");
myWriter.write(String.valueOf(p[i].getRol()) + "\n");
myWriter.write(p[i].getEquipo() + "\n");
}
}
myWriter.close();
System.out.println("Ejecutado");

}
else
{
FileWriter myWriter = new FileWriter("equip_pil.txt"); 
for(Equipo e: Equipo_10)
{
Piloto [] p = new Piloto[4];
p = e.getPilot_E();
int i;
for(i = 0; i < e.getNumero_pilotos(); i++)
{
myWriter.write(p[i].Get_Nombre() + "\n");
myWriter.write(p[i].Get_Apellido() + "\n");
myWriter.write(p[i].getFecnac().Get_Dia() + "\n");
myWriter.write(p[i].getFecnac().Get_Mes() + "\n");
myWriter.write(p[i].getFecnac().Get_Año() + "\n");
myWriter.write(p[i].Get_Nacionalidad() + "\n");
myWriter.write(p[i].getNum_auto() + "\n");
myWriter.write(p[i].getRol() + "\n");
myWriter.write(p[i].getPuntos() + "\n");
myWriter.write(p[i].getPodios() + "\n");
myWriter.write(p[i].getPole() + "\n");
myWriter.write(p[i].getVueltas_rapidas()+ "\n");
myWriter.write(p[i].getPenalizaciones() + "\n");
myWriter.write(p[i].getAbandonos() + "\n");
myWriter.write(String.valueOf(p[i].getRol()) + "\n");
myWriter.write(p[i].getEquipo() + "\n");
}
}
myWriter.close();
}
}
catch(IOException e)
{
System.out.println("Ocurrio un error");
e.printStackTrace();
}


//Guardar cantidad de pilotos
try{
File miArchivo = new File("cant_pil.txt");
if(miArchivo.createNewFile())
{
FileWriter myWriter = new FileWriter("cant_pil.txt");
for(Equipo e: Equipo_10)
{
myWriter.write(e.getNumero_pilotos() + "\n");
}
myWriter.close();
}
else
{
FileWriter myWriter = new FileWriter("cant_pil.txt");
for(Equipo e: Equipo_10)
{
myWriter.write(e.getNumero_pilotos() + "\n");
}
myWriter.close();
}
}
catch(IOException e)
{
System.out.println("Ocurrio un error");
e.printStackTrace();
}

        System.exit(0);
    }//GEN-LAST:event_SalirButtonActionPerformed

    private void PrecargaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecargaButtonActionPerformed
Com_Dep_6.clear();
//Cargando la precarga de comisarios deportivos        
try{
File miArchivo = new File("PrecargaComisarioDeportivos.txt");
if(miArchivo.createNewFile())
;
else
{
Scanner myReader = new Scanner(miArchivo);
while(myReader.hasNextLine())
{
Fecha f = new Fecha();
ComisarioDeportivo cd = new ComisarioDeportivo();
String data = myReader.nextLine();
cd.Set_Nombre(data);
data = myReader.nextLine();
cd.Set_Apellido(data);
data = myReader.nextLine();
f.Set_Dia(Integer.parseInt(data));
data = myReader.nextLine();
f.Set_Mes(Integer.parseInt(data));
data = myReader.nextLine();
f.Set_Año(Integer.parseInt(data));

cd.setFecnac(f);

data = myReader.nextLine();
cd.Set_Nacionalidad(data);
data = myReader.nextLine();
cd.Set_Sancionesaplicadas(Integer.parseInt(data));
data = myReader.nextLine();
cd.Set_Internacionalfia(Boolean.parseBoolean(data));
Com_Dep_6.add(cd);
}
}
}
catch(IOException e)
{
System.out.println("Ocurrio un error");
e.printStackTrace();
}

//Cargando la precarga de cantidad de pilotos
try{
File miArchivo = new File("PrecargaCantPil.txt");
if(miArchivo.createNewFile())
;
else
{
Scanner myReader = new Scanner(miArchivo);
{
for(Equipo e: Equipo_10)
{
String data = myReader.nextLine();
e.setNumero_pilotos(Integer.parseInt(data));
}
}

}
}
catch(IOException e)
{
System.out.println("Ocurrio un error");
e.printStackTrace();
}

//Cargando la precarga de pilotos

try{
File miArchivo = new File("PrecargaPilotos.txt");
if(miArchivo.createNewFile())
;
else
{
Scanner myReader = new Scanner(miArchivo);
for(Equipo e: Equipo_10)
{
Piloto [] p = new Piloto[4];
int i;
for(i = 0; i < e.getNumero_pilotos(); i++)
{
Fecha f = new Fecha();
Piloto p_2 = new Piloto();
String data = myReader.nextLine();
p_2.Set_Nombre(data);
data = myReader.nextLine();
p_2.Set_Apellido(data);
data = myReader.nextLine();
f.Set_Dia(Integer.parseInt(data));
data = myReader.nextLine();
f.Set_Mes(Integer.parseInt(data));
data = myReader.nextLine();
f.Set_Año(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setFecnac(f);
p_2.Set_Nacionalidad(data);
data = myReader.nextLine();
p_2.setNum_auto(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setRol(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setPuntos(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setPodios(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setPole(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setVueltas_rapidas(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setPenalizaciones(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setAbandonos(Integer.parseInt(data));
data = myReader.nextLine();
p_2.setLicencia_FIA(Boolean.parseBoolean(data));
data = myReader.nextLine();
p_2.setEquipo(data);
p[i] = p_2;
}
e.setPilot_E(p);
}
}
}
catch(IOException e)
{
System.out.println("Ocurrio un error");
e.printStackTrace();
}
    }//GEN-LAST:event_PrecargaButtonActionPerformed

    private void VolverButtonCartoon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonCartoon1ActionPerformed
        PanelContenedor.removeAll();
        PanelContenedor.add(PanelBotonesInformación);
        PanelContenedor.repaint();
        PanelContenedor.revalidate();
    }//GEN-LAST:event_VolverButtonCartoon1ActionPerformed

    private void InitButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InitButtonMousePressed
        InitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_InitButtonMousePressed

    private void InitButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InitButtonMouseReleased
        InitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_InitButtonMouseReleased

    private void EditButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMousePressed
        EditButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_EditButtonMousePressed

    private void EditButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseReleased
        EditButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_EditButtonMouseReleased

    private void InfoButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoButtonMousePressed
        InfoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_InfoButtonMousePressed

    private void InfoButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoButtonMouseReleased
        InfoButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_InfoButtonMouseReleased

    private void PrecargaButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrecargaButtonMousePressed
        PrecargaButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_PrecargaButtonMousePressed

    private void PrecargaButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrecargaButtonMouseReleased
        PrecargaButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_PrecargaButtonMouseReleased

    private void SalirButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirButtonMousePressed
        SalirButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_SalirButtonMousePressed

    private void SalirButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirButtonMouseReleased
        SalirButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_SalirButtonMouseReleased

    private void CargarButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarButtonMousePressed
        CargarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_CargarButtonMousePressed

    private void CargarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarButtonMouseReleased
        CargarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_CargarButtonMouseReleased

    private void ModificarButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarButtonMousePressed
        ModificarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ModificarButtonMousePressed

    private void ModificarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarButtonMouseReleased
        ModificarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ModificarButtonMouseReleased

    private void EliminarButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarButtonMousePressed
        EliminarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_EliminarButtonMousePressed

    private void EliminarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarButtonMouseReleased
        EliminarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_EliminarButtonMouseReleased

    private void PilotoCargarButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PilotoCargarButtonMousePressed
        PilotoCargarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_PilotoCargarButtonMousePressed

    private void PilotoCargarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PilotoCargarButtonMouseReleased
        PilotoCargarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_PilotoCargarButtonMouseReleased

    private void ComisarioDeportivoCargarButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComisarioDeportivoCargarButtonMousePressed
        ComisarioDeportivoCargarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ComisarioDeportivoCargarButtonMousePressed

    private void ComisarioDeportivoCargarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComisarioDeportivoCargarButtonMouseReleased
        ComisarioDeportivoCargarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ComisarioDeportivoCargarButtonMouseReleased

    private void VolverButtonElegirCargarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonElegirCargarMouseExited
        
    }//GEN-LAST:event_VolverButtonElegirCargarMouseExited

    private void VolverButtonElegirCargarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonElegirCargarMousePressed
        VolverButtonElegirCargar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonElegirCargarMousePressed

    private void VolverButtonElegirCargarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonElegirCargarMouseReleased
        VolverButtonElegirCargar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonElegirCargarMouseReleased

    private void AplicarButtonCargarPilotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AplicarButtonCargarPilotoMousePressed
        AplicarButtonCargarPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_AplicarButtonCargarPilotoMousePressed

    private void VolverButtonCargarPilotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonCargarPilotoMousePressed
       VolverButtonCargarPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonCargarPilotoMousePressed

    private void AplicarButtonCargarPilotoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AplicarButtonCargarPilotoMouseReleased
        AplicarButtonCargarPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_AplicarButtonCargarPilotoMouseReleased

    private void VolverButtonCargarPilotoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonCargarPilotoMouseReleased
        VolverButtonCargarPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonCargarPilotoMouseReleased

    private void VolverButtonCargarCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonCargarCDMousePressed
        VolverButtonCargarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonCargarCDMousePressed

    private void VolverButtonCargarCDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonCargarCDMouseReleased
        VolverButtonCargarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonCargarCDMouseReleased

    private void AplicarButtonCargarCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AplicarButtonCargarCDMousePressed
        AplicarButtonCargarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_AplicarButtonCargarCDMousePressed

    private void AplicarButtonCargarCDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AplicarButtonCargarCDMouseReleased
        AplicarButtonCargarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_AplicarButtonCargarCDMouseReleased

    private void PilotoModificarButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PilotoModificarButtonMousePressed
        PilotoModificarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_PilotoModificarButtonMousePressed

    private void PilotoModificarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PilotoModificarButtonMouseReleased
       PilotoModificarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_PilotoModificarButtonMouseReleased

    private void CDModificarButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CDModificarButtonMousePressed
        CDModificarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_CDModificarButtonMousePressed

    private void CDModificarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CDModificarButtonMouseReleased
       CDModificarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_CDModificarButtonMouseReleased

    private void VolverButtonElegirModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonElegirModificarMousePressed
        VolverButtonElegirModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonElegirModificarMousePressed

    private void VolverButtonElegirModificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonElegirModificarMouseReleased
        VolverButtonElegirModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonElegirModificarMouseReleased

    private void VolverButtonModificarPilotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonModificarPilotoMousePressed
        VolverButtonModificarPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonModificarPilotoMousePressed

    private void VolverButtonModificarPilotoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonModificarPilotoMouseReleased
       VolverButtonModificarPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonModificarPilotoMouseReleased

    private void AplicarModificaciónPilotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AplicarModificaciónPilotoMousePressed
        AplicarModificaciónPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_AplicarModificaciónPilotoMousePressed

    private void AplicarModificaciónPilotoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AplicarModificaciónPilotoMouseReleased
       AplicarModificaciónPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_AplicarModificaciónPilotoMouseReleased

    private void BuscarButtonPilotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarButtonPilotoMousePressed
        BuscarButtonPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_BuscarButtonPilotoMousePressed

    private void BuscarButtonPilotoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarButtonPilotoMouseReleased
        BuscarButtonPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_BuscarButtonPilotoMouseReleased

    private void VolverButtonCDModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonCDModificarMousePressed
        VolverButtonCDModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonCDModificarMousePressed

    private void VolverButtonCDModificarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonCDModificarMouseReleased
        VolverButtonCDModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonCDModificarMouseReleased

    private void AplicarButtonModificarCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AplicarButtonModificarCDMousePressed
       ButtonInfoEquipos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_AplicarButtonModificarCDMousePressed

    private void AplicarButtonModificarCDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AplicarButtonModificarCDMouseReleased
       AplicarButtonModificarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_AplicarButtonModificarCDMouseReleased

    private void BuscarCDModificarButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarCDModificarButtonMousePressed
        BuscarCDModificarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_BuscarCDModificarButtonMousePressed

    private void BuscarCDModificarButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarCDModificarButtonMouseReleased
        BuscarCDModificarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_BuscarCDModificarButtonMouseReleased

    private void ButtonPilotoEliminarElegirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPilotoEliminarElegirMousePressed
        ButtonPilotoEliminarElegir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonPilotoEliminarElegirMousePressed

    private void ButtonPilotoEliminarElegirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPilotoEliminarElegirMouseReleased
       ButtonPilotoEliminarElegir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonPilotoEliminarElegirMouseReleased

    private void ButtonCDEliminarElegirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCDEliminarElegirMousePressed
        ButtonCDEliminarElegir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonCDEliminarElegirMousePressed

    private void ButtonCDEliminarElegirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCDEliminarElegirMouseReleased
        ButtonCDEliminarElegir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonCDEliminarElegirMouseReleased

    private void VolverButtonElegirEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonElegirEliminarMousePressed
        VolverButtonElegirEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonElegirEliminarMousePressed

    private void VolverButtonElegirEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonElegirEliminarMouseReleased
        VolverButtonElegirEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonElegirEliminarMouseReleased

    private void ButtonEliminarPilotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonEliminarPilotoMousePressed
        ButtonEliminarPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonEliminarPilotoMousePressed

    private void ButtonEliminarPilotoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonEliminarPilotoMouseReleased
        ButtonEliminarPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonEliminarPilotoMouseReleased

    private void BuscarButtonPilotoEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarButtonPilotoEliminarMousePressed
        BuscarButtonPilotoEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_BuscarButtonPilotoEliminarMousePressed

    private void BuscarButtonPilotoEliminarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarButtonPilotoEliminarMouseReleased
        BuscarButtonPilotoEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_BuscarButtonPilotoEliminarMouseReleased

    private void VolverButtonEliminarPilotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonEliminarPilotoMousePressed
        VolverButtonEliminarPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonEliminarPilotoMousePressed

    private void VolverButtonEliminarPilotoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonEliminarPilotoMouseReleased
        VolverButtonEliminarPiloto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonEliminarPilotoMouseReleased

    private void BuscarButtonEliminarCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarButtonEliminarCDMousePressed
        BuscarButtonEliminarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_BuscarButtonEliminarCDMousePressed

    private void BuscarButtonEliminarCDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarButtonEliminarCDMouseReleased
        BuscarButtonEliminarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_BuscarButtonEliminarCDMouseReleased

    private void EliminarButtonCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarButtonCDMousePressed
        EliminarButtonCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_EliminarButtonCDMousePressed

    private void EliminarButtonCDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarButtonCDMouseReleased
        EliminarButtonCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_EliminarButtonCDMouseReleased

    private void VolverButtonEliminarCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonEliminarCDMousePressed
       VolverButtonEliminarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonEliminarCDMousePressed

    private void VolverButtonEliminarCDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonEliminarCDMouseReleased
        VolverButtonEliminarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonEliminarCDMouseReleased

    private void ButtonInfoEquiposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInfoEquiposMousePressed
        ButtonInfoEquipos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonInfoEquiposMousePressed

    private void ButtonInfoEquiposMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInfoEquiposMouseReleased
        ButtonInfoEquipos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonInfoEquiposMouseReleased

    private void ButtonInfoCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInfoCDMousePressed
        ButtonInfoCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonInfoCDMousePressed

    private void ButtonInfoCDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInfoCDMouseReleased
        ButtonInfoCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonInfoCDMouseReleased

    private void ButtonInfoPilotosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInfoPilotosMousePressed
        ButtonInfoPilotos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonInfoPilotosMousePressed

    private void ButtonInfoPilotosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonInfoPilotosMouseReleased
        ButtonInfoPilotos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonInfoPilotosMouseReleased

    private void ButtonSonyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSonyMousePressed
        ButtonSony.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonSonyMousePressed

    private void ButtonSonyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSonyMouseReleased
       ButtonSony.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonSonyMouseReleased

    private void ButtonNintendoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonNintendoMousePressed
        ButtonNintendo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonNintendoMousePressed

    private void ButtonNintendoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonNintendoMouseReleased
       ButtonNintendo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonNintendoMouseReleased

    private void ButtonBandaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBandaiMousePressed
        ButtonBandai.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonBandaiMousePressed

    private void ButtonBandaiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBandaiMouseReleased
        ButtonBandai.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonBandaiMouseReleased

    private void ButtonSegaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSegaMousePressed
       ButtonSega.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonSegaMousePressed

    private void ButtonSegaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSegaMouseReleased
        ButtonSega.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonSegaMouseReleased

    private void ButtonVocaloidMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonVocaloidMousePressed
        ButtonVocaloid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonVocaloidMousePressed

    private void ButtonVocaloidMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonVocaloidMouseReleased
        ButtonVocaloid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonVocaloidMouseReleased

    private void ButtonRetroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRetroMousePressed
        ButtonRetro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonRetroMousePressed

    private void ButtonRetroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonRetroMouseReleased
       ButtonRetro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonRetroMouseReleased

    private void ButtonUbisoftMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonUbisoftMousePressed
        ButtonUbisoft.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonUbisoftMousePressed

    private void ButtonUbisoftMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonUbisoftMouseReleased
        ButtonUbisoft.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonUbisoftMouseReleased

    private void ButtonCapcomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCapcomMousePressed
        ButtonCapcom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonCapcomMousePressed

    private void ButtonCapcomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCapcomMouseReleased
       ButtonCapcom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonCapcomMouseReleased

    private void ButtonCartoonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCartoonMousePressed
        ButtonCartoon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonCartoonMousePressed

    private void ButtonCartoonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCartoonMouseReleased
        ButtonCartoon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonCartoonMouseReleased

    private void ButtonIndieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonIndieMousePressed
        ButtonIndie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonIndieMousePressed

    private void ButtonIndieMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonIndieMouseReleased
        ButtonIndie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonIndieMouseReleased

    private void VolverButtonMostrarEquiposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonMostrarEquiposMousePressed
        VolverButtonMostrarEquipos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonMostrarEquiposMousePressed

    private void VolverButtonMostrarEquiposMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonMostrarEquiposMouseMoved
        VolverButtonMostrarEquipos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonMostrarEquiposMouseMoved

    private void VolverButtonSonyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonSonyMousePressed
        VolverButtonSony.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonSonyMousePressed

    private void VolverButtonSonyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonSonyMouseReleased
        VolverButtonSony.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonSonyMouseReleased

    private void VolverButtonNintendoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonNintendoMousePressed
        VolverButtonNintendo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonNintendoMousePressed

    private void VolverButtonNintendoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonNintendoMouseReleased
        VolverButtonNintendo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonNintendoMouseReleased

    private void VolverButtonSegaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonSegaMousePressed
        VolverButtonSega.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonSegaMousePressed

    private void VolverButtonSegaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonSegaMouseReleased
        VolverButtonSega.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonSegaMouseReleased

    private void VolverButtonBandaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonBandaiMousePressed
        VolverButtonBandai.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonBandaiMousePressed

    private void VolverButtonBandaiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonBandaiMouseReleased
        VolverButtonBandai.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonBandaiMouseReleased

    private void VolverButtonRetroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonRetroMousePressed
        VolverButtonRetro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonRetroMousePressed

    private void VolverButtonRetroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonRetroMouseReleased
        VolverButtonRetro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonRetroMouseReleased

    private void VolverButtonVocaloidMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonVocaloidMousePressed
        VolverButtonVocaloid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonVocaloidMousePressed

    private void VolverButtonVocaloidMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonVocaloidMouseReleased
       VolverButtonVocaloid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonVocaloidMouseReleased

    private void VolverButtonCapcomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonCapcomMousePressed
        VolverButtonCapcom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonCapcomMousePressed

    private void VolverButtonCapcomMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonCapcomMouseReleased
        VolverButtonCapcom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonCapcomMouseReleased

    private void VolverButtonSony7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonSony7MousePressed
        VolverButtonSony7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonSony7MousePressed

    private void VolverButtonSony7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonSony7MouseReleased
        VolverButtonSony7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonSony7MouseReleased

    private void VolverButtonIndieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonIndieMousePressed
        VolverButtonIndie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonIndieMousePressed

    private void VolverButtonIndieMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonIndieMouseReleased
        VolverButtonIndie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonIndieMouseReleased

    private void VolverButtonCartoonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonCartoonMousePressed
        VolverButtonCartoon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonCartoonMousePressed

    private void VolverButtonCartoonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonCartoonMouseReleased
        VolverButtonCartoon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonCartoonMouseReleased

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_jButton4MouseReleased

    private void ButtonPilotoMayorPenalizacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPilotoMayorPenalizacionesMousePressed
        ButtonPilotoMayorPenalizaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_ButtonPilotoMayorPenalizacionesMousePressed

    private void ButtonPilotoMayorPenalizacionesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonPilotoMayorPenalizacionesMouseReleased
        ButtonPilotoMayorPenalizaciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_ButtonPilotoMayorPenalizacionesMouseReleased

    private void Button_Pilotos_PuntosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Pilotos_PuntosMousePressed
        Button_Pilotos_Puntos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_Button_Pilotos_PuntosMousePressed

    private void Button_Pilotos_PuntosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_Pilotos_PuntosMouseReleased
        Button_Pilotos_Puntos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_Button_Pilotos_PuntosMouseReleased

    private void VolverButtonCartoon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonCartoon1MousePressed
        VolverButtonCartoon1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonCartoon1MousePressed

    private void VolverButtonCartoon1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonCartoon1MouseReleased
       VolverButtonCartoon1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonCartoon1MouseReleased

    private void VolverButtonMostrarCDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonMostrarCDMousePressed
       VolverButtonMostrarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_VolverButtonMostrarCDMousePressed

    private void VolverButtonMostrarCDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverButtonMostrarCDMouseReleased
        VolverButtonMostrarCD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_VolverButtonMostrarCDMouseReleased

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
       jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_jButton1MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    
    initEquipo();
    cargar_CD();
    CargarCantPil();
    CargarPilotos();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new NewJFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AplicarButtonCargarCD;
    private javax.swing.JButton AplicarButtonCargarPiloto;
    private javax.swing.JButton AplicarButtonModificarCD;
    private javax.swing.JButton AplicarModificaciónPiloto;
    private javax.swing.JButton BuscarButtonEliminarCD;
    private javax.swing.JButton BuscarButtonPiloto;
    private javax.swing.JButton BuscarButtonPilotoEliminar;
    private javax.swing.JButton BuscarCDModificarButton;
    private javax.swing.JButton ButtonBandai;
    private javax.swing.JButton ButtonCDEliminarElegir;
    private javax.swing.JButton ButtonCapcom;
    private javax.swing.JButton ButtonCartoon;
    private javax.swing.JButton ButtonEliminarPiloto;
    private javax.swing.JLabel ButtonEquipos;
    private javax.swing.JButton ButtonIndie;
    private javax.swing.JButton ButtonInfoCD;
    private javax.swing.JButton ButtonInfoEquipos;
    private javax.swing.JButton ButtonInfoPilotos;
    private javax.swing.JButton ButtonNintendo;
    private javax.swing.JButton ButtonPilotoEliminarElegir;
    private javax.swing.JButton ButtonPilotoMayorPenalizaciones;
    private javax.swing.JButton ButtonRetro;
    private javax.swing.JButton ButtonSega;
    private javax.swing.JButton ButtonSony;
    private javax.swing.JButton ButtonUbisoft;
    private javax.swing.JButton ButtonVocaloid;
    private javax.swing.JButton Button_Pilotos_Puntos;
    private javax.swing.JButton CDModificarButton;
    private javax.swing.JButton CargarButton;
    private javax.swing.JCheckBox CheckCargarInternacionalFIA;
    private javax.swing.JCheckBox CheckCargarLicenciaFIAPiloto;
    private javax.swing.JCheckBox CheckModificarFIACD;
    private javax.swing.JButton ComisarioDeportivoCargarButton;
    private javax.swing.JLabel DescripciónCargar;
    private javax.swing.JLabel DescripciónEliminarCD;
    private javax.swing.JLabel DescripciónEliminarPiloto;
    private javax.swing.JLabel DescripciónInicio;
    private javax.swing.JLabel DescripciónPrecarga1;
    private javax.swing.JLabel DescripciónPrecarga2;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton EliminarButton;
    private javax.swing.JButton EliminarButtonCD;
    private javax.swing.JButton InfoButton;
    private javax.swing.JButton InitButton;
    private javax.swing.JTable ListaBandai;
    private javax.swing.JTable ListaCapcom;
    private javax.swing.JList<String> ListaCargarEquipoPíloto;
    private javax.swing.JList<String> ListaCargarRolPiloto;
    private javax.swing.JTable ListaCartoon;
    private javax.swing.JTable ListaIndie;
    private javax.swing.JList<String> ListaModificarRolPiloto;
    private javax.swing.JTable ListaNintendo;
    private javax.swing.JTable ListaPilotos;
    private javax.swing.JTable ListaRetro;
    private javax.swing.JTable ListaSega;
    private javax.swing.JTable ListaSony;
    private javax.swing.JTable ListaUbisoft;
    private javax.swing.JTable ListaVocaloid;
    private javax.swing.JButton ModificarButton;
    private javax.swing.JPanel PanelBandai;
    private javax.swing.JPanel PanelBotonesEditar;
    private javax.swing.JPanel PanelBotonesInformación;
    private javax.swing.JPanel PanelBotonesPermanentes;
    private javax.swing.JPanel PanelCapcom;
    private javax.swing.JPanel PanelCartoon;
    private javax.swing.JPanel PanelComisarioDeportivoCargar;
    private javax.swing.JPanel PanelComisarioDeportivoModificar;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JPanel PanelEditar;
    private javax.swing.JPanel PanelElegirCargar;
    private javax.swing.JPanel PanelElegirEliminar;
    private javax.swing.JPanel PanelElegirModificar;
    private javax.swing.JPanel PanelEliminarComisarioDeportivo;
    private javax.swing.JPanel PanelEliminarPiloto;
    private javax.swing.JPanel PanelIndie;
    private javax.swing.JPanel PanelInfo;
    private javax.swing.JPanel PanelInicio;
    private javax.swing.JPanel PanelMostrarComisariosDeportivos;
    private javax.swing.JPanel PanelMostrarEquipos;
    private javax.swing.JPanel PanelNintendo;
    private javax.swing.JPanel PanelPilotoCargar;
    private javax.swing.JPanel PanelPilotoModificar;
    private javax.swing.JPanel PanelPilotos;
    private javax.swing.JPanel PanelRetro;
    private javax.swing.JPanel PanelSega;
    private javax.swing.JPanel PanelSony;
    private javax.swing.JPanel PanelUbisoft;
    private javax.swing.JPanel PanelVocaloid;
    private javax.swing.JButton PilotoCargarButton;
    private javax.swing.JButton PilotoModificarButton;
    private javax.swing.JButton PrecargaButton;
    private javax.swing.JButton SalirButton;
    private javax.swing.JScrollPane ScrollPanelBandai;
    private javax.swing.JScrollPane ScrollPanelCD1;
    private javax.swing.JScrollPane ScrollPanelCapcom;
    private javax.swing.JScrollPane ScrollPanelCartoon;
    private javax.swing.JScrollPane ScrollPanelEquipoPiloto;
    private javax.swing.JScrollPane ScrollPanelIndie;
    private javax.swing.JScrollPane ScrollPanelNintendo;
    private javax.swing.JScrollPane ScrollPanelPilotos;
    private javax.swing.JScrollPane ScrollPanelRetro;
    private javax.swing.JScrollPane ScrollPanelRolB;
    private javax.swing.JScrollPane ScrollPanelRolPiloto;
    private javax.swing.JScrollPane ScrollPanelSega;
    private javax.swing.JScrollPane ScrollPanelSony;
    private javax.swing.JScrollPane ScrollPanelUbisoft;
    private javax.swing.JScrollPane ScrollPanelVocaloid;
    private javax.swing.JTable TablaMostrarCD;
    private javax.swing.JLabel Text_Cant_Probador;
    private javax.swing.JLabel Text_Cant_Reserva;
    private javax.swing.JLabel Text_Cant_Titular;
    private javax.swing.JLabel TextoAbandonos;
    private javax.swing.JLabel TextoAbandonosB;
    private javax.swing.JLabel TextoApellido;
    private javax.swing.JLabel TextoApellidoB;
    private javax.swing.JLabel TextoApellidoC;
    private javax.swing.JTextField TextoApellidoCDBuscar;
    private javax.swing.JLabel TextoApellidob;
    private javax.swing.JLabel TextoApellidoc;
    private javax.swing.JLabel TextoAño;
    private javax.swing.JLabel TextoAñoCD;
    private javax.swing.JTextField TextoBuscarApellidoPiloto;
    private javax.swing.JTextField TextoBuscarNombrePiloto;
    private javax.swing.JTextField TextoCargarAbandonosPiloto;
    private javax.swing.JTextField TextoCargarApellidoCD;
    private javax.swing.JTextField TextoCargarApellidoPiloto;
    private javax.swing.JLabel TextoCargarApellidoTextoNombreCD;
    private javax.swing.JTextField TextoCargarAñoCD;
    private javax.swing.JTextField TextoCargarAñoPiloto;
    private javax.swing.JTextField TextoCargarDiaCD;
    private javax.swing.JTextField TextoCargarDiaPiloto;
    private javax.swing.JTextField TextoCargarMesCD;
    private javax.swing.JTextField TextoCargarMesPiloto;
    private javax.swing.JTextField TextoCargarNacionalidadCD;
    private javax.swing.JTextField TextoCargarNacionalidadPiloto;
    private javax.swing.JTextField TextoCargarNombreCD;
    private javax.swing.JTextField TextoCargarNombrePiloto;
    private javax.swing.JTextField TextoCargarNumeroAutoPiloto;
    private javax.swing.JTextField TextoCargarPenalizacionesPiloto;
    private javax.swing.JTextField TextoCargarPodiosPiloto;
    private javax.swing.JTextField TextoCargarPolesPiloto;
    private javax.swing.JTextField TextoCargarPuntosPiloto;
    private javax.swing.JTextField TextoCargarSancionesCD;
    private javax.swing.JTextField TextoCargarVueltasRapidasPiloto;
    private javax.swing.JLabel TextoDescripcionModificarCD;
    private javax.swing.JLabel TextoDescripcionModificarPiloto;
    private javax.swing.JLabel TextoDia;
    private javax.swing.JLabel TextoDiaCD;
    private javax.swing.JTextField TextoEliminarApellidoCD;
    private javax.swing.JTextField TextoEliminarApellidoPiloto;
    private javax.swing.JTextField TextoEliminarNombreCD;
    private javax.swing.JTextField TextoEliminarNombrePiloto;
    private javax.swing.JLabel TextoEquipo;
    private javax.swing.JLabel TextoFecha;
    private javax.swing.JLabel TextoFechaCD;
    private javax.swing.JLabel TextoFiltrarCDFIA3;
    private javax.swing.JLabel TextoIntFIAb;
    private javax.swing.JLabel TextoInternacionalFIACD;
    private javax.swing.JLabel TextoLicenciaFIA;
    private javax.swing.JLabel TextoMes;
    private javax.swing.JLabel TextoMesCD;
    private javax.swing.JTextField TextoModificarAbandonoPiloto;
    private javax.swing.JLabel TextoModificarElegir;
    private javax.swing.JTextField TextoModificarNumeroAutoPiloto;
    private javax.swing.JTextField TextoModificarPenalizacionesPiloto;
    private javax.swing.JTextField TextoModificarPodiosPiloto;
    private javax.swing.JTextField TextoModificarPolesPiloto;
    private javax.swing.JTextField TextoModificarPuntosPiloto;
    private javax.swing.JTextField TextoModificarSancionesCD;
    private javax.swing.JTextField TextoModificarVueltasPiloto;
    private javax.swing.JLabel TextoNacionalidadCD;
    private javax.swing.JLabel TextoNacionalidadPiloto;
    private javax.swing.JLabel TextoNombre;
    private javax.swing.JLabel TextoNombreB;
    private javax.swing.JLabel TextoNombreC;
    private javax.swing.JLabel TextoNombreCD;
    private javax.swing.JTextField TextoNombreCDBuscar;
    private javax.swing.JLabel TextoNombreb;
    private javax.swing.JLabel TextoNombrec;
    private javax.swing.JLabel TextoNumeroAuto;
    private javax.swing.JLabel TextoNumeroAutoB;
    private javax.swing.JLabel TextoPenalizaciones;
    private javax.swing.JLabel TextoPenalizacionesB;
    private javax.swing.JLabel TextoPodios;
    private javax.swing.JLabel TextoPodiosB;
    private javax.swing.JLabel TextoPoles;
    private javax.swing.JLabel TextoPolesB;
    private javax.swing.JLabel TextoPuntos;
    private javax.swing.JLabel TextoPuntosB;
    private javax.swing.JTextField TextoPuntosMayor;
    private javax.swing.JLabel TextoRol;
    private javax.swing.JLabel TextoRolB;
    private javax.swing.JLabel TextoSancionesCD;
    private javax.swing.JLabel TextoSancionesb;
    private javax.swing.JLabel TextoTituloCD;
    private javax.swing.JLabel TextoTituloIngresarPiloto;
    private javax.swing.JLabel TextoVueltasB;
    private javax.swing.JLabel TextoVueltasRápidas;
    private javax.swing.JLabel Texto_Cant_Pil_Bandai;
    private javax.swing.JLabel Texto_Cant_Pil_Capcom;
    private javax.swing.JLabel Texto_Cant_Pil_Cartoon;
    private javax.swing.JLabel Texto_Cant_Pil_Indie;
    private javax.swing.JLabel Texto_Cant_Pil_Nintendo;
    private javax.swing.JLabel Texto_Cant_Pil_Retro;
    private javax.swing.JLabel Texto_Cant_Pil_Sega;
    private javax.swing.JLabel Texto_Cant_Pil_Sony;
    private javax.swing.JLabel Texto_Cant_Pil_Ubisoft;
    private javax.swing.JLabel Texto_Cant_Pil_Vocaloid;
    private javax.swing.JLabel Texto_cant_Bandai;
    private javax.swing.JLabel Texto_cant_Capcom;
    private javax.swing.JLabel Texto_cant_Cartoon;
    private javax.swing.JLabel Texto_cant_Indie;
    private javax.swing.JLabel Texto_cant_Nintendo;
    private javax.swing.JLabel Texto_cant_Retro;
    private javax.swing.JLabel Texto_cant_Sega;
    private javax.swing.JLabel Texto_cant_Ubisoft;
    private javax.swing.JLabel Texto_cant_Vocaloid;
    private javax.swing.JLabel Texto_cant_sony;
    private javax.swing.JLabel TituloCDMostrar;
    private javax.swing.JLabel TituloEdicion;
    private javax.swing.JLabel TituloEliminarCD;
    private javax.swing.JLabel TituloEliminarElegir;
    private javax.swing.JLabel TituloModCD;
    private javax.swing.JLabel TituloPrograma;
    private javax.swing.JLabel TítuloBandai;
    private javax.swing.JLabel TítuloCapcom;
    private javax.swing.JLabel TítuloEliminarPiloto;
    private javax.swing.JLabel TítuloIndie;
    private javax.swing.JLabel TítuloInformación;
    private javax.swing.JLabel TítuloModificarPiloto;
    private javax.swing.JLabel TítuloNintendo;
    private javax.swing.JLabel TítuloPilotos;
    private javax.swing.JLabel TítuloRetro;
    private javax.swing.JLabel TítuloSega;
    private javax.swing.JLabel TítuloSony;
    private javax.swing.JLabel TítuloSony8;
    private javax.swing.JLabel TítuloUbisoft;
    private javax.swing.JLabel TítuloVocaloid;
    private javax.swing.JButton VolverButtonBandai;
    private javax.swing.JButton VolverButtonCDModificar;
    private javax.swing.JButton VolverButtonCapcom;
    private javax.swing.JButton VolverButtonCargarCD;
    private javax.swing.JButton VolverButtonCargarPiloto;
    private javax.swing.JButton VolverButtonCartoon;
    private javax.swing.JButton VolverButtonCartoon1;
    private javax.swing.JButton VolverButtonElegirCargar;
    private javax.swing.JButton VolverButtonElegirEliminar;
    private javax.swing.JButton VolverButtonElegirModificar;
    private javax.swing.JButton VolverButtonEliminarCD;
    private javax.swing.JButton VolverButtonEliminarPiloto;
    private javax.swing.JButton VolverButtonIndie;
    private javax.swing.JButton VolverButtonModificarPiloto;
    private javax.swing.JButton VolverButtonMostrarCD;
    private javax.swing.JButton VolverButtonMostrarEquipos;
    private javax.swing.JButton VolverButtonNintendo;
    private javax.swing.JButton VolverButtonRetro;
    private javax.swing.JButton VolverButtonSega;
    private javax.swing.JButton VolverButtonSony;
    private javax.swing.JButton VolverButtonSony7;
    private javax.swing.JButton VolverButtonVocaloid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
