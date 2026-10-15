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
        System.out.println("radar: " + esPalindromo("radar"));
        System.out.println("java: " + esPalindromo("java"));
        System.out.println("Cadena vacía: " + esPalindromo(""));
        System.out.println("Anita lava la tina: " + esPalindromo("Anita lava la tina"));
        System.out.println("reconocer: " + esPalindromo("reconocer"));
        System.out.println("null: " + esPalindromo(null));
        System.out.println("a: " + esPalindromo("a"));
        
    }
        // Método wrapper: recibe la cadena y prepara los datos
        // antes de llamar al método recursivo.
        public static boolean esPalindromo(String cadena){
            // Si la entrada es nula, devuelve false para evitar
            // intentar utilizar métodos sobre una referencia inexistente.
            if (cadena == null){
                return false; 
            } 
            // Convierte el texto a minúsculas y elimina los espacios
            // para que no afecten la comparación.
            String cadenaValida = cadena.toLowerCase().replace(" ", "");
            // Inicia la comparación desde el primer y el último carácter.
            return verificar(cadenaValida, 0, cadenaValida.length() - 1);
        } 
        // Método recursivo que compara los caracteres de los extremos
        // y avanza hacia el centro de la cadena.
        private static boolean verificar(String cadena, int inicio, int fin){ 
            // Caso base: si los índices se encuentran o se cruzan,
            // todas las comparaciones anteriores fueron iguales.
            // También permite aceptar una cadena vacía o de un carácter.
            if (inicio >= fin){
                return true;
            }else{ 
                if (cadena.charAt(inicio) == cadena.charAt(fin)){
                    // Paso recursivo: avanza el inicio y retrocede el fin,
                    // reduciendo la parte de la cadena que falta revisar.
                    return verificar(cadena, inicio+1, fin-1);
                }else{
                    // Si los caracteres son diferentes, la cadena no es palíndroma.
                    return false;
                }
            }
        }
    
}
