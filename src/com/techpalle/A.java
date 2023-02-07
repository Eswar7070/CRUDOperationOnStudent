package com.techpalle;

import java.sql.*;

public class A 
{
	 public void creating() 
	 {
		 Connection con = null;
		 Statement s=null;
		 
		 try 
		 {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Eswar123");
			 
			 s= con.createStatement();
			 s.executeUpdate("create table emp1 (ename varchar(40),esal int)");

		}
		 catch (ClassNotFoundException e) 
		 {
			e.printStackTrace();
		} 
		 catch (SQLException e) 
		 {
			
			e.printStackTrace();
		}
		 finally
		 {
			 try
			 {
				 if(s!=null)
				 {
					 s.close();
				 }
				 if(con!=null) 
				 {
					 con.close();
				 }
				
			} catch (SQLException e) 
			 {
				
				e.printStackTrace();
			}
		 }
		
	}
	 	public void inserting(String ename, int esal) 
	 	{
	 		
	 		Connection con=null;
	 		Statement s= null;
	 		
	 		
	 		try 
	 		{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Eswar123");
				 
				 s= con.createStatement();
				 
				 String qry="insert into emp1 values('ravi',50000)";
				 s.executeUpdate(qry);
		 		
			} 
	 		catch (ClassNotFoundException | SQLException e)
	 		{
				
				e.printStackTrace();
			}
	 		
	 		finally
			 {
				 try
				 {
					 if(s!=null)
					 {
						 s.close();
					 }
					 if(con!=null) 
					 {
						 con.close();
					 }
					
				} catch (SQLException e) 
				 {
					
					e.printStackTrace();
				}
	 		
	 		
	 		
	 	}
	 
	 	}
}
