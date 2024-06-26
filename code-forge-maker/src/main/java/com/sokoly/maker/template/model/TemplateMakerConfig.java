package com.sokoly.maker.template.model;

import com.sokoly.maker.meta.Meta;
import lombok.Data;

/**
 * 模版制作配置
 */
@Data
public class TemplateMakerConfig {

    private Meta meta = new Meta();

    private Long id;

    private String originProjectPath;

    TemplateMakerFileConfig fileConfig = new TemplateMakerFileConfig();

    TemplateMakerModelConfig modelConfig = new TemplateMakerModelConfig();

    // 新增：
    TemplateMakerOutputConfig outputConfig = new TemplateMakerOutputConfig();
}