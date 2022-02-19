//Henrique Andrew da Silva
package Teste;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//Classe
public class Leitura {
    
    public String entDados(String titulo) {
        
        System.out.println(titulo);
        
        InputStreamReader tec = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(tec);
        
        String d = "";
        
        try{
            d = buff.readLine();
        }
        catch(IOException ioe){
            System.out.println("\n Erro de Entrada");
        }
        return d;
    }
}
