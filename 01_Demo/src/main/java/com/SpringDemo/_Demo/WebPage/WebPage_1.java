package com.SpringDemo._Demo.WebPage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebPage_1 {
@GetMapping("/")	
public String pageLoader() {
	return "Hai this is Web page ";
}
}
