package com.sokoly.generator;

import cn.hutool.core.io.FileUtil;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * 第二期の核心生成器
 */
public class MainGenerator {
    /**
     * 生成静态文件和动态文件
     *
     * @param model
     * @throws TemplateException
     * @throws IOException
     */
    public static void doGenerate(Object model) throws TemplateException, IOException {
        String inputRootPath = "E:\\Develop\\project\\yupi_xingqiu\\code-forge\\code-forge-demo-projects\\acm-template-pro";
        String outputRootPath= "E:\\Develop\\project\\yupi_xingqiu\\code-forge\\acm-template-pro";
        if (!FileUtil.exist(outputRootPath)) {
            FileUtil.mkdir(outputRootPath);
        }
        String inputPath;
        String outputPath;

        inputPath =new File(inputRootPath,"src/com/yupi/acm/MainTemplate.java.ftl").getAbsolutePath();
        outputPath= new File(outputRootPath,"src/com/yupi/acm/MainTemplate.java").getAbsolutePath();
        DynamicGenerator.doGenerate(inputPath,outputPath,model);

        inputPath =new File(inputRootPath,".gitignore").getAbsolutePath();
        outputPath =new File(outputRootPath,".gitignore").getAbsolutePath();
        StaticGenerator.copyFilesByHutool(inputPath,outputPath);

        inputPath =new File(inputRootPath,"README.md").getAbsolutePath();
        outputPath =new File(outputRootPath,"README.md").getAbsolutePath();
        StaticGenerator.copyFilesByHutool(inputPath,outputPath);

    }
}
