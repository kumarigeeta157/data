package com.storeData.data;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class DataController {
    @RequestMapping("/data")

   public List<Data> retriveList1(){
        return Arrays.asList(
                new Data(1 , "kamal" , 232134),
                new Data(2 , "harsh" , 123423)

        );

    }
}
