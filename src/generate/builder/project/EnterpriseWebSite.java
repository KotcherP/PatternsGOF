package generate.builder.project;

import generate.builder.scheme.WebSiteBuilder;

public class EnterpriseWebSite extends WebSiteBuilder {
    @Override
    public void buildName() {
        webSite.setName("enterprise site");
    }

    @Override
    public void buildPrice() {
        webSite.setPrice(10000);
    }
}
