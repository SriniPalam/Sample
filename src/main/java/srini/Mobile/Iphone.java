package srini.Mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Iphone {

	@Autowired
	MobileProcessor cpu;

	
	public MobileProcessor getCpu() {
	return cpu;
}


public void setCpu(MobileProcessor cpu) {
	this.cpu = cpu;
}


	public void config()
	{
		System.out.println("I have Iphone 6s with good configurations");
		cpu.processor();
		
	}
}
