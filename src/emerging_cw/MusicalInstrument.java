/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emerging_cw;

/**
 *
 * @author acer
 */
public class MusicalInstrument {

    private int instrumentId;
    private String instrumentName;
    private String modelNum;
    private String brand;
    private int price;
    private int warranty;

    MusicalInstrument(int instrumentId, String instrumentName, String modelNum, String brand, int price, int warranty) {
        this.instrumentId = instrumentId;
        this.instrumentName = instrumentName;
        this.modelNum = modelNum;
        this.brand = brand;
        this.price = price;
        this.warranty = warranty;
    }

    public int getInstrumentId() {
        return this.instrumentId;
    }

    public String getInstrumentName() {
        return this.instrumentName;
    }

    public String getmodelNum() {
        return this.modelNum;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getPrice() {
        return this.price;
    }

    public int getWarranty() {
        return this.warranty;
    }
}
