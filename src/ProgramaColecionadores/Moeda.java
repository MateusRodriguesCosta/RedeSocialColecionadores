package ProgramaColecionadores;

/**
 *
 * @author Mateus
 */

public class Moeda extends Item{
    //atributos
  
    private int idMaterial;
    private String PesoM;
    private String DiametroM;
    private String EspessuraM;
    private String CoresM;
    private String BordaM;
    private String MetodoCunhagemM;
    
    public Moeda (){
        super();
        this.setTipoItem(4);
    }

   
    public String getNomeM() {
        return this.getNome();
    }

    public void setNomeM(String NomeM) {
        this.setNome(NomeM); 
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getPesoM() {
        return PesoM;
    }

    public void setPesoM(String PesoM) {
        this.PesoM = PesoM;
    }

    public String getDiametroM() {
        return DiametroM;
    }

    public void setDiametroM(String DiametroM) {
        this.DiametroM = DiametroM;
    }

    public String getEspessuraM() {
        return EspessuraM;
    }

    public void setEspessuraM(String EspessuraM) {
        this.EspessuraM = EspessuraM;
    }

    public String getCoresM() {
        return CoresM;
    }

    public void setCoresM(String CoresM) {
        this.CoresM = CoresM;
    }

    public String getBordaM() {
        return BordaM;
    }

    public void setBordaM(String BordaM) {
        this.BordaM = BordaM;
    }

    public String getMetodoCunhagemM() {
        return MetodoCunhagemM;
    }

    public void setMetodoCunhagemM(String MetodoCunhagemM) {
        this.MetodoCunhagemM = MetodoCunhagemM;
    }
    public Boolean salvar(){
        this.setIdItem(Dados.getNextIdMoeda());
        Dados.getMoedasBD().add(this);
        return true;
    }
}
