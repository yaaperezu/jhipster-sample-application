package com.yp.jhipster.application.service;

import com.yp.jhipster.application.domain.Task;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Task.
 */
public interface TaskService {

    /**
     * Save a task.
     *
     * @param task the entity to save
     * @return the persisted entity
     */
    Task save(Task task);

    /**
     * Get all the tasks.
     *
     * @return the list of entities
     */
    List<Task> findAll();


    /**
     * Get the "id" task.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Task> findOne(String id);

    /**
     * Delete the "id" task.
     *
     * @param id the id of the entity
     */
    void delete(String id);
}
