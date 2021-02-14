package ProgramaColecionadores;

import Jogo.Cartas;
import Jogo.Trunfo;
import static ProgramaColecionadores.Principal.idUserLogando;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.swing.JPanel;
import view.IconUser;

public class Dados {
    //Listas que armazenaram informações/dados dos seus respectivos tipos. 
    public static int idPrimeiroLog;
    private static List<Usuario> usuarios;
    private static List<Moeda>lstm;
    private static List<Cartao>lstcartao;
    private static List<Camiseta>lstcamiseta;
    private static List<Jogo>lstj;    
    private static List<hWheels>lsthw;
    private static List<Quadrinho>lstq;
    private static List<Atividade> lstAtividades;
    private static List<String> times;
    private static List<String> material;
    private static List<String> cores;
    private static List<String> pais;
    private static HashMap<Integer,String> nomesTiposColecao;
    private static List<Mensagem> mensagens;
    private static List<Comunidade> comunidades;
    private static int[][] grafoComunidade=new int [10][10];
    public static List<Troca> listaTrocas=new ArrayList<Troca>();
    public static int[][]matrizTroca=new int[10][10];
    public static List<Evento> listaEventos=new ArrayList<Evento>();
    public static int[][] grafoEvento=new int [10][10];
    
    public static HashMap<Integer,Trunfo>jogos=new HashMap<Integer,Trunfo>(); 
    //Cada metodo retorna o numero de elementos da respectiva lista.
    public static Integer getNextIdUsuario(){return getUsuariosBD().size();}
    public static Integer getNextIdMoeda(){return getMoedasBD().size();}
    public static Integer getNextIdCartao(){return getCartoesBD().size();}
    public static Integer getNextIdCamiseta(){return getCamisetasBD().size();}
    public static Integer getNextIdJogo(){return getJogosBD().size();}
    public static Integer getNextIdQuadrinho(){return getQuadrinhosBD().size();}
    public static Integer getNextIdHotWheel(){return getHotWheelsBD().size();}
    public static Integer getNextIdAtividade(){return getAtividadesBD().size();}
    public static Integer getNextIdMensagem(){return getMensagensBD().size();}
    public static Integer getNextIdComunidade(){return getComunidadesBD().size();}

    //Adiciona o Usuario Adm à lista de usuarios se não existir nenhum usuario cadastrado(Se a lista de usuarios estiver vazia), senão retorna a lista de usuarios.
    public static List<Usuario> getUsuarios() {
        if (usuarios == null){
            usuarios = new ArrayList<Usuario>();
            Usuario adm=new Usuario();
            adm.setNome("PC");
            adm.setIdUsuario(usuarios.size());
            adm.setEmail("o");
            adm.setSenha("o");
            adm.salvar();
            adm.getCartoesCamiseta().addAll(Cartas.camisetas.keySet());
            adm.getCartoesCartao().addAll(Cartas.cartoes.keySet());
            adm.getCartoesJogo().addAll(Cartas.jogos.keySet());
            adm.getCartoesMoeda().addAll(Cartas.jogos.keySet());
            adm.getCartoesQuadrinho().addAll(Cartas.quadrinhos.keySet());
            adm.getCartoesHotWheels().addAll(Cartas.hWheels.keySet());
            getUsuariosBD();
            Usuario leticia=new Usuario();
            leticia.setNome("Letícia");
             leticia.setSobrenome("Meirelles");
             
            leticia.setIdUsuario(usuarios.size());
            leticia.setEmail("1");
            leticia.setSenha("1");
            leticia.salvar();
            leticia.getCartoesCamiseta().addAll(Cartas.camisetas.keySet());
            leticia.getCartoesCartao().addAll(Cartas.cartoes.keySet());
            leticia.getCartoesJogo().addAll(Cartas.jogos.keySet());
            leticia.getCartoesMoeda().addAll(Cartas.jogos.keySet());
            leticia.getCartoesQuadrinho().addAll(Cartas.quadrinhos.keySet());
            leticia.getCartoesHotWheels().addAll(Cartas.hWheels.keySet());
            getUsuariosBD();
            Usuario uri=new Usuario();
            uri.setNome("URI");
            uri.setIdUsuario(usuarios.size());
            uri.setEmail("2");
            uri.setSenha("2");
            uri.salvar();
            uri.getCartoesCamiseta().addAll(Cartas.camisetas.keySet());
            uri.getCartoesCartao().addAll(Cartas.cartoes.keySet());
            uri.getCartoesJogo().addAll(Cartas.jogos.keySet());
            uri.getCartoesMoeda().addAll(Cartas.jogos.keySet());
            uri.getCartoesQuadrinho().addAll(Cartas.quadrinhos.keySet());
            uri.getCartoesHotWheels().addAll(Cartas.hWheels.keySet());
            getUsuariosBD();
        }
            
        return usuarios;
        
    }
        //Se a lstAtividades estiver vazia irá criar e retornar uma lista vazia, senão retorna a lista de atividades já criada e com os seus elementos.
        public static List<Atividade> getAtividadesBD() {
        if (lstAtividades == null){
            return lstAtividades = new ArrayList<Atividade>();
        }
        return lstAtividades;
    }
    
        //Se a lstm estiver vazia irá criar e retornar uma lista vazia, senão retorna a lista de moedas já criada e com os seus elementos.
        public static List<Moeda> getMoedasBD() {
        if (lstm == null){
            return lstm = new ArrayList<Moeda>();
        }
        return lstm;
    }
       //Ação semelhante ao do metodo de retornar moeda
        public static List<Cartao> getCartoesBD() {
        if (lstcartao == null){
            return lstcartao = new ArrayList<Cartao>();
        }
        return lstcartao;
    }
        //Ação semelhante ao do metodo de retornar moeda
        public static List<Camiseta> getCamisetasBD() {
        if (lstcamiseta == null){
            return lstcamiseta = new ArrayList<Camiseta>();
        }
        return lstcamiseta;
    }
        //Ação semelhante ao do metodo de retornar moeda
        public static List<Jogo> getJogosBD() {
        if (lstj == null){
            return lstj = new ArrayList<Jogo>();
        }
        return lstj;
    }
        //Ação semelhante ao do metodo de retornar moeda
        public static List<Quadrinho> getQuadrinhosBD() {
        if (lstq == null){
            return lstq = new ArrayList<Quadrinho>();
        }
        return lstq;
    }
        //Ação semelhante ao do metodo de retornar moeda
        public static List<hWheels> getHotWheelsBD() {
        if (lsthw == null){
            return lsthw = new ArrayList<hWheels>();
        }
        return lsthw;
    }
        //metodo que ira retorna a lista de times cadastrados(Desconhecido, Outro) se a lista de times estive vazia, caso contrario irá retornar a lista de times(Desconhecido, Outro) com os times que foram adicionados. 
        public static List<String> getTimes() {
         if (times == null){
             times=new ArrayList<String>();
             times.add("Desconhecido");
             times.add("Outro");
             return times;
         }
        return times;
    }
        //Semelhante ao metodo que retorna lista de times
        public static List<String> getMaterial() {
         if (material == null){
             material=new ArrayList<String>();
             material.add("Desconhecido");
             material.add("Outro");
             return material;
         }
        return material;
    }
        //Semelhante ao metodo que retorna lista de times
        public static List<String> getCores() {
         if (cores == null){
             cores=new ArrayList<String>();
             cores.add("Desconhecido");
             cores.add("Outro");
             return cores;
         }
        return cores;
    }
        //Semelhante ao metodo que retorna lista de times
        public static List<String> getPais() {
         if (pais == null){
             pais=new ArrayList<String>();
             pais.add("Desconhecido");
             pais.add("Outro");
             return pais;
         }
        return pais;
    }
        
        
         public static HashMap<Integer, String> getNomesTiposColecao() {
        if(nomesTiposColecao==null){
           nomesTiposColecao= new HashMap<Integer,String>();
           nomesTiposColecao.put(1,"Camiseta");
           nomesTiposColecao.put(2,"Cartão");
           nomesTiposColecao.put(3,"Jogo");
           nomesTiposColecao.put(4,"Moeda");
           nomesTiposColecao.put(5,"Quadrinho");
           nomesTiposColecao.put(6,"HotWheels");
        }
        return nomesTiposColecao;
    }
         
        //Metodo que retorna as mensagens que estão na lista "mensagens" da classe Dados. Se estiver vazia, cria uma lista e retorna nenhum elemento(mensagem). Senão retorna a lista já criada com seus elementos(mensagem)
        public static List<Mensagem> getMensagensBD() {
         if (mensagens == null){
             mensagens=new ArrayList<Mensagem>();
             return mensagens;
         }
        return mensagens;
    } 
        //Metodo que retorna as comunidades que estão na lista "comunidades" da classe Dados. Se estiver vazia, cria uma lista e retorna nenhum elemento(comunidade). Senão retorna a lista já criada com seus elementos(comunidade)
        public static List<Comunidade> getComunidadesBD() {
        if (comunidades == null){
            return comunidades = new ArrayList<Comunidade>();
        }
        return comunidades;
    }
        //Lista as mensagens por ID de usuario - exibir mensagem de tal usuario
        public static HashMap<Integer,Mensagem> getMensagemPorID(){
           HashMap<Integer,Mensagem> mensagensBD=new HashMap<Integer,Mensagem>();
           for(Mensagem e: getMensagensBD()){
           mensagensBD.put(e.getIdMensagem(),e);
           }
        return mensagensBD;
       }
        //Lista as comunidades por ID de usuario - exibe as comunidades de tal usuario
        public static HashMap<Integer,Comunidade> getComunidadePorID(){
           HashMap<Integer,Comunidade> comunidadesBD=new HashMap<Integer,Comunidade>();
           for(Comunidade e: getComunidadesBD()){
           comunidadesBD.put(e.getIdComunidade(),e);
           }
        return comunidadesBD;
       }
        public static HashMap<Integer,Troca> getTrocaPorID(){
           HashMap<Integer,Troca> trocas=new HashMap<Integer,Troca>();
           for(Troca troca: listaTrocas){
           trocas.put(troca.getIdTroca(),troca);
           }
        return trocas;
       }
        /**
        * lista camisetas pelo id de usuário
        * @param idUsuario id do usuário que deseja listar camiseta
        * @return se existir camisetas
        */
        public static List<Camiseta>getColecaoCamiseta(int idUsuario){
        List camisetas=new ArrayList<Camiseta>();
        for(Camiseta e:Dados.getCamisetasBD()){
            if(e.getIdUsuario()==idUsuario){camisetas.add(e);}
        }
        return camisetas;    
    }
        /**
        * lista cartões pelo id de usuário
        * @param idUsuario id do usuário que deseja listar cartoes
        * @return se existir cartões
        */
        public static List<Cartao>getColecaoCartao(int idUsuario){
        List cartoes=new ArrayList<Cartao>();
        for(Cartao e:Dados.getCartoesBD()){
            if(e.getIdUsuario()==idUsuario){cartoes.add(e);}
        }
        return cartoes;    
    }
        public static List<Jogo>getColecaoJogo(int idUsuario){
        List jogos=new ArrayList<Jogo>();
        for(Jogo e:Dados.getJogosBD()){
            if(e.getIdUsuario()==idUsuario){jogos.add(e);}
        }
        return jogos;    
    }
        public static List<Moeda>getColecaoMoeda(int idUsuario){
           List moedas=new ArrayList<Moeda>();
        for(Moeda e:Dados.getMoedasBD()){
            if(e.getIdUsuario()==idUsuario){moedas.add(e);}
        }
        return moedas;    
    }
        public static List<Quadrinho>getColecaoQuadrinho(int idUsuario){
           List quadrinhos=new ArrayList<Quadrinho>();
        for(Quadrinho e:Dados.getQuadrinhosBD()){
            if(e.getIdUsuario()==idUsuario){quadrinhos.add(e);return quadrinhos;}  
        return quadrinhos;}
        return quadrinhos;    
    }
        public static List<hWheels>getColecaohWheels(int idUsuario){
           List hwheels=new ArrayList<hWheels>();
        for(hWheels e:Dados.getHotWheelsBD()){
            if(e.getIdUsuario()==idUsuario){hwheels.add(e);}
        }
        return hwheels;    
    }  
        //retornara as atividades(lista de atividades) do dado usuario(Receberá o ID do usuario por parametro)
        public static List<Atividade> getAtividadesUsuario(int idUsuario){
               //cria o objeto do tipo Atividade para armazenar nessa lista os elementos(atividade) encontrados.
               List<Atividade> lstAtividadesUsuario=new ArrayList<Atividade>();
               for (Atividade atividade : Dados.getAtividadesBD()) {//percorre lista de atividades
               if(atividade.getIdUsuario()==idUsuario){//verifica se a atividade possui o id do usuário 
               lstAtividadesUsuario.add(atividade);//adiciona a atividade na lista de atividades especificas do usuario
               }
        }
           return lstAtividadesUsuario;
        } 
        
        //retornara as atividades(lista de atividades) do dado usuario(Receberá o ID do usuario por parametro)
        public static List<Atividade> getAtividadesAmigosUsuario(int idUsuario){
               //cria o objeto do tipo Atividade para armazenar nessa lista os elementos(atividade) encontrados.
               List<Atividade> lstAtividadesUsuario=new ArrayList<Atividade>();
               for (Atividade atividade : Dados.getAtividadesBD()) {//percorre lista de atividades
               if( getUsuariosBD().get(idUsuario).amigos.contains(atividade.getIdUsuario())){
                   
                   lstAtividadesUsuario.add(atividade);//adiciona a atividade na lista de atividades especificas do usuario
               } 
               }
           return lstAtividadesUsuario;
        } 

        //metodo para rank, organizando os elementos da lista dos usuarios pelo rank que cada um possui, do maior para o menor.
        public static void Rank(){    
               //organiza lista de usuario
               Collections.sort(usuarios);
               for(int i=0; i<usuarios.size(); i++){
                      Usuario e=usuarios.get(i);
                      e.setRank(i);
                      System.out.println("Rank: \n"+"Nome: "+usuarios.get(i).getNome()+"Pontos: "+usuarios.get(i).getPontos());
               }
       }      
       //Retorna os usuarios existentes, com o ID e Usuario(objeto)
        public static HashMap<Integer,Usuario> getUsuariosBD(){
           HashMap<Integer,Usuario> usuariosBD=new HashMap<Integer,Usuario>();
           for(Usuario e:getUsuarios()){
           usuariosBD.put(e.getIdUsuario(),e);
           }
        return usuariosBD;
       }
        //Cria o grafo de amizades. Estabelecendo seu tamanho de acordo com os usuarios existentes(com o metodo getusuariosBD.size()), 
        //retornando as amizades, ou seja, retornando aqueles usuarios que possuem conexão com outro usuario através do grafo, 
        //onde na posição[usuario01][usuario02] contem o inteiro 1, por exemplo. Na matriz amizades em dada posição se houver numero 1, então coordenadas((x,y) ou(Usuario,Usuario)) tem amizade!
        private static Integer[][] amizades(){
           Integer amizades[][]=new Integer [getUsuariosBD().size()][getUsuariosBD().size()];
            for(int i=0;i<getUsuariosBD().size();i++){
                for(int j=0;j<getUsuariosBD().size();j++){
                    if (getUsuariosBD().get(i).amigos.contains(j)){
                        amizades[i][j]=1;
                    }else{
                        amizades[i][j]=0;
                    }
                }
            }
        return amizades;
       }
        
        //Retorna a lista de amidos do dado usuario(no parametro se encontra o id do usuario que se deseja verificar quais são seus amigos).
        public static List<Usuario> getAmigos(int idUsuario){
               //cria objeto listaAmigos para armazenar os amigos encontrados 
               ArrayList<Usuario> listaAmigos = new ArrayList<Usuario>();
               //Percorre a lista de usuarios, verificando se em dada posição existe amizade, e exibindo no terminal cada usuario que encontrar em amizade com o Usuario dado.
               for(int i=0;i<getUsuariosBD().size();i++){
                      for(int j=0;j<getUsuariosBD().size();j++){
                      System.out.print(amizades()[i][j]);
                      }
                      System.out.println();
               }
               //Percorre a lista de usuarios, verificando se em dada posição existe amizade, e adicionando o usuario com conexão de amizade a lista de de amizades criada no inicio do metodo.
               for(int i=0;i<getUsuariosBD().size();i++){
                      if((amizades()[idUsuario][i]==1)&&(amizades()[i][idUsuario]==1)){
                      listaAmigos.add(getUsuariosBD().get(i));
                      }
               }
          return listaAmigos;
          }
        //Metodo semelhante ao de amizades, mas faz verificação das solicitações de amizade feitas pelo usuario dado(atraves do parametro). E retorna a lista de usuarios que estão pendentes.
        public static List<Usuario> getAmigosPendentes(int idUsuario){
          ArrayList<Usuario> listaAmigos = new ArrayList<Usuario>();
          for(int i=0;i<getUsuariosBD().size();i++){
                if((amizades()[idUsuario][i]==1)&&(amizades()[i][idUsuario]==0)
                        ||(amizades()[idUsuario][i]==0)&&(amizades()[i][idUsuario]==1)){
                      listaAmigos.add(getUsuariosBD().get(i));
                }
          }
          return listaAmigos;
        }
        ////Metodo semelhante ao de amizades, mas faz verificação se usuario solicitou amizade com o usuario dado(atraves do parametro). E retorna a lista de usuarios que fizeram a solicitação
        public static List<Usuario> getSolicitacaoAmizade(int idUsuario){
          ArrayList<Usuario> listaAmigos = new ArrayList<Usuario>();
          for(int i=0;i<getUsuariosBD().size();i++){
                if((amizades()[idUsuario][i]==0)&&(amizades()[i][idUsuario]==1)){
                      listaAmigos.add(getUsuariosBD().get(i));
                }
          }
          return listaAmigos;
        }
        //Retorna as lista de mensagens do usuario(confuso sobre esse metodo)
        public static List<Mensagem> getMensagensUsuario(int idUsuario){
           ArrayList<Mensagem> listaMensagens = new ArrayList<Mensagem>();
           for(Mensagem e:getMensagensBD()){
               if(e.getIdUser().contains(idUsuario)){
                   listaMensagens.add(e);
               }
           }
        return listaMensagens;
        }
        
        //retorna o grafo de comunidades.
        public static int[][] getGrafoComunidade() {
        return grafoComunidade;
        }
        //retorna as comunidades(lsita) do usuario(o que está logado no caso) com seus membros
        public static List<Integer> getComunidadesUsuario(int idUsuario){
            List<Integer> comunidadesParticipante=new ArrayList<Integer>();
            for(int i=0;i<10;i++){
                if(grafoComunidade[idUsuario][i]==1){
                    comunidadesParticipante.add(i);
                }
            }
            System.out.print("Comunidades Usuário:" + comunidadesParticipante);
            return comunidadesParticipante;
        }
        public static List<Comunidade> getComunidadeAmigo(int amigo){
            List<Comunidade> comunidadeAmigo=new ArrayList<Comunidade>();
            for(Comunidade o:Dados.getComunidadesBD()){
                if(grafoComunidade[amigo][o.getIdComunidade()]==1){
                    comunidadeAmigo.add(o);
                }
            }
            return comunidadeAmigo;
        }
        
        
        public static List<JPanel> verificaBusca(String palavra){
            List<JPanel> resultadoBusca=new ArrayList<>();
            for(Usuario usuario:getUsuarios()){
                if(usuario.getNome().contains(palavra)){
                IconUser icon=new IconUser(usuario.getIdUsuario());
                resultadoBusca.add(icon);
                 icon.setVisible(true);
                }
            }
            for(int i=0;i<Dados.getComunidadesBD().size();i++){
                if(Dados.getComunidadePorID().get(i).getNome().contains(palavra)){
                view.IconComunidade icon=new view.IconComunidade(i);
                resultadoBusca.add(icon);
                 icon.setVisible(true);
                }
            }
            for(Item item:lstcamiseta){
                if(item.getNome()!=null){
                if(item.getNome().contains(palavra)){
                view.IconItem icon=new view.IconItem(item);
                resultadoBusca.add(icon);
                icon.setVisible(true);
                }
                }
            }
                for(Item item:lstm){
                if(item.getNome()!=null){
                if(item.getNome().contains(palavra)){
                view.IconItem icon=new view.IconItem(item);
                resultadoBusca.add(icon);
                icon.setVisible(true);
                }
                }
            }
                for(Item item:lstj){
                if(item.getNome()!=null){
                if(item.getNome().contains(palavra)){
                view.IconItem icon=new view.IconItem(item);
                resultadoBusca.add(icon);
                icon.setVisible(true);
                }
                }
            }
                for(Item item:lstq){
                if(item.getNome()!=null){
                if(item.getNome().contains(palavra)){
                view.IconItem icon=new view.IconItem(item);
                resultadoBusca.add(icon);
                icon.setVisible(true);
                }
                }
            }
                for(Item item:lsthw){
                if(item.getNome()!=null){
                if(item.getNome().contains(palavra)){
                view.IconItem icon=new view.IconItem(item);
                resultadoBusca.add(icon);
                icon.setVisible(true);
                }
                }
            }
                for(Evento item:listaEventos){
                if(item.getTitulo()!=null){
                if(item.getTitulo().contains(palavra)){
                view.IconEvento icon=new view.IconEvento(item);
                resultadoBusca.add(icon);
                icon.setVisible(true);
                }
                }
            } 
        return resultadoBusca;
        }
        
        public static List<JPanel> sugestaoDeAmizade(int idUsuario){
        List<JPanel> resultadoBusca=new ArrayList<>();
        Usuario logado=Dados.getUsuariosBD().get(idUsuario);
            for(Usuario usuario:getUsuarios()){
                if(usuario.getAreasInteresse()!=null&&logado.getAreasInteresse()!=null){
                if(usuario.getAreasInteresse().contains(logado.getAreasInteresse())&&(usuario.getIdUsuario()!=idUsuario)){
                IconUser icon=new IconUser(usuario.getIdUsuario());
                resultadoBusca.add(icon);
                 icon.setVisible(true);
                }
                }
            }
        return resultadoBusca;
        
        }

        
}