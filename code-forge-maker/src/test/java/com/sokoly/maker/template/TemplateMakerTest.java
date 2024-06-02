package com.sokoly.maker.template;

import cn.hutool.core.io.resource.ResourceUtil;
import cn.hutool.json.JSONUtil;
import com.sokoly.maker.template.model.TemplateMakerConfig;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemplateMakerTest {

    /**
     * 使用 JSON 制作模板
     */
    @Test
    public void testMakeTemplateWithJSON(){
        String configStr = ResourceUtil.readUtf8Str("templateMaker.json");
        TemplateMakerConfig templateMakerConfig = JSONUtil.toBean(configStr, TemplateMakerConfig.class);
        long id = TemplateMaker.makeTemplate(templateMakerConfig);
        System.out.println(id);
    }
}