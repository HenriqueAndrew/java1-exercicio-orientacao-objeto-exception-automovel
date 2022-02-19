//Henrique Andrew da Silva
package Teste;

//classe Carga herdada de Veiculo (aplicado conceito heranca), e nao podendo ser estendidas (final)
final public class Carga extends Veiculo implements Calc {//resolucao subsidio 1.c.i)
    int tara;
    int cargaMax;

    //Construtor
    public Carga() {
        this.tara = 0;
        this.cargaMax = 0;
    }

    //metodos get e set para variaveis
    public int getTara() {
        return tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    final public void setTara(int tara) {
        this.tara = tara;
    }

    final public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    //sobrescrita do metodo calcVel (aplicado conceito de polimorfismo) - calculo de velocidade
     @Override
    public int calcVel(int velocMax) {
        if (super.getvelocMax() > 110){
            velocMax = 90 * 100000;
        }
        else{
        velocMax = super.getvelocMax() * 100000;
        }
        return velocMax;
    }
    //implementando metodo da interface Calc
    @Override
    public int calcular(){
        int somaV = 0;
        somaV += getMotor().getqtdPist();
        somaV += getMotor().getpotencia();
        somaV += getqtdRodas();
        somaV += getvelocMax();
        somaV += getTara();
        somaV += getCargaMax();
        return somaV;
    }
}
