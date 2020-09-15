package srini.Mobile;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {

	public void processor() {
		
		System.out.println("this is Snapdragon CPU, world firt cpu");
	}

}
