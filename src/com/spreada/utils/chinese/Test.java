package com.spreada.utils.chinese;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2018/5/14 9:28
 */
public class Test {

    public static void main(String[] args) {
        //繁体转简体
        ZHConverter zhConverter1 = ZHConverter.getInstance(ZHConverter.SIMPLIFIED);
        //简体转繁体
        ZHConverter zhConverter2 = ZHConverter.getInstance(ZHConverter.TRADITIONAL);
        System.out.println(zhConverter1.convert("胜多负少的范德萨刊登評論認為"));
        System.out.println(zhConverter2.convert("胜多负少的范德萨刊登評論認為"));
    }
}
