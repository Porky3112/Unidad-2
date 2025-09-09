package model;

public class ShippinCompany{

    private String duenio;
    private String nameCompany;


    private Ship CompanysShip;
    private Client[] companyClients new companyClients[5];

    public ShippinCompany(){


    }

    public Client addClient(String n, String nu, String ty, int k, int tP){

        
        String mensaje = validationQuantityClients();

        int i;
        boolean flat = true;

        for(i == 0; i < companyClients.length && flat; i ++){

            if (companyClients[i] == null){

                client = new Client(n, nu, ty, k, tP);
                companyClients[i] = client
                flat = false;
                
            }   
        }

        return Client;
    }



    public boolean validationQuantityClients(){


        if(companyClient.length => 5){

            mesagge = ""

        }

        else{
            
            mesagge= null
        }

        return mesaje;

    }

}