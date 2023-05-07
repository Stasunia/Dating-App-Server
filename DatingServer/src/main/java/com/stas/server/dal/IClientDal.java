package com.stas.server.dal;

import com.stas.server.entities.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientDal extends CrudRepository<Client, Long> {
}
