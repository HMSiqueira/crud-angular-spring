package br.com.heitorsiqueira.rest.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class ServicoPrestadoDTO {

    @NotEmpty(message = "campo descrição é obrigatório")
    private String descricao;

    @NotEmpty(message = "campo preço é obrigatório")
    private String preco;

    @NotEmpty(message = "campo data é obrigatório")
    private String data;

    @NotNull(message = "campo cliente é obrigatório")
    private Integer idCliente;
}
