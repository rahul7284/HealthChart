package com.healthcart.daoImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.healthcart.dto.BloodCBCDto;
import com.healthcart.model.BloodHbModel;
import com.healthcart.model.BloodPlateletsModel;
import com.healthcart.model.BloodRBCModel;
import com.healthcart.model.BloodSugarDescModel;
import com.healthcart.model.BloodWBCModel;
@Repository
public class BloodCBCDao {
	SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	Session session = null;
	
	public BloodCBCDto getCBCValues(int rbc_limit ,int wbc_limit,int platelets_limit,int hb_limit, String gender){
		BloodCBCDto bloodCBCDto =new BloodCBCDto();
		List<String>cbc_desc = new ArrayList<String>();
		 Map<String,String>description_map = new HashMap<String,String>();
		String wbc_desc=getWBCLevel(wbc_limit, gender);
		String rbc_desc=getRBCLevel(rbc_limit, gender);
		String hb_desc=getHbLevel(hb_limit, gender);
		String platelet_desc=getPlateletsLevel(platelets_limit, gender);
		cbc_desc.add(wbc_desc);
		cbc_desc.add(rbc_desc);
		cbc_desc.add(hb_desc);
		cbc_desc.add(platelet_desc);
		bloodCBCDto.setDescriptionlist(cbc_desc);
		description_map.put("WBCDESC", wbc_desc);
		description_map.put("RBCDESC", rbc_desc);
		description_map.put("HBDESC", hb_desc);
		description_map.put("PLATLEDESC", platelet_desc);
		bloodCBCDto.setDescription_map(description_map);
		return bloodCBCDto;
		
	}
public String getRBCLevel(int limt,String gender){
		String rbc_desc=null;
		BloodRBCModel bloodRbc = new BloodRBCModel();
		BloodRBCModel bloodRbc2 = new BloodRBCModel();
		BloodSugarDescModel bloodSugarDescModel = new BloodSugarDescModel();
		session = sessionFactory.openSession();
		System.out.println("DAO----------------------");
		BloodCBCDto bldcbcdto = new BloodCBCDto();
		
		bloodRbc=(BloodRBCModel) session.createCriteria(BloodRBCModel.class).add(Restrictions.eq("gender",gender)).uniqueResult();
		
		if(limt >= bloodRbc.getLow_limit() && limt <=bloodRbc.getHigh_limit()){
		bloodSugarDescModel.setId(4);
		bloodSugarDescModel=(BloodSugarDescModel) session.createCriteria(BloodSugarDescModel.class).add(Restrictions.eq("id",bloodSugarDescModel.getId())).uniqueResult();
		bldcbcdto.setRbc_description(bloodSugarDescModel.getDescription());
		rbc_desc=bloodSugarDescModel.getDescription();
		}
		
		else if(limt <= bloodRbc.getLow_limit()){
			bloodSugarDescModel.setId(6);
			bloodSugarDescModel=(BloodSugarDescModel) session.createCriteria(BloodSugarDescModel.class).add(Restrictions.eq("id",bloodSugarDescModel.getId())).uniqueResult();
			bldcbcdto.setRbc_description(bloodSugarDescModel.getDescription());
			rbc_desc=bloodSugarDescModel.getDescription();
		
			
		}
		
			else if(limt >= bloodRbc.getHigh_limit()){
		
				
				bloodSugarDescModel.setId(5);
				bloodSugarDescModel=(BloodSugarDescModel) session.createCriteria(BloodSugarDescModel.class).add(Restrictions.eq("id",bloodSugarDescModel.getId())).uniqueResult();
				bldcbcdto.setRbc_description(bloodSugarDescModel.getDescription());

				rbc_desc=bloodSugarDescModel.getDescription();

		}
		
		
		return rbc_desc;
	}
	
public String getWBCLevel(int limt,String gender){
	String wbc_desc = null;
BloodWBCModel bloodWbc = new BloodWBCModel();
BloodWBCModel bloodWbc2 = new BloodWBCModel();
BloodSugarDescModel bloodSugarDescModel = new BloodSugarDescModel();
session = sessionFactory.openSession();
System.out.println("DAO----------------------");
BloodCBCDto bldcbcdto = new BloodCBCDto();

bloodWbc=(BloodWBCModel) session.createCriteria(BloodWBCModel.class).add(Restrictions.eq("gender",gender)).uniqueResult();

if(limt >= bloodWbc.getLow_limit() && limt <= bloodWbc.getHigh_limit()){
bloodSugarDescModel.setId(7);
bloodSugarDescModel=(BloodSugarDescModel) session.createCriteria(BloodSugarDescModel.class).add(Restrictions.eq("id",bloodSugarDescModel.getId())).uniqueResult();
bldcbcdto.setWbc_description(bloodSugarDescModel.getDescription());
wbc_desc = bloodSugarDescModel.getDescription();
}

else if(limt <= bloodWbc.getLow_limit()){
	bloodSugarDescModel.setId(9);
	bloodSugarDescModel=(BloodSugarDescModel) session.createCriteria(BloodSugarDescModel.class).add(Restrictions.eq("id",bloodSugarDescModel.getId())).uniqueResult();
	bldcbcdto.setWbc_description(bloodSugarDescModel.getDescription());
	wbc_desc = bloodSugarDescModel.getDescription();

	
}

	else if(limt >= bloodWbc.getHigh_limit()){

		
		bloodSugarDescModel.setId(8);
		bloodSugarDescModel=(BloodSugarDescModel) session.createCriteria(BloodSugarDescModel.class).add(Restrictions.eq("id",bloodSugarDescModel.getId())).uniqueResult();
		bldcbcdto.setWbc_description(bloodSugarDescModel.getDescription());
		wbc_desc = bloodSugarDescModel.getDescription();

}


return wbc_desc;
}


public String getHbLevel(int limt,String gender){
String hb_desc = null;
BloodHbModel bloodHb = new BloodHbModel();
BloodHbModel bloodHb2 = new BloodHbModel();
BloodSugarDescModel bloodSugarDescModel = new BloodSugarDescModel();
session = sessionFactory.openSession();
System.out.println("DAO----------------------");
BloodCBCDto bldcbcdto = new BloodCBCDto();

bloodHb=(BloodHbModel) session.createCriteria(BloodHbModel.class).add(Restrictions.eq("gender",gender)).uniqueResult();

if(limt >= bloodHb.getLow_limit() && limt <= bloodHb.getHigh_limit()){
bloodSugarDescModel.setId(10);
bloodSugarDescModel=(BloodSugarDescModel) session.createCriteria(BloodSugarDescModel.class).add(Restrictions.eq("id",bloodSugarDescModel.getId())).uniqueResult();
bldcbcdto.setHb_description(bloodSugarDescModel.getDescription());
hb_desc = bloodSugarDescModel.getDescription();
}

else if(limt <= bloodHb.getLow_limit()){
	bloodSugarDescModel.setId(12);
	bloodSugarDescModel=(BloodSugarDescModel) session.createCriteria(BloodSugarDescModel.class).add(Restrictions.eq("id",bloodSugarDescModel.getId())).uniqueResult();
	bldcbcdto.setDescription(bloodSugarDescModel.getDescription());
	hb_desc = bloodSugarDescModel.getDescription();

	
}

	else if(limt >= bloodHb.getHigh_limit()){

		
		bloodSugarDescModel.setId(11);
		bloodSugarDescModel=(BloodSugarDescModel) session.createCriteria(BloodSugarDescModel.class).add(Restrictions.eq("id",bloodSugarDescModel.getId())).uniqueResult();
		bldcbcdto.setDescription(bloodSugarDescModel.getDescription());
		hb_desc = bloodSugarDescModel.getDescription();

}


return hb_desc;
}
public String getPlateletsLevel(int limt,String gender){
	String platelet_desc = null;
BloodPlateletsModel bloodPlatelets = new BloodPlateletsModel();
BloodPlateletsModel bloodPlatelets2 = new BloodPlateletsModel();
BloodSugarDescModel bloodSugarDescModel = new BloodSugarDescModel();
session = sessionFactory.openSession();
System.out.println("DAO----------------------");
BloodCBCDto bldcbcdto = new BloodCBCDto();

bloodPlatelets=(BloodPlateletsModel) session.createCriteria(BloodPlateletsModel.class).add(Restrictions.eq("gender",gender)).uniqueResult();

if(limt >= bloodPlatelets.getLow_limit() && limt <= bloodPlatelets.getHigh_limit()){
bloodSugarDescModel.setId(13);
bloodSugarDescModel=(BloodSugarDescModel) session.createCriteria(BloodSugarDescModel.class).add(Restrictions.eq("id",bloodSugarDescModel.getId())).uniqueResult();
bldcbcdto.setDescription(bloodSugarDescModel.getDescription());
platelet_desc = bloodSugarDescModel.getDescription();
}

else if(limt <= bloodPlatelets.getLow_limit()){
	bloodSugarDescModel.setId(15);
	bloodSugarDescModel=(BloodSugarDescModel) session.createCriteria(BloodSugarDescModel.class).add(Restrictions.eq("id",bloodSugarDescModel.getId())).uniqueResult();
	bldcbcdto.setDescription(bloodSugarDescModel.getDescription());
	platelet_desc = bloodSugarDescModel.getDescription();

	
}

	else if(limt >= bloodPlatelets.getHigh_limit()){

		
		bloodSugarDescModel.setId(14);
		bloodSugarDescModel=(BloodSugarDescModel) session.createCriteria(BloodSugarDescModel.class).add(Restrictions.eq("id",bloodSugarDescModel.getId())).uniqueResult();
		bldcbcdto.setDescription(bloodSugarDescModel.getDescription());
		platelet_desc = bloodSugarDescModel.getDescription();

}


return platelet_desc;
}

}
