package br.com.briangui.model;

import java.util.Date;

public class Contato {
    private Long id;
    private String descricao;
    private String endereco;
    private Integer numero;
    private Integer idCidade;
    private String email;
    private Date nascimento;
    private String telefone1;
    private String telefone2;
    private Integer idTipoContato;

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }
    
    public void setIdTipoContato(Integer idTipoContato) {
        this.idTipoContato = idTipoContato;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public Long getId() {
        return id;
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public Integer getIdTipoContato() {
        return idTipoContato;
    }

    public Date getNascimento() {
        return nascimento;
    }
    public Integer getNumero() {
        return numero;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }
}
