/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Cadena;
import java.util.Scanner;

/**
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo
 * de String) y su longitud. En el main se creará el objeto y se le pedirá al
 * usuario que ingrese una frase que puede ser una palabra o varias palabras
 * separadas por un espacio en blanco y a través de los métodos set, se guardará
 * la frase y la longitud de manera automática según la longitud de la frase
 * ingresada. Deberá además implementar los siguientes métodos: a) Método
 * mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
 * frase ingresada. b) Método invertirFrase(), deberá invertir la frase
 * ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca",
 * Salida: "acnalb asac". c) Método vecesRepetido(String letra), recibirá un
 * carácter ingresado por el usuario y contabilizar cuántas veces se repite el
 * carácter en la frase, por ejemplo: d) Entrada: frase = "casa blanca". Salida:
 * El carácter 'a' se repite 4 veces. e) Método compararLongitud(String frase),
 * deberá comparar la longitud de la frase que compone la clase con otra nueva
 * frase ingresada por el usuario. f) Método unirFrases(String frase), deberá
 * unir la frase contenida en la clase Cadena con una nueva frase ingresada por
 * el usuario y mostrar la frase resultante. g) Método reemplazar(String letra),
 * deberá reemplazar todas las letras “a” que se encuentren en la frase, por
 * algún otro carácter seleccionado por el usuario y mostrar la frase
 * resultante. h) Método contiene(String letra), deberá comprobar si la frase
 * contiene una letra que ingresa el usuario y devuelve verdadero si la contiene
 * y falso si no.
 *
 * @author elias
 */
public class servicioCadena {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cadena crearFrase(){
        Cadena fr = new Cadena();
        System.out.println("Ingrese una frase");
        fr.setFrase(leer.next().toLowerCase());
        fr.setLongitud(fr.getFrase().length());
        return fr;
    }
    /**
     * Con el CharAt me compara letra de una cadena, con letra de otra cadena
     * si son iguales me suma.
     * @param fr 
     */
    public void mostrarVocales(Cadena fr){
        int cantVocales = 0;
        String vocales = "aeiou";
        for (int i = 0; i < fr.getLongitud(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if(fr.getFrase().charAt(i) == vocales.charAt(j)){
                    cantVocales++;
                }
            }
        }
        System.out.println("Tiene " + cantVocales + " Vocales");
    }
    
    /**
     * StringBuilder sirve para muchísimas 
     * cosas más ya tiene un método llamado
     * reverse, el cual solamente tenemos que llamar.
     * Eso sí, eso no regresa una cadena, 
     * por eso tenemos que llamar a toString
     * @param fr 
     */
    public void invertirFrase(Cadena fr){
        StringBuilder inversa = new StringBuilder(fr.getFrase());
        //String invertida = inversa.reverse().toString();
        System.out.println("Frase Original: " + fr.getFrase());
        System.out.println("Frase Invertida: " + inversa.reverse().toString());
    }
    /**
     * Funcion para contar cuantas veces se repite una letra
     * @param fr 
     */
    public void vecesRepetido(Cadena fr){
        System.out.println("Ingrese una letra para ver cuanto se repite");
        String letra = leer.next();
        int contador = 0;
        for (int i = 0; i < fr.getLongitud(); i++) {
            if(letra.equals(fr.getFrase().substring(i, i+1))){
                contador++;
            }
        }
        System.out.println("La letra " + letra + " se repite " + contador + " veces");
    }
    
    public void compararLongitud(Cadena fr){
        System.out.println("Ingrese una nueva frase para comparar su longitud");
        String nuevaFrase = leer.next();
        if(fr.getLongitud()== nuevaFrase.length()){
            System.out.println("Tienen la misma longitud");
        }else{
            System.out.println("No tienen la misma longitud");
        }
    }
    
    public void unirFrase(Cadena fr){
        System.out.println("Ingrese la frase para unirla a la siguiente");
        String nuevaFrase = leer.next();
        fr.setFrase(fr.getFrase().concat(" ").concat(nuevaFrase));
        System.out.println("La frase quedaria: " + fr.getFrase());
    }
    
    public void remplazar(Cadena fr){
        System.out.println("Ingrese una letra o frase, esta misma remplazara"
                + "\na la letra A");
        String letra = leer.next();
        String nuevaFrase = fr.getFrase().replaceAll("a", letra);
        System.out.println(nuevaFrase);
    }
    
    public void contiene(Cadena fr){
        System.out.println("Ingresa una letra o frase para ver si esta contenida");
        String nuevaFrase = leer.next();
        if(fr.getFrase().contains(nuevaFrase)){
            System.out.println("La letra o frase esta incluida dentro de esta");
        }else{
            System.out.println("La letra o frase no esta incluida");
        }
    }
}
