package com.sistematizacaomgs.api.model;

public class Funcionario {
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String informacoesMedicas;

    //Getter e Setters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setInformacoesMedicas(String informacoesMedicas) {
        this.informacoesMedicas = informacoesMedicas;
    }

    public String getInformacoesMedicas() {
        return informacoesMedicas;
    }
}

