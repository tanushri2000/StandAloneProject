package com.tanu;

/**
 * Hello world!
 */
public class Application{
	
	/*
	 * public int sum(int a ,int b) { return a+b; }
	 */
	
    public static void main(String[] args) {
    	
    	App app=new App();
    	int wordCount = app.wordCount("My name is Tanushri");
    	System.out.println("count:"+wordCount);
        
    }
}
