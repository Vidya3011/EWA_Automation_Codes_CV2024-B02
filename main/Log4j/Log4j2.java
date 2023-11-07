package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;


public class Log4j2 {
	
 private static org.apache.logging.log4j.Logger log = LogManager.getLogger(Log4j2.class);

		public static void main(String[] args) {
			
			System.out.println("/n Contentverse. . .! \n");
			
			log.trace("this is trace message");
			log.info("This is Information message");
			log.error("This is an error message");
			log.warn("This is a warning message");
			log.debug("This is a Debug message");
			
		
		
		
		}

	}
	
	
	
	


