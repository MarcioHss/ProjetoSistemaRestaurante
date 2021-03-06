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
import model.ModelProdutos;

/**
 *
 * @author Marcio Henrique
 */
public class DAOProdutos {
    ConexaoBD conex = new ConexaoBD();
    ModelProdutos mod = new ModelProdutos();
    
    public void Salavar(ModelProdutos mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into cadprodutos(nome_produtos,"
                    + "fornecedor_produto,unidade_produto,preco_produtos) values(?,?,?,?)");
        
        pst.setString(1,mod.getNome());
        pst.setInt(2,mod.getFornecedor());
        pst.setString(3,mod.getUnidade());
        pst.setDouble(4,mod.getPreco());
        pst.execute();
        
            JOptionPane.showMessageDialog(null," Dados Inseridos com Sucesso");
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao inserir dados!!/n Erro:" +ex);
            
        }
        
        
        conex.desconecta();
    }
    
    public int buscaFornecedor(String nome){
        int codigo=0;
        conex.conexao();
        conex.executaSql("select * from cadfornecedor where nome_fornecedor ='"+nome+"'");
        try {
            conex.rs.first();
            codigo = conex.rs.getInt("cod_forncedor");
        } catch (SQLException ex) {
            Logger.getLogger(DAOEstoque.class.getName()).log(Level.SEVERE, null, ex);
        }
        conex.desconecta();
        return codigo;
    }
    
    public void Editar(ModelProdutos mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update cadprodutos set nome_produtos =?,"
                    + "fornecedor_produto =?,unidade_produto =?, preco_produtos =? where id_produtos =?");
        
        pst.setString(1,mod.getNome());
        pst.setInt(2,mod.getFornecedor());
        pst.setString(3,mod.getUnidade());
        pst.setInt(5,mod.getCodigo());
        pst.setDouble(4,mod.getPreco());
        pst.execute();
        
            JOptionPane.showMessageDialog(null," Dados alterados com Sucesso");
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao alterados dados!!/n Erro:" +ex);
            
        }
        
        
        conex.desconecta();
    }
    
   
    public ModelProdutos Buscar (ModelProdutos mod){
        conex.conexao();
        try {
            conex.executaSql("SELECT * FROM cadprodutos inner join cadfornecedor on (cod_forncedor = fornecedor_produto) WHERE nome_produtos like '%"+mod.getPesquisa()+"%'" );
            conex.rs.first();
            mod.setNome(conex.rs.getString("nome_produtos") );
            mod.setFornecedor(conex.rs.getInt("fornecedor_produto") );
            mod.setCodigo(conex.rs.getInt("id_produtos") );
            mod.setUnidade(conex.rs.getString("unidade_produto") );
            mod.setPreco(conex.rs.getDouble("preco_produtos") );
            mod.setNome_fornecedor(conex.rs.getString("nome_fornecedor") );
          
                        
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Registro não encontrado");
             
        }               
               
        conex.desconecta();
        
        return mod;
    }
    
    public void Excluir (ModelProdutos mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from cadprodutos where id_produtos =?  ");
            
            
            pst.setInt(1,mod.getCodigo());
  
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluidos com êxito no sistema!!!");
               
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao excluidos Dados!!/Erro: " + ex);
        }
        
        conex. desconecta();
        
    }
     
    
}
