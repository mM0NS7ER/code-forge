package ${basePackage}.generator;

import cn.hutool.core.io.FileUtil;

public class StaticGenerator {
    /**
     * 拷贝文件（实现方式1：Hutool实现）
     *
     * @param inputPath  输入目录
     * @param outputPath 输出目录
     */
    public static void copyFilesByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }
}