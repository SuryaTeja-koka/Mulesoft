package Operations;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Connection.DBConnection;


public class CreatingMoviesTable {
	public static void main(String args[]) {
	try {
    Connection con = null;
    con = DBConnection.getConnection();
    String qry="CREATE TABLE MOVIES(name varchar(255), actor varchar(255), actress varchar(255), director varchar(255), yearofrelease int)";
	
	PreparedStatement pstmt= con.prepareStatement(qry);	
	
	pstmt.execute();
	
	System.out.println("table created");
	}
	catch(Exception e) {
		System.out.println(e);
	}

	}
}