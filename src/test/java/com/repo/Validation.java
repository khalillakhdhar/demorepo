package com.repo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

boolean verifEmpty(String ch)
{
	return ch.isBlank();
}
boolean isConvertable(String c)
{
try
{
	Integer.parseInt(c);
	return true;
}
catch (Exception e) {
	// TODO: handle exception
	return false;
}
}
boolean verifLength(int lo,String ch)
{
return 	ch.length()>=lo;
}
boolean verifGrade(String grade)
{
	return !grade.contains("admin");
	
}
public boolean validatePass(String password)
{
String regex="(?=.*[a-z])(?=.*[A-Z]).*";
Pattern pattern=Pattern.compile(regex);
Matcher matcher=pattern.matcher(password);
return matcher.matches();
}

}
