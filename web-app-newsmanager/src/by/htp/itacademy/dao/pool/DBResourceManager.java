package by.htp.itacademy.dao.pool;

import java.util.ResourceBundle;

public class DBResourceManager {
	
	private final static DBResourceManager instance = new DBResourceManager();
	private ResourceBundle bundle =
			ResourceBundle.getBundle("by.htp.itacademy.dao.pool.db");

	public static DBResourceManager getInstance() {
		return instance;
	}
	
	public String getValue(String key) {
		return bundle.getString(key);
	}

}
