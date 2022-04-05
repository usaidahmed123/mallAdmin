package com.caseStudy.repository;

import com.caseStudy.Entities.MallAdmin;

public interface mallAdminRepository {

	public MallAdmin addMallAdmin(MallAdmin mallAdmin);
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin);
	public MallAdmin searchMallAdmin(int id);
	public boolean deleteMallAdmin(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
	
}
