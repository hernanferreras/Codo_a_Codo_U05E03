
package u05e03;

import java.util.Scanner;

public class U05E03 {
    
    public static void main(String args[]) {
        int num1;
        boolean a;
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num1=entrada.nextInt();
        a=esPar(num1);
        System.out.print(a);
    }
    static boolean esPar (int a){
        boolean x;
        int par=(a%2);
        if (par==0){
            x=true;
        }else{
            x=false;
        }
        return(x);
    }
}