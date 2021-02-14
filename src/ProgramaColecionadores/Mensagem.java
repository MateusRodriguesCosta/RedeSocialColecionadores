
package ProgramaColecionadores;

import java.util.ArrayList;
import java.util.List;

public class Mensagem {
    private final List<Integer> idUser;
    private final Integer idMensagem;
    private final List<ItemMensagem> listaItens;

    public Mensagem(int idUserLogando, int idUser, String conteudo) {
        this.idMensagem=Dados.getNextIdMensagem();
        this.listaItens=new ArrayList<ItemMensagem>();
        this.idUser=new ArrayList<Integer>();
        this.idUser.add(idUser);
        this.idUser.add(idUserLogando);
        this.setResposta(idUserLogando, conteudo);
        Dados.getMensagensBD().add(this);
    }

    public Integer getIdMensagem() {
        return idMensagem;
    }

    public void setUsuario(Integer e) {
        idUser.add(e);
    }
        
    public void setResposta(int idUser, String conteudo){
        ItemMensagem item =new ItemMensagem(idUser,conteudo);
        item.setIdItem(listaItens.size());
        listaItens.add(item);
    }

    public List<ItemMensagem> listarRespostas() {
        return listaItens;
    }

    public List<Integer> getIdUser() {
        return idUser;
    }
    
    
}
