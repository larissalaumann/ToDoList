package com.mycompany.trabalhofinal.Model;

import java.time.LocalDate;

public class Tarefa {
    private String titulo;
    private String descricao;
    private String concluida;
    private LocalDate data;

    public Tarefa() {
    }

    public Tarefa(String titulo, String descricao, String concluida, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConcluida() {
        return concluida;
    }

    public void setConcluida(String concluida) {
        this.concluida = concluida;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "titulo=" + titulo + ", descricao=" + descricao + ", concluida=" + concluida + ", data=" + data + '}';
    }
    
    
    
    
}
