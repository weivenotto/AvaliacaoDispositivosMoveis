package com.example.avaliacaodispositivosmoveis;

public class Pacientes {

    private String Nome;
    private int Idade;
    private double NumeroDeLeucocitos;
    private double NumeroDeGlicemia;
    private double NumeroDeATV;
    private double NumeroDeLHD;

    public Pacientes(String nome, int ano, double NumeroDeLeucositos, double NumeroDeGlucositos, double NumeroDeATV){
        this.Nome = Nome;
        this.Idade = Idade;
        this.NumeroDeLeucocitos = NumeroDeLeucositos;
        this.NumeroDeGlicemia = NumeroDeGlucositos;
        this.NumeroDeATV = NumeroDeATV;
        this.NumeroDeLHD = NumeroDeLHD;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        this.Idade = idade;
    }

    public double getNumeroDeLeucositos() {
        return NumeroDeLeucocitos;
    }

    public void setNumeroDeLeucositos(double numeroDeLeucositos) {
        this.NumeroDeLeucocitos = numeroDeLeucositos;
    }

    public double getNumeroDeGlucositos() {
        return NumeroDeGlicemia;
    }

    public void setNumeroDeGlucositos(double numeroDeGlucositos) {
        this.NumeroDeGlicemia = numeroDeGlucositos;
    }

    public double getNumeroDeATV() {
        return NumeroDeATV;
    }

    public void setNumeroDeATV(double numeroDeATV) {
        this.NumeroDeATV = numeroDeATV;
    }

    public double getNumeroDeLHD() {
        return NumeroDeLHD;
    }

    public void setNumeroDeLHD(double numeroDeLDH) {
        this.NumeroDeLHD = numeroDeLDH;
    }
}



