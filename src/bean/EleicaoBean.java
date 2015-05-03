package bean;

import dao.EleicaoDAO;
import javax.swing.JTextField;

public class EleicaoBean {

    public EleicaoBean() {
       
    }

    @SuppressWarnings("empty-statement")
    public String verificarVoto(JTextField txtVotoNumero) {
        EleicaoDAO el = new EleicaoDAO();
        String resp = "";
        switch(txtVotoNumero.getText()){
            case "13":
                resp = el.gravarVoto(13);
                break;
            case "15":
                resp = el.gravarVoto(15);
                break;
            case "20":
                resp = el.gravarVoto(13);
                break;
            case "25":
                resp = el.gravarVoto(25);
                break;
            case "00":
                resp = el.gravarVoto(0);
                break;
            default:
                resp = "Voto Anulado";
        };
        
        System.out.println(resp);
        return resp;
    }
}
