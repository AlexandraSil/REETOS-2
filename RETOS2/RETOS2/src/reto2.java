import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        int n=5;
        int i;
        int vidas=4;
        String palabraoculta="hola";
        Scanner lectura = new Scanner(System.in);

        String[] palabra = new String[] { "h","o","l","a" };
        String[] letras = new String[3];
       
        for (i = 0; i < n; i++) {
            System.out.println("tienes  " + vidas + " vidas");
            System.out.println("por favor digite la letra ");
            letras[i]=lectura.next();

            if(letras[i].equals(palabra[0])){
    
            }
            else if(letras[i].equals(palabra[1])){
                
            }
            else if(letras[i].equals(palabra[2])){
                
            }
            else if(letras[i].equals(palabra[3])){
                
            }
            else if(letras[i].equals(palabraoculta)){
                System.out.println("excelente descubriste la palabra oculta que es "+palabraoculta);
                System.out.println(palabra[0]);
                System.out.println(palabra[1]);
                System.out.println(palabra[2]);
                System.out.println(palabra[3]);
                break;
            }
            else if(vidas==0){
                break;
            }
            else if(letras[i]!=palabra[i]){
                System.out.println("no has asertado pierdes un vida "+ (vidas --));
            }
        }
    

        lectura.close();
        System.out.println("gracias por jugar");
    }
}