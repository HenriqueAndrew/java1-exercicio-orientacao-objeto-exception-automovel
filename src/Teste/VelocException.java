//Henrique Andrew da Silva

package Teste;


public class VelocException extends Exception{
    
    VelocException (int velocidade){
        System.out.println("\n======================================================\nA velocidade máxima está fora dos limites brasileiros!\n======================================================");
    }
    
    public String getMsg(){
        return "\n============================================\nAcessando o método da excessão VelocException\n============================================\n";
    }
}
