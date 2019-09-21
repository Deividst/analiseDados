package com.desafio.analisedados.dto;


import com.desafio.analisedados.model.Cliente;
import com.desafio.analisedados.model.Venda;
import com.desafio.analisedados.model.Vendedor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class RelatorioDto {

    private List<Cliente> clientes;
    private List<Vendedor> vendedores;
    private List<Venda> vendas;

    public RelatorioDto() {
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.vendas = new ArrayList<>();
    }
}
