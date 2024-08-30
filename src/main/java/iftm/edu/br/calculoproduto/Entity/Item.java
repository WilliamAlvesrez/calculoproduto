package iftm.edu.br.calculoproduto.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Item {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeProduto;
    private Double valorUnit;
    private Integer quantidade;
    private Boolean vendidoComDesconto;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public Double getValorUnit() {
        return valorUnit;
    }
    public void setValorUnit(Double valorUnit) {
        this.valorUnit = valorUnit;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Boolean getVendidoComDesconto() {
        return vendidoComDesconto;
    }
    public void setVendidoComDesconto(Boolean vendidoComDesconto) {
        this.vendidoComDesconto = vendidoComDesconto;
    }
    
}
