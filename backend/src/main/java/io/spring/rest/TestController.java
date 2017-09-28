package io.spring.rest;

import io.spring.model.Message;
import org.springframework.web.bind.annotation.*;

import io.spring.service.intf.TestService;

import java.util.List;

@RestController
public class TestController {

	private TestService testService;

	public TestController(TestService testService) {
	    this.testService = testService;
    }

	@CrossOrigin(origins = "http://localhost:8080")
	@RequestMapping(value="/get/json", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody List<Message> testGetJson() {
	    return this.testService.test();
	}
}
