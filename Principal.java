import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Wow wow = new Wow();
        Scanner teclado = new Scanner(System.in);
        String menu = " ==== Bienvenido a la radio clase C ====\n" +
                        "1. Encender o apagar el equipo.\n" +
                        "2. Subir o bajar el volumen de la consola.\n" +
                        "3. Escuchar la radio.\n" +
                        "4. Reproducir alguna canción de una playlist\n" +
                        "5. Utilizar las utilidades celulares.\n" +
                        "6. Visualizar el estado del clima.\n";
        int opcion = 1;


        

        String frecuencia = "FM";
        System.out.println(wow.cambiarFrecuencia(frecuencia));

        while (opcion>=1 && opcion<6){
            try{
                System.out.println(menu);
                System.out.println("Seleccione una de las opciones:");
                opcion = teclado.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("\n¿Desea encender o apagar la radio?");
                        boolean entradaInicio = false;
                        if (wow.estadoRadio()){
                            System.out.println("\nBienvenido a la radio");
                            entradaInicio = true;
                        }
                        else if(wow.estadoRadio() == false){
                            System.out.println("Que tenga un buen día");
                        }

                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    default:
                        System.out.println("Esperamos que disfrute su viaje");
                    break;
                }
            }
            catch (Exception e){
                teclado.nextLine();
                System.out.println("\nDebe ingresar un número valido\n");
                opcion = 1;

            }
        
        }
    
    }
}


