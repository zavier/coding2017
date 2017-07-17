package com.coderising.dp.builder;

public class TagBuilder {

    private TagNode rootNode;
    private TagNode parentNode;
	private TagNode currentNode;
	
	public TagBuilder(String rootTagName){
		rootNode = currentNode = new TagNode(rootTagName);
	}
	
	public TagBuilder addChild(String childTagName){
		TagNode tagNode = new TagNode(childTagName);
		currentNode.add(tagNode);
		parentNode = currentNode;
		currentNode = tagNode;
		return this;
	}
	public TagBuilder addSibling(String siblingTagName){
	    TagNode tagNode = new TagNode(siblingTagName);
        parentNode.add(tagNode);
		currentNode = tagNode;
		return this;
		
	}
	public TagBuilder setAttribute(String name, String value){
		currentNode.setAttribute(name, value);
		return this;
	}
	public TagBuilder setText(String value){
		currentNode.setValue(value);
		return this;
	}
	public String toXML(){
		return rootNode.toXML();
	}
}
