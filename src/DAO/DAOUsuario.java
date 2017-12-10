/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexao.ConexaoBD;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelUsuario;

/**
 *
 * @author Marcio Henrique
 */
public class DAOUsuario {
    ConexaoBD conex = new ConexaoBD();
    ModelUsuario mod = new ModelUsuario();
    
    public void Salvar (ModelUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cadusuario(nome_usuario,login_usuario,senha_usuario,situacao_usuario,"
                    + "perfil_usuario) values(?,?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getLogin());
            pst.setString(3,mod.getSenha());
            pst.setString(4,mod.getSituacao());
            pst.setInt(5,mod.getPerfil());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados!!/n Error:" +ex);
            
        }
        
        
        conex.desconecta();
        
    }
    
    public int buscaPerfil(String nome){
        int codigo=0;
        conex.conexao();
        conex.executaSql("select * from cadperfil where nome_perfil ='"+nome+"'");
        try {
            conex.rs.first();
            codigo = conex.rs.getInt("id_perfil");
        } catch (SQLException ex) {
            Logger.getLogger(DAOEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
        conex.desconecta();
        return codigo;
    }
    
    public void Editar (ModelUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cadusuario set nome_usuario =?,login_usuario =?,senha_usuario =?,situacao_usuario =?,"
                    + "perfil_usuario =? where cod_usuario =?");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getLogin());
            pst.setString(3,mod.getSenha());
            pst.setString(4,mod.getSituacao());
            pst.setInt(5,mod.getPerfil());
            pst.setInt(6,mod.getCodigo());
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterados dados!!/n Error:" +ex);
            
        }
        
        
        conex.desconecta();
        
    }
    
    public ModelUsuario Buscar (ModelUsuario mod){
        conex.conexao();
        try {
            conex.executaSql("SELECT * FROM cadusuario inner join cadperfil on (id_perfil = perfil_usuario) WHERE nome_usuario like '%"+mod.getPesquisa()+"%'" );
            conex.rs.first();
            mod.setNome(conex.rs.getString("nome_usuario") );
            mod.setLogin(conex.rs.getString("login_usuario") );
            mod.setPerfil(conex.rs.getInt("perfil_usuario") );
            mod.setSenha(conex.rs.getString("senha_usuario") );
            mod.setCodigo(conex.rs.getInt("cod_usuario") );
            mod.setSituacao(conex.rs.getString("situacao_usuario") );
            mod.setNome_perfil(conex.rs.getString("nome_perfil") );
            
                        
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Registro não encontrado");
             
        }               
               
        conex.desconecta();
        
        return mod;
    }
    
    public ModelUsuario ValidaUsuario (String login, String senha){
        conex.conexao();
        try {
            senha = convertPassword(senha);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            
            conex.executaSql("SELECT * FROM cadusuario WHERE login_usuario = '" +login +"' and  senha_usuario='"+senha+"'" );
            
            conex.rs.first();
            mod.setNome(conex.rs.getString("nome_usuario") );
            mod.setLogin(conex.rs.getString("login_usuario") );
            mod.setPerfil(conex.rs.getInt("perfil_usuario") );
            mod.setSenha(conex.rs.getString("senha_usuario") );
            mod.setCodigo(conex.rs.getInt("cod_usuario") );
            mod.setSituacao(conex.rs.getString("situacao_usuario") );
            
                        
        } catch (SQLException ex) {
             //JOptionPane.showMessageDialog(null,"Erro ao inserir dados/NErro:"+ex);
          mod.setNome("");
        }               
               
        conex.desconecta();
        
        return mod;
    }
    
    public void Excluir (ModelUsuario mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cadusuario where cod_usuario =?  ");
            
            
            pst.setInt(1,mod.getCodigo());
  
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com êxito no sistema!!!");
               
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao excluidos Dados!!/Erro: " + ex);
        }
        
        conex. desconecta();
        
    }
    
    public static String convertPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
 
        BigInteger hash = new BigInteger(1, md.digest(password.getBytes()));
 
        return String.format("%32x", hash);
    }
     
}
