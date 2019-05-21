package cn.sfc.demo.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName: DynamicProxyTest <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2019/5/21 18:22<br/>
 * @author: Jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        Pig pig = new Pig();
        PigInvocationHandler<Pig> pigPigInvocationHandler = new PigInvocationHandler<Pig>(pig);

        Animal animal = (Animal) Proxy.newProxyInstance(Animal.class.getClassLoader(),
                new Class<?>[]{Animal.class}, pigPigInvocationHandler);
        animal.eat(new Food("西瓜", "绿色", "水果", "10斤"));
    }
}
