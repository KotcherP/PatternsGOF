package generate.builder.project;

import generate.builder.scheme.WebSiteBuilder;

public class VisitWebSite extends WebSiteBuilder {
    @Override
    public void buildName() {
        webSite.setName("visit site");
    }

    @Override
    public void buildPrice() {
        webSite.setPrice(500);
    }
}
