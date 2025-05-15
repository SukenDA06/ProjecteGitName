package projectgitdam;

import java.util.Scanner;

public class ProjectGitDAM {

    public static void main(String[] args) {
        int total;
        int primero;
        int segundo;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Primer numero: ");
        primero = entrada.nextInt();
        
        System.out.print("\n");
        
        System.out.print("Segundo numero: ");
        segundo = entrada.nextInt();
        
        total = primero + segundo;
        System.out.println("Numero total: "+total);
    }
    
}
