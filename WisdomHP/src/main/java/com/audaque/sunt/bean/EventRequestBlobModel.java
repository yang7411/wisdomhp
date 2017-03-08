package com.audaque.sunt.bean;

import java.io.Serializable;

public class EventRequestBlobModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6653931090553554879L;

	private String multimedia;
	
    private String filename;


	public String getMultimedia() {
		return multimedia;
	}

	public void setMultimedia(String multimedia) {
		this.multimedia = multimedia;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
}
