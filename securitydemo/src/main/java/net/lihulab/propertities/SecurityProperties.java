package net.lihulab.propertities;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "lihulab.security")
public class SecurityProperties {
    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }

    private BrowserProperties browser = new BrowserProperties();
}
