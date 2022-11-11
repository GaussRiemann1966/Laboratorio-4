import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String menu = "1. Agregar Jugador\n2. Ver los jugadores mas valiosos\n3. Mostrar todos los jugadores\n4. Mostrar los mejores liberos\n5. Pasadores arriba del 80% de efectividad\n6. Salir\n";


        Emisoras emisora1 = new Emisoras("FM Joya", "94.5", false);
        Emisoras emisora2 = new Emisoras("HOla", "94.5", true);
        Emisoras emisora3 = new Emisoras("FM Norte", "94.5", false);
        Emisoras emisora4 = new Emisoras("No se", "94.5", true);

        ArrayList<Emisoras> emisoras = new ArrayList<Emisoras>();
        emisoras.add(emisora1);
        emisoras.add(emisora2);
        emisoras.add(emisora3);
        emisoras.add(emisora4);

        String frecuencia = "FM";

        Radio radio = new Radio(null, emisoras, 0, true);

        Wow wow = new Wow(radio, null);
        System.out.println("Hola");
        System.out.println(wow.cambiarFrecuencia(frecuencia));



        

        
        
        
    }
    
}
