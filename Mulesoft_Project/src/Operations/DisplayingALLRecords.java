package Operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connection.DBConnection;

public class DisplayingALLRecords {
	public static void main(String args[]) {
		try {
		    Connection con = null;
		    con = DBConnection.getConnection();
		    
		    PreparedStatement pstmt=con.prepareStatement("select * from movies");
			ResultSet rs=pstmt.executeQuery();
			int count=1;
			while(rs.next()) {
				System.out.println("****Movie records****");
				System.out.println("Record -> "+ count);
				System.out.println("Movie Name: "+rs.getString("name"));
				System.out.println("Actor: "+rs.getString("actor"));
				System.out.println("Actress: "+rs.getString("actress"));
				System.out.println("Director: "+rs.getString("director"));
				System.out.println("Year of Release: "+rs.getInt("yearofrelease"));

				count=count+1;
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	}
