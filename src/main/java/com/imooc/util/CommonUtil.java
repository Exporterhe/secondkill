package com.imooc.util;

import com.imooc.error.BusinessException;
import com.imooc.error.EnumError;
import org.springframework.util.DigestUtils;

import java.io.UnsupportedEncodingException;

public class CommonUtil {

    public static String md5(String value) throws BusinessException {
        try {
            return DigestUtils.md5DigestAsHex(value.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException ex){
            throw new BusinessException(EnumError.PARAMETER_VALIDATION_ERROR);
        }
    }

    public static void main(String[] args) throws BusinessException {
        System.out.println(md5("123456"));
    }

    private CommonUtil(){
        throw new IllegalArgumentException();
    }
}
