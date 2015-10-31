package org.mail.server;

public class Mail {
public static String send(String to, String subject, String body) {
	 return("Sending mail to "+to+", subject is ["+subject+"] and mail body is ["+body+"]");
}
}
