package com.atguigu.gulimall.product.exception;

import com.atguigu.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.awt.font.TextHitInfo;

@Slf4j
@RestControllerAdvice(basePackages = "com.atguigu.gulimall.product.controller")
public class GulimallExcptionControllerAdvice {

    @ExceptionHandler(value = Throwable.class)
    public R handleValidException(Throwable throwable){
        
        return R.error();
    }
}
