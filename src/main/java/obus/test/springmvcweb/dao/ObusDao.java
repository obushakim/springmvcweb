package obus.test.springmvcweb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import obus.test.springmvcweb.model.Obus;

@Repository("obusDao")
public class ObusDao {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Obus> getObuses() {
		Query query = entityManager.createQuery("FROM Obus as obus ORDER BY obus.id");

		return query.getResultList();
	}
}
