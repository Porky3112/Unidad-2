package ui;
import java.util.Scanner;
import model.ShippingCompany;


public class MorganApp{

    private static Scanner scan = new Scanner (System.in);
  

    public static void menu(ShippingCompany myS){

        int option;

        do{
            
            

            System.out.println("****** Bienvenido a la APP Morgan ********");
            System.out.println("Ingrese una opcion: ");
            System.out.println();
            System.out.println("1. Cargar barco");
            System.out.println("2. Descargar el barco");
            System.out.println("3. Calcular peso total de la carga del barco");
            System.out.println("4. Verificar si el barco puede zarpar");
            System.out.println("5. Cargar cliente");
            System.out.println("6. Desplegar cliente");
            System.out.println("7. Salir de APP");
            System.out.println("Ingresa una opcion: ");

            option = askInt();

            

            switch(option){


                case 1: 
                    break; 

                case 2:
                    break;

                case 3:
                    break;
                    
                case 4:
                    break;
                
                case 5: validationQuantityClients(myS);
                    addClient(myS);
                    break;

                case 6: clientSelectionInfo(myS);
                    break;

                case 7: System.out.println("Nos vemos pronto!!");
                    break;

                default:

            }



        }while( option != 7);

    }



    public static String ask(){
        
        System.out.print(": ");
        String answer = scan.nextLine();

        return answer; 


    }

    public static int askInt(){
        
        System.out.print(": ");
        int answer = scan.nextInt();
        scan.nextLine();

        return answer; 


    }

    public static void validationQuantityClients(ShippingCompany myShipController){

        String validation = myShipController.validationQuantityClients();

        if(validation == null ){

            System.out.println("Error al agregar cliente.");
        }
    }


    public static void addClient(ShippingCompany myShipController){


        System.out.println("Digite el nombre del cliente");
        String name = ask();

        System.out.println("Digite el registro del mercado del cliente");
        String number = ask();

        System.out.println("Digite el tipo de cliente");
        String type = ask();

        System.out.println("Digite la cantidad de kilos que ha transportado el cliente");
        int kilos = askInt();
        
        System.out.println("Digite el valor total pagado por el cliente");
        int totalPay = askInt();

        myShipController.addClient( name,  number,  type,  kilos,  totalPay);
        
    }



    public static int menuOfClients(ShippingCompany myShipController ){

        String[] clientList = myShipController.selectionInfoClient();

        int clientsNumber = myShipController.quantityClient();

        int i;

        for(i = 0; i < clientsNumber; i ++){

            System.out.println((i + 1) +  " : " + clientList[i]);
        }

        int election = validationOfElectionInMenu(clientsNumber, clientList);

        election -= 1;


        return election;


    }

    public static int validationOfElectionInMenu(int cN, String[] cL){

        int electionU;

        int i;

        do{ 

            for(i = 0; i < cN; i ++){

                System.out.println((i + 1) +  " : " + cL[i]);
            }

            System.out.println("Elige un cliente: ");

            electionU = askInt();

            if (electionU > cN  || electionU < 1){

                System.out.println("Opcion incorrecta.");
            }

        }while(electionU > cN  || electionU < 1);

        return electionU;
        
    }



    public static void clientSelectionInfo(ShippingCompany myShipController){

        int eletionUser = menuOfClients(myShipController);

        String clientInformation = myShipController.clientSelectionInfo(eletionUser);

        System.out.println(clientInformation);

    }



    public static void main(String[] args) {

        ShippingCompany myShip = new ShippingCompany("Morgan", "Naviera");

        menu( myShip);

    }

}