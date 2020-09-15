package srini.Mobile;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTeck implements MobileProcessor {

	
	public void processor() {
		System.out.println("this is media Teck CPU, world second CPU");

	}

}
