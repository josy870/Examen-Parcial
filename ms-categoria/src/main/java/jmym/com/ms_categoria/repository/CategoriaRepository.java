package jmym.com.ms_categoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jmym.com.ms_categoria.entity.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria,Integer> {
    
}
