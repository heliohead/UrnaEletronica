package dao;

import classes.Eleitor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class EleitorDAO {
    public String gravarEleitor(Eleitor eleitor){
        String resp;

        try{
            try (Connection con = Conecta.getConexao(); Statement stmt = con.createStatement()) {
                String sql = "INSERT INTO eleitor( NOME, TITULO) ";
                sql += "VALUES ('"+eleitor.getNome()+"', '"+eleitor.getTitulo()+"')";
                
                stmt.executeUpdate(sql);
            }            
         
            resp = "Eleitor Gravado com Sucesso";
        }catch(Exception e){
            resp = e.toString();
        }         
        return resp;
    }
    
        public Eleitor getEleitor(String titulo){
        Eleitor eleitor = new Eleitor();
        
        try{
          Connection con = Conecta.getConexao();
          Statement stmt = con.createStatement(); 
          String sql = "SELECT * FROM eleitor WHERE titulo='" + titulo + "'";
          ResultSet rs = stmt.executeQuery(sql);
          if(rs.next()){
            eleitor.setNome(rs.getString("nome"));
            eleitor.setTitulo(rs.getString("titulo"));
            //eleitor.setVotou(rs.getBoolean("votou"));
          }else{
            eleitor = null;
          }
          
          rs.close();
          stmt.close();
          con.close();
        }catch(Exception e){
            eleitor = null;
        }        
        return eleitor;
        
    }
}
