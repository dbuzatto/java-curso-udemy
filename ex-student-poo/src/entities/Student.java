package entities;

public class Student {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularNotaFinal(){
        return nota1 + nota2 + nota3;
    }

    public double calcularPontosFaltantes(){
        if (calcularNotaFinal() < 60.0){
            return 60.0 - calcularNotaFinal();
        }else {
            return 0.0;
        }
    }

}
