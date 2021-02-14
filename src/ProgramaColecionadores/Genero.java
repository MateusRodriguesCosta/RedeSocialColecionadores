package ProgramaColecionadores;

/**
 *
 * @author Mateus
 */

public class Genero{
    public String Censura;
    private String Genero;
    private String Produtora;
    private String Sinopse;
    private String Idioma;
    public Genero(){}
    public void setGenero(String genero){this.Genero=genero;}
    public void setCensura(String censura){this.Censura=censura;}
    public void setProdutora(String produtora){this.Produtora=produtora;}
    public void setSinopse(String sinopse){this.Sinopse=sinopse;}
    public void setIdioma(String idioma){this.Idioma=idioma;}
    public String getGenero(){return Genero;}
    public String getCensura(){return Censura;}
    public String getProdutora(){return Produtora;}
    public String getSinopse(){return Sinopse;}
    public String getIdioma(){return Idioma;}
}
