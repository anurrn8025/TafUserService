package com.aero.TafUserService.Services;

import com.aero.TafUserService.Models.UsersDTO;
import com.aero.TafUserService.Services.Interfaces.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${datastore.ms.url}")
    private String dataStoreUrl;

    private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);

    @Override
    public UsersDTO regUser(UsersDTO regUsers) {
        System.out.println("received id = "+ regUsers.getId());
       /* UsersDTO usersDTO = restTemplate.getForObject(dataStoreUrl + "/" + regUsers.getId(),
                UsersDTO.class);*/
        return restTemplate.postForObject(dataStoreUrl, regUsers, UsersDTO.class);

    }

    @Override
    public UsersDTO getUser(Long userId) {
        System.out.println("received id = "+ userId);
        return restTemplate.getForObject(dataStoreUrl+ "/" +userId, UsersDTO.class);

    }

    @Override
    public String updateUser(Long userId,UsersDTO updateUsers) {
        restTemplate.put(dataStoreUrl+ "/" +userId,updateUsers, UsersDTO.class);
        String resp = "user updated successfully!";
        return resp;
    }
}
