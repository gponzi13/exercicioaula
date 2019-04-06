package br.com.digitalhouse;

public class Filho {
    private String nomeDoFilho;
    private String mae;
    private String pai;
    private String filhoDe;

    public Filho(String nomeDoFilho, String mae, String pai, String filhoDe) {
        this.nomeDoFilho = nomeDoFilho;
        this.mae = mae;
        this.pai = pai;
        this.filhoDe = filhoDe;
    }

    public String getNomeDoFilho() {
        return nomeDoFilho;
    }

    public void setNomeDoFilho(String nomeDoFilho) {
        this.nomeDoFilho = nomeDoFilho;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getFilhoDe() {
        return filhoDe;
    }

    public void setFilhoDe(String filhoDe) {
        this.filhoDe = filhoDe;
    }
}
