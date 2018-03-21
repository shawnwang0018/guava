package org.shown.collection.guava;

import java.util.Collection;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;

/**
* @Title: MultiMapCase
* @Description: 多值Map示例
* @author xiao.wang
* @date 2018/3/21
* @version V1.0
*/
public class MultiMapCase {
    private static Logger logger = LoggerFactory.getLogger(MultiMapCase.class.getClass());
    public static void main(String[] args) {

        Multimap<String,Integer> map = LinkedHashMultimap.create();
        map.put("k1", 1);
        map.put("k1", 2);
        map.put("k2", 2);
        Collection<Integer> k1List = map.get("k1");
        logger.debug("k1List: {}" ,k1List);
        // 转化为Java Map
        Map<String, Collection<Integer>> stringCollectionMap = map.asMap();
        Collection<Integer> k2List = stringCollectionMap.get("k2");
        logger.debug("k2List: {}" ,k2List);

    }
}
