package com.fsoft.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatUtil {
	public static Timestamp stringToTimestamp(String s) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		Date parsedDate;
		try {
			parsedDate = dateFormat.parse(s.replace("T", " "));
			return new Timestamp(parsedDate.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
