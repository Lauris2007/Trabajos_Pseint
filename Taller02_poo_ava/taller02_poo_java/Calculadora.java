package taller02_poo_java;

public class Calculadora {
    
    private double Numero1;
    private double Numero2;
    
    public Calculadora (){}
    
    public Calculadora(double Numero1, double Numero2) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
    }
    
    public double getNumero1() {
        return Numero1;
    }

    public void setNumero1(double Numero1) {
        this.Numero1 = Numero1;
    }

    public double getNumero2() {
        return Numero2;
    }

    public void setNumero2(double Numero2) {
        this.Numero2 = Numero2;
    }
    //Metodos de operandos
    
    public double sumar () {
    return Numero1 + Numero2;
}
    public double resta () {
    return Numero1 - Numero2;
}
    public double multiplicacion () {
    return Numero1 * Numero2;
    }
    public double dividir () {
    if (Numero2 != 0){
        return Numero1 / Numero2;
    } else {
        System.out.println("No se puede divir por cero");
        return 0;
}
    
    }
}

