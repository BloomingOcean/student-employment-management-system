import io.github.swagger2markup.GroupBy;
import io.github.swagger2markup.Language;
import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.Swagger2MarkupConverter;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;
import io.github.swagger2markup.markup.builder.MarkupLanguage;

import java.net.URL;
import java.nio.file.Paths;

public class SwaggerTo {

    /**
     * 生成AsciiDocs格式文档
     * @throws Exception
     */
    public static void generateAsciiDocs() throws Exception {
        //    输出Ascii格式
        Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
                .withMarkupLanguage(MarkupLanguage.ASCIIDOC)
                .withOutputLanguage(Language.ZH)
                .withPathsGroupedBy(GroupBy.TAGS)
                .withGeneratedExamples()
                .withoutInlineSchema()
                .build();

        Swagger2MarkupConverter.from(new URL("http://localhost:7489/v2/api-docs"))
                .withConfig(config)
                .build()
                .toFolder(Paths.get("./doc/asciidoc/generated"));
    }

    /**
     * 生成Markdown格式文档
     * @throws Exception
     */
    public static void generateMarkdownDocs() throws Exception {
        //    输出Markdown格式
        Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
                .withMarkupLanguage(MarkupLanguage.MARKDOWN)
                .withOutputLanguage(Language.ZH)
                .withPathsGroupedBy(GroupBy.TAGS)
                .withGeneratedExamples()
                .withoutInlineSchema()
                .build();

        Swagger2MarkupConverter.from(new URL("http://localhost:7489/v2/api-docs"))
                .withConfig(config)
                .build()
                .toFolder(Paths.get("./doc/markdown/generated"));
    }
//  /**
//   * 生成Confluence格式文档
//   * @throws Exception
//   */
//  @Test
//  public void generateConfluenceDocs() throws Exception {
//      //    输出Confluence使用的格式
//      Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
//              .withMarkupLanguage(MarkupLanguage.CONFLUENCE_MARKUP)
//              .withOutputLanguage(Language.ZH)
//              .withPathsGroupedBy(GroupBy.TAGS)
//              .withGeneratedExamples()
//              .withoutInlineSchema()
//              .build();
//
//      Swagger2MarkupConverter.from(new URL("http://localhost:7489/v2/api-docs"))
//              .withConfig(config)
//              .build()
//              .toFolder(Paths.get("./docs/confluence/generated"));
//  }

    /**
     * 生成AsciiDocs格式文档,并汇总成一个文件
     * @throws Exception
     */
    public static void generateAsciiDocsToFile() throws Exception {
        //    输出Ascii到单文件
        Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
                .withMarkupLanguage(MarkupLanguage.ASCIIDOC)
                .withOutputLanguage(Language.ZH)
                .withPathsGroupedBy(GroupBy.TAGS)
                .withGeneratedExamples()
                .withoutInlineSchema()
                .build();

        Swagger2MarkupConverter.from(new URL("http://localhost:7489/v2/api-docs"))
                .withConfig(config)
                .build()
                .toFile(Paths.get("./doc/asciidoc/generated/all"));
    }

    /**
     * 生成Markdown格式文档,并汇总成一个文件
     * @throws Exception
     */
    public static void generateMarkdownDocsToFile() throws Exception {
        //    输出Markdown到单文件
        Swagger2MarkupConfig config = new Swagger2MarkupConfigBuilder()
                .withMarkupLanguage(MarkupLanguage.MARKDOWN)
                .withOutputLanguage(Language.ZH)
                .withPathsGroupedBy(GroupBy.TAGS)
                .withGeneratedExamples()
                .withoutInlineSchema()
                .build();

        Swagger2MarkupConverter.from(new URL("http://localhost:7489/v2/api-docs"))
                .withConfig(config)
                .build()
                .toFile(Paths.get("./doc/markdown/generated/all"));
    }

    public static void main(String[] args) {
        try {
            generateMarkdownDocs();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}