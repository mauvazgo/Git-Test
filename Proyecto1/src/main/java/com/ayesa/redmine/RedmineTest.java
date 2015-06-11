package com.ayesa.redmine;

import java.util.List;

import com.taskadapter.redmineapi.RedmineManager;
import com.taskadapter.redmineapi.bean.User;

public class RedmineTest {
	
	private static String uri = "http://127.0.0.1:81/redmine";
	private static String apiAccessKey = "9JpGsK2xlcbTJWqo9xTj";
	private static String projectKey = "taskconnector-test";
	private static Integer queryId = null; 
	
	public static void main (String args) {
	
		try {
	
			RedmineManager mgr = new RedmineManager(uri, apiAccessKey);
			List<User> users = (List<User>)mgr.getUsers();
			for (User user : users) {
		        System.out.println(user.toString());
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
