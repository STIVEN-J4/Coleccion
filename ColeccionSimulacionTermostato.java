/*

*/

package coleccionsimulaciontermostato;

/**
 *
 * @author STIVEN
 */
import java.util.ArrayList;
import java.util.Collection;
public class ColeccionSimulacionTermostato {


    public static void main(String[] args) {
       System.out.println("                 UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-LATACUNGA");
       System.out.println("\nCARRERA: INGENIERIA AUTOMOTRIZ");
       System.out.println("\nNOMBRE: JIMÉNEZ JULIO");
       System.out.println("\nMATERIA: PROGRAMACIÓN");
       System.out.println("\nDOCENTE: ING.LUIS GUERRA");
       System.out.println("\nNRC: 7450");
       System.out.println("\n");

        Collection listaMaterialesCircuito=new ArrayList<String>();
        listaMaterialesCircuito.add("Protoboard");
        listaMaterialesCircuito.add("Cables");
        listaMaterialesCircuito.add("Potenciometro 1");
        listaMaterialesCircuito.add("Sensor temperatura");
        listaMaterialesCircuito.add("Resistencia 1 de 12 KΩ");
        listaMaterialesCircuito.add("Resistencia 2 de 48 KΩ");
        listaMaterialesCircuito.add("Potenciometro 2");
        listaMaterialesCircuito.add("Resistencia 3 de 48 KΩ");
        listaMaterialesCircuito.add("Amplificador Operaciona l de 741");
        listaMaterialesCircuito.add("Fusible");
        listaMaterialesCircuito.add("Resistencia 4de 10 KΩ");
        listaMaterialesCircuito.add("Resistencia 5 de 10 KΩ");
        listaMaterialesCircuito.add("Diodo zener");
        listaMaterialesCircuito.add("Amplificador Operaciona 2  741");
        listaMaterialesCircuito.add("Resistencia 6 de 1 KΩ");
        listaMaterialesCircuito.add("Potenciometro_3");
        listaMaterialesCircuito.add("Amplificador Operaciona 3 de 741");
        listaMaterialesCircuito.add("Led rojo");
        listaMaterialesCircuito.add("Capacitor");
        listaMaterialesCircuito.add("Amplificador Operaciona 3 de 741");
        listaMaterialesCircuito.add("Potenciometro 4");
        listaMaterialesCircuito.add("Led verde");
        listaMaterialesCircuito.add("Bareria 1 de 9V");
        listaMaterialesCircuito.add("Transistor");
        listaMaterialesCircuito.add("Broche de bateria 1");
        listaMaterialesCircuito.add("Bareria 2 de 9V");
        listaMaterialesCircuito.add("Broche de bateria 2");
        listaMaterialesCircuito.add("Condensador");

        System.out.println("\nNúmero de vehiculos antes de ser eliminados: "+listaMaterialesCircuito.size());

        System.out.println("\nLOS ELEMENTOS IMPLEMENTAMOS SON: ");
        System.out.println(listaMaterialesCircuito.toString());

        listaMaterialesCircuito.remove("Fusible");
        listaMaterialesCircuito.remove("Diodo zener");
        listaMaterialesCircuito.remove("Capacitor");
        listaMaterialesCircuito.remove("Transistor");
        listaMaterialesCircuito.remove("Condensador");

        System.out.println("\nNúmero de elementos despues de ser eliminados Fusible,Diodo zener,Capacitor,Transistor,Condensador"
                + " del circuito es: "+listaMaterialesCircuito.size());
        System.out.println("\nLOS ELEMENTOS IMPLEMENTADOS EN EL PROYECTO FINAL: ");
        System.out.println(listaMaterialesCircuito.toString());

    }

}
