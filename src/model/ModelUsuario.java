/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Marcio Henrique
 */
public class ModelUsuario {

    private String Pesquisa;
    
    private int codigo;
    private String nome;
    private String login;
    private String senha;
    private String situacao;
    private String Endereco;
    private String nome_perfil;
    private int perfil;

    /**
     * @return the Pesquisa
     */
    public String getPesquisa() {
        return Pesquisa;
    }

    /**
     * @param Pesquisa the Pesquisa to set
     */
    public void setPesquisa(String Pesquisa) {
        this.Pesquisa = Pesquisa;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * @return the perfil
     */
    public int getPerfil() {
        return perfil;
    }

    /**
     * @param perfil the perfil to set
     */
    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    /**
     * @return the nome_perfil
     */
    public String getNome_perfil() {
        return nome_perfil;
    }

    /**
     * @param nome_perfil the nome_perfil to set
     */
    public void setNome_perfil(String nome_perfil) {
        this.nome_perfil = nome_perfil;
    }

   
}
