package net.lihulab.aop.api;

public class BizLogicImpl implements BizLogic {
    @Override
    public String save() {
		System.out.println("BizLogicImpl : BizLogicImpl save.");
		return "BizLogicImpl save.";
    }
}