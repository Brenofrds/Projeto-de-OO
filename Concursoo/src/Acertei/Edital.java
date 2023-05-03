package Acertei;

import java.time.LocalDate;

public class Edital {
    //Atributos
    private String nome;
    private LocalDate dataInscricao;
    private LocalDate dataFimInscricao;
    private LocalDate dataProva;
    private int valorInscricao;
    private String escolaridade; 
    private int vagas;

    //Metodos Publicos
    public void apresentar() {
        System.out.println("---------------------------------------------------");
        System.out.println("Concurso " + this.getNome());
        System.out.println("Nivel de escolaridade " + this.getEscolaridade());
        System.out.println("Prevê proviemnto de " + this.getVagas() + " vagas");
        System.out.println("Será aberto dia " + this.getDataInscricao() + " e fechará dia " + this.getDataFimInscricao());
        System.out.println("E o valor da inscrição: R$" + this.getValorInscricao());
    }
    
    public void excluirEdital() {
        this.nome = null;
        this.dataInscricao = null;
        this.dataFimInscricao = null;
        this.dataProva = null;
        this.valorInscricao = 0;
        this.escolaridade = null;
        this.vagas = 0;
    }

    //Construtor
    public Edital(String nome, LocalDate dataInscricao, LocalDate dataFimInscricao, 
                  LocalDate dataProva, int valorInscricao, String escolaridade, int vagas) {
        this.nome = nome;
        this.dataInscricao = dataInscricao;
        this.dataFimInscricao = dataFimInscricao;
        this.dataProva = dataProva;
        this.valorInscricao = valorInscricao;
        this.escolaridade = escolaridade;
        this.vagas = vagas;
    }

    //Metodos Especiais
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataInscricao() {
        return dataInscricao;
    }
    public void setDataInscricao(LocalDate dataInscricao) {
        this.dataInscricao = dataInscricao;
    }
    public LocalDate getDataFimInscricao() {
        return dataFimInscricao;
    }
    public void setDataFimInscricao(LocalDate dataFimInscricao) {
        this.dataFimInscricao = dataFimInscricao;
    }
    public LocalDate getDataProva() {
        return dataProva;
    }
    public void setDataProva(LocalDate dataProva) {
        this.dataProva = dataProva;
    }
    public int getValorInscricao() {
        return valorInscricao;
    }
    public void setValorInscricao(int valorInscricao) {
        this.valorInscricao = valorInscricao;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public int getVagas() {
        return vagas;
        
    }
}