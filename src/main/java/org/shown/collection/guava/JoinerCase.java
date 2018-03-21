package org.shown.collection.guava;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author WSH8690
 */
public class JoinerCase {
    private static Logger logger = LoggerFactory.getLogger(JoinerCase.class.getClass());
    public static void main(String[] args) {
        List<String> list = ImmutableList.of("aa","bb","cc");
        String join = Joiner.on("-").join(list);
        logger.debug("Joiner result: {}",join);
    }
}
