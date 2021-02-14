package ProgramaColecionadores;

/**
 *
 * @author Mateus
 */

public class Modelo{
    //atributos
    private int idCor;
    private String Tamanho;
    private String Marca;
    private String Modelo;
    //metodo construtor
    public Modelo(){}
    //metodo de acesso
    public void setIdCor(int idcor){this.idCor=idcor;}
    public void setTamanho(String tamanho){this.Tamanho=tamanho;}
    public void setMarca(String marca){this.Marca=marca;}
    public void setModelo(String modelo){this.Modelo=modelo;}    
    public int getIdCor(){return idCor;}
    public String getTamanho(){return Tamanho;}
    public String getMarca(){return Marca;}
    public String getModelo(){return Modelo;}
}
