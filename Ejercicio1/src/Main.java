public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre= "Justin Imbaquingo";
        persona1.edad =20;

        Persona persona2 = new Persona();
        persona2.nombre= "Gabriel Perez";
        persona2.edad= 25;

        persona1.presentarse();
        persona2.presentarse();
    }
}

class Persona {
    String nombre;
    int edad;

    void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años, y estudio en la EPN.");
    }
}
