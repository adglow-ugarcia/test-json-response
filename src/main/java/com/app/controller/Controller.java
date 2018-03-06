package com.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testJSON")
public class Controller {

	private static final Logger logger = LoggerFactory.getLogger(Controller.class);

	@RequestMapping(value = "/")
	public String index() {
		logger.info("[m:index] ---------- Index API ----------");
		return "REST API HERE: My API";
	}

}
