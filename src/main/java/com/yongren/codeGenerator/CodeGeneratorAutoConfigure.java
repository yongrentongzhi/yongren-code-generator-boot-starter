package com.yongren.codeGenerator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.yongren.codeGenerator.properties.DataSourceConfigInfo;
import com.yongren.codeGenerator.properties.GlobalConfigInfo;
import com.yongren.codeGenerator.properties.PackageConfigInfo;
import com.yongren.codeGenerator.properties.StrategyConfigInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置代码生成器属性
 *
 * @author yongren
 * @date 2021/7/15
 * @since 1.0
 */
@EnableConfigurationProperties(
                {GlobalConfigInfo.class,
                DataSourceConfigInfo.class,
                StrategyConfigInfo.class,
                PackageConfigInfo.class})
@Configuration
public class CodeGeneratorAutoConfigure {
    @Autowired
    private GlobalConfigInfo globalConfigInfo;
    @Autowired
    private DataSourceConfigInfo dataSourceConfigInfo;
    @Autowired
    private StrategyConfigInfo strategyConfigInfo;
    @Autowired
    private PackageConfigInfo packageConfigInfo;

    @Bean
    public AutoGenerator getAutoGenerator(){
        AutoGenerator autoGenerator=new AutoGenerator();

        BeanUtils.copyProperties(dataSourceConfigInfo,autoGenerator.getDataSource());
        BeanUtils.copyProperties(globalConfigInfo,autoGenerator.getGlobalConfig());
        BeanUtils.copyProperties(strategyConfigInfo,autoGenerator.getStrategy());
        BeanUtils.copyProperties(packageConfigInfo,autoGenerator.getPackageInfo());
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setXml(null);
        autoGenerator.setTemplate(templateConfig);

        return autoGenerator;
    }

}
