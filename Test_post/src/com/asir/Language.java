package com.asir;

public class Language {
	private int lang_id;
	private String language;

	
	public Language(int lang_id,String language) {
		
		this.lang_id=lang_id;
		this.language=language;
	}


	public Language() {
		// TODO Auto-generated constructor stub
	}


	public int getLang_id() {
		return lang_id;
	}


	public void setLang_id(int lang_id) {
		this.lang_id = lang_id;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}
}
