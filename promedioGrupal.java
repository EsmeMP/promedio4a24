import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class promedioGrupal {

    public static void main(String[] args) throws IOException{
        // Tamanio del grupo
        int n;
        // calificaciones de cada alumna

        double[] calificaciones;
        // Para sumar calificaciones
        double suma = 0;
        // El promedio del grupo
        double promedio;
        BufferedReader bufer = new BufferedReader((new InputStreamReader(System.in)));
        String entrada;

        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("----------------------------------");
        // Recuperando el tamano del grupo
        System.out.println("Escribe el numero de alumnos en el grupo" );
        entrada = bufer.readLine(); //Lectura del teclado
        n = Integer.parseInt(entrada); //Conversion de String a int

        calificaciones = new double[n]; //construccion del arreglo

        // Pedir cada calificacion y acumularla
        for ( int i = 0; i < calificaciones.length; i++){
            System.out.println("Escriba calificaciones del estudiante [" + (i+1) + "]:");
            entrada = bufer.readLine();
            calificaciones[i] = Double.parseDouble(entrada);
            suma += calificaciones[i];
        }
        // Obtener el promedio
        promedio = suma / n;
        System.out.println("--------------------------------");
        System.out.println("Las calificaciones de cada alumno son: ");
            for ( double calif : calificaciones){
                System.out.println(calif);
            }
        System.out.println("----------------------------");
        System.out.println("El promedio de grupo es: " + promedio);
    }
}