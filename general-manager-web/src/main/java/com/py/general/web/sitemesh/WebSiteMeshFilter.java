package com.py.general.web.sitemesh;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 * Created by huanghe on 2017/7/2.
 */
public class WebSiteMeshFilter extends ConfigurableSiteMeshFilter {

    public static final String DECORATOR_URL="/decorator/index";

    /**
     * decoratorPath 第一个参数配置被模板装饰的页面  第二个参数为模板页
     * @param builder
     */
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.addDecoratorPath("/", DECORATOR_URL)
                .addDecoratorPath("/test", DECORATOR_URL)
                .addExcludedPath("/test1")//不需要装饰的路径
                .addExcludedPath(DECORATOR_URL);
    }
}
