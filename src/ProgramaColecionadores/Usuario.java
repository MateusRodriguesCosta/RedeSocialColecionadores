package ProgramaColecionadores;

import Jogo.Jogador;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mateus
 */

public class Usuario implements Cloneable, Comparable{
    //atributos
    private String areasInteresse;
    private String Telefone;
    private String Celular;
    private String Nome;
    private String Sobrenome;
    private String Sexo;
    private String Idioma;
    private String dataNascimento;
    private String dataDeResgistro;    
    private String Numero;
    private String email;
    private String nomeUsuario;
    private int idUsuario;
    private boolean status;
    private String Sobre;
    private int idPais;
    private Image foto;
    private String CNPJ; //opcao01
    private String Cpf;  //opcao02
    private int privacidade;
    private int pontos=getQuantidadeColecoes();
    private int classificacao;
    private int rank;
    private String senha;
    private List<Forum> recados;
    public ArrayList<Integer> amigos;
    private List<Integer> idMensagens;
    private Jogador jogador;
    
    private Image publi1;
    //metodo construtor
    public Usuario(){super();
    amigos=new ArrayList<Integer>();
    }
    
    //metodos de acesso
    public Image getFoto() {return foto;}
    public void setFoto(Image foto) {this.foto = foto;}
    public void setPrivacidade(int privacidade) {this.privacidade = privacidade;}
    public String getTelefone(){return Telefone;}
    public void setTelefone(String Telefone){this.Telefone = Telefone;}
    public String getCelular(){return Celular;}
    public void setCelular(String Celular){this.Celular = Celular;}
    public String getNome(){return Nome;}
    public void setNome(String Nome){this.Nome = Nome;}
    public String getSobrenome(){return Sobrenome;}
    public void setSobrenome(String Sobrenome){this.Sobrenome = Sobrenome;}
    public String getSexo(){return Sexo;}
    public void setSexo(String Sexo){this.Sexo = Sexo;}
    public String getIdioma(){return Idioma;}
    public void setIdioma(String Idioma){this.Idioma = Idioma;}
    public String getDataNascimento(){return dataNascimento;}
    public void setDataNascimento(String dataNascimento){this.dataNascimento = dataNascimento;}
    public String getDataDeResgistro(){return dataDeResgistro;}
    public void setDataDeResgistro(String dataDeResgistro){this.dataDeResgistro = dataDeResgistro;}
    public String getNumero(){return Numero;}
    public void setNumero(String Numero){this.Numero = Numero;}
    public void setSobre(String sobre){this.Sobre=sobre;}
    public String getSobre(){return Sobre;}
    public int getIdPais(){return idPais;}
    public void setIdPais(int idPais){this.idPais=idPais;}
    public String getAreasInteresse(){return areasInteresse;}
    public String getAreasInteresse(String toString){return areasInteresse;}
    public boolean isStatus() {return status;}
    public void setStatus(boolean status) {this.status = status;}
    public void addAmigo(int idUser){this.amigos.add(idUser);
        Atividade e=new Atividade();
        
    }
        
     public Image getPubli1() {
        if(publi1!=null){
        return publi1;}else{
            return null;
        }
    }

    public void setPubli1(Image publi1) {
        this.publi1 = publi1;
    }
    
    
    public void setEmail(String text) {this.email=text;}
    public void setNomeUsuario(String text) {this.nomeUsuario=text;}
    public void setSenha(String senha) {this.senha=senha;}
    public String getNomeUsuario() {return nomeUsuario;}
    public String getEmail() {return email;}
    public String getSenha() {return senha;}
    public String getCNPJ(){return CNPJ;}
    public void setCNPJ(String CNPJ){this.CNPJ = CNPJ;}
    public String getCpf(){return Cpf;}
    public void setCpf(String Cpf){this.Cpf = Cpf;}
    public void setAreasInteresse(String areas){this.areasInteresse = areas;}
    public int getIdUsuario() {return idUsuario;}
    public int getPrivacidade() {return privacidade;}
    public void setIdUsuario(int idUsuario) {this.idUsuario = idUsuario;}
    public void vPerfil(){}  
    public void vLocalizacao(){}
    public void visualizarContato(){
    //(v)visualizar Telefone, Celular, Endereco...
    }
    public void editarPerfil(){}   
    public void Entrar(){}
    public void Sair(){}

    
    //cartas jogo
    public void setCartaCamiseta(int idCartaCamiseta) {
        jogador.setCamiseta(idCartaCamiseta);
    }

    public void setCartaCartao(int idCartaCartao) {
        jogador.setCartao(idCartaCartao);
    }

    public void setCartaJogo(int idCartaJogo) {
        jogador.setJogo(idCartaJogo);
    }

    public void setCartaMoeda(int idCartaMoeda) {
        jogador.setMoeda(idCartaMoeda);
    }

    public void setCartaQuadrinho(int idCartaQuadrinho) {
        jogador.setQuadrinho(idCartaQuadrinho);
    }

    public void setCartaHotWheels(int idCartaHotWheels) {
        jogador.setHotWheels(idCartaHotWheels);
    }

    public List<Integer> getCartoesCamiseta() {
        return jogador.getCartoesCamiseta();
    }

    public List<Integer> getCartoesCartao() {
        return jogador.getCartoesCartao();
    }

    public List<Integer> getCartoesJogo() {
        return jogador.getCartoesJogo();
    }

    public List<Integer> getCartoesMoeda() {
        return jogador.getCartoesMoeda();
    }

    public List<Integer> getCartoesQuadrinho() {
        return jogador.getCartoesQuadrinho();
    }

    public List<Integer> getCartoesHotWheels() {
        return jogador.getCartoesHotWheels();
    }
    //cartas jogo
    
    
  public int getRank() {
        getQuantidadeItensColecoes();
       
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    //public void getAreasInteresse(String toString) {}
@Override
    public Object clone(){
        Object c = new Usuario();
        try{
           Usuario i = (Usuario) super.clone();
           c=i;
        }
        catch(CloneNotSupportedException g){ }
        return c;
    }
        
    public Boolean salvar(){
       this.setIdUsuario(Dados.getNextIdUsuario());
       jogador=new Jogador(idUsuario);
       Dados.getUsuarios().add(this);
       Jogador put = Jogador.put(this.getIdUsuario(), jogador);
       return true;
    }
       
    public List<Usuario> listar(){
        Dados.Rank();
        return Dados.getUsuarios();
    }
    /**
    * Retorna a quantidade de colecoes do usuário
    * @return se existir camisetas
    */
     public int getQuantidadeColecoes(){
        int total=0;
        if(!getColecaoCamiseta().isEmpty()){//verifica se não é vázio
        total++;}
        if(!getColecaoCartao().isEmpty()){//verifica se não é vázio
        total++;}
        if(!getColecaoJogo().isEmpty()){//verifica se não é vázio
        total++;}
        if(!getColecaoMoeda().isEmpty()){//verifica se não é vázio
        total++;}
        if(!getColecaoQuadrinho().isEmpty()){//verifica se não é vázio
        total++;}
        if(!getColecaohWheels().isEmpty()){//verifica se não é vázio
        total++;}
        return total;
        
    }
    /**
    * Retorna a quantidade itens do usuário
    * @return se existir itens cadastrados
    */
    public int getQuantidadeItensColecoes(){
        int total=0;
        if(!getColecaoCamiseta().isEmpty()){//verifica se não é vázio
        total+=getColecaoCamiseta().size();}
        if(!getColecaoCartao().isEmpty()){//verifica se não é vázio
        total+=getColecaoCartao().size();}
        if(!getColecaoJogo().isEmpty()){//verifica se não é vázio
        total+=getColecaoJogo().size();}
        if(!getColecaoMoeda().isEmpty()){//verifica se não é vázio
        total+=getColecaoMoeda().size();}
        if(!getColecaoQuadrinho().isEmpty()){//verifica se não é vázio
        total+=getColecaoQuadrinho().size();}
        if(!getColecaohWheels().isEmpty()){//verifica se não é vázio
        total+=getColecaohWheels().size();}
        this.pontos=total;
        return total;
        
    }
    
    /**
    * lista camisetas do usuario
    * @return se existir camisetas
    */
    public List<Camiseta>getColecaoCamiseta(){
        List camisetas=new ArrayList<>();
        for(Camiseta e:Dados.getCamisetasBD()){
            if(e.getIdUsuario()==idUsuario){camisetas.add(e);}
        }
        return camisetas;    
    }
    /**
    * Verificar se usuario possui colecao de camisetas
    * @return verdadeiro de existir
    */
    public boolean ExisteColecaoCamiseta(){
        return !getColecaoCamiseta().isEmpty();
    }
    
    /**
    * lista cartoes do usuario
    * @return lista se existir camisetas
    */
    public List<Cartao>getColecaoCartao(){
        List cartoes=new ArrayList<Cartao>();
        for(Cartao e:Dados.getCartoesBD()){
            if(e.getIdUsuario()==idUsuario){cartoes.add(e);}
        }
        return cartoes;    
    }
    /**
    * Verificar se usuario possui colecao de cartoes
    * @return verdadeiro de existir
    */
    public boolean ExisteColecaoCartao(){
        return !getColecaoCartao().isEmpty();
    }
    
    public List<Jogo>getColecaoJogo(){
        List jogos=new ArrayList<Jogo>();
        for(Jogo e:Dados.getJogosBD()){
            if(e.getIdUsuario()==idUsuario){jogos.add(e);}
        }
        return jogos;    
    }
    public boolean ExisteColecaoJogo(){ return !getColecaoJogo().isEmpty();}
   
    public List<Moeda>getColecaoMoeda(){
        List moedas=new ArrayList<Moeda>();
        for(Moeda e:Dados.getMoedasBD()){
            if(e.getIdUsuario()==idUsuario){moedas.add(e);}
        }
        return moedas;    
    }
    public boolean ExisteColecaoMoeda(){ return !getColecaoMoeda().isEmpty();}
    public List<Quadrinho>getColecaoQuadrinho(){
        List quadrinhos=new ArrayList<Quadrinho>();
        for(Quadrinho e:Dados.getQuadrinhosBD()){
            if(e.getIdUsuario()==idUsuario){quadrinhos.add(e);return quadrinhos;}  
        }
        return quadrinhos;    
    }
    public boolean ExisteColecaoQuadrinho(){ return !getColecaoQuadrinho().isEmpty();}
    
    public List<hWheels>getColecaohWheels(){
           List hwheels=new ArrayList<hWheels>();
        for(hWheels e:Dados.getHotWheelsBD()){
            if(e.getIdUsuario()==idUsuario){hwheels.add(e);}
        }
        return hwheels;    
    }
     public boolean ExisteColecaohWheels(){ return !getColecaohWheels().isEmpty();}

   
     /**
    * Busca na classe dados todas as atividades do usuário
    * @return verdadeiro de existir
    */
     public List<Atividade> getAtividades(){
         return Dados.getAtividadesUsuario(idUsuario);
     }
     
    /**
    * Busca os recados que o usuário recebeu
    * @return 
    */
    public List<Forum> getRecados(){ if (recados == null){
            return recados = new ArrayList<Forum>();
        }
        return recados;
    }
      
    public Integer getNextIdRecado(){return getRecados().size();}
    
    public void setRecado(int idUser,String texto){
        Forum recado = new Forum(idUser, texto);
        recados.add(recado);   
    }
      
     
//METODO DE COMPARAÇÃO PARA ORGANIZAÇÃO E IMPLEMENTAÇÃO DO "RANK"   
            public int compareTo(Object o){
            Usuario user = (Usuario) o;
            if(pontos < user.pontos){
                   return 1;
             }else{
                   if(pontos > user.pontos){
                    return -1;
                    }else{return 0;}
            }
            }
        
        public int getPontos(){
            return this.pontos;
        }
//metodo retorna lista de comunidades do usuario
        public List<Integer> getComunidadesUsuario(){
            List<Integer> comunidadesParticipante=new ArrayList<Integer>();
            for(int i=0;i<10;i++){
                if(Dados.getGrafoComunidade()[idUsuario][i]==1){
                    comunidadesParticipante.add(i);
                }
            }
            return comunidadesParticipante;
        }
        
        
}