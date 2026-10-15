/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package espalindromo;

/**
 *
 * @author asaen
 */
public class EsPalindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("null: " + esPalindromo(null));
        
    }
        public static boolean esPalindromo(String cadena){
            if (cadena == null){
                return false; 
            } 
            String cadenaValida = cadena.toLowerCase().replace(" ", "");
            return verificar(cadenaValida, 0, cadenaValida.length() - 1);
        } 
        private static boolean verificar(String cadena, int inicio, int fin){ 
            if (inicio >= fin){
                return true;
            }else{ 
                if (cadena.charAt(inicio) == cadena.charAt(fin)){
                    return verificar(cadena, inicio+1, fin-1);
                }else{
                    return false;
                }
            }
        }
    
}
