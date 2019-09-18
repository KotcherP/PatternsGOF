package generate.builder.scheme;

public abstract class WebSiteBuilder {
    protected WebSite webSite;

    public void createWebSite(){
        webSite = new WebSite();
    }

    public abstract void buildName();
    public abstract void buildPrice();

    public WebSite getWebSite(){
        return webSite;
    }
}
