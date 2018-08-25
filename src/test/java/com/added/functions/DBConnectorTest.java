package com.added.functions;

import org.testng.annotations.Test;

import java.sql.Connection;

import static org.testng.Assert.*;

public class DBConnectorTest {

    private static Connection con;
    private static final String url = "jdbc:mysql://localhost/coupon?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String userDBname = "root";
    private static final String passowrdDB = "";


    @Test
    public void testGetCon() {

        DBConnector dbConnector = new DBConnector();
        System.out.println(dbConnector);
        DBConnector.getCon();
        System.out.println("dbConnector. = " + DBConnector.getInstance());
    }
}