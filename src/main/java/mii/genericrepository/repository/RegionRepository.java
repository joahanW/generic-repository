/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mii.genericrepository.repository;

import mii.genericrepository.models.Region;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author MSI-JO
 */
public interface RegionRepository extends JpaRepository<Region, Long>{
    
}
