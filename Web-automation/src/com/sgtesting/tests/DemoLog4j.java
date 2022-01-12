package com.sgtesting.tests;

import org.apache.log4j.Logger;

public class DemoLog4j {
	private static Logger log=Logger.getLogger("for loop results:.........");

	public static void main(String[] args) {
		log.info("For loop starts here-----------");
		for(int i=1;i<100;i++)
		{
			if(i%2==0)
			{
				log.info("Value of i : "+i);
			}
		}
		log.info("For loop ends here-------------------");

	}

}
