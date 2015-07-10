import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bean.AnotherBean;
import com.bean.EchoBean;


public class EchoBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:com/bean/echo.xml");
		
		EchoBean bean = ctx.getBean("echoBean",EchoBean.class);
		AnotherBean another = bean.getAnother();
		System.out.println(another.getName());
	
	}

}
