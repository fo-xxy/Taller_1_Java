package informacion.estudiantes;


public class Calificaciones {

    /*4: Se definen los atributos, en privado*/

    private double nota1;
    private double nota2;
    private double nota3;

    /*5: Se crean los metodos getter y setter*/
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    /*6: se crean los metodos de accion para calcular la nota
    * dependiendo del porcentaje sugerido y se calcula la nota final*/

    public double notaSeguimiento(){
        return (this.nota1 * 0.4 );
    }

    public double notaParcial(){
        return (this.nota2 * 0.3);
    }

    public double notaExamenFinal(){
        return (this.nota3 * 0.3);
    }

    public double notaFinal(){
        return (this.notaSeguimiento() + this.notaParcial() + this.notaExamenFinal());
    }

    /*7: Vamos a la clase Mansajes */


}
