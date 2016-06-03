package com.cnfwsy.freemarker.creator.impl;

import com.cnfwsy.freemarker.bean.Conf;
import com.cnfwsy.freemarker.bean.TableInfo;
import com.cnfwsy.freemarker.creator.AbstractFileCreator;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 创建业务接口类
 *
 * @author zhangjh
 */
public class ServiceClassCreator extends AbstractFileCreator {
    private static ServiceClassCreator creator;

    private ServiceClassCreator() {
        super();
    }

    private ServiceClassCreator(Conf conf) {
        super();
        init(conf);
    }

    public static synchronized ServiceClassCreator getInstance(Conf conf) {
        if (null == creator) {
            creator = new ServiceClassCreator(conf);
        }
        return creator;
    }

    @Override
    public void createFile(TableInfo tableInfo, Conf _conf) throws IOException, TemplateException {
        boolean force = Boolean.parseBoolean(conf.getForce());
        String ftl = "service.ftl";
        String fileName = "I" + tableInfo.getBeanName() + "Service.java";
        String selfPath = conf.getService_package();

        Map<String, Object> root = new HashMap<String, Object>();
        root.put("table", tableInfo);
        root.put("conf", conf);
        Template temp = cfg.getTemplate(ftl);
        fileName = javaPath + selfPath + separator + fileName;
        createFile(force, fileName, root, temp);
    }

}
