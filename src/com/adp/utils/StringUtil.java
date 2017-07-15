package com.adp.utils;

import java.io.UnsupportedEncodingException;

import org.apache.commons.lang.StringUtils;

public class StringUtil {
	
	 public static String convertEncoding(String pText, String pFromEncoding, String pToEncoding) {
	        if (StringUtils.isBlank(pText)) {
	            return pText;
	        }

	        if (StringUtils.isBlank(pFromEncoding)) {
	        	pFromEncoding = "UTF-8";
	        }

	        if (StringUtils.isBlank(pToEncoding)) {
	        	pToEncoding = "UTF-8";
	        }

	        try {
	        	pText = new String(pText.getBytes(pFromEncoding), pToEncoding);
	        } catch (UnsupportedEncodingException e) {
	        }

	        return pText;
	}
	 
	 public static boolean isEmpty(String pString){
		 return pString == null || pString.length() == 0;
	 }
	 
	 public static boolean isNotEmpty(String pString){
		 return !isEmpty(pString);
	 }

	 public static String getHTMLStringFromString(String pString){
		 if(pString==null)
			 return new String();
		 pString = pString.replace("\n", "<BR/>");
		 pString = pString.replace("�", "&eacute;");
		 pString = pString.replace("�", "&egrave;");
		 pString = pString.replace("�", "&ecirc;");
		 pString = pString.replace("�", "&ccedil;");
		 pString = pString.replace("�", "&agrave;");
		 pString = pString.replace("�", "&ocirc;");
		 pString = pString.replace("�", "&Eacute;");
		 pString = pString.replace("�", "&icirc;");
		 return pString;
	 }
	 
	 public static String getStringFromHTMLString(String pHTMLString){
		 if(pHTMLString==null)
			 return new String();
		 pHTMLString = pHTMLString.replace("<BR/>", "");
		 pHTMLString = pHTMLString.replace("&eacute;","�");
		 pHTMLString = pHTMLString.replace("&egrave;","�");
		 pHTMLString = pHTMLString.replace("&ecirc;","�");
		 pHTMLString = pHTMLString.replace("&ccedil;","�");
		 pHTMLString = pHTMLString.replace("&agrave;","�");
		 pHTMLString = pHTMLString.replace("&ocirc;","�");
		 pHTMLString = pHTMLString.replace("&Eacute;","�");
		 pHTMLString = pHTMLString.replace("&icirc;", "�");
		 return pHTMLString;
	 }
}
