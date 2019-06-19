package com.ssi.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssi.entities.Branch;

@Component
public class BranchDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<String> getAllBranches(){
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Branch.class);
		List<Branch> branches=cr.list();
		List<String> branchList=new ArrayList<>();
		for(Branch branch:branches){
			branchList.add(branch.getBname());
		}
		session.close();
		return branchList;
	}
}
