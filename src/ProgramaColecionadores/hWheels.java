package ProgramaColecionadores;

/**
 *
 * @author Mateus
 */

public class hWheels extends Item
{
    
    private String Censura;
    private String Material;
    public hWheels(){super();
    this.setTipoItem(6);}
    Modelo o1=new Modelo();
    
    public void setCensura(String censura){this.Censura=censura;}
    public void setMaterial(String material){this.Material=material;}
    public String getCensura(){return Censura;}
    public String getMaterial(){return Material;}
    
    public Boolean salvar(){
        this.setIdItem(Dados.getNextIdHotWheel());
        Dados.getHotWheelsBD().add(this);
        return true;
    }
}
