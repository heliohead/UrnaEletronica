
package dao;

import java.sql.Connection;
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
     
    
}
