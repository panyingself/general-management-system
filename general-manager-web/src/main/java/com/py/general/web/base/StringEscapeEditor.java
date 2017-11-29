//package com.py.general.web.base;//
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by Fernflower decompiler)
////
//
//
//
//import org.apache.commons.lang.StringEscapeUtils;
//
//import java.beans.PropertyEditorSupport;
//
//public class StringEscapeEditor extends PropertyEditorSupport {
//    private boolean escapeHTML;
//    private boolean escapeJavaScript;
//    private boolean escapeSQL;
//
//    public StringEscapeEditor() {
//    }
//
//    public StringEscapeEditor(boolean escapeHTML, boolean escapeJavaScript, boolean escapeSQL) {
//        this.escapeHTML = escapeHTML;
//        this.escapeJavaScript = escapeJavaScript;
//        this.escapeSQL = escapeSQL;
//    }
//
//    public void setAsText(String text) {
//        if(text == null) {
//            this.setValue((Object)null);
//        } else {
//            String value = text;
//            if(this.escapeHTML) {
//                value = StringEscapeUtils.escapeHtml(text);
//            }
//
//            if(this.escapeJavaScript) {
//                value = StringEscapeUtils.escapeJavaScript(value);
//            }
//
//            if(this.escapeSQL) {
//                value = StringEscapeUtils.escapeSql(value);
//            }
//
//            value = value.trim();
//            this.setValue(value);
//        }
//
//    }
//
//    public String getAsText() {
//        Object value = this.getValue();
//        return value != null?value.toString():"";
//    }
//}
