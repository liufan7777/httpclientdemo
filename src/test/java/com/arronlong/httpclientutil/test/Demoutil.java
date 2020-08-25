package com.arronlong.httpclientutil.test;

import com.alibaba.fastjson.JSONObject;
import com.arronlong.httpclientutil.HttpClientUtil;
import com.arronlong.httpclientutil.common.HttpConfig;
import com.arronlong.httpclientutil.common.HttpHeader;
import com.arronlong.httpclientutil.exception.HttpProcessException;
import org.apache.http.Header;

import java.util.HashMap;
import java.util.Map;


public class Demoutil {
    public static void main(String[] args) throws HttpProcessException {
        String url="http://apidev.merchant.yiyitech.com/v1/recommend/sku/search";

        Header[] headers=HttpHeader.custom().accept("application/json, text/plain, */*")
                                            .contentType("application/json;charset=UTF-8")
                                            .authorization("4cf646648aae09e2b9a4660544fe91d4")
                                            .build();

        Map<String,Object> map=new HashMap<String, Object>();
        map.put("keyWord","");
        map.put("page",1);
        map.put("pageSize",10);
        map.put("shopId",650758);
        map.put("type",1);
        String jsonString= JSONObject.toJSONString(map);
        System.out.println(jsonString);

        HttpConfig config =  HttpConfig .custom()
                                        .url(url)
                                        .headers(headers)
                                        .json(jsonString);
        String result= HttpClientUtil.post(config);
        String cf =String.valueOf(config);
        System.out.println(result);
        System.out.println(cf);
    }
}
