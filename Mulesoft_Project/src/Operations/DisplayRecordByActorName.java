package Operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import Connection.DBConnection;

public class DisplayRecordByActorName {
	public static void main(String args[]) {
		try {
		    Connection con = null;
		    con = DBConnection.getConnection();
		    String name = null;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Please enter the name to retrive the record: ");
		    name = sc.next();
		    PreparedStatement pstmt=con.prepareStatement("select * from movies where  name = ?" );
		    pstmt.setString(1, name);
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
