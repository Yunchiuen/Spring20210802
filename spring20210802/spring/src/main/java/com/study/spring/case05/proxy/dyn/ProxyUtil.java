package com.study.spring.case05.proxy.dyn;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyUtil {
	private Object object;

	public ProxyUtil(Object object) {
		super();
		this.object = object;
	}

	public Object getProxy() {
		// 類別載入器
		ClassLoader loader = getClass().getClassLoader();
		// 目標所實做的介面
		Class[] interfaces = object.getClass().getInterfaces();
		// 處理代理的實現
		InvocationHandler handler = (Object proxy, Method method, Object[] args) -> {
			Object result = null;
			try {
				// 前置通知
				MyLogger.before(object.getClass(), method.getName(), args);
				result = method.invoke(object, args);
				return result;
			} catch (Exception e) {
				// e.printStackTrace(System.out);
				// 例外異常通知
				MyLogger.throwing(object.getClass(), e.getMessage());
			} finally {
				// 後置通知
				MyLogger.end(object.getClass(), method.getName(), result);
			}
			return result;
		};

		Object proxyObj = Proxy.newProxyInstance(loader, interfaces, handler);
		return proxyObj;
	}

}
