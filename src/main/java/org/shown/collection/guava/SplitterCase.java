package org.shown.collection.guava;

import com.google.common.base.Splitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 *
 * @author WSH8690
 * @date 2018/3/1
 */
public class SplitterCase {
    private static Logger logger = LoggerFactory.getLogger(SplitterCase.class.getClass());
    public static void main(String[] args) {
        String str = "1-2-3-4- 5- 6 --7 ";
        List<String> list =  Splitter.on("-").omitEmptyStrings().trimResults().splitToList(str);
        logger.debug("list: {}",list);
    }
}
