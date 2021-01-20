package com.qiongqi.video.guaikavideo.controller.app;

import com.qiongqi.video.guaikavideo.config.Exception.XException;
import com.qiongqi.video.guaikavideo.utils.response.code.ResponseCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 说明
 * @author: ※狗尾巴草
 * @date: 2021-01-20 15:14
 **/
@RestController
@RequestMapping("test")
public class index {

    @GetMapping("index")
    public void index(@RequestParam("i") Integer i){
        System.out.println("i : "+i);

    }


}
