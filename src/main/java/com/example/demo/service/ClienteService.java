package com.example.demo.service;

import com.example.demo.model.Cliente;

import java.util.Optional;

public interface ClienteService {
    Iterable<Cliente>buscarTodos();

    Optional<Cliente> buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
