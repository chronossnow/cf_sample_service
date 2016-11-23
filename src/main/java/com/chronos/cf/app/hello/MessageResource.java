package com.chronos.cf.app.hello;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class MessageResource {
	private String messageId;
	private String message;
}
