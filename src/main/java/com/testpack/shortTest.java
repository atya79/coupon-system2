package com.testpack;

import com.dbdao.CompanyDBDAO;
import com.dbdao.CouponDBDAO;
import com.javabeans.Company;
import com.javabeans.Coupon;
import com.javabeans.CouponType;

import java.sql.SQLException;

/**
 * This is a Test Class.
 * It's more pratical class. Is short, and check the Objects and the function in the fast way.
 * The other Test is just a beta version of test with scanners and User experience.
 * 
 * I moved to work with the short Test because I don't think I will have enough time for Scanners and Visual in
 * this point. we just need the pratical thing. I WILL use the visual test and terminal or 
 * maybe only the structure of it. 
 * 
 * @author Raziel
 *
 */

public class shortTest {
	
	public static void main(String[] args) throws SQLException {

		CouponDBDAO dbcoup = new CouponDBDAO();
		CompanyDBDAO dbcomp = new CompanyDBDAO();
		System.out.println("dbcoup = " + dbcoup.getAllCoupon());
		System.out.println("dbcomp.getAllCompanies() = " + dbcomp.getAllCompanies());
		
		Coupon c1 = new Coupon();
		System.out.println("c1 = " + c1.toString());
		Coupon c3 = new Coupon();
		System.out.println("c3.toString() = " + c3.toString());

		Coupon c4 = new Coupon();
		System.out.println("c4.toString() = " + c4.toString());
		Company co = new Company();
		System.out.println("co.getCompName() = " + co.getCompName());
		
		// coupon add.
//		c1 = new Coupon("Villa",LocalDate.now(),LocalDate.of(2018, 7, 29), 10, CouponType.TRAVEL, "Hotel Coupon", 150.90, "/Users/Kill130/Google Drive/m.jpg");
//		dbcoup.createCoupon(c1);
//		System.out.println(c1.toString());
		
		//Coupon remove
//		c1.setId(3);
//		dbcoup.removeCoupon(c1);
//		System.out.println(c1.toString());
		
//		co.setId(23);
//		dbcomp.removeCompany(co);
//		System.out.println(co.toString());
		
		
//		Coupon c5 = dbcoup.getCoupon(1);
//		//dbcoup.getCoupon(1);
//		System.out.println(c5);
		
		CouponType type = null;
//		
//		DBConnector.getCon();
//		try {
//			
//			
//			String sql = "insert into coupon (coup_id, title, Category) " + "values ('7', 'Hilton', %s)".format(type.name());
//			PreparedStatement prep = DBConnector.getInstance().prepareStatement(sql);
//			prep.executeUpdate();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
//		Coupon coup = dbcoup.getCoupon(3);
//		System.out.println(coup.toString());
//		System.out.println(dbcoup.getAllCoupon().toString());
		
		
		
		
//		System.out.println(dbcoup.getCouponByType(CouponType.ELECTRONICS).toString());

		CompanyDBDAO db = new CompanyDBDAO();
		System.out.println("Get all companies: "+ db.getAllCompanies());
		System.out.println("args = [" + args + "]");db.getAllCompanies();
		System.out.println("db.getAllCompanies() = " + db.getAllCompanies());
		System.out.println("db = " + db);
		System.out.println("db = " + db.getAllCompanies());
		System.out.println("shortTest.main");
		System.out.println("db.getAllCompanies() = " + db.getAllCompanies());
		System.out.println();
		System.out.println(db);
		System.out.println(db);
		System.out.println(db);

		System.out.println(db.getCoupons(2));
		


	}

}


