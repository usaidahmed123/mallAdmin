package com.caseStudy.repository;

import javax.persistence.EntityManager;

import com.caseStudy.mallAdmin.MallAdmin;

public class mallAdminRepositoryImpl implements mallAdminRepository {
	
	
	
	
	//Step 1 : Start JPA Life Cycle
	private EntityManager entityManager;
	
	
	public mallAdminRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	
	}

	@Override
	public MallAdmin addMallAdmin(MallAdmin mallAdmin) {
		
		entityManager.persist(mallAdmin);
		
		return mallAdmin;
	}
	

	@Override
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin) {
		
		entityManager.merge(mallAdmin);
		// TODO Auto-generated method stub
		return mallAdmin;
	}

	@Override
	public MallAdmin searchMallAdmin(int id) {
		
		MallAdmin mallAdmin = entityManager.find(MallAdmin.class, id);
		return mallAdmin;
	}

	@Override
	public boolean deleteMallAdmin(int id) {
		
		MallAdmin mallAdmin = entityManager.find(MallAdmin.class,id);
		entityManager.remove(mallAdmin);
		
		return false;
	}

	@Override
	public void beginTransaction() {
		
		entityManager.getTransaction().begin();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commitTransaction() {
		
		entityManager.getTransaction().commit();
		// TODO Auto-generated method stub
		
	}

}
