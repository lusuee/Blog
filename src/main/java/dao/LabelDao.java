package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.Label;

@Repository
public interface LabelDao {

	List<Label> queryLabel();
	
}
