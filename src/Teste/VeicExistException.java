//Henrique Andrew da Silva

package Teste;

//criar excecao placa existente
public class VeicExistException extends Exception {
    
    VeicExistException (){
        System.out.println("\n====================================\nJá existe um veículo com essa placa!\n====================================");
    }
    
    public String getMsg(){
        return "\n=====================================================================\nAcessando o metodo getmsg da excecao VeicExistException\n=====================================================================\n";
    }
}
