//Henrique Andrew da Silva
package Teste;

//classe Passeio herdada de Veiculo (aplicado conceito heranca) e nao podendo ser estendidas (final)
final public class Passeio extends Veiculo implements Calc {
    int qtdePassageiros;

    //Construtor
    public Passeio() {
        this.qtdePassageiros = 0;
    }

    //metodos get e set para variaveis
    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    final public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }
 
    //sobrescrita do metodo calcVel (aplicado conceito de polimorfismo) - calculo de velocidade
    @Override
    public int calcVel(int velocMax) {
        if (super.getvelocMax() > 110){
            velocMax = 100 * 1000;
        }
        else{
            velocMax = super.getvelocMax() * 1000;
        }
        return velocMax;
    }
    
    //implementando metodo da interface Calc
    @Override
    public int calcular(){
        int somaL = 0;
        somaL += getplaca().length();
        somaL += getmarca().length();
        somaL += getmodelo().length();
        somaL += getcor().length();
        return somaL;
    }
}
