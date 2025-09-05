import java.util.Scanner;
import model.Client;

public class MorganApp{

    private static Scanner scan = new Scanner (System.in);

    public static void menu(Client cl1){

        do{

            System.out.println("****** Bienvenido a la APP Morgan ********");
            System.out.println("Ingrese una opcion: ");
            System.out.println();
            System.out.println("1. Cargar barco");
            System.out.println("2. Descargar el barco");
            System.out.println("3. Peso total de la carga del barco");
            System.out.println("4. Verificar si el barco puede zarpar");
            System.out.println("5. Salir de APP");

            int option = askInt();

            switch(option){


                case 1: client1  = crearClient();
                    break; 
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

                case 5: System.out.println("Nos vemos pronto!!");
                    break;

                default:

            }



        }while( option != 5);

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


    public static Client crearClient(){

        System.out.println("Digite el nombre del cliente");
        String name = ask();

        System.out.println("Digite el registro del mercado del cliente");
        String number = ask();

        System.out.println("Digite el tipo de cliente");
        String type = ask();

        System.out.println("Digite la cantidad de kilos que ha transportado el cliente");
        int kilos = askInt();
        
        System.out.println("Digite el tipo de cliente");
        int totalPay = askInt();

        return new Client(name,number,type,kilos,totalPay);
        
    }

    public static void infoClient(){

    System.out.pritln("Informacion del cliente: ");
    System.out.println("Nombre: " +  Client.getNombre()); 
    System.out.println("Registro de mercado: " +  Client.getnumber());
    System.out.println("Tipo: " + Client.getType());
    System.out.println("Kilos transportados: " + Client.getKilo());
    System.out.println("Registro de mercado: " + Client.getTotalPayClient());

    }



    public static void main(String[] args) {

        Client client1;

        menu(client1);

    }
}