package Dominio;

import java.sql.SQLOutput;
import java.util.List;

public class Cuenta {
    private String IBAN;
    private String nombreTitular;
    private String apellidoTitular;
    private double saldo;
    private List<Double> movimientos;

    public Cuenta(){

        this.saldo = 0;

    }

    public String getIBAN() {
        return IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return nombreTitular + " " + apellidoTitular;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    public void setApellidoTitular(String apellidoTitular){
        this.apellidoTitular = apellidoTitular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double ingreso(double ingreso){
        if(movimientos.size() <= 100){
            System.out.println("Has agotado los movimientos");
            return this.saldo;
        }
        movimientos.add(ingreso);
        return this.saldo += ingreso;
    }
    public double retirada(double retirada){
        if(retirada < 0){
            retirada = Math.abs(retirada);
        }
        if(movimientos.size() <= 100){
            System.out.println("Has agotado los movimientos");
            return this.saldo;
        }
        movimientos.add(retirada *= -1);
        return this.saldo -= retirada;
    }
    public void verMovimientos(){
        int i = 1;
        for(Double movimiento : movimientos){
            System.out.println("Movimiento " + i + ": " + movimiento);
        }
    }
    @Override
    public String toString(){
        return "Titular: " + getTitular() + "\nIBAN: " + getIBAN() + "\nSaldo: " + getSaldo();
    }


}
