package com.sokoly.maker.generator.main;

import freemarker.template.TemplateException;

import java.io.IOException;

public class MainGenerator extends GenerateTemplate {
    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
        MainGenerator mg = new MainGenerator();
        mg.doGenerate();
    }

//    @Override
//    protected void buildDist(String outputPath, String sourceCopyDestPath, String jarPath, String shellOutputFilePath) {
//        System.out.println("不输出dist");
//    }
}

