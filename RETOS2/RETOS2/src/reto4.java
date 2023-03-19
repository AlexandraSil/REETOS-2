import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) {

        String[][] matriz = new String[4][4];

        
        matriz[0]=new String[] {"7","8","9","x"};
        matriz[1]=new String[] {"4","5","6","-"};
        matriz[2]=new String[] {"1","2","3","4"};
        matriz[3]=new String[] {"0",".","=","/"};

    Scanner lectura = new Scanner(System.in);
    System.out.print("calculadora" );
    

for(int i=0;i<4;i++){
    System.out.println("");
    for (int j=0; j < 4; j++) {
        System.out.print (matriz[i][j]);
         System.out.print("\t");
}
}
    lectura.close();
}
    }