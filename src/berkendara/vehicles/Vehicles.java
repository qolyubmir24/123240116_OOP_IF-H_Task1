/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package berkendara.vehicles;

/**
 *
 * @author Mirwan Qolyubi
 */
public abstract class Vehicles {
    protected String vehicleType;

    public Vehicles(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return this.vehicleType;
    }
}
