package com.test.smartercommerce.dao;

import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.smartercommerce.dao.UserDao;

import junit.framework.Assert;

public class UserDaoImplTest extends EntityDaoImplTest{

	/*@Autowired
	UserDao userdao;
	
	@Override
	protected IDataSet getDataSet() throws Exception{
		IDataSet dataSet = new FlatXmlDataSet(this.getClass().getClassLoader().getResourceAsStream("User.xml"));
		return dataSet;
	}
	
	@Test
	 public void findAllUsers(){
        Assert.assertEquals(userdao.findAllUsers().size(), 2);
    }
	*/
     
}
