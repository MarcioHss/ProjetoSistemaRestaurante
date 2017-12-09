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
import model.ModelPerfil;

/**
 *
 * @author Marcio Henrique
 */
public class DAOPerfil {
    ConexaoBD conex = new ConexaoBD();
    ModelPerfil mod = new ModelPerfil();
    
    public void Salvar (ModelPerfil mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cadperfil(nome_perfil) values(?)");
            pst.setString(1,mod.getNome());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados!!/n Error:" +ex);
            
        }
        
        
        conex.desconecta();
        
    }
    
    public void Editar (ModelPerfil mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cadperfil set nome_perfil =? where id_perfil =?");
            pst.setString(1,mod.getNome());
            pst.setInt(2,mod.getCodigo());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterados dados!!/n Error:" +ex);
            
        }
        
        
        conex.desconecta();
        
    }
    
    public ModelPerfil Buscar (ModelPerfil mod){
        conex.conexao();
        try {
            conex.executaSql("SELECT * FROM cadperfil WHERE nome_perfil like '%"+mod.getPesquisa()+"%'" );
            conex.rs.first();
            mod.setNome(conex.rs.getString("nome_perfil") );
            mod.setCodigo(conex.rs.getInt("id_perfil") );
                 
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao inserir dados/NErro:"+ex);
             
        }               
               
        conex.desconecta();
        
        return mod;
    }
    
     public void Excluir (ModelPerfil mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cadperfil where id_perfil =?  ");
            
            
            pst.setInt(1,mod.getCodigo());
  
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com êxito no sistema!!!");
               
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao excluidos Dados!!/Erro: " + ex);
        }
        
        conex. desconecta();
        
    }
     
}
