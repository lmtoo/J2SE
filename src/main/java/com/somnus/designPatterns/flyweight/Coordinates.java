package com.somnus.designPatterns.flyweight;

/**
 * @Title: Coordinates.java
 * @Package com.somnus.designPatterns.flyweight
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月28日 下午3:16:47
 * @version V1.0
 */
public class Coordinates {
	private int x;
	private int y;

	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
