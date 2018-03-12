package com.in28minutes.springboot;

import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
public class Test {

		@org.junit.Test
		public void test() throws Exception{
		URL url = new URL("http://localhost:8080/greeting");
		HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
		httpCon.setDoOutput(true);
		httpCon.setRequestMethod("GET");
		OutputStreamWriter out = new OutputStreamWriter(httpCon.getOutputStream());
		System.out.println(httpCon.getResponseCode());
		out.close();
	}
}
