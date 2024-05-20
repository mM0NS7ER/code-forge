# ${name}

> ${description}
>
> 作者：${author}
>
> 基于 [SOKOLY](https://blog.csdn.net/m0_50765373) 的 [创码空间项目](https://github.com/mM0NS7ER/code-forge) 制作，感谢您的使用！

可以通过命令行交互式输入的方式动态生成想要的项目代码

## 如何使用

执行项目根目录下的脚本文件：

```
generator <命令> <选项参数>
        ```

        示例命令：

        ```
        generator generate <#list modelConfig.models as modelInfo><#if modelInfo.groupKey??><#else>-${modelInfo.abbr}</#if> </#list>
        ```

        ## 参数说明

        <#list modelConfig.models as modelInfo>
        <#if modelInfo.groupKey??>
        <#else >
        ${modelInfo?index + 1}）${modelInfo.fieldName}

        类型：${modelInfo.type}

        描述：${modelInfo.description}

        默认值：${modelInfo.defaultValue?c}

        缩写： -${modelInfo.abbr}
        </#if>

</#list>
```


## 额外的话

🎉 🎊 非常感谢您访问这个项目！这个项目是我们团队的辛勤努力的成果，我们真心希望它能为您带来帮助和乐趣。如果您觉得这个项目对您有帮助，或者您欣赏我们的工作，那么请不要吝啬您的点赞和星星🌟！

🌈 **每一颗星星都是对我们工作的认可和鼓励！** 就像彩虹的每一道颜色都为我们带来希望和喜悦一样，您的星星也会为我们的项目增添更多的光彩。

🚀 **让我们携手共进，一起为开源社区贡献更多的力量！** 点击页面右上角的星星图标，为我们的项目投上您宝贵的一票吧！

💖 **再次感谢您的关注和支持！** 愿您在这个项目中收获满满，与我们一起成长和进步！
