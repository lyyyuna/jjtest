package net.lihulab.realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

import java.net.PasswordAuthentication;

public class MyRealm1 implements Realm {

    @Override
    public String getName() {
        return "my realm 1";
    }

    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        return authenticationToken instanceof UsernamePasswordToken;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username = (String)authenticationToken.getPrincipal();
        String password = new String((char[])authenticationToken.getCredentials());

        if (!"zhang".equals(username)) {
            throw new UnknownAccountException();
        }
        if (!"1234".equals(password)) {
            throw new IncorrectCredentialsException();
        }

        return new SimpleAuthenticationInfo(username, password, getName());
    }
}
