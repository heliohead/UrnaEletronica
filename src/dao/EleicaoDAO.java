
package dao;

import classes.Candidato;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EleicaoDAO {
     public String gravarVoto(int numero){
        String resp;

        try{
            try (Connection con = Conecta.getConexao(); Statement stmt = con.createStatement()) {
                String sql = "UPDATE eleicoes SET votos = votos+1 WHERE numero=" +numero;
                stmt.executeUpdate(sql);
            }            
         
            resp = "Voto Gravado com Sucesso";
        }catch(Exception e){
            resp = e.toString();
        }         
        return resp;
    }
     
    public Candidato getEleitor(){
        try{
          Connection con = Conecta.getConexao();
          Statement stmt = con.createStatement(); 
          String sql = "SELECT * FROM eleicao";
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
