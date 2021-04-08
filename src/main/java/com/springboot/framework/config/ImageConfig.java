package com.springboot.framework.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 图像处理
 *
 * @author huangpengfei
 * @version 1.0
 * @since 2019/7/16 1:44
 */
@Data
@ConfigurationProperties(prefix = "img")
@Component
public class ImageConfig {
    private Integer width;
    private Integer height;
}
