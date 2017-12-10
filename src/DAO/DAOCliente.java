/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelCliente;

/**
 *
 * @author Marcio Henrique
 */
public class DAOCliente {
    ConexaoBD conex = new ConexaoBD();
    ModelCliente mod = new ModelCliente();
    
    public void Salvar (ModelCliente mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cadclientes(nome_cliente,"
                    + "cpf_cliente,rg_cliente,cep_cliente,cidade_cliente,endereco_cliente,"
                    + "uf_cliente,sexo_cliente, estadocivil_cliente,opcaoservico_cliente)values(?,?,?,?,?,?,?,?,?,?,?) ");
            
            
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getCPF());
            pst.setString(3,mod.getRG());
            pst.setString(4,mod.getCEP());
            pst.setString(5,mod.getCidade());
            pst.setString(6,mod.getEndereco());
            pst.setString(7,mod.getUF());
            pst.setString(8,mod.getSexo());
            pst.setString(9,mod.getEstadoCivil());
            pst.setString(10,mod.getOpcaoServico());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Inseridos com êxito no sistema!!!");
               
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao Inserir Dados!!/Erro: " + ex);
        }
        
        conex. desconecta();
        
    }
    
    public void Excluir (ModelCliente mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cadclientes where cod_cliente =?  ");
            
            
            pst.setInt(1,mod.getCodigo());
  
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com êxito no sistema!!!");
               
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao excluidos Dados!!/Erro: " + ex);
        }
        
        conex. desconecta();
        
    }
    
    public void Editar (ModelCliente mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cadclientes set nome_cliente =?,cpf_cliente =?,rg_cliente =? "+
                    ",cep_cliente =?,cidade_cliente =?,endereco_cliente =?," +
                    " uf_cliente =?,sexo_cliente =?, estadocivil_cliente =?,opcaoservico_cliente =?  where cod_cliente =? ");
            
            
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getCPF());
            pst.setString(3,mod.getRG());
            pst.setString(4,mod.getCEP());
            pst.setString(5,mod.getCidade());
            pst.setString(6,mod.getEndereco());
            pst.setString(7,mod.getUF());
            pst.setString(8,mod.getSexo());
            pst.setString(9,mod.getEstadoCivil());
            pst.setString(10,mod.getOpcaoServico());
            pst.setInt(11,mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterados com êxito no sistema!!!");
               
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao alterados Dados!!/Erro: " + ex);
        }
        
        conex. desconecta();
        
    } 
    
    public ModelCliente Buscar (ModelCliente mod){
        conex.conexao();
        try {
            conex.executaSql("SELECT * FROM cadclientes WHERE nome_cliente like '%"+mod.getPesquisa()+"%'" );
            conex.rs.first();
            mod.setNome(conex.rs.getString("nome_cliente") );
            mod.setEndereco(conex.rs.getString("endereco_cliente") );
            mod.setUF(conex.rs.getString("uf_cliente") );
            mod.setCidade(conex.rs.getString("cidade_cliente") );
            mod.setCodigo(conex.rs.getInt("cod_cliente") );
            mod.setCPF(conex.rs.getString("cpf_cliente") );
            mod.setCEP(conex.rs.getString("cep_cliente") );
            mod.setOpcaoServico(conex.rs.getString("opcaoservico_cliente") );
            mod.setEstadoCivil(conex.rs.getString("estadocivil_cliente") );
            mod.setRG(conex.rs.getString("rg_cliente") );
            mod.setSexo(conex.rs.getString("sexo_cliente") );
                        
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Registro não encontrado");
             
        }               
               
        conex.desconecta();
        
        return mod;
    }
     
    
}
