package ui;
import java.util.Scanner;
import java.time.LocalDate;
import model.ShippinCompany;

public class MorganApp{

    private static Scanner scan = new Scanner (System.in);
  

    public static void menu(ShippinCompany myS){

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
                
                case 5: 
                    break;

                case 6: addClient();
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

    public static void validationQuantityClients(){

        validation = myShip.validationQuantityClients();

        if(validation == null){

            menu();
        }
    }


    public static Client addClient(){

        validationQuantityClients();

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

        myShip.addClient(String name, String number, String type, int kilos, int totalPay);
        
    }

    public static void infoClient(Client client1){

    System.out.println("Informacion del cliente: ");
    System.out.println("Nombre: " ); 
    System.out.println("Registro de mercado: " );
    System.out.println("Tipo: ");
    System.out.println("Kilos transportados: " );
    System.out.println("Registro de mercado: " );

    }



    public static void main(String[] args) {

        ShippinCompany myShip = null;

        menu(ShippinCompany myShip);

    }
}