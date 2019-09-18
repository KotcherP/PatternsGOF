package generate.builder.control;

import generate.builder.scheme.WebSite;
import generate.builder.scheme.WebSiteBuilder;

//определяет порядок создания составных частей объекта,чтобы скрыть реализацию от клиента
public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }

    public WebSite buildWebSite(){
        builder.createWebSite();
        builder.buildName();
        builder.buildPrice();

        return builder.getWebSite();
    }
}
