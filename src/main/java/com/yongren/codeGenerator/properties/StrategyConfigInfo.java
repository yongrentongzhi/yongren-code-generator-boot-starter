package com.yongren.codeGenerator.properties;

import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashSet;
import java.util.Set;

/**
 * 生成策略的配置信息
 * @author yongren
 * @date 2021/7/16
 * @since 1.0
 */
@Data
@ConfigurationProperties("yongren.code-generator.strategy-config-info")
public class StrategyConfigInfo {
    /**
     * 生成 <code>@RestController</code> 控制器
     * <pre>
     *      <code>@Controller</code> -> <code>@RestController</code>
     * </pre>
     */
    private boolean restControllerStyle = true;
    /**
     * 需要包含的表名
     *
     */
    private  String[] include ;

    /**
     * 数据库表映射到实体的命名策略
     */
    private NamingStrategy naming = NamingStrategy.underline_to_camel;
    /**
     * 【实体】是否为lombok模型（默认 false）<br>
     * <a href="https://projectlombok.org/">document</a>
     */
    private boolean entityLombokModel = true;
}
