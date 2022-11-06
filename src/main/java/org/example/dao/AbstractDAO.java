package org.example.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.utils.BaseUtils;

/**
 * @author "Khazratov Aslonbek"
 * @since 10/07/2022 01:58 (Monday)
 * quiz-app-console-master/IntelliJ IDEA
 */
public class AbstractDAO<D extends BaseDAO> {

    protected final D dao;

    protected final Gson gson;
    protected final BaseUtils utils;

    public AbstractDAO(D dao, BaseUtils utils) {
        this.dao = dao;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        this.utils = utils;
    }
}
