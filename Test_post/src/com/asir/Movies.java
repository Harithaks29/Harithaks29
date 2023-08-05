package com.asir;

//import java.util.List;
//import java.util.ArrayList;

public class Movies {
	private int id;
	private String name;
	private String type;
	private int pay;
//	private List<Language> language;
	private String language;
	
	
	public Movies(int id,String name,String type,int pay,String language) {
		this.id=id;
		this.name=name;
		this.type=type;
		this.pay=pay;
		this.language=language;
//		this.language = new ArrayList<>();	
	}

	public Movies() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

//	public void addLanguage(Language languages) {
//        this.language.add(languages);
//    }
//
//    public List<Language> getLanguages() {
//        return language;
//    }

}
