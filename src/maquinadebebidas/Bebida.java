
package maquinadebebidas;

/**
 *
 * @author Silvina Páez
 */
public abstract class Bebida {

    private int azucar;
    private int leche;
    
    public int getAzucar() {
        return azucar;
    }
    public int getLeche() {
        return leche;
    }
    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }
    public void setLeche(int leche) {
        this.leche = leche;
    }

    @Override
    public String toString() {
        return getClase() +","+getDetalle()+",azúcar x"+getAzucar()+",leche x"+getLeche();
    }
   
    public abstract String getDetalle();
    
    public abstract double getPrecio();
    
    public abstract String getClase();
}
