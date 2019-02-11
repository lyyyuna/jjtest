package net.lihulab;

import static org.junit.Assert.assertTrue;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private void login(String configFile, String username, String password) {
        Factory<SecurityManager> factory = new IniSecurityManagerFactory(configFile);

        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        subject.login(token);
    }

    @Test
    public void testPasswordService(){
        login("classpath:shiro-passwordservice.ini", "wu", "123");
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        // 1. 获取 SecurityManager 工厂，此处使用 ini 配置文件初始化 SecurityManager
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        // 2。得到 SecurityManager 实例，并绑定 SecurityUtils
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        // 3. 得到 subject 及创建用户名/密码身份验证 token (即用户名/密码)
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zhang", "1123");
        try {

            subject.login(token);
        } catch (AuthenticationException e) {
            System.out.println("wrong authentication: " + e.getMessage());
        }

        System.out.println(subject.isAuthenticated());

    }

    @Test
    public void testRealm() {
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zhang", "1234");
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(subject.isAuthenticated());
    }

    @Test
    public void testIsPermitted() {
        login("classpath:shiro-roles.ini", "wang", "123");
        Assert.assertTrue(SecurityUtils.getSubject().isPermitted("user:create"));
        Assert.assertFalse(SecurityUtils.getSubject().isPermitted("user:delete"));
        Assert.assertTrue(SecurityUtils.getSubject().isPermitted("user:create:*"));
    }
}
