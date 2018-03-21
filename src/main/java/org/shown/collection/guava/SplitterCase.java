package org.shown.collection.guava;

import com.google.common.base.Splitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


/**
* @Title: SplitterCase
* @Description: 字符串分割组成新的List
* @author xiao.wang
* @date 2018/3/21
* @version V1.0
*/
public class SplitterCase {
    private static Logger logger = LoggerFactory.getLogger(SplitterCase.class.getClass());
    public static void main(String[] args) {
        String str = "1-2-3-4- 5- 6 --7 ";
        List<String> list =  Splitter.on("-").omitEmptyStrings().trimResults().splitToList(str);
        logger.debug("list: {}",list);
    }
}
