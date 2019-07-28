package informacion;

public enum Mensajes {

    /*8: Definimos las frases que el usuario verá antes de insertar la primera nota*/
    MENSAJE_PETICION_NOTA1("Ingrese la nota de seguimiento: "),
    MENSAJE_PETICION_NOTA2("Ingrese la nota del parcial: "),
    MENSAJE_PETICION_NOTA3("Ingrese la nota del examen final: "),
    MENSAJE_PETICION_NOTA_FINAL("La nota final es: ");

    /*9: se crea un atributo para los mensajes*/
    private String mensaje;
    /*10: Se crea un constructor del atributo*/
    Mensajes(String s) {
        this.mensaje = s;
    }
    /*11: Se crea un metodo de tipo get del atributo en este caso mensaje*/

    public String getMensaje() {
        return mensaje;
    }
    /*12: Vamos a la clase principal, en este caso el main*/
}
