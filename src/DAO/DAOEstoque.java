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
import model.ModelEstoque;

/**
 *
 * @author Marcio Henrique
 */
public class DAOEstoque {
    ConexaoBD conex = new ConexaoBD();
    ModelEstoque mod = new ModelEstoque();
    
    public void Salavar(ModelEstoque mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cadestoque(produto_estoques,qtdmaxima_estoques,qtdminima_estoques,"
                    + "qtdatual_estoques) values(?,?,?,?)");
        
        pst.setInt(1,mod.getProduto());
        pst.setInt(2,mod.getQtdmaxima());
        pst.setInt(3,mod.getQtdminima());
        pst.setInt(4,mod.getQtdatual());
        pst.execute();
        
            JOptionPane.showMessageDialog(null," Dados Inseridos com Sucesso");
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao inserir dados!!/n Erro:" +ex);
            
        }
        
        
        conex.desconecta();
    }
    
    public void Editar(ModelEstoque mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cadestoque set produto_estoques =?,qtdmaxima_estoques =?,qtdminima_estoques =?,"
                    + "qtdatual_estoques =? where id_estoques = ?");
        
        pst.setInt(1,mod.getProduto());
        pst.setInt(2,mod.getQtdmaxima());
        //pst.setDate(3,mod.getValidade());
        pst.setInt(3,mod.getQtdminima());
        pst.setInt(4,mod.getQtdatual());
        pst.setInt(5,mod.getCodigo());
        pst.execute();
        
            JOptionPane.showMessageDialog(null," Dados alterados com Sucesso");
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao alterados dados!!/n Erro:" +ex);
            
        }
        
        
        conex.desconecta();
    }
    
   
    public ModelEstoque Buscar (ModelEstoque mod){
        conex.conexao();
        try {
            conex.executaSql("SELECT * FROM cadestoque inner join cadprodutos on (produto_estoques = id_produtos) WHERE nome_produtos like '%"+mod.getPesquisa()+"%'" );
            conex.rs.first();
            mod.setProduto(conex.rs.getInt("produto_estoques") );
            mod.setQtdatual(conex.rs.getInt("qtdatual_estoques") );
            mod.setQtdmaxima(conex.rs.getInt("qtdmaxima_estoques") );
            mod.setQtdminima(conex.rs.getInt("qtdminima_estoques") );
            mod.setNome_produto(conex.rs.getString("nome_produtos") );
            mod.setCodigo(conex.rs.getInt("id_estoques") );
          
                        
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao inserir dados/NErro:"+ex);
             
        }               
               
        conex.desconecta();
        
        return mod;
    }
    
     public void Excluir (ModelEstoque mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cadestoque where id_estoques =?  ");
            
            
            pst.setInt(1,mod.getCodigo());
  
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com êxito no sistema!!!");
               
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao excluidos Dados!!/Erro: " + ex);
        }
        
        conex. desconecta();
        
    }
     
    public int buscaProduto(String nome){
        int codigo=0;
        conex.conexao();
        conex.executaSql("select * from cadprodutos where nome_produtos ='"+nome+"'");
        try {
            conex.rs.first();
            codigo = conex.rs.getInt("ID_produtos");
        } catch (SQLException ex) {
            Logger.getLogger(DAOEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
        conex.desconecta();
        return codigo;
    } 
     
    
}
