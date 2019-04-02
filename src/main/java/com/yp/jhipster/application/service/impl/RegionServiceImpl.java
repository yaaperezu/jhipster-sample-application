package com.yp.jhipster.application.service.impl;

import com.yp.jhipster.application.service.RegionService;
import com.yp.jhipster.application.domain.Region;
import com.yp.jhipster.application.repository.RegionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing Region.
 */
@Service
public class RegionServiceImpl implements RegionService {

    private final Logger log = LoggerFactory.getLogger(RegionServiceImpl.class);

    private final RegionRepository regionRepository;

    public RegionServiceImpl(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    /**
     * Save a region.
     *
     * @param region the entity to save
     * @return the persisted entity
     */
    @Override
    public Region save(Region region) {
        log.debug("Request to save Region : {}", region);
        return regionRepository.save(region);
    }

    /**
     * Get all the regions.
     *
     * @return the list of entities
     */
    @Override
    public List<Region> findAll() {
        log.debug("Request to get all Regions");
        return regionRepository.findAll();
    }


    /**
     * Get one region by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    public Optional<Region> findOne(String id) {
        log.debug("Request to get Region : {}", id);
        return regionRepository.findById(id);
    }

    /**
     * Delete the region by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(String id) {
        log.debug("Request to delete Region : {}", id);
        regionRepository.deleteById(id);
    }
}
