
package maquinaCafe;

/**
 *
 * @author Silvina Páez
 */
public class Expreso extends Cafe{
    
    @Override
    public String getDetalle() {
        return "Expresso";
    }
    @Override
    public double getPrecio() {
        return 100; 
    }   
}

