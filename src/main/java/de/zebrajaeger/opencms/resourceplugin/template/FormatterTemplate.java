package de.zebrajaeger.opencms.resourceplugin.template;

/**
 * Created by lars on 11.02.2017.
 */
public class FormatterTemplate extends FileTemplate {
    private String name;

    public FormatterTemplate(String name) {
        super("templates/formatter.jsp");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}