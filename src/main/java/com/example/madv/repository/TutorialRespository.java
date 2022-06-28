package com.example.madv.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.madv.model.*;

public interface TutorialRespository extends MongoRepository<Tutorial, String>{
	List<Tutorial> findByTitleContaining(String title);
	List<Tutorial> findByPublished(boolean published);
}
