package com.yongren.codeGenerator.properties;

import com.baomidou.mybatisplus.generator.config.rules.DateType;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 全局配置信息
 * @author yongren
 * @date 2021/7/16
 * @since 1.0
 */
@Data
@ConfigurationProperties("yongren.code-generator.global-config-info")
public class GlobalConfigInfo {

    /**
     * 生成文件的输出目录
     */
    private String outputDir = System.getProperty("user.dir")+"/src/main/java";

    /**
     * 是否覆盖已有文件
     */
    private boolean fileOverride = true;

    /**
     * 是否打开输出目录
     */
    private boolean open = false;

    /**
     * 是否在xml中添加二级缓存配置
     */
    private boolean enableCache = true;

    /**
     * 开发人员
     */
    private String author = "yongren";

    /**
     * 开启 swagger2 模式
     */
    private boolean swagger2 = true;
    /**
     * 开启 BaseResultMap
     */
    private boolean baseResultMap = true;


    /**
     * 开启 baseColumnList
     */
    private boolean baseColumnList = true;


}
