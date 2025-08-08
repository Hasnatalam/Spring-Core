package com.hasnat.SpringCoreXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hasnat.service.WishMassage;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	//Creating container
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/hasnat/config/applicationConfig.xml");
    	//Getting reference
    	Object obj = ctx.getBean("wmg");
    	//Typecasting to WishMassage
    	WishMassage wishMassage = (WishMassage) obj;
    	//Calling WishMassage class wish method
    	wishMassage.wish();
    	ctx.close();
    }
}
