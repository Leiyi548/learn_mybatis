package com.leiyi.pojo;

/**
 * @author Leiyi548
 * @date 2022/2/26 15:08
 */
public class Device {
    private int id;
    private String typeNo;
    private float productionPrice;
    private String productionDate;

    public Device(int id, String typeNo, float productionPrice, String productionDate) {
        this.id = id;
        this.typeNo = typeNo;
        this.productionPrice = productionPrice;
        this.productionDate = productionDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(String typeNo) {
        this.typeNo = typeNo;
    }

    public float getProductionPrice() {
        return productionPrice;
    }

    public void setProductionPrice(float productionPrice) {
        this.productionPrice = productionPrice;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", typeNo='" + typeNo + '\'' +
                ", productionPrice=" + productionPrice +
                ", productionDate='" + productionDate + '\'' +
                '}';
    }
}