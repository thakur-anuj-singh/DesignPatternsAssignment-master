package net.media.training.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class XMLBuilder {
    private String tagName;
    private String content;
    private List<XMLBuilder> children;
    private List<Attribute> attributes;

    public XMLBuilder(String tagName) {
        this.tagName = tagName;
        this.children = new ArrayList<>();
        this.attributes = new ArrayList<>();
    }

    public XMLBuilder addChild(String tagName) {
        XMLBuilder child = new XMLBuilder(tagName);
        this.children.add(child);
        return child;
    }
    public XMLBuilder addChild(XMLBuilder child) {
        this.children.add(child);
        return child;
    }


    public XMLBuilder addAttribute(String name, String value) {
        this.attributes.add(new Attribute(name, value));
        return this;
    }

    public XMLBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    public String build() {
        StringBuilder xml = new StringBuilder();
        xml.append("<").append(tagName);

        for (Attribute attribute : attributes) {
            xml.append(" ").append(attribute.name).append("=\"").append(attribute.value).append("\"");
        }

        if (children.isEmpty() && (content == null || content.isEmpty())) {
            xml.append("/>");
        } else {
            xml.append(">");

            if (content != null && !content.isEmpty()) {
                xml.append(content);
            }

            for (XMLBuilder child : children) {
                xml.append(child.build());
            }

            xml.append("</").append(tagName).append(">");
        }

        return xml.toString();
    }

    private static class Attribute {
        private String name;
        private String value;

        public Attribute(String name, String value) {
            this.name = name;
            this.value = value;
        }
    }
}
