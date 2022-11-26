/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.genericrepository.controller.controllerInterface;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author MSI-JO
 */

public interface BasicCrudControllerInterface<E, I> {

    @GetMapping
    ResponseEntity<List<E>> findAll();

    @GetMapping("/{id}")
    ResponseEntity<E> findById(@PathVariable I id);

    @PostMapping
    ResponseEntity<E> create(@RequestBody E entity);

    @PutMapping("/{id}")
    ResponseEntity<E> update(@PathVariable I id, @RequestBody E entity);

    @DeleteMapping("/{id}")
    ResponseEntity<E> delete(@PathVariable I id);

}
