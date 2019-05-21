package cn.sfc.demo.dynamicproxy;

/**
 * @ClassName: Pig <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2019/5/21 18:03<br/>
 * @author: Jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */

public class Pig implements Animal {

    public void eat(Food food) {
        System.err.println("我吃了" + food);
    }
}
