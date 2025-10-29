
package Modelos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ArchivoDeTexto {
    private String         nombrearchivo;
    private FileWriter     escritura;
    private BufferedWriter bufferedescritura;
    private FileReader     lectura;
    private BufferedReader bufferedlectura;
    
    
    ArchivoDeTexto(String nombrearchivo){
        this.nombrearchivo = nombrearchivo;
    }
    
    
    public void AbrirArchivo(boolean modo, String nombrearchivo) throws IOException{
        File Archivo = new File (nombrearchivo);//pueden cambiarle el nombre
        
        if(!Archivo.exists()){
            Archivo.createNewFile();
        }
        
        if(modo){
            escritura = new FileWriter(Archivo, modo);
            bufferedescritura = new BufferedWriter(escritura);
        }
        else{
            lectura = new FileReader(Archivo);
            bufferedlectura = new BufferedReader(lectura);
        }
    }
    
    public void EscribirArchivo(String texto, boolean modo, String nombrearchivo) throws IOException{
        AbrirArchivo(modo, nombrearchivo);
        if(bufferedescritura == null){
            throw new IOException("No se ha abierto el archivo para escribir");
        }
        else{
            bufferedescritura.write(texto); //ingreso la linea de texto en el archivo
            bufferedescritura.newLine();   //salto de linea
        }
    }
    
    public String LeerArchivo(String texto, boolean modo, String nombrearchivo) throws IOException{
        AbrirArchivo(modo, nombrearchivo);
        if(bufferedlectura == null){
            throw new IOException("No se ha abierto el archivo para leer");
        }
        String linea;
        while((linea = bufferedlectura.readLine()) != null){
            texto += linea + "\n";
        }
        return texto;
    }
    
    public void cerrarArchivo() throws IOException{
        
        if(bufferedescritura != null){
            bufferedescritura.close();
            bufferedescritura = null;
        }
        
        if(escritura != null){
            escritura.close();
            escritura = null;
        }
        
        if(bufferedlectura != null){
            bufferedlectura.close();
            bufferedlectura = null;
        }
        
        if(lectura != null){
            lectura.close();
            lectura = null;
        }
        
    }
 
}
