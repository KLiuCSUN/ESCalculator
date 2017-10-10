package rushi.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rushi.model.Chip;

import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class ChipService {
	
	@Autowired
	Chip ch;
	
	

}
