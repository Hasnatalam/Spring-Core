package com.hasnat.SpringCoreXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hasnat.config.AppConfig;
import com.hasnat.service.WishMassage;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	//Creating container
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
    	//Getting reference
    	Object obj = ctx.getBean("wm");
    	//Type casting to WishMassage
    	WishMassage wishMassage = (WishMassage) obj;
    	//Calling WishMassage class wish method
    	wishMassage.wish();
    	ctx.close();
    }
}
