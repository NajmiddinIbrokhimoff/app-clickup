package uz.ibrokhimoff.appclickup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import uz.ibrokhimoff.appclickup.entity.User;
import uz.ibrokhimoff.appclickup.entity.enums.SystemRoleName;
import uz.ibrokhimoff.appclickup.payload.ApiResponse;
import uz.ibrokhimoff.appclickup.payload.RegisterDTO;
import uz.ibrokhimoff.appclickup.repository.UserRepository;

@Service
public class AuthService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    //TODO kod yozamiz
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return null;
    }

    /*public ApiResponse registerUser(RegisterDTO registerDTO) {

        if (userRepository.existsByEmail(registerDTO.getEmail())) {
            return new ApiResponse("Bunday User Mavjud", false);

           *//* User user = new User(
                    registerDTO.getFullName(),
                    registerDTO.getEmail(),
                    passwordEncoder.encode(registerDTO.getPassword()),
                    SystemRoleName.SYSTEM_USER
            );*//*

            userRepository.save(user);
        }
        return  null;
    }*/

  /*  public Boolean sendEmail(String sendingEmail,String emailCode){
        try{
            SimpleMailMessage mailMessage=new SimpleMailMessage();
            mailMessage.setFrom("Test@pdp.com");
            mailMessage.setTo(sendingEmail);
            mailMessage.setSubject("Akkauntni Tasdiqlash");
            mailMessage.setText(emailCode);
            javaMailSender.send(mailMessage);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }*/
}
