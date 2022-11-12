import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.UIDefaults.ProxyLazyValue;

public class Principal {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("November Rain", "Guns N' Roses", "Rock");
        Cancion cancion2 = new Cancion("Welcome to the jungle", "Guns N' Roses", "Rock");
        Cancion cancion3 = new Cancion("Without me", "Eminem", "Rap");
        Cancion cancion4 = new Cancion("The Real Slim Shady", "Eminem", "Rap");

        ArrayList<Cancion> canciones1 = new ArrayList<Cancion>();
        canciones1.add(cancion1);
        canciones1.add(cancion2);
        ArrayList<Cancion> canciones2 = new ArrayList<Cancion>();
        canciones2.add(cancion3);
        canciones2.add(cancion4);

        Playlist playlist1 = new Playlist("Rock", canciones1);
        Playlist playlist2 = new Playlist("Rap", canciones2);

        Wow wow = new Wow();
        wow.getPlaylists().add(playlist1);
        wow.getPlaylists().add(playlist2);

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
        
        String menu4 = "===¿Qué desea hacer en el telefono?=====\n" +
                        "1. Conectarse/desconectarse\n" +
                        "2. Mostrar contactos\n" +
                        "3. Llamar a algún contacto\n" +
                        "4. Finalizar LLamada en espera\n" +
                        "5. Cambiar llamada en espera\n";
        int opcionCelu = 1;

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
                                System.out.println("Escriba la frecuencia que desea escuchar AM o FM");
                                String frecuencia = "";
                                frecuencia = teclado.nextLine();
                                System.out.println(wow.cambiarFrecuencia(frecuencia));
                                System.out.println("Desear 1. Cambiar Emisora 2. Guardar emisora 3. Cargar emisora");
                                op =  teclado.nextInt();
                                teclado.nextLine();
                                switch (op) {
                                    
                                    case 1:
                                        int vol = 0;
                                        while (vol != 1 ) {
                                            System.out.println("1. Avanzar 2. Retroceder");
                                            int op1 = teclado.nextInt();
                                            teclado.nextLine();
                                            if (op1 == 1){
                                                System.out.println(wow.cambiarEmisoras(true));
                                            }
                                            if (op1==2) {
                                                System.out.println(wow.cambiarEmisoras(false));
                                        
                                            }
                                        System.out.println("Desea salir de este modo? presione 1");
                                            int op6 = teclado.nextInt();
                                            teclado.nextLine();
                                            switch (op6) {
                                                case 1:
                                                    vol = 1;
                                                break;
                                            }
                                            
                                        }
                                        
                                        break;
                                
                                    case 2:
                                        System.out.println("Ha guardado la emisora actual");
                                        wow.guardarEmisoras();

                                        break;
                                    case 3:
                                        System.out.println("Elija la emisora que quiere cargar");
                                        int o = 1;
                                         
                                        for (Emisoras emisora : wow.getEmisorasFAv()) {
                                            o++;
                                            System.out.println(o+" "+emisora.toString());
                                        }
                                            int op1 = teclado.nextInt();
                                            teclado.nextLine();
                                            op1 = op1-1;
                                            System.out.println(wow.cargarEmisoras(op1));
                                        
                                        break;
                                }
                                
                                break;

                            case 3:
                                System.out.println("¿Qué Playlist desea excuchar Rock(1) y Rap(2)?");

                                System.out.println(wow.mostrarPlaylist());
                                System.out.println("Seleccione una");
                                op = teclado.nextInt();
                                teclado.nextLine();
                                wow.seleccionarPlaylist(op);
                                int cambiar = 0;
                                while (cambiar != 1) {
                                    System.out.println("Elija su cancion: 1. Avanzar y 2. Retroceder");
                                    op = teclado.nextInt();
                                    teclado.nextLine();
                                    if (op == 1){
                                        System.out.println(wow.cambiarCancion(true));
                                    }
                                    if (op==2) {
                                        System.out.println(wow.cambiarCancion(false));
                                    }
                                    System.out.println("Desea salir de este modo? presione 1");
                                        int op5 = teclado.nextInt();
                                        teclado.nextLine();
                                        
                                        switch (op5) {
                                            case 1:
                                                cambiar = 1;
                                                break;
                                        }
                                
                                    
                                }
                                break;
                            case 4:
                                System.out.println(menu4);
                                System.out.println("Seleccione una de las opciones:");
                                opcionCelu = teclado.nextInt();
                                teclado.nextLine();
                                int decision =1;
                                switch(opcionCelu){
                                    case 1: //conectarse/desconectarse
                                        wow.conectado();
                                    case 2: //mostrar contactos
                                        System.out.println(wow.mostrarContactos());
                                    case 3: //llamar contactos
                                        System.out.println(wow.mostrarContactos());
                                        System.out.println("A que contacto desea llamar?");
                                        decision = teclado.nextInt();
                                        teclado.nextLine();
                                        System.out.println(wow.llamarContactos(decision));
                                    case 4: //finalizar llamada en espera
                                        System.out.println(wow.finalizarLlamadaEspera());
                                    case 5: //cambiar llamada en espera
                                        System.out.println(wow.cambiarLlamadaEspera());
                                }

                            case 5:
                                System.out.println("Este es el pronostico del clima");
                                System.out.println(wow.pronosticoClima());
                           
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



