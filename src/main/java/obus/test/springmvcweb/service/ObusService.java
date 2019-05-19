package obus.test.springmvcweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import obus.test.springmvcweb.dao.ObusDao;
import obus.test.springmvcweb.model.Obus;

@Transactional
@Service("obusService")
public class ObusService {

	@Autowired
	@Qualifier("obusDao")
	private ObusDao obusDao;

	public List<Obus> getObuses() {
		return obusDao.getObuses();
	}
}
