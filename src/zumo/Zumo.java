/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zumo;

/**
 *
 * @author aguadulce
 */
public class Zumo {
    private int litros;//contenido actual del deposito de zumo.
    private int precio_litro;
    private String sabor;
    private int litros_max;//capacidad máxima del deposito.

    /*Constructor por defecto*/
    public Zumo() {
    }
    /*Constructor por parámetros*/
    public Zumo(int litros, int precio_litro, String sabor, int litros_max) {
        this.litros = litros;
        this.precio_litro = precio_litro;
        this.sabor = sabor;
        this.litros_max = litros_max;
    }
    
    /*Método que permite consultar el contenido actual que tiene el deposito*/
    public int obtenerLitros(){
        return getLitros();
    }
    
    
    /*Método que permite sacar zumo del deposito siempre y cuando
    se tenga el dinero suficientes.Este método se probará con JUnit*/
    public void sacarZumo(int litros, int dinero) throws Exception
    {
        if (dinero <= 0) {
            throw new Exception("Es necesaria una cantidad positiva para sacar zumo");
        }

        if (dinero <(litros/getPrecio_litro())) {
            throw new Exception("No tiene suficiente dinero");
        }
        
        this.setLitros(this.getLitros() + litros);
    }

    
    /*Método que permite rellenar el deposito de zumo siempre y cuando
    la capacidad no se sobrepase. Este método sera probado con JUnit.*/
    public void rellenar(int litros) throws Exception

{
	if ((this.getLitros() + litros)>this.getLitros_max() )
        {throw new Exception("No se puede sobrepasar la capacidad del depósito");}	
		
		
        this.setLitros(this.getLitros() - litros);
	
}

    /**
     * @return the litros
     */
    public int getLitros() {
        return litros;
    }

    /**
     * @param litros the litros to set
     */
    public void setLitros(int litros) {
        this.litros = litros;
    }

    /**
     * @return the precio_litro
     */
    public int getPrecio_litro() {
        return precio_litro;
    }

    /**
     * @param precio_litro the precio_litro to set
     */
    public void setPrecio_litro(int precio_litro) {
        this.precio_litro = precio_litro;
    }

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * @return the litros_max
     */
    public int getLitros_max() {
        return litros_max;
    }

    /**
     * @param litros_max the litros_max to set
     */
    public void setLitros_max(int litros_max) {
        this.litros_max = litros_max;
    }

}

