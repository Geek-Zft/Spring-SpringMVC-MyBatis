package com.zft;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Description: 测试Junit
 * @author  fengtan.zhang
 * @date    2019/4/10 0010 下午 2:16
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
public class TestJunit {



    @Test
    public void testJunit() {
        String str = "junit is working";
        assertEquals("junit is working", str);
    }
}
