package model;

public class Client{

    private String nameClient;
    private String CommercialRegister;
    private LocalDate expirationDate;
    private String typeClient;
    private int kilosTransportQuantity;
    private int totalValuepay;


    public Client(String name, String number, String type, int kilos, int totalPay ){

        nameClient = name;
        CommercialRegister = number;
        typeClient = type;
        kilosTransportQuantity = kilos;
        totalValuepay = totalPay;


    }

}