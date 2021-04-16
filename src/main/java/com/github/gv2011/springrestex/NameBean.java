package com.github.gv2011.springrestex;

public class NameBean {

	private final long id;
	private final String name;

	public NameBean(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName
	() {
		return name;
	}
}
