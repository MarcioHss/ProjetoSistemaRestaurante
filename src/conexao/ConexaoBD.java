package conexao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBD {
   public Statement stm;
   public ResultSet rs;
   private final String driver = "com.mysql.jdbc.Driver";
   private final String caminho = "jdbc:mysql://localhost:3306/projetosistemarestaurante"; 
   private final String usuario = "root";
   private final String senha = "";
   public Connection con;
   
   public void conexao(){
        try {
           System.setProperty("jdbc.Drivers", driver);
           con=DriverManager.getConnection(caminho, usuario, senha);
           // JOptionPane.showMessageDialog(null,"A Conexao com o banco foi feita com êxito!!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao se conectar com o banco de dados:\n"+ex.getMessage());
       }
   }
           
    public void desconecta(){
       try {
           con.close();
          // JOptionPane.showMessageDialog(null,"Desconectado com sucesso!!");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao fechar conexão com o banco de dados:\n" +ex.getMessage());
       }
        
    }
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
           rs = stm.executeQuery(sql);
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao se conectar com o banco de dados:\n"+ex.getMessage());
       }
   }
}
