package com.yongren.codeGenerator.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("yongren.code-generator.package-config-info")
public class PackageConfigInfo {
    /**
     * 父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名
     */
    private String parent = "com.yongren";
    /**
     * 父包模块名
     */
    private String moduleName ;
}
