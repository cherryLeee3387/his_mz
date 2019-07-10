package com.neuedu.his.common.util;

import java.util.UUID;

/**
 * 生成uuid的主键（id）
 */
public class CommonIdGenerator  {

    public static String gen() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
