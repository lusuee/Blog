package serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.LabelDao;
import entity.Label;
import service.LabelService;

@Service
public class LabelServiceImpl implements LabelService {

	@Autowired
	private LabelDao labelDao;
	
	@Override
	public List<Label> queryLabel() {
		return labelDao.queryLabel();
	}

}
