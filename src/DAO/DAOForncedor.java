/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelFornecedor;

/**
 *
 * @author Marcio Henrique
 */
public class DAOForncedor {
    ConexaoBD conex = new ConexaoBD();
    ModelFornecedor mod = new ModelFornecedor();
    
    public void Salvar(ModelFornecedor mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cadfornecedor(nome_fornecedor,cnpj_fornecedor,"
                    + "cep_fornecedor,endereco_fornecedor,uf_fornecedor,cidade_fornecedor)values(?,?,?,?,?,?)" );
            
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getCNPJ());
            pst.setString(3,mod.getCEP());
            pst.setString(4,mod.getEndereco());
            pst.setString(5,mod.getUF());
            pst.setString(6,mod.getCidade());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Os dados foram inseridos com sucesso!!");
                     
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao inserir dados/NErro:"+ex);
             
        }
        
        
                
               
        conex.desconecta();
        
    }
    
     public void Editar (ModelFornecedor mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update  cadfornecedor set nome_fornecedor =?,cnpj_fornecedor =?," +
                     "cep_fornecedor =?,endereco_fornecedor =?,uf_fornecedor =?,cidade_fornecedor =? where cod_forncedor  =?" );
            
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getCNPJ());
            pst.setString(3,mod.getCEP());
            pst.setString(4,mod.getEndereco());
            pst.setString(5,mod.getUF());
            pst.setString(6,mod.getCidade());
            pst.setInt(7,mod.getCodigo());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Os dados foram alterados com sucesso!!");
                     
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao alterados dados/NErro:"+ex);
             
        }
        
        
                
               
        conex.desconecta();
        
    }
    
    public ModelFornecedor Buscar (ModelFornecedor mod){
        conex.conexao();
        try {
            conex.executaSql("SELECT nome_fornecedor,"+
             "endereco_fornecedor,uf_fornecedor, cidade_fornecedor,cod_forncedor,cnpj_fornecedor,cep_fornecedor"       + " FROM cadfornecedor WHERE nome_fornecedor like '%"+mod.getPesquisa()+"%'" );
            conex.rs.first();
            mod.setNome(conex.rs.getString("nome_fornecedor") );
            mod.setEndereco(conex.rs.getString("endereco_fornecedor") );
            mod.setUF(conex.rs.getString("uf_fornecedor") );
            mod.setCidade(conex.rs.getString("cidade_fornecedor") );
            mod.setCodigo(conex.rs.getInt("cod_forncedor") );
            mod.setCNPJ(conex.rs.getString("cnpj_fornecedor") );
            mod.setCEP(conex.rs.getString("cep_fornecedor") );
            
            
            
                     
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Registro não encontrado");
             
        }               
               
        conex.desconecta();
        
        return mod;
    }
    
    public void Excluir (ModelFornecedor mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cadfornecedor where cod_forncedor =?  ");
            
            
            pst.setInt(1,mod.getCodigo());
  
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com êxito no sistema!!!");
               
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao excluidos Dados!!/Erro: " + ex);
        }
        
        conex. desconecta();
        
    }
            
    
   
}
