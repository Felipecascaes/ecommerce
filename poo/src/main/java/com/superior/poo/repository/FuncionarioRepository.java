package com.superior.poo.repository;



import com.superior.poo.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Integer> {
    Optional<FuncionarioModel> findByCodFuncionario(int codFuncionario);
    Optional<FuncionarioModel> findByNmFuncionario(String nmFuncionario);
    Optional<FuncionarioModel> findByTelFuncionario(String telFuncionario);
    Optional<FuncionarioModel> findBySalFuncionario(double salFuncionario);
}
