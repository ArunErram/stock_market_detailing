package com.ArunErram.sectorservice.application.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ArunErram.sectorservice.application.model.Sector;

@Repository
public interface SectorRepository extends MongoRepository<Sector, String>
{
	public Sector findByName(String sectorName);
}
