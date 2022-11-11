import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Wow wow = new Wow();
        Scanner teclado = new Scanner(System.in);
        String menu =   "1. Subir o bajar el volumen de la consola.\n" +
                        "2. Escuchar la radio.\n" +
                        "3. Reproducir alguna canción de una playlist\n" +
                        "4. Utilizar las utilidades celulares.\n" +
                        "5. Visualizar el estado del clima.\n";
        int opcion = 1;
        int op = 0;

        String menu2 = "==== Bienvenido a la radio clase C ====\n" +
                        "\n1. Enceder radio" +
                        "\n2. Apagar radio";  
        int opcionEncenr = 1;
        
        while (opcionEncenr>=1 && opcionEncenr<2){
            try{
                System.out.println(menu2);
                System.out.println("Seleccione una de las opciones:");
                opcionEncenr = teclado.nextInt();
                teclado.nextLine();
                switch(opcionEncenr){
                    case 1:
                        System.out.println(menu);
                        System.out.println("Seleccione una de las opciones:");
                        opcion = teclado.nextInt();
                        teclado.nextLine();
                        switch(opcion){
                            case 1:
                                System.out.println("¿Quiere subir volumen(1) o  bajar volumen(2)?");
                                op = teclado.nextInt();
                                teclado.nextLine();
                                if (op == 1){
                                    System.out.println("El volumen es "+ wow.cambiarVolumen(true));
                                    
                                }
                                if (op==2) {
                                    System.out.println("El volumen es "+ wow.cambiarVolumen(false));
                                    
                                }
                            break;
                            case 2:
                                String frecuencia = "AM";
                                System.out.println(wow.cambiarFrecuencia(frecuencia));
                            case 3:
                                System.out.println("¿Qué Playlist desea excuchar Rock(1) y Rap(2)?");
                                op = teclado.nextInt();
                                teclado.nextLine();
                                wow.seleccionarPlaylist(op);
                                

                                
                                
                            case 4:
                            case 5:
                        
                           
                        }
                    break;
                    
                    default:
                        System.out.println("Se apagó la radio");

                    break;
                }    
            }
            catch (Exception e){
                teclado.nextLine();
                System.out.println("\nDebe ingresar un número valido\n");
                opcionEncenr = 1;
            }
        }
        
    }
    
}



