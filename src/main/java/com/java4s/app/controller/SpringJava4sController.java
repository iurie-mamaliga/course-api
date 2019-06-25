/* 
 * Author ::. Sivateja Kandula | www.java4s.com 
 *
 */

package com.java4s.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringJava4sController {

	@RequestMapping("/java4s-spring-boot-ex-tomcat")
	public String customerInformation() {
		
		return "Hey, I am from external tomcat";
	}

}