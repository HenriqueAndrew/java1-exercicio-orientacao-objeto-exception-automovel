//Henrique Andrew da Silva
package Teste;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.util.List;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
      

public class Teste implements ActionListener {
            
    private static Leitura l1 = new Leitura();    
    private static BDVeiculos BDVeic = new BDVeiculos();
    private static List <Passeio> bdPas = BDVeic.getveicpas();
    private static Passeio p;
    private static Carga c;
    
    //Modelo Janela Inicial 
    private static JFrame sistVeiculos = new JFrame();
    
    private static JButton btPasseio = new JButton(); 
    private static JButton btCarga = new JButton(); 
    
    //Modelo Janela Menu Secundario
    private static JFrame menuSist = new JFrame();
    
    private static JButton cadastrarp = new JButton();
    private static JButton cadastrarc = new JButton();
    private static JButton consExcpp = new JButton();
    private static JButton consExccp = new JButton();
    private static JButton impExctp = new JButton();
    private static JButton impExctc = new JButton();
    private static JButton sairSist = new JButton();
    
    //Modelo Janela Cadastro Veiculo
    private static JFrame cadVeiculos = new JFrame();
    
    private static JLabel qtPassagl = new JLabel();
    private static JLabel placal = new JLabel();
    private static JLabel marcal = new JLabel();
    private static JLabel modelol = new JLabel();
    private static JLabel corl = new JLabel();
    private static JLabel qtRodasl = new JLabel();
    private static JLabel velMaxl = new JLabel();
    private static JLabel qtPistl = new JLabel();
    private static JLabel potl = new JLabel();
    private static JLabel taral = new JLabel();
    private static JLabel cargaMaxl = new JLabel();
    
    private static JTextField qtPassagt = new JTextField(2);
    private static JTextField placat = new JTextField(10);
    private static JTextField marcat = new JTextField(20);
    private static JTextField modelot = new JTextField(20);
    private static JTextField cort = new JTextField(20);
    private static JTextField qtRodast = new JTextField(2);
    private static JTextField velMaxt = new JTextField(3);
    private static JTextField qtPist = new JTextField(2);
    private static JTextField pott = new JTextField(3);
    private static JTextField tarat = new JTextField(4);
    private static JTextField cargaMaxt = new JTextField(4);    
        
    private static JButton cad = new JButton();
    private static JButton limp = new JButton();
    private static JButton novo = new JButton();
    private static JButton sair = new JButton();
    
    //Modelo Janela Consultar e Excluir pela placa
    //verificar necessidade de se replicar objetos jlabel sobre os campos
    private static JFrame consVeiculos = new JFrame();
    
    private static JButton cons = new JButton();
    private static JButton excl = new JButton();
    
    //Criando objeto para vinculo chamada de objetos
    private static Teste j = new Teste();
    private static Teste k = new Teste();
    
    //Modelo Tabela para Janelas Imprimir/Excluir todos
             //public class FormTab implements ActionListener{
        
        private static JFrame janTabela = new JFrame("Imprimir/Excluir Todos");
        
        private static JButton impTodos = new JButton("Imprimir Todos");
        private static JButton excTodos = new JButton("Excluir Todos");
        
        private static DefaultTableModel  modTabela = new DefaultTableModel();

        private static JTable tabela = new JTable(modTabela);

        private static JScrollPane barRolTab = new JScrollPane(tabela);

        private static Teste ft = new Teste();
    
   //Metodo actionPerformed para indicar as chamadas das acoes pelos botoes da JANELA MENU PRIMARIO    
    public void actionPerformed(ActionEvent evt){
            
            //System.out.println("\nVoce clicou no botao");
            if(evt.getSource().equals(btPasseio)){ //--se igual ao botao x disparar msg            
            
                System.out.println("\nVoce clicou no botao Menu Veiculos Passeio");
                menuSist.setSize(400,300);
                menuSist.setTitle("VEICULOS DE PASSEIO");
        
                cadastrarp.setText("CADASTRAR");        
                consExcpp.setText("CONSULTAR/EXCLUIR PELA PLACA");
                impExctp.setText("IMPRIMIR/EXCLUIR TODOS");
                sairSist.setText("CONSULTAR/EXCLUIR PELA PLACA");

                menuSist.add(cadastrarp);
                menuSist.add(consExcpp);
                menuSist.add(impExctp);
                menuSist.add(sairSist);
                
                cadastrarp.addActionListener(j);
                consExcpp.addActionListener(j);
                impExctp.addActionListener(j);
                sairSist.addActionListener(j);

                menuSist.setLayout(new FlowLayout());
                menuSist.setVisible(true);
            }
            
            if(evt.getSource().equals(btCarga)){
                menuSist.setSize(400,300);
                menuSist.setTitle("VEICULOS DE CARGA");

                cadastrarc.setText("CADASTRAR");        
                consExccp.setText("CONSULTAR/EXCLUIR PELA PLACA");
                impExctc.setText("IMPRIMIR/EXCLUIR TODOS");
                sairSist.setText("SAIR");

                menuSist.add(cadastrarc);
                menuSist.add(consExccp);
                menuSist.add(impExctc);
                menuSist.add(sairSist);
                
                cadastrarc.addActionListener(j);
                consExccp.addActionListener(j);
                impExctc.addActionListener(j);
                sairSist.addActionListener(j);

                menuSist.setLayout(new FlowLayout());
                menuSist.setVisible(true);
            }
            
            if(evt.getSource().equals(cadastrarp)){
                cadVeiculos.setSize(400, 500);
                cadVeiculos.setTitle("CADASTRO DE VEICULOS PASSEIO");
                qtPassagl.setText("Qtd de Passageiros: ");
                placal.setText("Placa: ");
                marcal.setText("Marca: ");
                modelol.setText("Modelo: ");
                corl.setText("Cor: ");
                qtRodasl.setText("Qtd. Rodas: ");
                velMaxl.setText("Velocidade Max.: ");
                qtPistl.setText("Qtd. Pistoes: ");
                potl.setText("Potencia: ");

                cad.setText("Cadastrar");
                limp.setText("Limpar");
                novo.setText("Novo");
                sair.setText("Sair");

                cadVeiculos.add(qtPassagl);
                cadVeiculos.add(qtPassagt);
                cadVeiculos.add(placal);
                cadVeiculos.add(placat);
                cadVeiculos.add(marcal);
                cadVeiculos.add(marcat);
                cadVeiculos.add(modelol);
                cadVeiculos.add(modelot);
                cadVeiculos.add(corl);
                cadVeiculos.add(cort);
                cadVeiculos.add(qtRodasl);
                cadVeiculos.add(qtRodast);
                cadVeiculos.add(velMaxl);
                cadVeiculos.add(velMaxt);
                cadVeiculos.add(qtPistl);
                cadVeiculos.add(qtPist);
                cadVeiculos.add(potl);
                cadVeiculos.add(pott);

                cadVeiculos.add(cad);
                cadVeiculos.add(limp);
                cadVeiculos.add(novo);
                cadVeiculos.add(sair);

                cad.addActionListener(j);
                limp.addActionListener(j);
                novo.addActionListener(j);
                sair.addActionListener(j);

                cadVeiculos.setLayout(new FlowLayout());
                cadVeiculos.setVisible(true);
            }
            
            if(evt.getSource().equals(cadastrarc)){
                
                cadVeiculos.setSize(400, 500);
                cadVeiculos.setTitle("CADASTRO DE VEICULOS CARGA");
                taral.setText("Tara: ");
                cargaMaxl.setText("Carga Max.: ");
                placal.setText("Placa: ");
                marcal.setText("Marca: ");
                modelol.setText("Modelo: ");
                corl.setText("Cor: ");
                qtRodasl.setText("Qtd. Rodas: ");
                velMaxl.setText("Velocidade Max.: ");
                qtPistl.setText("Qtd. Pistoes: ");
                potl.setText("Potencia: ");

                cad.setText("Cadastrar");
                limp.setText("Limpar");
                novo.setText("Novo");
                sair.setText("Sair");

                cadVeiculos.add(taral);
                cadVeiculos.add(tarat);
                cadVeiculos.add(cargaMaxl);
                cadVeiculos.add(cargaMaxt);
                cadVeiculos.add(placal);
                cadVeiculos.add(placat);
                cadVeiculos.add(marcal);
                cadVeiculos.add(marcat);
                cadVeiculos.add(modelol);
                cadVeiculos.add(modelot);
                cadVeiculos.add(corl);
                cadVeiculos.add(cort);
                cadVeiculos.add(qtRodasl);
                cadVeiculos.add(qtRodast);
                cadVeiculos.add(velMaxl);
                cadVeiculos.add(velMaxt);
                cadVeiculos.add(qtPistl);
                cadVeiculos.add(qtPist);
                cadVeiculos.add(potl);
                cadVeiculos.add(pott);

                cadVeiculos.add(cad);
                cadVeiculos.add(limp);
                cadVeiculos.add(novo);
                cadVeiculos.add(sair);

                cad.addActionListener(j);
                limp.addActionListener(j);
                novo.addActionListener(j);
                sair.addActionListener(j);

                cadVeiculos.setLayout(new FlowLayout());
                cadVeiculos.setVisible(true);
            }
            
            if(evt.getSource().equals(cad)){ //--se igual ao botao x disparar msg            
            
                System.out.println("\nVoce clicou no botao Cadastrar");
                p = new Passeio();
                p.setQtdePassageiros(Integer.parseInt(qtPassagt.getText()));
                p.setplaca(placat.getText());
                p.setmarca(marcat.getText());
                p.setmodelo(modelot.getText());
                p.setcor(cort.getText());
                p.setqtdRodas(Integer.parseInt(qtRodast.getText()));
                try{
                p.setvelocMax(Integer.parseInt(velMaxt.getText()));
                }
                catch(VelocException eveloc){
                    System.out.println(eveloc.getMsg());                
                }
                p.getMotor().setqtdPist(Integer.parseInt(qtPist.getText()));
                p.getMotor().setpotencia(Integer.parseInt(pott.getText()));

                BDVeic.cadVeicPasseio(p);

                qtPassagt.setText(null);
                placat.setText(null);
                marcat.setText(null);
                modelot.setText(null);
                cort.setText(null);
                qtRodast.setText(null);
                velMaxt.setText(null);
                qtPist.setText(null);
                pott.setText(null);
                tarat.setText(null);
                cargaMaxt.setText(null);
                qtPassagt.requestFocus();
            
            }
            
            if(evt.getSource().equals(limp)){ //--se igual ao botao x disparar msg            
            
                System.out.println("\nVoce clicou no botao Limpar");

                qtPassagt.setText(null);
                placat.setText(null);
                marcat.setText(null);
                modelot.setText(null);
                cort.setText(null);
                qtRodast.setText(null);
                velMaxt.setText(null);
                qtPist.setText(null);
                pott.setText(null);
                tarat.setText(null);
                cargaMaxt.setText(null);
                qtPassagt.requestFocus();
            }
            
            if(evt.getSource().equals(novo)){ //--se igual ao botao x disparar msg            
            
                System.out.println("\nVoce clicou no botao Novo Veiculo");
            }
            
            if(evt.getSource().equals(sair)){
                System.out.println("\nVoce clicou no botao Sair");
                janTabela.dispose();
            }

            if(evt.getSource().equals(consExcpp)){
                consVeiculos.setSize(400, 500);
                consVeiculos.setTitle("CONSULTAR/EXCLUIR VEICULO PASSEIO PELA PLACA");
                placal.setText("Informe a Placa: ");
                qtPassagl.setText("Qtd de Passageiros: ");        
                marcal.setText("Marca: ");
                modelol.setText("Modelo: ");
                corl.setText("Cor: ");
                qtRodasl.setText("Qtd. Rodas: ");
                velMaxl.setText("Velocidade Max.: ");
                qtPistl.setText("Qtd. Pistoes: ");
                potl.setText("Potencia: ");

                cons.setText("Consultar");
                excl.setText("Excluir");
                sair.setText("Sair");

                consVeiculos.add(placal);
                consVeiculos.add(placat);
                consVeiculos.add(qtPassagl);
                consVeiculos.add(qtPassagt);        
                consVeiculos.add(marcal);
                consVeiculos.add(marcat);
                consVeiculos.add(modelol);
                consVeiculos.add(modelot);
                consVeiculos.add(corl);
                consVeiculos.add(cort);
                consVeiculos.add(qtRodasl);
                consVeiculos.add(qtRodast);
                consVeiculos.add(velMaxl);
                consVeiculos.add(velMaxt);
                consVeiculos.add(qtPistl);
                consVeiculos.add(qtPist);
                consVeiculos.add(potl);
                consVeiculos.add(pott);

                consVeiculos.add(cons);
                consVeiculos.add(excl);
                consVeiculos.add(sair);        

                cons.addActionListener(j);
                excl.addActionListener(j);
                sair.addActionListener(j);

                consVeiculos.setLayout(new FlowLayout());
                consVeiculos.setVisible(true);            
            }

            if(evt.getSource().equals(consExccp)){
                consVeiculos.setSize(400, 500);
                consVeiculos.setTitle("CONSULTAR/EXCLUIR VEICULO CARGA PELA PLACA");
                placal.setText("Informe a Placa: ");
                taral.setText("Tara: ");
                cargaMaxl.setText("Carga Max.: ");       
                marcal.setText("Marca: ");
                modelol.setText("Modelo: ");
                corl.setText("Cor: ");
                qtRodasl.setText("Qtd. Rodas: ");
                velMaxl.setText("Velocidade Max.: ");
                qtPistl.setText("Qtd. Pistoes: ");
                potl.setText("Potencia: ");

                cons.setText("Consultar");
                excl.setText("Excluir");
                sair.setText("Sair");

                consVeiculos.add(placal);
                consVeiculos.add(placat);
                consVeiculos.add(taral);
                consVeiculos.add(tarat);
                consVeiculos.add(cargaMaxl);
                consVeiculos.add(cargaMaxt);       
                consVeiculos.add(marcal);
                consVeiculos.add(marcat);
                consVeiculos.add(modelol);
                consVeiculos.add(modelot);
                consVeiculos.add(corl);
                consVeiculos.add(cort);
                consVeiculos.add(qtRodasl);
                consVeiculos.add(qtRodast);
                consVeiculos.add(velMaxl);
                consVeiculos.add(velMaxt);
                consVeiculos.add(qtPistl);
                consVeiculos.add(qtPist);
                consVeiculos.add(potl);
                consVeiculos.add(pott);

                consVeiculos.add(cons);
                consVeiculos.add(excl);
                consVeiculos.add(sair);        

                cons.addActionListener(j);
                excl.addActionListener(j);
                sair.addActionListener(j);

                consVeiculos.setLayout(new FlowLayout());
                consVeiculos.setVisible(true);
            }
            
            if(evt.getSource().equals(cons)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nVoce clicou no botao Consultar pela Placa");
            }
            
            if(evt.getSource().equals(excl)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nVoce clicou no botao Excluir pela Placa");
            }
            
            if(evt.getSource().equals(impExctp)){
            janTabela.setTitle("PASSEIO - IMPRIMIR/EXCLUIR TODOS");
            janTabela.setSize(900,550);
            
            modTabela.addColumn("Placa");
            modTabela.addColumn("Marca");
            modTabela.addColumn("Modelo");
            modTabela.addColumn("Cor");
            modTabela.addColumn("Qtd.Rodas");
            modTabela.addColumn("VelocMax");
            modTabela.addColumn("Qtd.Pist");
            modTabela.addColumn("Potencia");
            modTabela.addColumn("Qtd.Passag.");
            
            impTodos.setMnemonic('I');
            excTodos.setMnemonic('E');
            
            //Definir dimensao da tabela para aparecer a barra de rolagem da TABELA
            tabela.setPreferredScrollableViewportSize(new Dimension(800,400));
            janTabela.add(barRolTab);
            
            janTabela.add(impTodos);
            janTabela.add(excTodos);
            janTabela.add(sair);
            
            impTodos.addActionListener(ft);
            excl.addActionListener(ft);
            sair.addActionListener(ft);
            
            janTabela.setLayout(new FlowLayout());
            janTabela.setVisible(true);
            }
            
            if(evt.getSource().equals(impExctc)){
                janTabela.setTitle("CARGA - IMPRIMIR/EXCLUIR TODOS");
                janTabela.setSize(900,550);

                modTabela.addColumn("Placa");
                modTabela.addColumn("Marca");
                modTabela.addColumn("Modelo");
                modTabela.addColumn("Cor");
                modTabela.addColumn("Qtd.Rodas");
                modTabela.addColumn("VelocMax");
                modTabela.addColumn("Qtd.Pist");
                modTabela.addColumn("Potencia");
                modTabela.addColumn("Tara");
                modTabela.addColumn("Carga Max.");

                impTodos.setMnemonic('I');
                excTodos.setMnemonic('E');

                //Definir dimensao da tabela para aparecer a barra de rolagem da TABELA
                tabela.setPreferredScrollableViewportSize(new Dimension(800,400));
                janTabela.add(barRolTab);

                janTabela.add(impTodos);
                janTabela.add(excTodos);
                janTabela.add(sair);

                impTodos.addActionListener(ft);
                excl.addActionListener(ft);
                sair.addActionListener(ft);

                janTabela.setLayout(new FlowLayout());
                janTabela.setVisible(true);
            }
            
            
            if(evt.getSource().equals(impTodos)){
                System.out.println("\nVoce clicou no botao Imprimir/Excluir tudo");
            
                p = new Passeio();
                modTabela = (DefaultTableModel) tabela.getModel();
                modTabela.setRowCount(0);
            
                for(int pos = 0; pos < bdPas.size(); pos++){
                    p.setQtdePassageiros(bdPas.get(pos).getQtdePassageiros());
                    p.setplaca(bdPas.get(pos).getplaca());
                    p.setmarca(bdPas.get(pos).getmarca());
                    p.setmodelo(bdPas.get(pos).getmodelo());
                    p.setcor(bdPas.get(pos).getcor());
                    p.setqtdRodas(bdPas.get(pos).getqtdRodas());
                    try{
                    p.setvelocMax(bdPas.get(pos).getvelocMax());
                    }
                    catch(VelocException eveloc){
                    System.out.println(eveloc.getMsg());                
                    }
                    p.getMotor().setqtdPist(bdPas.get(pos).getMotor().getqtdPist());
                    p.getMotor().setpotencia(bdPas.get(pos).getMotor().getpotencia());

                    modTabela.insertRow(pos, new Object[]{p.getQtdePassageiros(), p.getmarca(), p.getmodelo(), p.getcor(), p.getqtdRodas(), p.getvelocMax(), p.getMotor().getqtdPist(), p.getMotor().getpotencia()});
                }
            }  
            
            if(evt.getSource().equals(excTodos)){
                
            }
            
            if(evt.getSource().equals(sairSist)){
                System.out.println("\nVoce clicou no botao Sair");
                janTabela.dispose();
            }
            
    }
            
        
    //Metodo actionPerformed para indicar as chamadas das acoes pelos botoes da JANELA MENU PRIMARIO    
    /*
    public void btMenuPasseioActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(btPasseio)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nVoce clicou no botao Menu Veiculos Passeio");
        }
    
    }
    */
    /*
    public void btMenuCargaActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(btCarga)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nVoce clicou no botao Menu Veiculos Carga");
        }
    
    }     
    */
    
    //Metodo actionPerformed para indicar as chamadas das acoes pelos botoes da JANELA MENU SECUNDARIO
    /*
    public void btMenuCadastrarActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(cadastrarp)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nVoce clicou no botao Cadastrar Veiculos");
        }
    
    }
    */
    /*
    public void btMenuConsultarExcluirActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(consExcpp)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nVoce clicou no botao Consultar/Excluir por placa");
        }
    
    }
    */
    /*
    public void btMenuImprimirTudoActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(impTodos)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nVoce clicou no botao Imprimir/Excluir tudo");
            
            p = new Passeio();
            modTabela = (DefaultTableModel) tabela.getModel();
            modTabela.setRowCount(0);
            
            for(int pos = 0; pos < bdPas.size(); pos++){
                p.setQtdePassageiros(bdPas.get(pos).getQtdePassageiros());
                p.setplaca(bdPas.get(pos).getplaca());
                p.setmarca(bdPas.get(pos).getmarca());
                p.setmodelo(bdPas.get(pos).getmodelo());
                p.setcor(bdPas.get(pos).getcor());
                p.setqtdRodas(bdPas.get(pos).getqtdRodas());
                try{
                p.setvelocMax(bdPas.get(pos).getvelocMax());
                }
                catch(VelocException eveloc){
                System.out.println(eveloc.getMsg());                
                }
                p.getMotor().setqtdPist(bdPas.get(pos).getMotor().getqtdPist());
                p.getMotor().setpotencia(bdPas.get(pos).getMotor().getpotencia());
                
                modTabela.insertRow(pos, new Object[]{p.getQtdePassageiros(), p.getmarca(), p.getmodelo(), p.getcor(), p.getqtdRodas(), p.getvelocMax(), p.getMotor().getqtdPist(), p.getMotor().getpotencia()});
            }
        }
    
    }   
    */    
    //Metodo actionPerformed para indicar as chamadas das acoes pelos botoes da JANELA DE CADASTRO
    /*
    public void btCadastrarActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(cad)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nVoce clicou no botao Cadastrar");
            p = new Passeio();
            p.setQtdePassageiros(Integer.parseInt(qtPassagt.getText()));
            p.setplaca(placat.getText());
            p.setmarca(marcat.getText());
            p.setmodelo(modelot.getText());
            p.setcor(cort.getText());
            p.setqtdRodas(Integer.parseInt(qtRodast.getText()));
            try{
            p.setvelocMax(Integer.parseInt(velMaxt.getText()));
            }
            catch(VelocException eveloc){
                System.out.println(eveloc.getMsg());                
            }
            p.getMotor().setqtdPist(Integer.parseInt(qtPist.getText()));
            p.getMotor().setpotencia(Integer.parseInt(pott.getText()));
            
            BDVeic.cadVeicPasseio(p);
            
            qtPassagt.setText(null);
            placat.setText(null);
            marcat.setText(null);
            modelot.setText(null);
            cort.setText(null);
            qtRodast.setText(null);
            velMaxt.setText(null);
            qtPist.setText(null);
            pott.setText(null);
            tarat.setText(null);
            cargaMaxt.setText(null);
            qtPassagt.requestFocus();
            
        }      
    
    }
    */
    /*
    public void btLimparActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(limp)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nVoce clicou no botao Limpar");
            
            qtPassagt.setText(null);
            placat.setText(null);
            marcat.setText(null);
            modelot.setText(null);
            cort.setText(null);
            qtRodast.setText(null);
            velMaxt.setText(null);
            qtPist.setText(null);
            pott.setText(null);
            tarat.setText(null);
            cargaMaxt.setText(null);
            qtPassagt.requestFocus();
        }
    
    }
    */
    /*
    public void btNovoActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(novo)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nVoce clicou no botao Novo Veiculo");
        }
    
    }
    */
    /*
    public void btSairActionPerformed(ActionEvent evt){//colocar neste metodo todas as acoes dos botoes - chamando os objetos.metodos do sistema
       
        if(evt.getSource().equals(sair)){
            System.out.println("\nVoce clicou no botao Sair");
            janTabela.dispose();
        }
        
    }    
    */
    
    public void txtQtdPasActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(qtPassagt)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nCadastro da quantidade de Passageiros");
        }
    
    }
    
    public void txtPlacaActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(placat)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nCadastro da placa");
        }
    
    }
    
    public void txtMarcaActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(marcat)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nCadastro da Marca");
        }
    
    }
    
    public void txtModeloActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(modelot)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nCadastro do Modelo");
        }
    
    }
    
    public void txtCorActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(cort)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nCadastro da Cor");
        }
    
    }
    
    public void txtQtdRodasActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(qtRodast)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nCadastro da Quantidade de Rodas");
        }
    
    }
    
    public void txtVelocMaxActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(velMaxt)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nCadastro da Velocidade Maxima");
        }
    
    }
    
    public void txtQtdPistActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(qtPist)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nCadastro da Quantidade de Pistoes");
        }
    
    }
    
    public void txtPotenciaActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(pott)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nCadastro da Potencia");
        }
    
    }
    
    public void txtTaraActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(tarat)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nCadastro da Tara");
        }
    
    }
    
    public void txtCargaMaxActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(cargaMaxt)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nCadastro da Carga Maxima");
        }
    
    }
    
    //Metodo actionPerformed para indicar as chamadas das acoes pelos botoes da JANELA DE CONSULTAR/EXCLUIR PELA PLACA    
    /*
    public void btConsultarActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(cons)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nVoce clicou no botao Consultar pela Placa");
        }
    
    }
    */
    /*
    public void btExcluirActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(excl)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nVoce clicou no botao Excluir pela Placa");
        }
    
    }
    */
    
    //Metodo actionPerformed para indicar as chamadas das acoes pelos botoes da JANELA DE IMPRIMIR/EXCLUIR TODOS   
    /*
    public void btImprimirTodosActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(impTodos)){ //--se igual ao botao x disparar msg
            
            //modTabela.insertRow(0, BDVeic.imprimirPasseio());
            //BDVeic.imprimirPasseio();
            System.out.println("\nVoce clicou no botao Imprimir Todos os Veiculos");
        }
    
    }
    */
    /*
    public void btExcluirTodosActionPerformed(ActionEvent evt){
        if(evt.getSource().equals(excTodos)){ //--se igual ao botao x disparar msg            
            
            System.out.println("\nVoce clicou no botao Excluiro Todos os Veiculos");
        }
    
    } 
    */
    
    public static void main(String args[]) {
        
        //Janela Inicial
        sistVeiculos.setSize(400,300);
        sistVeiculos.setTitle("SISTEMA DE GESTAO DE VEICULOS");
        
        btPasseio.setText("PASSEIO");        
        btCarga.setText("CARGA");
        
        sistVeiculos.add(btPasseio);
        sistVeiculos.add(btCarga);
        
        btPasseio.addActionListener(j);
        btCarga.addActionListener(j);        
        
        sistVeiculos.setLayout(new FlowLayout());
        sistVeiculos.setVisible(true);
        
        //if()
        
        //-------------------------------------------------
        
        //Janela Secundaria - Menu Sistema - Veiculo Passeio
        /*
        menuSist.setSize(400,300);
        menuSist.setTitle("VEICULOS DE PASSEIO");
        
        cadastrar.setText("CADASTRAR");        
        consExcp.setText("CONSULTAR/EXCLUIR PELA PLACA");
        impExct.setText("IMPRIMIR/EXCLUIR TODOS");
        sairSist.setText("CONSULTAR/EXCLUIR PELA PLACA");
        
        menuSist.add(cadastrar);
        menuSist.add(consExcp);
        menuSist.add(consExcp);
        menuSist.add(sairSist);
        
        menuSist.setLayout(new FlowLayout());
        menuSist.setVisible(true);
        */
        
        //Janela Secundaria - Menu Sistema - Veiculo Carga
        /*
        menuSist.setSize(400,300);
        menuSist.setTitle("VEICULOS DE CARGA");
        
        cadastrar.setText("CADASTRAR");        
        consExcp.setText("CONSULTAR/EXCLUIR PELA PLACA");
        impExct.setText("IMPRIMIR/EXCLUIR TODOS");
        sairSist.setText("SAIR");
        
        menuSist.add(cadastrar);
        menuSist.add(consExcp);
        menuSist.add(impExct);
        menuSist.add(sairSist);
        
        menuSist.setLayout(new FlowLayout());
        menuSist.setVisible(true);
        */
        
        //-------------------------------------------------
        
        //Janela Cadastro de Veiculo Passeio
        /*
        cadVeiculos.setSize(400, 500);
        cadVeiculos.setTitle("CADASTRO DE VEICULOS PASSEIO");
        qtPassagl.setText("Qtd de Passageiros: ");
        placal.setText("Placa: ");
        marcal.setText("Marca: ");
        modelol.setText("Modelo: ");
        corl.setText("Cor: ");
        qtRodasl.setText("Qtd. Rodas: ");
        velMaxl.setText("Velocidade Max.: ");
        qtPistl.setText("Qtd. Pistoes: ");
        potl.setText("Potencia: ");
        
        cad.setText("Cadastrar");
        limp.setText("Limpar");
        novo.setText("Novo");
        sair.setText("Sair");
        
        cadVeiculos.add(qtPassagl);
        cadVeiculos.add(qtPassagt);
        cadVeiculos.add(placal);
        cadVeiculos.add(placat);
        cadVeiculos.add(marcal);
        cadVeiculos.add(marcat);
        cadVeiculos.add(modelol);
        cadVeiculos.add(modelot);
        cadVeiculos.add(corl);
        cadVeiculos.add(cort);
        cadVeiculos.add(qtRodasl);
        cadVeiculos.add(qtRodast);
        cadVeiculos.add(velMaxl);
        cadVeiculos.add(velMaxt);
        cadVeiculos.add(qtPistl);
        cadVeiculos.add(qtPist);
        cadVeiculos.add(potl);
        cadVeiculos.add(pott);
        
        cadVeiculos.add(cad);
        cadVeiculos.add(limp);
        cadVeiculos.add(novo);
        cadVeiculos.add(sair);
        
        cad.addActionListener(j);
        limp.addActionListener(j);
        novo.addActionListener(j);
        sair.addActionListener(j);
        
        cadVeiculos.setLayout(new FlowLayout());
        cadVeiculos.setVisible(true);
        */
        
        //-------------------------------------------------
        
        //Janela Cadastro de Veiculo Carga
        /*
        cadVeiculos.setSize(400, 500);
        cadVeiculos.setTitle("CADASTRO DE VEICULOS CARGA");
        taral.setText("Tara: ");
        cargaMaxl.setText("Carga Max.: ");
        placal.setText("Placa: ");
        marcal.setText("Marca: ");
        modelol.setText("Modelo: ");
        corl.setText("Cor: ");
        qtRodasl.setText("Qtd. Rodas: ");
        velMaxl.setText("Velocidade Max.: ");
        qtPistl.setText("Qtd. Pistoes: ");
        potl.setText("Potencia: ");
        
        cad.setText("Cadastrar");
        limp.setText("Limpar");
        novo.setText("Novo");
        sair.setText("Sair");
        
        cadVeiculos.add(taral);
        cadVeiculos.add(tarat);
        cadVeiculos.add(cargaMaxl);
        cadVeiculos.add(cargaMaxt);
        cadVeiculos.add(placal);
        cadVeiculos.add(placat);
        cadVeiculos.add(marcal);
        cadVeiculos.add(marcat);
        cadVeiculos.add(modelol);
        cadVeiculos.add(modelot);
        cadVeiculos.add(corl);
        cadVeiculos.add(cort);
        cadVeiculos.add(qtRodasl);
        cadVeiculos.add(qtRodast);
        cadVeiculos.add(velMaxl);
        cadVeiculos.add(velMaxt);
        cadVeiculos.add(qtPistl);
        cadVeiculos.add(qtPist);
        cadVeiculos.add(potl);
        cadVeiculos.add(pott);
        
        cadVeiculos.add(cad);
        cadVeiculos.add(limp);
        cadVeiculos.add(novo);
        cadVeiculos.add(sair);
        
        cad.addActionListener(j);
        limp.addActionListener(j);
        novo.addActionListener(j);
        sair.addActionListener(j);
        
        cadVeiculos.setLayout(new FlowLayout());
        cadVeiculos.setVisible(true);
        */
        
        //-------------------------------------------------
        
        //Janela Consultar/Excluir Veiculo Passeio pela placa
        /*
        consVeiculos.setSize(400, 500);
        consVeiculos.setTitle("CONSULTAR/EXCLUIR VEICULO PASSEIO PELA PLACA");
        placal.setText("Informe a Placa: ");
        qtPassagl.setText("Qtd de Passageiros: ");        
        marcal.setText("Marca: ");
        modelol.setText("Modelo: ");
        corl.setText("Cor: ");
        qtRodasl.setText("Qtd. Rodas: ");
        velMaxl.setText("Velocidade Max.: ");
        qtPistl.setText("Qtd. Pistoes: ");
        potl.setText("Potencia: ");
        
        cons.setText("Consultar");
        excl.setText("Excluir");
        sair.setText("Sair");
        
        consVeiculos.add(placal);
        consVeiculos.add(placat);
        consVeiculos.add(qtPassagl);
        consVeiculos.add(qtPassagt);        
        consVeiculos.add(marcal);
        consVeiculos.add(marcat);
        consVeiculos.add(modelol);
        consVeiculos.add(modelot);
        consVeiculos.add(corl);
        consVeiculos.add(cort);
        consVeiculos.add(qtRodasl);
        consVeiculos.add(qtRodast);
        consVeiculos.add(velMaxl);
        consVeiculos.add(velMaxt);
        consVeiculos.add(qtPistl);
        consVeiculos.add(qtPist);
        consVeiculos.add(potl);
        consVeiculos.add(pott);
        
        consVeiculos.add(cons);
        consVeiculos.add(excl);
        consVeiculos.add(sair);        
        
        cons.addActionListener(j);
        excl.addActionListener(j);
        sair.addActionListener(j);
        
        consVeiculos.setLayout(new FlowLayout());
        consVeiculos.setVisible(true);
        */
        //-------------------------------------------------
        /*
        //Janela Consultar/Excluir Veiculo Carga pela placa
        consVeiculos.setSize(400, 500);
        consVeiculos.setTitle("CONSULTAR/EXCLUIR VEICULO CARGA PELA PLACA");
        placal.setText("Informe a Placa: ");
        taral.setText("Tara: ");
        cargaMaxl.setText("Carga Max.: ");       
        marcal.setText("Marca: ");
        modelol.setText("Modelo: ");
        corl.setText("Cor: ");
        qtRodasl.setText("Qtd. Rodas: ");
        velMaxl.setText("Velocidade Max.: ");
        qtPistl.setText("Qtd. Pistoes: ");
        potl.setText("Potencia: ");
        
        cons.setText("Consultar");
        excl.setText("Excluir");
        sair.setText("Sair");
        
        consVeiculos.add(placal);
        consVeiculos.add(placat);
        consVeiculos.add(taral);
        consVeiculos.add(tarat);
        consVeiculos.add(cargaMaxl);
        consVeiculos.add(cargaMaxt);       
        consVeiculos.add(marcal);
        consVeiculos.add(marcat);
        consVeiculos.add(modelol);
        consVeiculos.add(modelot);
        consVeiculos.add(corl);
        consVeiculos.add(cort);
        consVeiculos.add(qtRodasl);
        consVeiculos.add(qtRodast);
        consVeiculos.add(velMaxl);
        consVeiculos.add(velMaxt);
        consVeiculos.add(qtPistl);
        consVeiculos.add(qtPist);
        consVeiculos.add(potl);
        consVeiculos.add(pott);
        
        consVeiculos.add(cons);
        consVeiculos.add(excl);
        consVeiculos.add(sair);        
        
        cons.addActionListener(j);
        excl.addActionListener(j);
        sair.addActionListener(j);
        
        consVeiculos.setLayout(new FlowLayout());
        consVeiculos.setVisible(true);
        */
        //-------------------------------------------------
        
        //Janela-Tabela para Impressao/Exclusao de todos Veiculos Passeio
                     //public void impTodosPasseio(){
            /*
            janTabela.setTitle("PASSEIO - IMPRIMIR/EXCLUIR TODOS");
            janTabela.setSize(900,550);
            
            modTabela.addColumn("Placa");
            modTabela.addColumn("Marca");
            modTabela.addColumn("Modelo");
            modTabela.addColumn("Cor");
            modTabela.addColumn("Qtd.Rodas");
            modTabela.addColumn("VelocMax");
            modTabela.addColumn("Qtd.Pist");
            modTabela.addColumn("Potencia");
            modTabela.addColumn("Qtd.Passag.");
            
            impTodos.setMnemonic('I');
            excTodos.setMnemonic('E');
            
            //Definir dimensao da tabela para aparecer a barra de rolagem da TABELA
            tabela.setPreferredScrollableViewportSize(new Dimension(800,400));
            janTabela.add(barRolTab);
            
            janTabela.add(impTodos);
            janTabela.add(excTodos);
            janTabela.add(sair);
            
            impTodos.addActionListener(ft);
            excl.addActionListener(ft);
            sair.addActionListener(ft);
            
            janTabela.setLayout(new FlowLayout());
            janTabela.setVisible(true);
            */
            
        
        
               
        boolean continua = true;
        int opcao = 0;
        
        while(continua){
        System.out.println("\n+====================SISTEMA DE GESTAO DE VEICULOS====================+"
                + "\n|                                                                     |"
                + "\n|                            MENU INICIAL                             |"                
                + "\n|                                                                     |"
                + "\n|               (1) Cadastrar Veiculo de Passeio                      |"                    
                + "\n|               (2) Cadastrar Veiculo de Carga                        |"
                + "\n|               (3) Imprimir Todos os Veiculos de Passeio             |"
                + "\n|               (4) Imprimir Todos os Veiculos de Carga               |"
                + "\n|               (5) Imprimir Veiculo de Passeio pela Placa            |"
                + "\n|               (6) Imprimir Veiculo de Carga pela Placa              |"
                + "\n|               (7) Excluir Veiculo de Passeio pela Placa             |"
                + "\n|               (8) Excluir Veiculo de Carga pela Placa               |"
                + "\n|               (9) Sair do Sistema                                   |"
                + "\n|                                                                     |"
                + "\n+=====================================================================+"
        );        
            try{    
                opcao = Integer.parseInt(l1.entDados("\n\n\n          ESCOLHA O NUMERO DA OPERACAO QUE DESEJA REALIZAR "));
            }            
            catch(NumberFormatException nfe){                    
                    l1.entDados("\n======================================================\n\nDeve ser um valor inteiro - Aperte <ENTER>");
                   continue;
            }
            
            switch (opcao){
            case 1:
                boolean rp = true; 
                while(rp){
                p = new Passeio();
                    if(p != null){                        
                        p = BDVeic.cadVeicPasseio(p);
                        BDVeic.setveicpas(p);                        
                        l1.entDados("\n======================================================\nVeiculo de Passeio Cadastrado - Aperte <ENTER>");   
                        String respPass = l1.entDados("\n======================================================\nDeseja cadastrar outro Veículo de Passeio? <S/N>");
                        if(respPass.equalsIgnoreCase("n")){
                            break;
                        }                           
                    }
                }
                break;              
            
            case 2:  
                boolean rc = true; 
                while(rc){
                c = new Carga();
                    if(c != null){
                        c = BDVeic.cadVeicCarga(c);
                        BDVeic.setveiccarg(c);                                                            
                        l1.entDados("\n======================================================\nVeiculo de Carga Cadastrado - Aperte <ENTER>");   
                        String respCarg = l1.entDados("\n======================================================\nDeseja cadastrar outro Veículo de Carga? <S/N>");
                        if(respCarg.equalsIgnoreCase("n")){
                            break;
                        }                                           
                    }
                }
                break;
                
            case 3:         
                if (BDVeic.getveicpas() == null){
                    l1.entDados("\n======================================================\nNão há Veículos de PASSEIO cadastrado no Sistema - Aperte <ENTER>");
                    break;
                }
                else{
                    System.out.println("\n==========Impressão de TODOS os Veículos de Passeio==========");
                    BDVeic.imprimirPasseio();  
                    l1.entDados("\n=======================================================\nNão há mais veículos Passeios para Imprimir - Aperte <ENTER>");
                    break;
                }
                 
            case 4:
                if (BDVeic.getveicarg() == null){
                    l1.entDados("\n======================================================\nNão há Veículos de CARGA cadastrado no Sistema - Aperte <ENTER>");
                    break;
                }
                else{
                    System.out.println("\n==========Impressão de TODOS os Veículos de Carga==========");
                    BDVeic.imprimirCarga();
                    l1.entDados("\n=======================================================\nNão há mais veículos Carga para Imprimir - Aperte <ENTER>");
                    break;
                }
                
            case 5:
                System.out.println("\n\n=====================Impressao de Veículo Passeio pela Placa=====================");
                p = new Passeio();
                int enderecop = 0;
                String placaPass = l1.entDados("\nInforme a placa do Veículo que deseja consultar: ");
                p.setplaca(placaPass);
                enderecop = BDVeic.consVeicPasseio(p, enderecop);
                if (enderecop == -1){
                    l1.entDados("\n======================================================\nNão existe Veículo de PASSEIO com esta Placa = Aperte <ENTER>");
                    break;
                }
                else{
                    System.out.println("\n===Veiculo Passeio===\n" 
                    + "\nPlaca: " + BDVeic.getveicpas().get(enderecop).getplaca()
                    + "\nMarca: " + BDVeic.getveicpas().get(enderecop).getmarca()
                    + "\nModelo: " + BDVeic.getveicpas().get(enderecop).getmodelo()
                    + "\nCor: " + BDVeic.getveicpas().get(enderecop).getcor()
                    + "\nQuantidade de Rodas: " + BDVeic.getveicpas().get(enderecop).getqtdRodas()
                    + "\nPistões: " + Integer.toString(BDVeic.getveicpas().get(enderecop).getMotor().getqtdPist())
                    + "\nPotencia: " + Integer.toString(BDVeic.getveicpas().get(enderecop).getMotor().getpotencia())
                    + "\nVelocidade Máxima: " + BDVeic.getveicpas().get(enderecop).calcVel(0)
                    + "\nPassageiros: " + BDVeic.getveicpas().get(enderecop).getQtdePassageiros()
                    + "\nQuantidade total de Letras: " + BDVeic.getveicpas().get(enderecop).calcular());
                    l1.entDados("\n======================================================\nVeiculo impresso! - Aperte <ENTER> para voltar ao MENU");
                    break;
                }  
                
            case 6:
               System.out.println("\n\n=====================Impressao de Veículo Passeio pela Placa=====================");
                c = new Carga();
                int enderecoc = 0;
                String placaCarga = l1.entDados("\nInforme a placa do Veículo que deseja consultar: ");
                c.setplaca(placaCarga);
                enderecoc = BDVeic.consVeicCarga(c, enderecoc);
                if (enderecoc == -1){
                    l1.entDados("\n======================================================\nNão existe Veículo de CARGA com esta Placa = Aperte <ENTER>");
                    break;
                }
                else{
                    System.out.println("\n===Veiculo Carga===\n"
                    + "\nPlaca: " + BDVeic.getveicarg().get(enderecoc).getplaca()
                    + "\nMarca: " + BDVeic.getveicarg().get(enderecoc).getmarca()
                    + "\nModelo: " + BDVeic.getveicarg().get(enderecoc).getmodelo()
                    + "\nCor: " + BDVeic.getveicarg().get(enderecoc).getcor()
                    + "\nQuantidade de Rodas: " + BDVeic.getveicarg().get(enderecoc).getqtdRodas()
                    + "\nPistões: " + Integer.toString(BDVeic.getveicarg().get(enderecoc).getMotor().getqtdPist())
                    + "\nPotencia: " + Integer.toString(BDVeic.getveicarg().get(enderecoc).getMotor().getpotencia())
                    + "\nVelocidade Máxima: " + BDVeic.getveicarg().get(enderecoc).calcVel(0)
                    + "\nPeso do Veículo: " + BDVeic.getveicarg().get(enderecoc).getTara()
                    + "\nCarga Máxima do Veículo: " + BDVeic.getveicarg().get(enderecoc).getCargaMax()
                    + "\nSoma dos valores contidos nos atributos numéricos: " + BDVeic.getveicarg().get(enderecoc).calcular());
                    l1.entDados("\n======================================================\nVeiculo impresso! - Aperte <ENTER> para voltar ao MENU");
                    break;
                    }
            
            case 7:
                System.out.println("\n\n=====================Exclusão de Veículo Passeio pela Placa=====================");
                p = new Passeio();
                int endexcp = 0;
                String placaPasExc = l1.entDados("\nInforme a placa do Veículo que deseja EXCLUIR: ");
                p.setplaca(placaPasExc);
                endexcp = BDVeic.consVeicPasseio(p, endexcp);
                if (endexcp == -1){
                    l1.entDados("\n======================================================\nNão existe Veículo de PASSEIO com esta Placa = Aperte <ENTER>");
                    break;
                }
                else{
                    BDVeic.delItemBDPas(endexcp);
                    l1.entDados("\n======================================================\nVeiculo excluido! - Aperte <ENTER> para voltar ao MENU");
                    break;
                }
                
            case 8:
                System.out.println("\n\n=====================Exclusão de Veículo Carga pela Placa=====================");
                c = new Carga();
                int endexcc = 0;
                String placaCargaExc = l1.entDados("\nInforme a placa do Veículo que deseja EXCLUIR: ");
                c.setplaca(placaCargaExc);
                endexcc = BDVeic.consVeicCarga(c, endexcc);
                if (endexcc == -1){
                    l1.entDados("\n======================================================\nNão existe Veículo de CARGA com esta Placa = Aperte <ENTER>");
                    break;
                }
                else{
                    BDVeic.delItemBDCarg(endexcc);
                    l1.entDados("\n======================================================\nVeiculo excluido! - Aperte <ENTER> para voltar ao MENU");
                    break;
                }
                
            case 9:
                continua = false;
                System.out.println("\n===========================SISTEMA ENCERRADO===========================");
                break;
            default:
                l1.entDados("\n\n======================================================\nOpcao Invalida!\n\nEscolha entre as opções 1 e 7\nAperte <ENTER>");                
            }
        
        }
    }//fim da classe main

    
}
        
    

