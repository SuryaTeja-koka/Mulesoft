package Operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import Connection.DBConnection;

public class InsertingRecords {

	public static void main(String args[]) {
		try {
		    Connection con = null;
		    con = DBConnection.getConnection();
		    
			String mname=null;
			String mactor=null;
			String mactress=null;
			String mdirector=null;
			int myearofrelease=0;

			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Movie Name: ");
			mname=sc.next();
			System.out.println("Enter Movie Actor: ");
			mactor =sc.next();
			System.out.println("Enter Movie Actress: ");
			mactress =sc.next();
			System.out.println("Enter Movie Director: ");
			mdirector = sc.next();
			System.out.println("Enter Movie Year of Release: ");
			myearofrelease = sc.nextInt();
			PreparedStatement pstmt=con.prepareStatement("insert into movies values(?,?,?,?,?)");
			pstmt.setString(1, mname);
			pstmt.setString(2,mactor);
			pstmt.setString(3, mactress);
			pstmt.setString(4, mdirector);
			pstmt.setInt(5, myearofrelease);

			pstmt.execute();
			System.out.println("record is inserted");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
