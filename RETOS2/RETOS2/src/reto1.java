import java.util.Scanner;

public class reto1{
    public static void main(String[] args) {

        String nombre;
        String palabra;
        char [] palindromo;
        int izquierda=0;
        int derecha;

         Scanner lectura = new Scanner(System.in);{

        
         System.out.println("Ingresa su nombre");
         nombre=lectura.nextLine();

         System.out.println("Por favor ingrese la palabra");
         palabra = lectura.next();

         
         palabra = palabra.toLowerCase();
         palindromo=palabra.toCharArray();
         
         derecha=palindromo.length -1;
         
         while(izquierda< derecha){
            if(palindromo[izquierda] == palindromo[derecha]){
                derecha --;
                izquierda ++;
            } else{
                System.out.println("queri@:"+nombre+", la palabra no es un palindromo");
                break;
            }
         }
         if(izquierda ==derecha){
            System.out.println("querido usuari@:"+nombre+", la palabra "+palabra+" es un palindromo ");
         }
         lectura.close();
    }
}
 }