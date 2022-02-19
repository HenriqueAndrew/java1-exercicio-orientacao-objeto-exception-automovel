//Henrique Andrew da Silva

package Teste;

import java.util.ArrayList;
import java.util.List;

public class BDVeiculos {
    
    //ATRIBUTOS
    private static List <Passeio> BDPas = new ArrayList <Passeio>();      
    private static List <Carga> BDCarg = new ArrayList <Carga>();
    private static Leitura l1 = new Leitura();
    
    //METODOS
    public List <Passeio> getveicpas(){ 
        return BDPas;
    }    
    
    public void setveicpas(Passeio vp){
        BDPas.add(vp);
        }
    
    public List <Carga> getveicarg(){
        return BDCarg;
    }
    
    public void setveiccarg(Carga vc){
        BDCarg.add(vc);                
    }   
    
    public Passeio testaPlacap(Passeio vp) throws VeicExistException{        
        for(int i = 0; i < BDPas.size(); i++){
            try{
                if(BDPas.get(i).getplaca().equals(vp.getplaca())){
                throw new VeicExistException();
                }            
            }
            catch(NullPointerException npe){
                continue;
            }            
        }
        return null;
    }
    
    public Carga testaPlacac(Carga carga) throws VeicExistException{        
        for(int i = 0; i < BDCarg.size(); i++){
            try{
                if(BDCarg.get(i).getplaca().equals(carga.getplaca())){                
                throw new VeicExistException();
                }
            }
            catch(NullPointerException npe){
                continue;
            }
        }
        return null;
    }    
    
    public Passeio cadVeicPasseio(Passeio passeio){
        System.out.println("\n\n===============================\nCadastro de Veiculos de Passeio" + "\n===============================\n");     
        boolean existPlacaPasseio = true;
        while(existPlacaPasseio == true){
            passeio.setplaca(l1.entDados("Informe a Placa do Veiculo: "));        
            try{        
                testaPlacap(passeio);
                existPlacaPasseio = false;
            }
            catch(VeicExistException ePlacaExist){
                System.out.println(ePlacaExist.getMsg());
            }
        }
        passeio.setmarca(l1.entDados("Informe a Marca do Veiculo: "));
        passeio.setmodelo(l1.entDados("Informe o Modelo do Veiculo: "));
        passeio.setcor(l1.entDados("Informe a cor do Veículo: "));       
        boolean testaint = true;
        while(testaint){
            try{// verifica se digigou numero inteiro
                passeio.setqtdRodas(Integer.parseInt(l1.entDados("Informe a quantidade de Rodas do Veículo: ")));                
                passeio.getMotor().setqtdPist(Integer.parseInt(l1.entDados("Informe quantos pistões tem o Veículo: ")));
                passeio.getMotor().setpotencia(Integer.parseInt(l1.entDados("Informe a potência do Veículo: ")));
                passeio.setvelocMax(Integer.parseInt(l1.entDados("Informe a velocidade máxima do Veículo: ")));
                passeio.setQtdePassageiros(Integer.parseInt(l1.entDados("Informe a quantidade máxima de Passageiros do Veículo: ")));
                testaint = false;
                
            }
            catch(NumberFormatException eEntradaNum){
                System.out.println("\n===================================================\nErro de entrada de Dados: Deve entrar com número!!!\n===================================================");
            }
            catch(VelocException eveloc){
                System.out.println(eveloc.getMsg());                
            }
        }
        return passeio;
    }   
    
    
    public Carga cadVeicCarga(Carga carga){
        System.out.println("\n\n===============================\nCadastro de Veiculos de Carga" + "\n===============================\n");  
        boolean existPlacaCarga = true;
        while(existPlacaCarga == true){
            carga.setplaca(l1.entDados("Informe a Placa do Veiculo: "));                
            try{
                testaPlacac(carga);
                existPlacaCarga = false;
            }
            catch(VeicExistException ePlacaExist){                    
                System.out.println(ePlacaExist.getMsg());
            }
        }
        carga.setmarca(l1.entDados("Informe a Marca do Veiculo: "));
        carga.setmodelo(l1.entDados("Informe o Modelo do Veiculo: "));
        carga.setcor(l1.entDados("Informe a cor do Veículo: "));       
        boolean testaint = true;
        while(testaint){
            try{// verifica se digigou numero inteiro
                carga.setqtdRodas(Integer.parseInt(l1.entDados("Informe a quantidade de Rodas do Veículo: ")));                
                carga.getMotor().setqtdPist(Integer.parseInt(l1.entDados("Informe quantos pistões tem o Veículo: ")));
                carga.getMotor().setpotencia(Integer.parseInt(l1.entDados("Informe a potência do Veículo: ")));
                carga.setvelocMax(Integer.parseInt(l1.entDados("Informe a velocidade máxima do Veículo: ")));
                carga.setTara(Integer.parseInt(l1.entDados("Informe o Peso do Veículo: ")));
                carga.setCargaMax(Integer.parseInt(l1.entDados("Informe o limite de Carga do Veiculo: ")));
                testaint = false;
            }
            catch(NumberFormatException eEntradaNum){
                System.out.println("\n===================================================\nErro de entrada de Dados: Deve entrar com número!!!\n===================================================");
            }
            catch(VelocException eveloc){
                System.out.println(eveloc.getMsg());                
            }
        }        
        return carga;
    }
    
    public int consVeicPasseio(Passeio vp, int endereco){
        endereco = -1;
        for(int i = 0; i < BDPas.size(); i++){
            if(BDPas.get(i).getplaca().equals(vp.getplaca())){                                
                return i;
            }           
        }
        return endereco;
    }
    
    public int consVeicCarga(Carga vc, int endereco){
        endereco = -1;
        for(int i = 0; i < BDCarg.size(); i++){
            if(BDCarg.get(i).getplaca().equals(vc.getplaca())){
                return i;
            }             
        }
        return endereco; 
    }
    
    public void imprimirPasseio(){
        for(int i = 0; i < BDPas.size(); i++){
            System.out.println("\n===Veiculo Passeio===\n" 
                + "\nPlaca: " + BDPas.get(i).getplaca()
                + "\nMarca: " + BDPas.get(i).getmarca()
                + "\nModelo: " + BDPas.get(i).getmodelo()
                + "\nCor: " + BDPas.get(i).getcor()
                + "\nQuantidade de Rodas: " + BDPas.get(i).getqtdRodas()
                + "\nPistões: " + Integer.toString(BDPas.get(i).getMotor().getqtdPist())
                + "\nPotencia: " + Integer.toString(BDPas.get(i).getMotor().getpotencia())
                + "\nVelocidade Máxima: " + BDPas.get(i).calcVel(0)
                + "\nPassageiros: " + BDPas.get(i).getQtdePassageiros()
                + "\nQuantidade total de Letras: " + BDPas.get(i).calcular()); 
        }
    } 
    
    public void imprimirCarga(){
        for(int i = 0; i < BDCarg.size(); i++){
            System.out.println("\n===Veiculo Carga===\n"
                + "\nPlaca: " + BDCarg.get(i).getplaca()
                + "\nMarca: " + BDCarg.get(i).getmarca()
                + "\nModelo: " + BDCarg.get(i).getmodelo()
                + "\nCor: " + BDCarg.get(i).getcor()
                + "\nQuantidade de Rodas: " + BDCarg.get(i).getqtdRodas()
                + "\nPistões: " + Integer.toString(BDCarg.get(i).getMotor().getqtdPist())
                + "\nPotencia: " + Integer.toString(BDCarg.get(i).getMotor().getpotencia())
                + "\nVelocidade Máxima: " + BDCarg.get(i).calcVel(0)
                + "\nPeso do Veículo: " + BDCarg.get(i).getTara()
                + "\nCarga Máxima do Veículo: " + BDCarg.get(i).getCargaMax()
                + "\nSoma dos valores contidos nos atributos numéricos: " + BDCarg.get(i).calcular());
        }
    }
    
    public void delItemBDPas(int local){
        BDPas.remove(local);
    }
    
    public void delItemBDCarg(int local){
        BDCarg.remove(local);
    }
    
}

