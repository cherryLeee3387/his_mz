package com.neuedu.his.common.util;

import lombok.val;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 给病历数据生成主键（线程不安全）
 */
public class CaseHistoryIdGenerator {

    private static Date date=new Date();
    private static String dateStr=null;
    private static Integer seq=0;

    //时间戳+数字序列
    public String gen(){
        //1、生成新的id时，seq+1 2、日期如果过了一天，dateStr需要变化，并且seq需要清零
        //1、获取日期前缀 dateStr
        String id=genPrefix()+genSuffix();
        return id;
    }

    //生成后缀：给seq补0，同事seq+1
    private static String genSuffix() {
        String suffix=String.format("%04d",seq);   //%代表要格式化  0代表要补的数字是0 4表示补完之后一共长度是4 d代表正整形
        seq+=1;
        return suffix;
    }

    //生成前缀
    private static String genPrefix(){
        Date current = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String currStr=sdf.format(current);
        //currStr=2019-07-09 dateStr=2019-07-08
        if(!currStr.equals(dateStr)){
            dateStr=currStr;
            seq=0;
        }
        return dateStr;
    }
}
