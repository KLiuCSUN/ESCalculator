package rushi.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rushi.model.Chip;
import rushi.repository.ChipRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class ChipService {
	
	@Autowired
	ChipRepository ch;
	
	public List<Chip> findall(){
		return ch.findAll();
	}

	public Chip findOne(Long chipID) {
		return ch.findOne(chipID);
	}
}
