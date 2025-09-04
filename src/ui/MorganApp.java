import java.util.Scanner;
import model.Client;



public class MorganApp{

    private Scanner scan = new Scanner (System.in);

    private Client client;



    public void menu(){

        int option;

        do{

            System.out.println("****** Bienvenido a la APP Morgan ********");
            System.out.println("Ingrese una opcion: ");
            System.out.println();
            System.out.println("1. Cargar barco");
            System.out.println("2. Descargar el barco");
            System.out.println("3. Peso total de la carga del barco");
            System.out.println("4. Verificar si el barco puede zarpar");
            System.out.println("5. Salir de APP");

            switch(option){


                case 1:
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

    public String ask(){

        System.out.print(": ");

        return scan.nextLine();


    }

    public  void createClient(){

        System.out.println("Ingresa el nombre del cliente");

        name = app.ask();

        client1 = new Client(name);


    

    }

    public  void infoClient(){


    }



    public static void main(String[] args) {

        MorganApp app = new MorganApp();

        app.menu();


    }
}