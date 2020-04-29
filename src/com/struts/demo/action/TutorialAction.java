package com.struts.demo.action;

import com.struts.demo.service.TutorialFinderService;

public class TutorialAction {

	private String bestTutorialSite;
	private String language;
	public String execute() {
		System.out.println("hello from action execute");
		TutorialFinderService tutorialService = new TutorialFinderService();
		System.out.println(getLanguage());
		setBestTutorialSite(tutorialService.getBestTutorialSite(getLanguage()));
		return "success"; 
	}
	public String getBestTutorialSite() {
		return bestTutorialSite;
	}
	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
}
