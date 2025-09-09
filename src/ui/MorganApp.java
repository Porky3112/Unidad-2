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


                case 1: cl1  = crearClient(); 
                    infoClient(cl1);
                    break; 

                case 2:
                    break;

                case 3:
                    break;
                    
                case 4:
                    break;
                
                case 5:
                    break;

                case 6:
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


    public static Client addClient(){

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

        return new Client(name,number,type,kilos,totalPay);
        
    }

    public static void infoClient(Client client1){

    System.out.println("Informacion del cliente: ");
    System.out.println("Nombre: " +  client1.getNombre()); 
    System.out.println("Registro de mercado: " +  client1.getNumber());
    System.out.println("Tipo: " + client1.getType());
    System.out.println("Kilos transportados: " + client1.getKilo());
    System.out.println("Registro de mercado: " + client1.getTotalPayClient());

    }



    public static void main(String[] args) {

        ShippinCompany myShip = null;

        menu(client1);

    }
}