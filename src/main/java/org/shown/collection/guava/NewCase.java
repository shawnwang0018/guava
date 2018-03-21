package org.shown.collection.guava;

import java.util.List;
import java.util.Set;

import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * @author xiao.wang
 * @version V1.0
 * @Title: NewCase
 * @Description: 测试利用guava完成集合的创建
 * @date 2018/3/21
 */
public class NewCase {
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(SplitterCase.class.getClass());
    public static void main(String[] args) {
        // 普通Collection的创建
        List<String> list = Lists.newArrayList();
        Set<String> set = Sets.newHashSet();
        //Map<String, String> map = Maps.newHashMap();
        // 不变Collection的创建
        ImmutableList<String> iList = ImmutableList.of("a", "b", "c");
        ImmutableSet<String> iSet = ImmutableSet.of("e1", "e2");
        ImmutableMap<String, String> iMap = ImmutableMap.of("k1", "v1", "k2", "v2");
        list.add("a");
        list.add("b");
        list.add("c");
        set.add("a");
        set.add("b");
        set.add("c");
        logger.debug("list result: {}", list);
        logger.debug("set result:  {}" , set);
        logger.debug("isList result: {}" , iList);
        logger.debug("iSet result: {}" , iSet);
        logger.debug("iMap result: {}" , iMap);
    }
}
