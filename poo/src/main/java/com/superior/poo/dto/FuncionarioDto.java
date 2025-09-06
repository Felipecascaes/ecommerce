package com.superior.poo.dto;



import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;



public record FuncionarioDto(
        @NotBlank(message = "O nome do funcionário é obrigatório.")
        String nmFuncionario,

        @NotBlank(message = "O telefone do funcionário é obrigatório.")
        String telFuncionario,

        @NotNull(message = "O salário do funcionário é obrigatório.")

        @DecimalMin(value = "0.01", message = "Salário não pode ser menor que 0.01.")
        Double salFuncionario
) {}





