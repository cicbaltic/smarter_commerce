package com.smartercommerce.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.smartercommerce.pojo.Item;
import com.smartercommerce.pojo.User;

@Repository("itemDao")
public class ItemDaoImpl extends AbstractDao<Integer, Item> implements ItemDao{

	public Item findById(int id) {
        return getByKey(id);
    }
 
    public void saveItem(Item item) {
        persist(item);
    }
    public void deleteItemById(int id) {
        Query query = getSession().createSQLQuery("delete from Item where id = :id");
        query.setInteger("id", id);
        query.executeUpdate();
    }
 
    @SuppressWarnings("unchecked")
    public List<Item> findAllItems() {
    	Criteria criteria = createEntityCriteria();
    	return (List<Item>) criteria.list();
    }
    @SuppressWarnings("unchecked")
    public List<Item> findItemByCategory(String category) {
    	Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("category", category));
        return (List<Item>) criteria.list();
    	
    }

}
