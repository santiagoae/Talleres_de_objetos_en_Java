/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 * Represnetar un tipo de vehiculo
 * @author kawa
 */
public class Vehicle {

    /**
     * variables con su respectivo acceso para cada paquete.
     * en este caso solo tenemos un paquete pero se instacia cada variable con su respectivo permiso de acceso
     * 
     */
    
    private String vehicleBrand;
    public String plateNumber;
    public String name;
    public String color;
    public int capacity;
    protected String chassisNumber;
    
    /**
     * constructor para inicializar las variables de la clase
     * @param vehicleBrand marca del vehiculo 
     * @param plateNumber numero de placa
     * @param name nombre de vehiculo
     * @param color color del vehiculo
     * @param capacity capacidad de pasajeros del vehiculo
     * @param chassisNumber numeor de chasis del vehiculo 
     */

    public Vehicle(String vehicleBrand, String plateNumber, String name, String color, int capacity, String chassisNumber) {
        this.vehicleBrand = vehicleBrand;
        this.plateNumber = plateNumber;
        this.name = name;
        this.color = color;
        this.capacity = capacity;
        this.chassisNumber = chassisNumber;
    }
    
    /**
     * tenemos las funciones para modificar los atributos privado y protegidos
     * @return devuelve el dato con su respectivo tipo de dato
     */

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    protected String getChassisNumber() {
        return chassisNumber;
    }

    protected void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    private String showVehicleDescription(String vehicleBrand, String chassisNumber) {

        return "Vehicle Brand: " + vehicleBrand + "Chassis Number: " + chassisNumber;
    }

    public String ShowVehicle() {
        return showVehicleDescription(this.vehicleBrand, this.chassisNumber) + "Vehicle Color: " + this.color;
    }

}
