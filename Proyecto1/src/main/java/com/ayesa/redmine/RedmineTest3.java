package com.ayesa.redmine;

import java.util.List;
import java.util.logging.Logger;

import com.taskadapter.redmineapi.RedmineManager;
import com.taskadapter.redmineapi.RedmineManagerFactory;
import com.taskadapter.redmineapi.bean.User;

public class RedmineTest3 {

	private static String uri = "http://127.0.0.1:81/redmine";
	private static String apiAccessKey = "WpXFreqOrHqIJ0tpzw8J";

	public static void main(String[] args) throws Exception {

		try {

			RedmineManager mgr = RedmineManagerFactory.createWithApiKey(uri,
					apiAccessKey);
			List<User> users = (List<User>) mgr.getUserManager().getUsers();
			for (User user : users) {
				System.out.println(user.toString());
			}
		} catch (Exception e) {
			Logger.getGlobal().log(null, " msg");
			throw e;

		}
	}
}
