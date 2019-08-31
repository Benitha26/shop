package com.quinnox.basics.model;

public class CubeBean {
	private int num=0;

	public CubeBean() {
		super();
	}

	public int getNum() {
		return (num*num*num);
	}

	public void setNum(int num) {
		this.num = num;
	}
}
