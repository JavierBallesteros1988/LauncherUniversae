/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Launcher;

import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel; 
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author javierballesteroscarcamo
 */
public class utilidades {
    public static void imp(JPanel content, JPanel instance){
        instance.setSize(content.getSize());
        instance.setLocation(0, 0);
        
        content.removeAll();
        content.add(instance);
        content.revalidate();
        content.repaint();
    }
    
    public static void reescala(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon (image.getImage().getScaledInstance(labelName.getSize().width, labelName.getSize().height, Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        labelName.repaint();
    
    }
    
    public static void reescala(JLabel labelName, String root, Dimension dimension){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon (image.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        labelName.repaint();
    }   


                        
      private static final String JSON_FILE_PATH = "src/Launcher/BaseDeDatos.json";
      public static String NombreGrado (int indexGrado) throws FileNotFoundException, IOException, JSONException { 
          try(BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_PATH))){
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine())!=null){
                sb.append(line);
            }
            JSONObject grado = new JSONObject(sb.toString()).getJSONArray("grados").getJSONObject(indexGrado);
            return grado.getString("nombre");
           
        }
          catch (IOException| JSONException e){
              return "Error al leer el archivo JSON";
          }
           }  
          
           public static String NombreJuego (int indexGrado, int indexJuego) throws FileNotFoundException, IOException, JSONException { 
          try(BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_PATH))){
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine())!=null){
                sb.append(line);
            }
            JSONObject grado = new JSONObject(sb.toString()).getJSONArray("grados").getJSONObject(indexGrado).getJSONArray("juegos").getJSONObject(indexJuego);
            return grado.getString("titulo");
        }
          catch (IOException| JSONException e){
              return "Error al leer el archivo JSON";
          }
           }
          
          public static String ImagenJuego (int indexGrado, int indexJuego) throws FileNotFoundException, IOException, JSONException { 
          try(BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_PATH))){
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine())!=null){
                sb.append(line);
            }
            JSONObject grado = new JSONObject(sb.toString()).getJSONArray("grados").getJSONObject(indexGrado).getJSONArray("juegos").getJSONObject(indexJuego);
            return grado.getString("imagen");
        }
          catch (IOException| JSONException e){
              return "Error al leer el archivo JSON";
          }
           }
          
          public static String RutaJuego (int indexGrado, int indexJuego) throws FileNotFoundException, IOException, JSONException { 
          try(BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_PATH))){
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine())!=null){
                sb.append(line);
            }
            JSONObject grado = new JSONObject(sb.toString()).getJSONArray("grados").getJSONObject(indexGrado).getJSONArray("juegos").getJSONObject(indexJuego);
            return grado.getString("ruta");
        }
          catch (IOException| JSONException e){
              return "Error al leer el archivo JSON";
          }
           }
          
          public static String DescripcionJuego (int indexGrado, int indexJuego) throws FileNotFoundException, IOException, JSONException { 
          try(BufferedReader br = new BufferedReader(new FileReader(JSON_FILE_PATH))){
            StringBuilder sb = new StringBuilder();
            String line;
            while((line = br.readLine())!=null){
                sb.append(line);
            }
            JSONObject grado = new JSONObject(sb.toString()).getJSONArray("grados").getJSONObject(indexGrado).getJSONArray("juegos").getJSONObject(indexJuego);
            return grado.getString("descripcion");
        }
          catch (IOException| JSONException e){
              return "Error al leer el archivo JSON";
          }
           }
          public static ArrayList <String> CrearListaString(String ruta, String nombre, String tipo, int tamaño){
              ArrayList <String > TempList = new ArrayList <>();
              for (int i =0; i<tamaño; i++){
                  TempList.add(ruta+nombre+i+tipo);
                  
                  
              }
            return TempList;  
          }

   
}
          
          
          
          

   
  




