package com.xyl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	@Value("${userName}")
	private String userName;

	@RequestMapping("/getUserName")
	public String getUserName() {
		return userName;
	}
}