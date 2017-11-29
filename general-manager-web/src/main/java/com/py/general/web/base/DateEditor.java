package com.py.general.web.base;


import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateEditor extends PropertyEditorSupport {
    DateEditor() {
    }

    public void setAsText(String text) throws IllegalArgumentException {
        if(!StringUtils.isEmpty(text)) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = null;

            try {
                date = format.parse(text);
            } catch (ParseException var7) {
                format = new SimpleDateFormat("yyyy-MM-dd");

                try {
                    date = format.parse(text);
                } catch (ParseException var6) {
                    System.out.println("日期+" + text + "日期解析异常： " + var6.toString());
                    date = new Date();
                }
            }

            this.setValue(date);
        }
    }
}
