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
import model.ModelComanda;

/**
 *
 * @author Marcio Henrique
 */
public class DAOComanda {
    
    ConexaoBD conex = new ConexaoBD();
    ModelComanda mod = new ModelComanda();
    
    public void Salvar (ModelComanda mod){
     conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into formcomanda(produto_comanda,cliente_comanda,"
                    + "qtd_comanda)values(?,?,?)");
            pst.setString(1,mod.getProduto());
            pst.setString(2,mod.getCliente());
            pst.setInt(3,mod.getQTDcomanda());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Os dados não foram inseridos com êxito!! /n Erro:" +ex);
            
     
     
     conex.desconecta();
    }
    }
}
   