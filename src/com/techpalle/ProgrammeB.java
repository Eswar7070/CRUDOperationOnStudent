package com.techpalle;
import java.sql.*;

public class ProgrammeB {

	public static void main(String[] args) {
		B b=new B();
		//b.creating();
		try 
		{

		b.deleting(2);
		} 
		catch (ClassNotFoundException e)
		{
			
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
		
	}

}
