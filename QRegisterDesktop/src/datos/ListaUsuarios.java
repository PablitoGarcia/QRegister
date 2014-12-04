/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public abstract class ListaUsuarios {
    public final static int CANTIDAD = 10;
    private static Usuario[] lista = new Usuario[CANTIDAD];
    
    
    private static String archivo = "array.db";
    private static FileInputStream fis = null;
    private static ObjectInputStream ois = null;
    private static FileOutputStream fos = null;
    private static ObjectOutputStream oos = null;
    
         public static boolean addUsuario(Usuario p){
        for (int i=0; i<lista.length;i++){
            if (lista[i]==null){
                lista[i]=p;
                System.out.println(lista[i]);
                return true;
            }
        }
        return false;
     }

    public static Usuario[] getLista() {
        return lista;
    }

    public static void setLista(Usuario[] lista) {
        ListaUsuarios.lista = lista;
    }
    
    
    
     public static boolean saveLista() {

        boolean saved = false;
         
            
        
        try {
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);

        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
            return false;
        } catch (IOException ex) {
            System.out.println("Error al guardar el archivo");
            return false;
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                    oos = null;
                }
                if (fos != null) {
                    fos.close();
                    fos = null;
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }        

        System.out.println("Guardado Correctamente");
        return true;
    }

    /*
     */
    public static boolean levantarObjetoEntero() {
        Usuario[] aux=null;

        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);

            aux = (Usuario[]) ois.readObject();
           
          
        }  catch (Exception e1) {
            System.out.println("Error!!!" + e1);
            return false;
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                    ois = null;
                }
                if (fis != null) {
                    fis.close();
                    fis = null;
                    
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }
        lista = aux;
        return true;
    }
     public static String verificarEntrada(String nom){
         for (int i=0; i<=lista.length; i++){
             if(lista[i].getNombre()==nom){
                 
             }
         }
        return null;
     }
     /* public static int darClave(){
        int count = 1200;
        for (int i=0; i<lista.length; i++){
            if (lista[i]!= null){
                count= count +1;
            }
        }
        return count;
     
   }*/
          public static int darClave(){
        
       
             int valorDado = (int) Math.floor(Math.random() * 800000 + 1);
              return valorDado;
        }
      
            }
        
       
     
   
          
     
      
