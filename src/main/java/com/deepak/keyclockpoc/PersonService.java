package com.deepak.keyclockpoc;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class  PersonService {
    public List<String> getPersons(){
        return Arrays.asList("deepak" , "kamna" , "dhanuk" , "kabir");
    }
}
