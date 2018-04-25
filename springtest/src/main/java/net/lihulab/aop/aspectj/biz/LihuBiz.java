package net.lihulab.aop.aspectj.biz;

import org.springframework.stereotype.Service;

import net.lihulab.aop.aspectj.LihuMethod;

@Service
public class LihuBiz {

    @LihuMethod("LihuBiz save with LihuMethod")
    public String save(String arg) {
		System.out.println("LihuBiz save : " + arg);
//		throw new RuntimeException(" Save failed!");
		return " Save success!";
    }
}