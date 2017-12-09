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
public class ModelComanda {

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
    public String getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(String produto) {
        this.produto = produto;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the QTDcomanda
     */
    public int getQTDcomanda() {
        return QTDcomanda;
    }

    /**
     * @param QTDcomanda the QTDcomanda to set
     */
    public void setQTDcomanda(int QTDcomanda) {
        this.QTDcomanda = QTDcomanda;
    }
    private int codigo;
    private String produto;
    private String cliente;
    private int QTDcomanda;
}
