package br.com.briangui.model;

public class Cidade {
    private Long id;
    private String descricao;
    private String uf;
    private String cep;

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public String getDescricao() {
        return descricao;
    }

    public Long getId() {
        return id;
    }

    public String getUf() {
        return uf;
    }
}
