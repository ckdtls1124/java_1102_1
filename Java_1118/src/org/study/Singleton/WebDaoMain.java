package org.study.Singleton;

public class WebDaoMain {
	public static void main(String[] args) {
		
		WebDao.getInstance();
		WebDao.getInstance().insert();
		WebDao.getInstance().update();
		WebDao.getInstance().delete();
		WebDao.getInstance().select();
		
	}
}
