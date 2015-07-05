package com.somnus.designPatterns.proxy;

public class Client {

	public static void main(String[] args) throws Exception{
	    Searcher searcher = (Searcher) XMLUtil.getBean();
	    searcher.doSearch("杨过", "玉女心经");
	}

}
