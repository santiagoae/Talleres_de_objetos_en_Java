/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 * Representar un tipo de juguete
 * @author kawa
 */
public class Toy {
    
    /**
     * variables con su respectivo acceso para cada paquete.
     * en este caso solo tenemos un paquete pero se instacia cada variable con su respectivo permiso de acceso
     * 
     */
    private String toyType;
    public String category;
    public float price;
    protected String brandName;
    
    /**
     * constructor par ainicializar las variables
     * @param toyType tipo de juguete
     * @param category categoria del juguete
     * @param price precio del juguete
     * @param brandName marca del juguete
     */

    public Toy(String toyType, String category, float price, String brandName) {
        this.toyType = toyType;
        this.category = category;
        this.price = price;
        this.brandName = brandName;
    }
    
    /**
     * tenemos las funciones para modificar los atributos privado y protegidos
     * @return devuelve el dato con su respectivo tipo de dato
     */

    public String getToyType() {
        return toyType;
    }

    public void setToyType(String toyType) {
        this.toyType = toyType;
    }

    protected String getBrandName() {
        return brandName;
    }

    protected void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    
    private String showToyDescription(String toyType, String brandName) {

        return "This is a: " + toyType + "of our brand: " + brandName;
    }
    
    
}
