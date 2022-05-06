package lecture.c08core;

import org.springframework.stereotype.Component;

import lombok.Setter;

@Component
public class Car {
	@Setter
	private Engine engine;
	
	public void go() {
		engine.action();
	}
}
