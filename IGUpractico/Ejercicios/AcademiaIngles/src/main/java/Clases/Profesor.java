package Clases;

public class Profesor extends Persona {

    private double salario;
    private boolean fijo;

    public Profesor(double salario, boolean fijo, String DNI, String nombre) {
        super(DNI, nombre);
        this.salario = salario;
        this.fijo = fijo;
    }

    
    public void salarioFinal(double retencion , int aniosTrabajando){
        if (!fijo) {
            this.salario = salario*(100-retencion)*(0.01);
        }else {
            this.salario = (salario+50*aniosTrabajando)*(100-retencion)*(0.01);
        }
    }
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isFijo() {
        return fijo;
    }

    public void setFijo(boolean fijo) {
        this.fijo = fijo;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "salario=" + salario + ", fijo=" + fijo + '}';
    }

}
