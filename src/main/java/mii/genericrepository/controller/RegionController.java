/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.genericrepository.controller;

import mii.genericrepository.controller.generic.BasicCrudController;
import mii.genericrepository.models.Region;
import mii.genericrepository.service.generic.BasicCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MSI-JO
 */
@RestController
@RequestMapping("/region")
public class RegionController extends BasicCrudController<Region, Long>{
    
    @Autowired
    public RegionController(BasicCrudService service) {
        super(service);
    }
    
}
