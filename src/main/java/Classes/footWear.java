/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 * Representar un tipo de calzado
 * @author kawa
 */
public class footWear {
    
    /**
     * variables con su respectivo acceso para cada paquete.
     * en este caso solo tenemos un paquete pero se instacia cada variable con su respectivo permiso de acceso
     * 
     */
    
    private String brandName;
    public String color;
    public float size;
    protected String soleType;
    
    /**
     * constructor par ainicializar las variables
     * @param brandName nombre de la marca del calzado
     * @param color color del calzado
     * @param size talla del calzado
     * @param soleType tipo de suela del calzado
     */

    public footWear(String brandName, String color, float size, String soleType) {
        this.brandName = brandName;
        this.color = color;
        this.size = size;
        this.soleType = soleType;
    }
    
    /**
     * tenemos las funciones para modificar los atributos privado y protegidos
     * @return devuelve el dato con su respectivo tipo de dato
     */

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    protected String getSoleType() {
        return soleType;
    }

    protected void setSoleType(String soleType) {
        this.soleType = soleType;
    }
    
    private float price(String brandName, float size){
        float price = 400;
        if((brandName == "Nike") && (size==39)){
            return price;
        }
        return 0;
    }
    
}
