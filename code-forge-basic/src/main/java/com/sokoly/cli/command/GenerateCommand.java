package com.sokoly.cli.command;

import cn.hutool.core.bean.BeanUtil;
import com.sokoly.generator.MainGenerator;
import com.sokoly.model.MainTemplateConfig;
import lombok.Data;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Command(name="generate",description="生成代码",mixinStandardHelpOptions = true)
@Data
public class GenerateCommand implements Callable<Integer> {
    @Option(names = {"-l", "--loop"}, arity = "0..1", description = "是否循环",interactive = true, echo = true)
    private boolean loop;
    @Option(names = {"-a", "--author"}, arity = "0..1", description = "作者",interactive = true, echo = true)
    private String author = "sokoly";
    @Option(names = {"-o", "--outputText"}, arity = "0..1", description = "输出文本",interactive = true, echo = true)
    private String outputText = "sum =";
    public Integer call () throws Exception {
        MainTemplateConfig mainTemplateconfig = new MainTemplateConfig();
        BeanUtil.copyProperties(this, mainTemplateconfig);
        System.out.println("配置信息：" + mainTemplateconfig);
        MainGenerator.doGenerate(mainTemplateconfig);
        return 0;
    }
}
