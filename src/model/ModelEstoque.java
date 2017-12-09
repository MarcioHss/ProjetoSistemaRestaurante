
package model;

import java.sql.Date;


public class ModelEstoque {

    private String Pesquisa;
   
    private int codigo;
    private int produto;
    private int qtdmaxima;
    private int qtdminima;
    private int qtdatual;
    private String nome_produto;

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
     * @return the produto
     */
    public int getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(int produto) {
        this.produto = produto;
    }

    /**
     * @return the qtdmaxima
     */
    public int getQtdmaxima() {
        return qtdmaxima;
    }

    /**
     * @param qtdmaxima the qtdmaxima to set
     */
    public void setQtdmaxima(int qtdmaxima) {
        this.qtdmaxima = qtdmaxima;
    }

    /**
     * @return the qtdminima
     */
    public int getQtdminima() {
        return qtdminima;
    }

    /**
     * @param qtdminima the qtdminima to set
     */
    public void setQtdminima(int qtdminima) {
        this.qtdminima = qtdminima;
    }

    /**
     * @return the qtdatual
     */
    public int getQtdatual() {
        return qtdatual;
    }

    /**
     * @param qtdatual the qtdatual to set
     */
    public void setQtdatual(int qtdatual) {
        this.qtdatual = qtdatual;
    }

    /**
     * @return the nome_produto
     */
    public String getNome_produto() {
        return nome_produto;
    }

    /**
     * @param nome_produto the nome_produto to set
     */
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

   
}
