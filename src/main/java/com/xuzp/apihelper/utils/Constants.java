package com.xuzp.apihelper.utils;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * @author za-xuzhiping
 * @Date 2017/12/7
 * @Time 17:19
 */
public interface Constants {

    String ENUM = "Enum";
    String URL_SPLIT = "/";
    String LF = "\n";
    String STRING_ARRAY_TYPE_NAME = "java.lang.String[]";
    String LONG_ARRAY_TYPE_NAME= "java.lang.Long[]";
    String INTEGER_ARRAY_TYPE_NAME= "java.lang.Integer[]";
    String LONG_ARRAY_BASIC_TYPE_NAME = "long[]";
    String INT_ARRAY_BASIC_TYPE_NAME = "int[]";
    String STRING_LIST_TYPE_NAME = "java.util.List<java.lang.String>";
    String INTEGER_LIST_TYPE_NAME = "java.util.List<java.lang.Integer>";
    String LONG_LIST_TYPE_NAME = "java.util.List<java.lang.Long>";
    String COLLECTION_TYPE_NAME = "java.util.Collection";
    String MULTIPARTFILE = "org.springframework.web.multipart.MultipartFile";
    String OBJECT_TYPE_NAME = "java.lang.Object";
    String MAP_TYPE_NAME = "java.util.Map";
    String ENCODING = "UTF-8";
    String DOT = ".";
    String SPLIT_MARK = ";";
    String COMMENT_MARK = "*";
    int MAX_RECURSION = 4;
    String JAVA = "java";

    String CONTENT_TYPE = "Content-Type";
    String REQUEST_MAPPING = "RequestMapping";
    String GET_MAPPING = "GetMapping";
    String PUT_MAPPING = "PutMapping";
    String POST_MAPPING = "PostMapping";
    String DELETE_MAPPING = "DeleteMapping";
    Set<String> REQUEST_MAPPINGS = Sets.newHashSet(REQUEST_MAPPING, POST_MAPPING, PUT_MAPPING, DELETE_MAPPING, GET_MAPPING);
    String VOID = "void";

    String DEFAULT_PAGABLE_CLASS_NAME = "Page";
    String DEFAULT_MODULE_NAME = "new_module";
    String DEFAULT_REQUEST_URL = "http://127.0.0.1:8080";
    String DEFAULT_OUTPUT_FOLDER = "__autoAPI";
    String API_DOC_FOLDER = "apidoc";
    String POSTMAN_FOLDER = "postman";
    String MARKDOWN_FOLDER = "markdown";
    String TEXT_FILE_SUFFIX = ".txt";
    String JSON_FILE_SUFFIX = ".json";
    String MARKDOWN_FILE_SUFFIX = ".md";
    /**
     * Property Area
     */
    String PROPERTY_FILE = "apiHelper.properties";
    String COMMENT_PATH = "commentPath";
    String OUTPUT_PATH = "outputPath";
    String CLASS_PATH = "classPath";
    String SERVICE_PATH = "servicePath";
    String MODULE_PATH = "modulePath";
    String REQUEST_URL = "requestURL";
    String PAGABLE_CLASS_NAME = "pagableClassName";
    String TEMPLATE_PATH = "templatePath";
    String MOCK_DATA_PATH = "mockDataPath";
    String SHOW_JSON_COMMENT = "showJSONComment";

    String TEMPLATE_DEFAULT_PATH = "template";

    String SCHEMA_V2_1_0 = "https://schema.getpostman.com/json/collection/v2.1.0/collection.json";
    String POST = "POST";
    String PUT = "PUT";
    String GET = "GET";
    String DELETE = "DELETE";

    int PORT_80 = 80;

    String API_DOC_PARAM_LIST_TEMPLATE = " * @apiParam {`PARAM_TYPE`} `PARAM_NAME` `PARAM_DESC`";
    String MARKDOWN_PARAM_LIST_TEMPLATE = "| `PARAM_NAME` | `PARAM_TYPE` | `PARAM_DESC` | `PARAM_IS_OPTIONAL`|";

    String RESPONSE_JSON_FTL = "response_json.ftl";
    String HELP_FTL = "help.ftl";
    String MARKDOWN_TEMPLATE_FTL = "markdown_template.ftl";
    String APIDOC_TEMPLATE_FTL = "apidoc_template.ftl";

    String PARAM_PATH = "PATH";
    String PARAM_DESC = "DESC";
    String PARAM_APINAME = "APINAME";
    String PARAM_APIGROUP = "APIGROUP";
    String PARAM_APIMETHOD = "APIMETHOD";
    String PARAM_LABELNAME = "LABELNAME";
    String PARAM_PARAM_LIST = "PARAM_LIST";
    String PARAM_PARAM_LIST_STRING = "PARAM_LIST_STRING";
    String PARAM_REQUEST_JSON = "REQUEST_JSON";
    String PARAM_RESPONSE_JSON = "RESPONSE_JSON";
}


