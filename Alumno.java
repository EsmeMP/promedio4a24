public class Alumno {
    private String matricula;
    private String nombre;
    private double estructuras;
    private double ingles;
    private double iot;
    private double promedio;
    private double promedioEstructuras;
    private double promedioIngles;
    private double promedioIot;

    // constructor
    public Alumno(String m, String n){
        // Inicialiazar el nombre y la matricula del alumno
        this.matricula = m;
        this.nombre = n;
    }

    // constructor vacio
    public Alumno(){
        System.out.println("Se construyo un objeto alumno");
    }

    public Alumno( String n) {
        this.nombre = n;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstructuras() {
        return estructuras;
    }

    public void setEstructuras(double estructuras) {
        this.estructuras = estructuras;
    }

    public double getIngles() {
        return ingles;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    public double getIot() {
        return iot;
    }

    public void setIot(double iot) {
        this.iot = iot;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio() {
        this.promedio = (this.estructuras + this.ingles + this.iot) / 3;
    }


    @Override //Anotacion, anula la informacion
    public String toString() {
        return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", promedio=" + promedio + "]";
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getPromedioEstructuras() {
        return promedioEstructuras;
    }

    public void setPromedioEstructuras(double promedioEstructuras) {
        this.promedioEstructuras = promedioEstructuras;
    }

    public double getPromedioIngles() {
        return promedioIngles;
    }

    public void setPromedioIngles(double promedioIngles) {
        this.promedioIngles = promedioIngles;
    }

    public double getPromedioIot() {
        return promedioIot;
    }

    public void setPromedioIot(double promedioIot) {
        this.promedioIot = promedioIot;
    }

}

// object hereda todas las clases

// ctrl + . para los getters and setters
// Obtener y modificar valor de una variable privada


// POJOs Plain Old Java Objet