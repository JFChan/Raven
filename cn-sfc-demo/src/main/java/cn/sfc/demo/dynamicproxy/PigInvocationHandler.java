package cn.sfc.demo.dynamicproxy;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName: PigInvocationHandler <br/>
 * @Function: TODO ADD FUNCTION. <br/>
 * @Reason: TODO ADD REASON. <br/>
 * @Date: 2019/5/21 18:19<br/>
 * @author: Jeff
 * @see
 * @since JDK 1.7-1.8
 * 佛祖保佑,永无BUG
 */
@AllArgsConstructor
public class PigInvocationHandler<T> implements InvocationHandler {

    private T target;


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.err.println("######代理开始######");
        Object invoke = method.invoke(target, args);
        System.err.println("######代理结束######");
        return invoke;
    }
}
