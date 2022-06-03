package com.example.yq.annotation.service;

/**
 * @author yangqiang
 * @create 2022-05-28 23:30
 */
public class SetterBean {
	public interface IService {} //@1

	public static class ServiceA implements IService {} //@2

	public static class ServiceB implements IService {} //@3

	private IService service;

	public void setService(IService service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return "SetterBean{" +
				"service=" + service +
				'}';
	}
}
