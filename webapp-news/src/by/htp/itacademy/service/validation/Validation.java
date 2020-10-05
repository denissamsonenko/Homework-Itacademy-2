package by.htp.itacademy.service.validation;

import by.htp.itacademy.entity.News;

public class Validation {
	
	public static boolean isCorrect(News news) {
		if((news.getTitle().length()<=100) ||
		   (news.getBrief().length()<=200) ||
		   (news.getContent().length()<=300)){
			return true;
		} return false;
	}
}
