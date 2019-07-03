package com.covalense.jdbcapp.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Vector;



public class ConnectionPool {

	private ArrayList<Connection> pool;

	private int poolSize;
	private String dbUrl;
	private String userNM;
	private String password;
	private static ConnectionPool poolRef = null;

	public static ConnectionPool getConnectionPool() throws Exception {

		if (poolRef == null) {
			poolRef = new ConnectionPool();
		}
		return poolRef;
	}

	
	
	private void loadproperties() throws Exception {

		poolSize = Integer.parseInt(PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.POOL_SIZE));
		dbUrl = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.DB_URL);
		userNM = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.USER_NAME);
		password = PropertyUtil.getPropertyUtil().getProperty(ConnectionPoolConstants.PASSWORD);
	}

	
	
	private void initializePool() throws Exception {
		
		pool = new ArrayList<Connection>();
		Connection con = null;
		for (int i = 0; i < poolSize; i++) {

			con = DriverManager.getConnection(dbUrl, userNM, password);
			pool.add(con);
		}
	}

	
	
	public ConnectionPool() throws Exception {

		loadproperties();
		initializePool();

	}



	public Connection getConnectionFromPool() {
		return pool.remove(0);
	}

	public void retunConnectionToPool(Connection con) {
		pool.add(con);
	}

}// end of class