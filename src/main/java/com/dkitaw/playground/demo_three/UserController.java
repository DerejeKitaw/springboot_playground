package com.dkitaw.playground.demo_three;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // @RestController known as a stereotype annotation. 
@RequestMapping("users")
public class UserController {

@GetMapping
public String getUser() {
 return "Demo three Hello World!";
 }
@PostMapping
public UserResponse createUser(@RequestBody UserDetailsRequestModel userDetails) {
  UserResponse returnValue = new UserResponse();
  UserDto userDto = new UserDto();
  BeanUtils.copyProperties(userDetails, userDto);
  
  UserDto createUser = userDto;
  BeanUtils.copyProperties(createUser, returnValue);


  return returnValue;
 }

}