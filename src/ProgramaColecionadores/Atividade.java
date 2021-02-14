package ProgramaColecionadores;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Leticia
 */ 
public class Atividade {
        int idAtividade,idComunidade, idItem, idTipoColecaoItem,idUsuario,idTipoAtividade,idStatus;
        private int like,deslike,view,privacidade;
        private int idUsursioDestinatario;
        enum tipoMural{
            perfil,comunidade,evento,
        }
        private tipoMural tipoMural;
        private Image foto;
        String textoPostagem;
        List<Item> lstItem;
        List<Usuario> usuarios;
        List<Comentario> comentarios;
        
        /***
        * Tipo de Atividade
        * 
        * tipo 0 - Undo de Atividade ou redo
        * tipo 1 - Adição de item de coleção
        * tipo 2 - Exclusão de item de coleção
        * tipo 3 - alteração de atributo de item
        * 41 undo adiçao
        * 42 undo exculsao
        * 43 undo edicao
        * 51 redo adicao
        * 52 redo remocao
        * 53 redo alteracao
        * 8 - Adição amigo
        *tipo 6 - atividade bloqueda
        *Tipo de Status
        * 1 - atividade desfeita
        * 0 - atividade refeita
        * 3 - atividade bloquedada
        */
        
        public String tipoAcao,nomeObjeto;
        public Date data;
        boolean notificacao;
        //Metodo construtor
        public Atividade(int idItem, int idTipoColecaoItem, int idUsuario, int idTipoAtividade, String tipoAcao, String nomeObjeto) {
               Date e=new Date();
               e.getTime();
               this.data=e;
               this.idItem = idItem;
               this.idTipoColecaoItem = idTipoColecaoItem;
               this.idUsuario = idUsuario;
               this.idTipoAtividade = idTipoAtividade;
               this.tipoAcao = tipoAcao;
               this.nomeObjeto = nomeObjeto;
               this.lstItem=new ArrayList<>();
               this.usuarios=new ArrayList<>();
        }
        //metodo construtor(recebe como parametro extra o id da atividade)
        public Atividade(int idAtividade, int idItem, int idTipoColecaoItem, int idUsuario, int idTipoAtividade, String tipoAcao, String nomeObjeto) {
               Date e=new Date();
               e.getTime();
               this.data=e;
               this.idAtividade = idAtividade;
               this.idItem = idItem;
               this.idTipoColecaoItem = idTipoColecaoItem;
               this.idUsuario = idUsuario;
               this.idTipoAtividade = idTipoAtividade;
               this.tipoAcao = tipoAcao;
               this.nomeObjeto = nomeObjeto;
               this.lstItem=new ArrayList<>();
               this.usuarios=new ArrayList<>();
        }
        
        

        /**
        *Atividade de adicão de amigo
        * @param idUsuario
        * @param idUsursioDestinatario
        */
        //Metodo construtor de atividade de adicao de amigo(recebendo como parametro o id do usuario e do usuario que você solicitar/destinatario)  
        public Atividade(int idUsuario,int idUsursioDestinatario) {
               Date e=new Date();
               e.getTime();
               this.data=e;
               this.idUsursioDestinatario=idUsursioDestinatario;
               this.idUsuario = idUsuario;
               this.idTipoAtividade = 7;
               this.tipoAcao = "Adicionou";
               this.nomeObjeto = Dados.getUsuariosBD().get(idUsursioDestinatario).getNomeUsuario();
               this.privacidade = 3;//privado
               this.idStatus=0;
               this.notificacao=true;
        }
        
        
        //METODO CONSTRUTOR GENERICO(padrao)
        public Atividade(){
            Date e=new Date();
            e.getTime();
            this.data=e;
            lstItem=new ArrayList<>();
            usuarios=new ArrayList<>();
        }
        
        
        
        //METODO CONSTRUTOR Postagem mural
        public Atividade(int idUsuario, String postagem, tipoMural tipoMural){
            this.idUsuario=idUsuario;
            this.textoPostagem=postagem;
            this.tipoMural=tipoMural;
            this.tipoAcao = "";
            this.nomeObjeto = "";
            Date e=new Date();
            e.getTime();
            this.data=e;
        }
        
         //METODO CONSTRUTOR Postagem mural com foto..
        public Atividade(int idUsuario, String postagem, Image foto, tipoMural tipoMural){
            this.idUsuario=idUsuario;
            this.textoPostagem=postagem;
            this.foto=foto;
            this.tipoMural=tipoMural;
            this.tipoAcao = "";
            this.nomeObjeto = "";
            Date e=new Date();
            e.getTime();
            this.data=e;
        }
        
          //METODO CONSTRUTOR Postagem mural com foto..
        public Atividade(int idUsuario, String postagem, Image foto, int idComunidade){
            this.idUsuario=idUsuario;
            this.idComunidade=idComunidade;
            this.textoPostagem=postagem;
            this.foto=foto;
            this.tipoMural=tipoMural.comunidade;
            this.tipoAcao = "";
            this.nomeObjeto = "";
            Date e=new Date();
            e.getTime();
            this.data=e;
        }
           //METODO CONSTRUTOR Postagem mural com foto..
        public Atividade(int idUsuario, String postagem, int idComunidade){
            this.idUsuario=idUsuario;
            this.idComunidade=idComunidade;
            this.textoPostagem=postagem;
            this.tipoMural=tipoMural.comunidade;
            this.tipoAcao = "";
            this.nomeObjeto = "";
            Date e=new Date();
            e.getTime();
            this.data=e;
        }
        
        //metodo undo que verifica se o usuario tem atividades para serem desfeitas(idStatus!=0), 
        //se tiver continua verificando o tipo da atividade a ser desfeita, e dependendo da atividade 
        //que sera desfeita dentro do laço IF se verdadeira ira executar um dos metodos que está dentro, por exemplo:
        //no primeiro IF, se o id da atividade for IGUAL à 1 OU for IGUAL à 51 ENTÃO ele ira executar o metodo UNDOADICAOITEM(). E assim sucessivamente.
        // != <--- diferente
        public void undo() {
        if(idStatus!=0){    
        if(idTipoAtividade==1||idTipoAtividade==51){undoAdicaoItem();}
        if(idTipoAtividade==2||idTipoAtividade==52){undoExclusaoItem();}
        if(idTipoAtividade==3||idTipoAtividade==53){undoAlteracaoItem();}
        if(idTipoAtividade==41){redoAdicaoItem();}
        if(idTipoAtividade==42){redoExclusaoItem();}
        if(idTipoAtividade==43){redoAlteracaoItem();}}
        }
        
       
        //METODO - DESFAZ ADIÇÃO DE ITEM
        public void undoAdicaoItem() {
               //verifica se a colecao(o ID - idTipoColecaoItem) é do tipo camiseta ---- O mesmo para todos os laços a seguir(cartao, moeda, hwheels, quadrinho e jogo)
               if (1==idTipoColecaoItem){
                      //Se for camiseta! carrega a camiseta(Que está dentro da classe Dados) e 
                      //altera o ID de usuário para 0 que é o ID que recebe os itens excluídos, ou seja, 
                      //ele armazena o item que foi excluido dentro de uma lista de um usuario "fantasma", 
                      //um usuario que será utilizado apenas para receber estes itens temporariamente.
                      Dados.getCamisetasBD().get(idItem).setIdUsuario(0);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 41, "desfez adição ","CAMISETA");
                      /**constroi atividade com os dados do objeto para registro de ação undo do usuário
                      *sim, temos uma classe que quando invoca alguns metodos cria um outro objeto pra
                      *registrar a ação do mesmo tipo... os parametros do objeto criado pelo metodo da atividade 
                      *é o mesmo da atividade criadora... exceto o tipo que é 0 além da descricão da mensagem que descreve a ação
                      */   
                      atividade.idStatus=1;
                      //adicionando a atividade na lista de atividades
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Adicao desfeita");  //mensagem para o usuario
               }
               
               if (idTipoColecaoItem==2){
                      Dados.getCartoesBD().get(idItem).setIdUsuario(0);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 41, "Desfez a adição de ","CARTÃO");
                      atividade.idStatus=1;
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Adicao desfeita");  
               }
               if (idTipoColecaoItem==3){
                      Dados.getJogosBD().get(idItem).setIdUsuario(0);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 41, "Desfez a adição de ","JOGO");
                      atividade.idStatus=1;
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Adicao desfeita");  
               }
               if (idTipoColecaoItem==4){
                      Dados.getMoedasBD().get(idItem).setIdUsuario(0);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 41, "Desfez a adição de ","MOEDA");
                      atividade.idStatus=1;
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Adicao desfeita");  
               }
               if (idTipoColecaoItem==5){
                      Dados.getQuadrinhosBD().get(idItem).setIdUsuario(0);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario,41, "Desfez a adição de ","QUADRINHO");
                      atividade.idStatus=1;
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Adicao desfeita");  
               }
               if (idTipoColecaoItem==6){
                      Dados.getHotWheelsBD().get(idItem).setIdUsuario(0);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 41, "Desfez a adição de ","HOT WHEELS");
                      atividade.idStatus=1;
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Adicao desfeita");  
               }  
        }
        //METODO - DESFAZ ESCLUSÃO DE ITEM
        public void undoExclusaoItem() {
               //verifica se a colecao(o ID - idTipoColecaoItem) é do tipo camiseta ---- O mesmo para todos os laços a seguir(cartao, moeda, hwheels, quadrinho e jogo)
               if (idTipoColecaoItem==1){
                      //Se for camiseta! carrega a camiseta(Que está dentro da classe Dados) e 
                      //altera o ID a que pertence a camiseta para o ID do usuario.
                      Dados.getCamisetasBD().get(idItem).setIdUsuario(idUsuario);//carrega a camiseta e altera o id de usuário
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario,42,"Desfez a exclusão de ","CAMISETA");
                      atividade.idStatus=1;
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Exclusão desfeita");  
               }
               if (idTipoColecaoItem==2){
                      Dados.getCartoesBD().get(idItem).setIdUsuario(idUsuario);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 42, "Desfez a exclusão de ","CARTÃO");
                      atividade.idStatus=1;
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Exclusão desfeita");  
               }
               if (idTipoColecaoItem==3){
                      Dados.getJogosBD().get(idItem).setIdUsuario(idUsuario);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 42, "Desfez a exclusão de ","JOGO");
                      atividade.idStatus=1;
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Exclusão desfeita");  
               }
               if (idTipoColecaoItem==4){
                      Dados.getMoedasBD().get(idItem).setIdUsuario(idUsuario);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 42, "Desfez a exclusão de ","MOEDA");
                      atividade.idStatus=1;
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Exclusão desfeita");  
               }
               if (idTipoColecaoItem==5){
                      Dados.getQuadrinhosBD().get(idItem).setIdUsuario(idUsuario);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 42, "Desfez a exclusão de ","QUADRINHO");
                      atividade.idStatus=1;
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Exclusão desfeita");  
               }
               if (idTipoColecaoItem==6){
                      Dados.getHotWheelsBD().get(idItem).setIdUsuario(idUsuario);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 42, "Desfez a exclusão de ","HOT WHEELS");
                      atividade.idStatus=1;
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Exclusão desfeita");  
               }
        }
        //METODO - DESFAZ ALTERAÇÃO
        public void undoAlteracaoItem() {
               //verifica se a colecao(o ID - idTipoColecaoItem) é do tipo camiseta ---- O mesmo para todos os laços a seguir(cartao, moeda, hwheels, quadrinho e jogo)
               if (idTipoColecaoItem==1){
                      Dados.getCamisetasBD().set(idItem, (Camiseta) lstItem.get(0));
                      /**Envia o objeto que foi armazenado na posicao 0 da lista de versao realizado durante o registro da alteracao(recebe a camiseta que foi salva na antes de ser alterada)
                      * apesar de ser do tipo item a gente faz gambiarra "(Camiseta)"e converte para o tipo camiseta... dica do professor que queria salvar a alma da tábata
                      */
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 43, "Desfez a alteração de ","CAMISETA");
                      atividade.idStatus=1;
                      //Lista de versões da classe atividades recebe todos os itens da lista de versões que foi alterada no metodo, ou seja, a lista que contem o objeto que foi alterado/excluido pelo usuario ou por undo.
                      //Lista de versões -->lstItem
                      atividade.lstItem=lstItem;
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Alteração desfeita");  
               }
               if (idTipoColecaoItem==2){
                      Dados.getCartoesBD().set(idItem, (Cartao) lstItem.get(0));
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 43, "Desfez a alteração de ","CARTÃO");
                      atividade.idStatus=1;
                      atividade.lstItem=lstItem;
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Alteração desfeita");  
               }
               if (idTipoColecaoItem==3){
                      Dados.getJogosBD().set(idItem, (Jogo) lstItem.get(0));
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 43, "Desfez a alteração de ","JOGO");
                      atividade.idStatus=1;
                      atividade.lstItem=lstItem;
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Alteração desfeita");  
               }
               if (idTipoColecaoItem==4){
                      Dados.getMoedasBD().set(idItem, (Moeda) lstItem.get(0));
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 43, "Desfez a alteração de ","MOEDA");
                      atividade.idStatus=1;
                      atividade.lstItem=lstItem;
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Alteração desfeita");  
               }
               if (idTipoColecaoItem==5){
                      Dados.getQuadrinhosBD().set(idItem, (Quadrinho) lstItem.get(0));
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 43, "Desfez a alteração de ","QUADRINHO");
                      atividade.idStatus=1;
                      atividade.lstItem=lstItem;
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Alteração desfeita");  
               }
               if (idTipoColecaoItem==6){
                      Dados.getHotWheelsBD().set(idItem, (hWheels) lstItem.get(0));
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 43, "Desfez a alteração de ","HOT WHEELS");
                      atividade.idStatus=1;
                      atividade.lstItem=lstItem; 
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Alteração desfeita");  
               }
        }
        //METODO - REFAZ ADIÇÃO
        public void redoAdicaoItem(){
               //verifica se a colecao(o ID - idTipoColecaoItem) é do tipo camiseta ---- O mesmo para todos os laços a seguir(cartao, moeda, hwheels, quadrinho e jogo)
               if (idTipoColecaoItem==1){
                      //Se for camiseta! carrega a camiseta(Que está dentro da classe Dados) e 
                      //altera o ID a que pertence a camiseta para o ID do usuario.
                      Dados.getCamisetasBD().get(idItem).setIdUsuario(idUsuario);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 51, "Refez a adição de ","CAMISETA");
                      atividade.idStatus=0;
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Adição refeita");  
               }
               if (idTipoColecaoItem==2){
                      Dados.getCartoesBD().get(idItem).setIdUsuario(idUsuario);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 51, "Refez a adição de ","CARTÃO");
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Adição refeita");  
               }
               if (idTipoColecaoItem==3){
                      Dados.getJogosBD().get(idItem).setIdUsuario(idUsuario);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 51, "Refez a adição de ","JOGO");
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Adição refeita"); 
               }
               if (idTipoColecaoItem==4){
                      Dados.getMoedasBD().get(idItem).setIdUsuario(idUsuario);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 51, "Refez a adição de ","MOEDA");
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Adição refeita");  
               }
               if (idTipoColecaoItem==5){
                      Dados.getQuadrinhosBD().get(idItem).setIdUsuario(idUsuario);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 51, "Refez a adição de ","JOGO");
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Adição refeita");  
               }
               if (idTipoColecaoItem==6){
                      Dados.getHotWheelsBD().get(idItem).setIdUsuario(idUsuario);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 51, "Refez a adição de ","HOT WHEELS");
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Adição refeita");  
               }
        
        }
        //METODO - REFAZ EXCLUSÃO
        public void redoExclusaoItem() {
               //verifica se a colecao(o ID - idTipoColecaoItem) é do tipo camiseta ---- O mesmo para todos os laços a seguir(cartao, moeda, hwheels, quadrinho e jogo)
               if (idTipoColecaoItem==1){
                      //Se for camiseta! carrega a camiseta(Que está dentro da classe Dados) e 
                      //altera o ID de usuário para 0 que é o ID que recebe os itens excluídos, ou seja, 
                      //ele armazena o item que foi excluido dentro de uma lista de um usuario "fantasma", 
                      //um usuario que será utilizado apenas para receber estes itens temporariamente.
                      Dados.getCamisetasBD().get(idItem).setIdUsuario(0);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 52, "Refez a exclusão de ","CAMISETA");
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Exclusão refeita");  
               }
               if (idTipoColecaoItem==2){
                      Dados.getCartoesBD().get(idItem).setIdUsuario(0);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 52, "Refez a exclusão de ","CARTÃO");
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Exclusão refeita");  
               }
               if (idTipoColecaoItem==3){
                      Dados.getJogosBD().get(idItem).setIdUsuario(0);
                      Atividade atividade=new Atividade( idItem,idTipoColecaoItem, idUsuario, 52, "Refez a exclusão de ","JOGO");
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Exclusão refeita");  
               }
               if (idTipoColecaoItem==4){
                      Dados.getMoedasBD().get(idItem).setIdUsuario(0);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 52, "Refez a exclusão de ","MOEDA");
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Exclusão refeita");  
               }
               if (idTipoColecaoItem==5){
                       Dados.getQuadrinhosBD().get(idItem).setIdUsuario(0);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 52, "Refez a exclusão de ","QUADRINHO");
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Exclusão refeita");  
               }
               if (idTipoColecaoItem==6){
                      Dados.getHotWheelsBD().get(idItem).setIdUsuario(0);
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 52, "Refez a exclusão de ","HOT WHEELS");
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Exclusão refeita");  
               }
        
        }
        //idêntico ao undo alteracao mas envia o item da segunda posicao na lista de versões (Lista de versões -> lstItem)
        //METODO - REFAZ ALTERAÇÃO
        public void redoAlteracaoItem() {
               if (idTipoColecaoItem==1){
                      Dados.getCamisetasBD().set(idItem, (Camiseta) lstItem.get(1));
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 53, "Refez a alteracao de ","CAMISETA");
                      atividade.lstItem=lstItem;
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Alteração refeita");  
               }
               if (idTipoColecaoItem==2){
                      Dados.getCartoesBD().set(idItem, (Cartao) lstItem.get(1));
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 53, "Refez a alteracao de ","CARTÃO");
                      atividade.lstItem=lstItem;
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Alteração refeita");  
               }
               if (idTipoColecaoItem==3){
                      Dados.getJogosBD().set(idItem, (Jogo) lstItem.get(1));
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 53, "Refez a alteracao de ","JOGO");
                      atividade.lstItem=lstItem;
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Alteração refeita");  
               }
               if (idTipoColecaoItem==4){
                      Dados.getMoedasBD().set(idItem, (Moeda) lstItem.get(1));
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 53, "Refez a alteracao de ","MOEDA");
                      atividade.lstItem=lstItem;
                       atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Alteração refeita");  
               }
               if (idTipoColecaoItem==5){
                      Dados.getQuadrinhosBD().set(idItem, (Quadrinho) lstItem.get(1));
                      Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 53, "Refez a alteracao de ","QUADRINHO");
                      atividade.lstItem=lstItem;
                      atividade.salvar();
                      JOptionPane.showMessageDialog(null, "Alteração refeita");  
               }
               if (idTipoColecaoItem==6){
                      Dados.getHotWheelsBD().set(idItem, (hWheels) lstItem.get(1));
                       Atividade atividade=new Atividade(idItem,idTipoColecaoItem, idUsuario, 53, "Refez a alteracao de ","HOT WHEELS");
                       atividade.lstItem=lstItem;
                        atividade.salvar();
                       JOptionPane.showMessageDialog(null, "Alteração refeita");  
               }
        
        }
        //METODO - ADICIONA VERSAO DO ITEM A LISTA
        
        //ADICIONA versoes do item do tipo Item da atividade
        public boolean add(Item e){return lstItem.add(e);}
        //ADICIONA versoes do item da atividade
        public boolean addUser(Usuario e) {return usuarios.add(e);}
        
        //METODOS DE ACESSO - GET(retorna/acessa) && SET(modifica/altera/armazena)
        public int getIdAtividade() {return idAtividade;}
        public void setIdAtividade(int idAtividade) {this.idAtividade = idAtividade;}
        public int getIdItem() {return idItem;}
        public void setIdItem(int idItem) {this.idItem = idItem;}
        public int getIdTipoColecaoItem() {return idTipoColecaoItem;}
        public void setIdTipoColecaoItem(int idTipoColecaoItem) {this.idTipoColecaoItem = idTipoColecaoItem;}
        public int getIdUsuario() {return idUsuario;}
        public void setIdUsuario(int idUsuario) {this.idUsuario = idUsuario;}
        public int getIdTipoAtividade() {return idTipoAtividade;}
        public void setIdTipoAtividade(int idTipoAtividade) {this.idTipoAtividade = idTipoAtividade;}
        public String getTipoAcao() {return tipoAcao;}
        public void setTipoAcao(String tipoAcao) {this.tipoAcao = tipoAcao;}
        public String getNomeObjeto() {return nomeObjeto;}
        public void setNomeObjeto(String nomeObjeto) {this.nomeObjeto = nomeObjeto;}
        public Date getData() {return data;}
        public void setData(Date data) {this.data = data;}
        public int getIdStatus() {return idStatus;}
        public void setIdStatus(int idStatus) {this.idStatus = idStatus;}
        public void setView() {this.view++;}
        public int getView() {return view;}
        public void setLike() {this.like++;}
        public int getLike() {return like;}

    public tipoMural getTipoMural() {
        return tipoMural;
    }

    public void setTipoMural(tipoMural tipoMural) {
        this.tipoMural = tipoMural;
    }

    public Image getFoto() {
        if(tipoMural==null){
          return getItem().getFoto();
        }else{
        return foto;
        }
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public String getTextoPostagem() {
        return textoPostagem;
    }

    public void setTextoPostagem(String textoPostagem) {
        this.textoPostagem = textoPostagem;
    }
        
        //Adiciona a atividade na lista de atividades dentro da classe Dados
        public void salvar(){
        this.setIdAtividade(Dados.getNextIdAtividade());
        Dados.getAtividadesBD().add(this);}
        
        //Bloqueia a atividade do usuario, para que não se exceda a quantidade de "undos" e "redos". Não armazenando outras atividades do usuario.
        public void bloquearAtividades(int idUserLogando){
               for (Atividade a: Dados.getAtividadesBD()) {//percorre lista de atividades
                      if(a.getIdUsuario()==idUserLogando){//verifica se a atividade possui o id do usuário logado
                             if((a.getIdTipoAtividade()==41)|| (a.getIdTipoAtividade()==42)|| (a.getIdTipoAtividade()==43 )||
                             (a.getIdTipoAtividade()==51)|| (a.getIdTipoAtividade()==52)|| (a.getIdTipoAtividade()==53 )){
                             a.setIdStatus(3);//bloqueada
                             }
                      }
               }  
        }
        //Metodo que retorna toda a lista de atividades 
       public List<Atividade> listar(){return Dados.getAtividadesBD();}
        
        /**
        * Busca o item relacionado à atividade
        * @return Item da atividade
        */
        //Busca o item relacionado à atividade, e quando encontrado retorna o item
        public Item getItem(){
        Item item=null;
        if(this.idTipoColecaoItem==1){
            item=Dados.getCamisetasBD().get(idItem);
        }else if(this.idTipoColecaoItem==2){
            item=Dados.getCartoesBD().get(idItem);
        }else if(this.idTipoColecaoItem==3){
            item=Dados.getJogosBD().get(idItem);
        }else if(this.idTipoColecaoItem==4){
            item=Dados.getMoedasBD().get(idItem);
        }else if(this.idTipoColecaoItem==5){
            item=Dados.getQuadrinhosBD().get(idItem);
        }else if(this.idTipoColecaoItem==6){
            item=Dados.getHotWheelsBD().get(idItem);
        }else{}
            return item;
        }
        //Recebe os comentarios em uma nova ArrayList de comentarios 
        public List<Comentario> getComentarios(){ if (comentarios == null){
            return comentarios = new ArrayList<Comentario>();
        }
        return comentarios;
        }
        //Retorna toda a lista de comentarios
        public Integer getNextIdComentario(){return getComentarios().size();}
        
        //Metodo para criar comentario, tendo como parametro o id do usuario, e o texto(String) de comentario.
        public void setComentario(int idUser,String texto){
        //cria o objeto comentario
        Comentario comentario = new Comentario();
        //Recebe(set) o id do comentario.
        comentario.setIdComentario(getNextIdComentario());
        //Recebe(set) o id da Atividade.
        comentario.setIdAtividade(idAtividade);
        //Recebe(set) o id do usuario.
        comentario.setIdUsuario(idUser);
        //Recebe(set) o id do item.
        comentario.setIdItem(idItem);
        //Recebe(set) o conteudo do comentario(texto - String).
        comentario.setConteudo(texto);
        //Adiciona o objeto(comentario) que foi criado e adiciona na lista de comentarios.
        comentarios.add(comentario);   
    }
}