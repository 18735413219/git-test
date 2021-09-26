/*
版权所有
*/
package com.nuc.spring.controller;

import com.nuc.spring.service.XxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 温国涛
 * @version 1.0
 * @date : 14:37 2021/9/26
 */
@RestController
public class XxxController {

    @Autowired
    private XxxService xxxService;

    @GetMapping("hello")
    public String hello(){
        return xxxService.hello();
    }
}
