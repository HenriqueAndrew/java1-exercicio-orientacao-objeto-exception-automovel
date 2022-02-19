//Henrique Andrew da Silva
package Teste;

//classe abstrata Veiculo
public abstract class Veiculo {
    private String placa; 
    private String marca; 
    private String modelo;
    private String cor;
    private int qtdRodas;
    private int velocMax;
    private Motor motor; //acoplagem (objeto da classe Motor)
    
    //construtor
    public Veiculo(){
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.qtdRodas = 0;
        this.velocMax = 0;
        this.motor = new Motor();
    }
    
    //metodos get e set para variaveis
    public String getplaca() {
		return placa;
    }
    
    final public void setplaca(String placa) {
		this.placa = placa;
    }
    
    public String getmarca() {
		return marca;
    }
    
    final public void setmarca(String marca) {
		this.marca = marca;
    }
    
    public String getmodelo() {
		return modelo;
    }
    
    final public void setmodelo(String modelo) {
		this.modelo = modelo;
    }
    
     public String getcor() {
		return cor;
    }
    
    final public void setcor(String cor) {
		this.cor = cor;
    }
    
    public int getvelocMax() {
		return velocMax;
    }
    
    final public void setvelocMax(int velocMax) throws VelocException {
		 if (velocMax >= 80 && velocMax <= 110){
            this.velocMax = velocMax;  
        } else {
            throw new VelocException(velocMax);
        }
    }
    
    public int getqtdRodas() {
		return qtdRodas;
    }
    
    final public void setqtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
    }

    public Motor getMotor() {
        return motor;
    }

    final public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    //metodo abstrato calcVel
    public abstract int calcVel(int velocMax);
           
}
