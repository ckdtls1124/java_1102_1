package org.study.Singleton;

public class WebDao {
	
	private WebDao() {
		System.out.println("Singleton Class");
	}
	
	private static class Singleton{
		private static final WebDao INSTANCE=new WebDao();
	}
	
	public static WebDao getInstance() {
		return Singleton.INSTANCE;
	}
	
	public void insert() {
		System.out.println("insert");
	}
	public void delete() {
		System.out.println("delete");
	}
	public void update() {
		System.out.println("update");
	}
	public void select() {
		System.out.println("select");
	}
	
}
