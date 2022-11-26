/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.genericrepository.controller.generic;

import java.util.List;
import mii.genericrepository.controller.controllerInterface.BasicCrudControllerInterface;
import mii.genericrepository.service.generic.BasicCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author MSI-JO
 */
public class BasicCrudController<E, I> implements BasicCrudControllerInterface<E, I> {

    private final BasicCrudService service;

    @Autowired
    public BasicCrudController(BasicCrudService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<List<E>> findAll() {
        return new ResponseEntity(service.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<E> findById(I id) {
        return new ResponseEntity(service.findById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<E> create(E entity) {
        return new ResponseEntity(service.create(entity), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<E> update(I id, E entity) {
        return new ResponseEntity(service.update(id, entity),HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<E> delete(I id) {
        return new ResponseEntity(service.delete(id), HttpStatus.OK);
    }

}
