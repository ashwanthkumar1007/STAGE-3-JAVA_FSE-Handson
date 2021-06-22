package com.cognizant.ormlearn.association.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.association.Entity.Skill;
import com.cognizant.ormlearn.association.repository.SkillRepository;
@Service
public class SkillService {
	@Autowired
	private SkillRepository repo;
	
	@Transactional
	public void save(Skill skill)
	{
		repo.save(skill);
	}
	
	@Transactional
	public Skill findById(int id)
	{
		return repo.findById(id).get();
	}

}
