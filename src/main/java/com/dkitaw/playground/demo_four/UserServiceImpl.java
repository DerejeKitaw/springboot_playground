// package com.dkitaw.playground.demo_three;

// import org.springframework.beans.BeanUtils;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// @Service
// public class UserServiceImpl implements UserService {

//   @Autowired
//   UserRepository userRepository;

//   // @Autowired
//   // Utils utils;

//   // @Autowired
//   // BCryptPasswordEncoder bCryptPasswordEncoder;

//   @Override
//   public UserDto createUser(UserDto user) {

//     if (userRepository.findByEmail(user.getEmail()) != null)
//       throw new RuntimeException("Record alredy exists");

//     UserEntity userEntity = new UserEntity();
//     BeanUtils.copyProperties(user, userEntity); // copy userDto to userEntity

//     userEntity.setUserId("testUserId");
//     userEntity.setEncryptedPassword("testpassword");

//     UserEntity storedUserDetails = userRepository.save(userEntity);

//     UserDto returnValue = new UserDto();
//     BeanUtils.copyProperties(storedUserDetails, returnValue);// copy storedUserDetails to returnValue

//     return returnValue;
//   }

//   @Override
//   public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//     return null;
//   }

//   @Override
//   public UserDto getUser(String email) {
// 	return null;
// }

// //   @Override
// //   public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
// //     UserEntity userEntity = userRepository.findByEmail(email);
// //     if(userEntity == null) throw new UsernameNotFoundException(email);
// //     return new User(userEntity.getEmail(), userEntity.getEncryptedPassword(), new ArrayList<>());
// // }

// //   @Override
// //   public UserDto getUser(String email) {
// //     UserEntity userEntity = userRepository.findByEmail(email);
// //     if(userEntity == null) throw new UsernameNotFoundException(email);
// //     UserDto returnValue = new UserDto();
// //     BeanUtils.copyProperties(userEntity, returnValue);
// //     return returnValue;
// //   }
// }