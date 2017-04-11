package strong.app;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.app.Utils.SearchingCriteria;
import com.app.model.User;


@Repository
public class UsersDao extends DAO
{
	
	
	public User queryUserById(int id)
            throws Exception {
        try {
            Criteria search = getSession().createCriteria(User.class);
            search.add(Restrictions.like("Id", id));
	        User user=(User)search.uniqueResult();
            return user;
        } catch (HibernateException e) {
        	close();
            throw new Exception("Could not get User " + id, e);
        }
    }
	/*
	public User queryUserByEmail(String zip)
            throws Exception {
        try {
            Criteria search = getSession().createCriteria(User.class);
            search.add(Restrictions.like("userEmail", zip));
	        User user=(User)search.uniqueResult();
            return user;
        } catch (HibernateException e) {
        	close();
            throw new Exception("Could not get User who's email is" + zip, e);
        }
    }
	
	public ArrayList<User> searchUsersByCriteria(SearchingCriteria sc) throws Exception
	{
		
		try{
			String query;
			query= "From JobDetails where userEmail like :userEmail And 1=1 ";
			if(!sc.getUserStreet().equalsIgnoreCase(""))
			{
				query=query+" And userStreet=:userStreet";
			}
			if(!sc.getUserzip().equalsIgnoreCase(""))
            {
				query=query+" and userZip=:userZip";
            }
			Query q = getSession().createQuery(query);
			q.setString("userEmail",sc.getUserEmail()+"%");
			if(!sc.getUserStreet().equalsIgnoreCase(""))
			{
				q.setString("userStreet",sc.getUserStreet()+"%");
			}
			if(!sc.getUserzip().equalsIgnoreCase(""))
            {
				q.setString("userZip",sc.getUserzip()+"%");
            }
            
            ArrayList<User> Users=(ArrayList<User>)q.list();
            return Users;
		}
		catch(Exception e)
		{
			throw new Exception("Could not get Users' Details ", e);
		}
		
		
		
		
	
	}
	
	public ArrayList<User> ListUsers ()throws Exception
	{
		ArrayList<User> Users = null;
		
		try{
			String query=" from User";
			
			Query q = getSession().createQuery(query);
			
            
			Users=(ArrayList<User>)q.list();
            for(User e: Users)
    		{
    			System.out.println(e.getUserEmail());
    		}
            
            return Users;
		}
		catch(Exception e)
		{
			System.out.println("*** Could not get Users' Details " + e.getMessage());
		}
		
		return Users;
	}
	*/
}
