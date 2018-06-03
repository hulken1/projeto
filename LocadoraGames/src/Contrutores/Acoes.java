package Contrutores;

import javax.swing.table.DefaultTableModel;

public class Acoes {

    public void clientes(String nomeCliente, String enderecoCliente,
            String cpfCliente, String dataNascimento,
            String cepCliente, String nResidencial,
            String nCelular, String nEndereco) {

        Clientes c = new Clientes();
        c.setTxtNomeCliente(nomeCliente);
        c.setTxtEnderecoCliente(enderecoCliente);
        c.setTxtCPF(cpfCliente);
        c.setTxtDataNascimento(dataNascimento);
        c.setTxtCep(cepCliente);
        c.setTxtNumeroRes(nResidencial);
        c.setTxtCelular(nCelular);
        c.setTxtNumeroEndereco(nEndereco);

        Clientes.dadosClientes.add(c);
    }

        public DefaultTableModel listarClientes() {

        //DefaultTableModel
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("DataNascimento");
        modelo.addColumn("Endereco");
        modelo.addColumn("Nº");               
        modelo.addColumn("CEP");
        modelo.addColumn("Telefone");
        modelo.addColumn("Celular");
       

        for (int indice = 0; indice < Clientes.dadosClientes.size(); indice++) {

            modelo.addRow(new Object[]{
                Clientes.dadosClientes.get(indice).getTxtNomeCliente(),
                Clientes.dadosClientes.get(indice).getTxtCPF(),
                Clientes.dadosClientes.get(indice).getTxtDataNascimento(),
                Clientes.dadosClientes.get(indice).getTxtEnderecoCliente(),  
                Clientes.dadosClientes.get(indice).getTxtNumeroEndereco(),
                Clientes.dadosClientes.get(indice).getTxtCep(),
                Clientes.dadosClientes.get(indice).getTxtNumeroRes(),
                Clientes.dadosClientes.get(indice).getTxtCelular()
               

            });

        }

        //Retorno
        return modelo;
    }
        
            public void jogos(String nomeJogo , String caracteristicas , String valorJogo , String quantidadeJogo , String genero){
        
        CadastroJogos cj = new CadastroJogos();
        cj.setTxtNomeJogo(nomeJogo);
        cj.setTxtCaracteristicas(caracteristicas);
        cj.setTxtValorJogo(valorJogo);
        cj.setTxtQuantidade(quantidadeJogo);
        cj.setTxtGenero(genero);
        
        CadastroJogos.dadosJogos.add(cj);
    }
            
         public DefaultTableModel listarJogos(){       
    
        DefaultTableModel modeloJogo = new DefaultTableModel();
        modeloJogo.addColumn("Nome Jogo");
        modeloJogo.addColumn("Caracteristicas");
        modeloJogo.addColumn("R$ Valor");
        modeloJogo.addColumn("Quantidade");
        modeloJogo.addColumn("Genero");
        
        for (int indice = 0; indice < CadastroJogos.dadosJogos.size(); indice++) {
        modeloJogo.addRow(new Object[]{
                CadastroJogos.dadosJogos.get(indice).getTxtNomeJogo(),
                CadastroJogos.dadosJogos.get(indice).getTxtCaracteristicas(),
                CadastroJogos.dadosJogos.get(indice).getTxtValorJogo(),
                CadastroJogos.dadosJogos.get(indice).getTxtQuantidade(),
                CadastroJogos.dadosJogos.get(indice).getTxtGenero()
            });
        }
          
        return modeloJogo;
     }
         public void alterarCliente(String nomeCliente,String cpfCliente,String dataNascimento, String enderecoCliente,
        		 String nEndereco,
            String cepCliente, String nResidencial,
            String nCelular,  int linha){
             
              Clientes c = new Clientes();
            c.setTxtNomeCliente(nomeCliente);
            c.setTxtCPF(cpfCliente);
            c.setTxtDataNascimento(dataNascimento);
            c.setTxtEnderecoCliente(enderecoCliente);
            c.setTxtNumeroEndereco(nEndereco);          
            c.setTxtCep(cepCliente);
        	c.setTxtNumeroRes(nResidencial);
        	c.setTxtCelular(nCelular);
        	
        
        Clientes.dadosClientes.set(linha,c);
         }
         
         public void excluiCliente(int linha){
             Clientes.dadosClientes.remove(linha);
         }
}

    
    
