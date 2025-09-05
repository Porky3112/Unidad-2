package model;

public class Client{

    private String nameClient;
    private String CommercialRegister;
    private String typeClient;
    private int kilosTransportQuantity;
    private int totalValuePay;


    public Client(String name, String number, String type, int kilos, int totalPay ){

        this.nameClient = name;
        this.CommercialRegister = number;
        this.typeClient = type;
        this.kilosTransportQuantity = kilos;
        this.totalValuePay = totalPay;

    }

    public String getNombre(){

        return this.nameClient;

    }

    public String getNumber(){

        return this.CommercialRegister;

    }

    public String getType(){

        return this.typeClient;

    }

    public int getKilo(){

        return this.kilosTransportQuantity;

    }

    public int getTotalPayClient(){

        return this.totalValuePay;

    }

}