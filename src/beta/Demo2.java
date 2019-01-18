package beta;
import org.apache.logging.log4j.*;

public class Demo2 {
	
	// Initializes Log object
	private static Logger log = LogManager.getLogger(Demo2.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("I have clicked on button");
		log.info("Button is displayed");
		log.error("Button is not displayed");
		log.fatal("Object is missing");

	}

}
