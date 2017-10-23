package com.healthcart.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healthcart.dto.BloodSugarDto;
import com.healthcart.model.BloodSugarDescModel;
import com.healthcart.model.BloodSugarModel;
@Repository
public class BloodSugarDao {
	SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	Session session = null;
	
	public BloodSugarDto getBloodSugerLevel(int limt,String mode){
		
		BloodSugarModel bloodSugar = new BloodSugarModel();
		BloodSugarModel bloodSugar2 = new BloodSugarModel();
		BloodSugarDescModel bloodSugarDescModel = new BloodSugarDescModel();
		session = sessionFactory.openSession();
		System.out.println("DAO----------------------");
		BloodSugarDto bldsugardto = new BloodSugarDto();
		
		bloodSugar=(BloodSugarModel) session.createCriteria(BloodSugarModel.class).add(Restrictions.eq("mode",mode)).uniqueResult();
		bloodSugar.setValue(limt);
		if(limt >= bloodSugar.getLow_limit() && limt <= bloodSugar.getHigh_limit()){
		bloodSugarDescModel.setId(1);
		bloodSugarDescModel=(BloodSugarDescModel) session.createCriteria(BloodSugarDescModel.class).add(Restrictions.eq("id",bloodSugarDescModel.getId())).uniqueResult();
		bldsugardto.setDescription(bloodSugarDescModel.getDescription());
		}
		
		else if(limt <= bloodSugar.getLow_limit()){
			bloodSugarDescModel.setId(3);
			bloodSugarDescModel=(BloodSugarDescModel) session.createCriteria(BloodSugarDescModel.class).add(Restrictions.eq("id",bloodSugarDescModel.getId())).uniqueResult();
			bldsugardto.setDescription(bloodSugarDescModel.getDescription());
		
			
		}
		
			else if(limt >= bloodSugar.getHigh_limit()){
		
				
				bloodSugarDescModel.setId(2);
				bloodSugarDescModel=(BloodSugarDescModel) session.createCriteria(BloodSugarDescModel.class).add(Restrictions.eq("id",bloodSugarDescModel.getId())).uniqueResult();
				bldsugardto.setDescription(bloodSugarDescModel.getDescription());
			
		}
		
		
		return bldsugardto;
	}
	

}
