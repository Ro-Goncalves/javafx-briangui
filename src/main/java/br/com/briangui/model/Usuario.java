package br.com.briangui.model;

public class Usuario {
    private Long id;
    private String descricao;
    private String senha;

    public String getDescricao() {
        return descricao;
    }

    public Long getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
