import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.PublicKey;

import javax.naming.event.ObjectChangeListener;

import java.io.IOException;
public class promedioGrupal{

    //Declarando variables globales
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada; 
    //Declaración de un arreglo de tipo TDA
    public static Alumno[] alumnos;

    public static void leerAlumnos() throws IOException {
        String matricula, nombre;

        System.out.println("Solicitud de informacion de cada estudiante");
        for ( int i = 0; i < alumnos.length; i++){
            System.out.println("-----------------------");
            System.out.println("Escriba la matricula");
            entrada = bufer.readLine();
            matricula = entrada;
            System.out.println("Escribe el nombre");
            entrada = bufer.readLine();
            nombre = entrada;
            // Creacion de un alumno POJO
            Alumno a = new Alumno (matricula, nombre);
            // Leyendo cailificaciones
            System.out.println("Escribe calificacion de estructuras: ");
            entrada = bufer.readLine();
            a.setEstructuras(Double.parseDouble(entrada));
            System.out.println("Escribe calificacion de ingles: ");
            entrada = bufer.readLine();
            a.setIngles(Double.parseDouble(entrada));
            System.out.println("Escrible calificacion de iot: ");
            entrada = bufer.readLine();
            a.setIot(Double.parseDouble(entrada));
            a.setPromedio();
            // Agregando un alumno al arreglo
            alumnos[i] = a;
        }
    }

    public static void imprimirAlumnos() {
        System.out.println("Contenido del arreglo alumnos:  ");
        for(Alumno a : alumnos){
            System.out.println("---------------------------------------");
            System.out.println("Informacion del alumno: ");
            System.out.println(a.toString());
        }
    }
    public static double calcularPromedioGrupo(){
        double suma = 0;
        for(Alumno a: alumnos ){
            suma += a.getPromedio();
        }
        return (suma / alumnos.length );
    }

    public static double calcularPromedioEstructuras() {
        double suma = 0;
        for (Alumno a : alumnos){
            suma += a.getEstructuras();
        }
        return (suma / alumnos.length);
    }
    public static double calcularPromedioIngles() {
        double suma = 0;
        for (Alumno a : alumnos){
            suma += a.getIngles();
        }
        return (suma / alumnos.length);
    }
    public static double calcularPromedioIot() {
        double suma = 0;
        for (Alumno a : alumnos){
            suma += a.getIot();
        }
        return (suma / alumnos.length);
    }

    public static void main(String[] args) throws IOException {
        int n; //tamaño del grupo
       
        // double[] calificaciones; //Calificaciones de cada alumno
        // double suma = 0; // para sumar calificaciones
        double promedio; // el promedio del grupo

       

        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("----------------------------------------------");
        //Recuperando el tamaño del grupo
        System.out.println("Escribe el numero de alumnos de un grupo: ");
        entrada = bufer.readLine(); //Lectura del teclado
        n = Integer.parseInt(entrada); //Conversion de string a int
        //Contruir el arreglo alumnos
        alumnos = new Alumno[n];
        // Introducir Informacion de los Alumnos
        leerAlumnos();
        // Mostrar informacion
        imprimirAlumnos();
        //Obtener el promedio
        promedio = calcularPromedioGrupo();

        System.out.println("----------------------------------------");
        System.out.println("El promedio de grupo es: " + promedio);
        System.out.println("El promedio de grupo en Estructuras es: " + calcularPromedioEstructuras());
        System.out.println("El promedio de grupo en Estructuras es: " + calcularPromedioIngles());
        System.out.println("El promedio de grupo en Estructuras es: " + calcularPromedioIot());
    }
}

// METODO toString SIRVE PARA VER LAS CALIFICACIONES