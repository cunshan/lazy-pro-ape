package com.cunshan.lpa.common.config.dubbo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="dubbo.provider")
public class DubboProvider {

	/**
	 * 服务的超时时间,单位毫秒
	 */
	private int timeout = 10000;

	/**
	 * 调用失败重试次数
	 */
	private int retries = 0;

	/**
	 * 是否延迟暴露,-1表示不延迟暴露
	 */
	private int delay = -1;

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public int getRetries() {
		return retries;
	}

	public void setRetries(int retries) {
		this.retries = retries;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	
	
}
