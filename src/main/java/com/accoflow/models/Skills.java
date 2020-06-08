package com.accoflow.models;

public class Skills {

	private int java;
	private int angular;
	private int react;
	
	public Skills(int java, int angular, int react, int js) {
		super();
		this.java = java;
		this.angular = angular;
		this.react = react;
		this.js = js;
	}
	public Skills() {
		super();
	}
	private int js;
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getAngular() {
		return angular;
	}
	public void setAngular(int angular) {
		this.angular = angular;
	}
	public int getReact() {
		return react;
	}
	public void setReact(int react) {
		this.react = react;
	}
	public int getJs() {
		return js;
	}
	public void setJs(int js) {
		this.js = js;
	}
}
