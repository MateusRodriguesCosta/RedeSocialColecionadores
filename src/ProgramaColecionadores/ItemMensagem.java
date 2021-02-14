
package ProgramaColecionadores;


public class ItemMensagem {
    private int idItem;
    private final int idUser;
    private final String conteudo;

    public ItemMensagem(int idUser, String conteudo) {
        this.idUser = idUser;
        this.conteudo = conteudo;
        
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getConteudo() {
        return conteudo;
    }
    
    
    
}
