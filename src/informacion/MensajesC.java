package informacion;

public enum MensajesC {
    /*Mensajes de las condicionales*/
    MENSAJE_PETICION_CONDICION1("Excelente, tu rendimiento ha sido el mejor. "),
    MENSAJE_PETICION_CONDICION2("Tu rendimiento es aceptable, pero finalizaste bien. "),
    MENSAJE_PETICION_CONDICION3( "Te sugerimos comprometerte más con tu estudio. "),
    MENSAJE_PETICION_CONDICION4("Malas noticias, no cumpliste con el mínimo para avanzar. "),
    MENSAJE_PETICION_CONDICION5("Nuevamente vuelve a iniciar tus estudios y dedícate. ");

    private String mensaje;

    MensajesC(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
