package com.automationdirect.sniffshell;

public class PlayWithProxy {

	public static void setSocks() {
		System.setProperty("socksProxyHost", "ec2-54-174-216-92.compute-1.amazonaws.com");
		System.setProperty("socksProxyPort", "1080");
	}
	
	public static void setHTTP() {
		System.setProperty("http.proxyHost", "ec2-54-174-216-92.compute-1.amazonaws.com");
		System.setProperty("http.proxyPort", "1080");
	}
	
	public static String debug() {
		String sH = System.getProperty("socksProxyHost");
		String hH = System.getProperty("http.proxyHost");
		return String.format("%s %s", sH, hH);
	}
}
