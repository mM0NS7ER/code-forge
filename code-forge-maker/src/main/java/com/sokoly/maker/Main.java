package com.sokoly.maker;

import com.sokoly.maker.generator.main.MainGenerator;
import freemarker.template.TemplateException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
        MainGenerator mg = new MainGenerator();
        mg.doGenerate();
    }
}
