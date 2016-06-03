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
 * 创建业务接口实例类
 *
 * @author zhangjh
 */
public class ServiceImplClassCreator extends AbstractFileCreator {
    private static ServiceImplClassCreator creator;

    private ServiceImplClassCreator() {
        super();
    }

    private ServiceImplClassCreator(Conf conf) {
        super();
        init(conf);
    }

    public static synchronized ServiceImplClassCreator getInstance(Conf conf) {
        if (null == creator) {
            creator = new ServiceImplClassCreator(conf);
        }
        return creator;
    }

    @Override
    public void createFile(TableInfo tableInfo, Conf conf) throws IOException, TemplateException {
        boolean force = Boolean.parseBoolean(conf.getForce());
        String ftl = "impl.ftl";
        String fileName = tableInfo.getBeanName() + "ServiceImpl.java";
        String selfPath = conf.getService_package() + separator + "impl";

        Map<String, Object> root = new HashMap<String, Object>();
        root.put("table", tableInfo);
        root.put("conf", conf);
        Template temp = cfg.getTemplate(ftl);

        fileName = javaPath + selfPath + separator + fileName;
        createFile(force, fileName, root, temp);
    }

}
