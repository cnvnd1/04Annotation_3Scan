package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component // 스캔 대상 
public class EchoBean {
	
	AnotherBean another;
	

	public AnotherBean getAnother() {
		return another;
	}
	@Autowired //자동으로 AnotherBean을 찾아서 주입된다. 사용할 수 있는 곳은 생성자 변수 setter
	@Qualifier(value="anotherBean") //동일한 타입이 여러개인 경우에 명시적으로 지정 
	public void setAnother(AnotherBean another) {
		this.another = another;
	}

	
	
}
