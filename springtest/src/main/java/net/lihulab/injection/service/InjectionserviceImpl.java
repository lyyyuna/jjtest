package net.lihulab.injection.service;

import net.lihulab.injection.dao.InjectionDao;

public class InjectionserviceImpl implements InjectionService {
    private InjectionDao injectionDao;

    // 构造器注入
    public InjectionserviceImpl(InjectionDao dao) {
        injectionDao = dao;
    }

    public void setInjectionDao(InjectionDao dao) {
        injectionDao = dao;
    }
    // set 注入
    public void say(String s) {
        System.out.println("injection: InjectionserviceImple says: " + s);
        injectionDao.save(s);
    }
}