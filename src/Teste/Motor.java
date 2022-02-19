//Henrique Andrew da Silva
package Teste;

//classe Motor
public class  Motor {
    private int qtdPist;
    private int potencia;
    
    //construtor padrao
    public Motor(){
        this.qtdPist = 0;
        this.potencia = 0;
    }
    
    //metodos set e get para variaveis    
    public int getqtdPist() {
		return qtdPist;
	}
    
    final public void setqtdPist(int qtdPist) {
		this.qtdPist = qtdPist; 
	}
    
    public int getpotencia() {
		return potencia;
	}
    
    final public void setpotencia(int potencia){
		this.potencia = potencia;
	}
}
