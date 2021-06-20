/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptador;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Arthur H. Rodrigues
 */
public class Encriptador {

    public static void main(String[] args) {
        
        Random random = new Random();
        
        
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*Ççabcdefghijklmnopqrstuvwxyz " ;
        String caracteresNovos = "" ;
        
        int n = (random.nextInt(caracteres.length()- 10)+10);
        
        
        int e = (caracteres.length() - n);
        
        for (int i = e; i < (caracteres.length()-1); i++) {
            
             caracteresNovos += (caracteres.charAt(i));  
        }
        
        for (int i = 0; i < e; i++) {
            
             caracteresNovos += (caracteres.charAt(i));  
        }
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Palavra a Ser Encriptada: ");
        String palavra = ler.nextLine();
        
        String palavraCrip="";
        
        for (int identificadorP = 0; identificadorP < palavra.length(); identificadorP++) {
            
            for (int identificadorC = 0; identificadorC < caracteres.length(); identificadorC++) {
                
                if (palavra.charAt(identificadorP)== caracteres.charAt(identificadorC)) {
                    
                    palavraCrip += caracteresNovos.charAt(identificadorC);
                    
                }
            }
        }
        
        palavraCrip += n;
        
        System.out.println("criptografado: "+palavraCrip);
        
        
        
        
    }
    
}
