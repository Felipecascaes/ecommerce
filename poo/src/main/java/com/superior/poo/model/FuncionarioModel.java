package com.superior.poo.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TBFUNCIONARIO")
public class FuncionarioModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "CODFUNCIONARIO")
    private Integer codFuncionario;

    @Column(name = "NMFUNCIONARIO")
    private String nmFuncionario;

    @Column(name = "TELFUNCIONARIO")
    private String telFuncionario;

    @Column(name = "SALFUNCIONARIO")
    private Double salFuncionario;
}
