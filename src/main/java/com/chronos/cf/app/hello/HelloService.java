package com.chronos.cf.app.hello;

import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("request")
@RequestMapping(value="/hello/")
public class HelloService {
	@RequestMapping(value="message", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public MessageResource message() {
		return new MessageResource("100", "テストメッセージ");
	}
}
