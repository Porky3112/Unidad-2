package model;

public class ShippingCompany{

    private String boss;
    private String nameCompany;


    private Ship CompanysShip;
    private Client[] companyClients = new Client[5];

    public ShippingCompany(String d, String naC  ){

        this.boss = d;
        this.nameCompany = naC;

    }   

    public Client addClient(String n, String nu, String ty, int k, int tP){

        String mensaje = validationQuantityClients();

        Client client = null; 

        int i;
        boolean flat = true;

        for(i = 0; i < companyClients.length && flat; i ++){

            if (companyClients[i] == null){

                client = new Client(n, nu, ty, k, tP);
                companyClients[i] = client;
                flat = false;
                
            }   
        }

        return client;
    }



    public String validationQuantityClients(){

        String mesagge = null;


        if( quantityClient() >=  companyClients.length){

            mesagge = "El maximo es 5 clientes.";

        }

        else{
            
            mesagge= "Cargando cliente...";
        }

        return mesagge;

    }

    public int quantityClient(){

        int counter = 0;

        int i ;

        for(i = 0; i < companyClients.length; i ++){

            if(companyClients[i] != null ){

                counter += 1;
            }
        }

        return counter;
    }

    public String[] selectionInfoClient(){

        int i;
        String[] nameList = new String[quantityClient()];

        for( i = 0 ; i <  nameList.length; i ++ ){

            nameList[i] = companyClients[i].getName();

        }

        return nameList;
    }

    public String clientSelectionInfo(int ele){

        Client temporalClient = companyClients[ele];

        return "Nombre: " + temporalClient.getName() +
            "Numero de registro: " + temporalClient.getNumber() +
            "Tipo: " + temporalClient.getType() +
            "Kilos transportados: " + temporalClient.getKilo() +
            "Total pagado: "+ temporalClient.getTotalPayClient();      

    }
}