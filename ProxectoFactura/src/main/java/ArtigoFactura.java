/**
 *
 * @author a21manuelsg
 */
public class ArtigoFactura {
    
    private String id;

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(String id) {
        this.id = id;
    }

    private String descricion;

    /**
     * Get the value of descricion
     *
     * @return the value of descricion
     */
    public String getDescricion() {
        return descricion;
    }

    /**
     * Set the value of descricion
     *
     * @param descricion new value of descricion
     */
    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    private int cantidade;

    /**
     * Get the value of cantidade
     *
     * @return the value of cantidade
     */
    public int getCantidade() {
        return cantidade;
    }

    /**
     * Set the value of cantidade
     *
     * @param cantidade new value of cantidade
     */
    public void setCantidade(int cantidade) {
        this.cantidade = cantidade;
    }

    private double prezoUnitario;

    /**
     * Get the value of prezoUnitario
     *
     * @return the value of prezoUnitario
     */
    public double getPrezoUnitario() {
        return prezoUnitario;
    }

    /**
     * Set the value of prezoUnitario
     *
     * @param prezoUnitario new value of prezoUnitario
     */
    public void setPrezoUnitario(double prezoUnitario) {
        this.prezoUnitario = prezoUnitario;
    }

    public ArtigoFactura(String id, String descricion, int cantidade, double prezoUnitario) {
        this.id = id;
        this.descricion = descricion;
        this.cantidade = cantidade;
        this.prezoUnitario = prezoUnitario;
    }

    @Override
    public String toString() {
        return "ArtigoFactura{" + "id=" + id + ", descricion=" + descricion + ", cantidade=" + cantidade + ", prezoUnitario=" + prezoUnitario + '}';
    }
    
    public double obterPrezoTotal(){     
        return this.prezoUnitario*this.cantidade;      
    }
}
