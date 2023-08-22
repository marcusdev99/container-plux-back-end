package com.devcoast.containerplux.model;


import jakarta.persistence.*;

//TODO  : Agregar hora de entrada
//TODO :  Agregar hora de salida
//TODO : Agregar nombre de transportista
//TODO : Agregar propiedad estado

@Entity(name = "containers")
public class Container {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String entryDay;
    private String entryHour;
    private String outDay;
    private String status;
    private String type;
    private String size;
    private String shippingCompany;
    private String operator;
    private String licencePlate;
    private String carrier;

    public Container() {
    }

    public Container(String entryDay, String entryHour, String outDay, String status, String type, String size, String shippingCompany, String operator, String licencePlate, String carrier) {
        this.entryDay = entryDay;
        this.entryHour = entryHour;
        this.outDay = outDay;
        this.status = status;
        this.type = type;
        this.size = size;
        this.shippingCompany = shippingCompany;
        this.operator = operator;
        this.licencePlate = licencePlate;
        this.carrier = carrier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntryDay() {
        return entryDay;
    }

    public void setEntryDay(String entryDay) {
        this.entryDay = entryDay;
    }

    public String getEntryHour() {
        return entryHour;
    }

    public void setEntryHour(String entryHour) {
        this.entryHour = entryHour;
    }

    public String getOutDay() {
        return outDay;
    }

    public void setOutDay(String outDay) {
        this.outDay = outDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
}

