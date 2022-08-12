package com.fwzgsp.layui1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CrosConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")// 所有的当前站点的请求地址，都支持跨域访问。

                .allowedOriginPatterns("*")
                .allowCredentials(true) // 是否支持跨域用户凭证
                .allowedMethods("GET", "POST", "PUT", "DELETE","PATCH") // 当前站点支持的跨域请求类型是什么。
                .maxAge(3600); // 超时时长设置为1小时。 时间单位是秒。
    }
}
