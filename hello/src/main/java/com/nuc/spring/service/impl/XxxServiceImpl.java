/*
版权所有
*/
package com.nuc.spring.service.impl;

import com.nuc.spring.service.XxxService;
import org.springframework.stereotype.Service;

/**
 * @author 温国涛
 * @version 1.0
 * @date : 14:36 2021/9/26
 */
@Service
public class XxxServiceImpl implements XxxService {
    @Override
    public String hello() {
        System.out.println("wokequnimade");
        return "Hello,springboot,dhy";
    }
}
