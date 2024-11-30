package jmym.com.ms_categoria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jmym.com.ms_categoria.entity.Categoria;

@Service
public interface CategoriaService {
    List<Categoria> lista();
    Categoria guardar(Categoria categoria);
    Optional<Categoria> buscarPorId(Integer id);
    Categoria actualizar(Categoria categoria);
    void eleminar(Integer id);
}
