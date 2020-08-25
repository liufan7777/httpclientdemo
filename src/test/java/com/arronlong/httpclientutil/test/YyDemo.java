package com.arronlong.httpclientutil.test;

import com.alibaba.fastjson.JSONObject;
import com.arronlong.httpclientutil.HttpClientUtil;
import com.arronlong.httpclientutil.common.HttpConfig;
import com.arronlong.httpclientutil.common.HttpHeader;
import com.arronlong.httpclientutil.exception.HttpProcessException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class YyDemo {
    public static void main(String[] args) throws HttpProcessException, FileNotFoundException {
//        String Url="http://apidev.merchant.yiyitech.com/v1/recommend/sku/search";
//       Header[] headers=HttpHeader.custom()
//                                                 .host("api.admindd.yiyitech.com")
//                                                 .connection("keep-alive")
//                                                 .accept("application/json, text/plain, */*")
//                                                 .contentType("application/json;charset=UTF-8")
//                                                 .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.97 Safari/537.36")
//                                                 .other("token","eyJhbGciOiJIUzI1NiJ9.eyJwYXRoIjpbInBvc3QvdjEvdXNlcnMiLCJkZWxldGUvdjEvdXNlcnMvLioiLCJwdXQvdjEvdXNlcnMvLioiLCJnZXQvdjEvdXNlcnMiLCJnZXQvdjEvdXNlcnMvLioiLCJnZXQvdjEvdmlzaXRlZC9tZXNzYWdlL2RldGlhbCIsImdldC92MS9kYXRhL3Nlc3Npb25Gb3JlY2FzdCIsImdldC92MS9kYXRhL2Z1bmN0aW9uRXZhbHVhdGUiLCJnZXQvdjEvZGF0YS9zaG9wcGluR3VpZGUiLCJnZXQvdjEvdmlzaXRlZC9tZXNzYWdlIl0sIm5hbWUiOiJhMTIzNDU2IiwiZXhwIjoxNTk0NzE2MjIwLCJhY2NvdW50IjoidGVzdDAwMSJ9._ZhZi16P7sPuvTq57LwUkA66cZaFH4dfGwy11mCMkv0")
//                                                 .cookie("experimentation_subject_id=ImZkYzMzYzFmLTk0ZmMtNGE3Yi05ODZhLTMwZTUxYTI1M2E5ZiI%3D--0165edbdd5ed55fb8197475489c68d47e5c14f0a; 3AB9D23F7A4B3C9B=KHQLJ6NW5BDIOGJA3AYJLEUEXJUOYXW37UL4LAZGZAAMLTA44Q6CTIWGDNBDAHJVXTVLMTFS5QZP4TQLPLQP23PIPE; ARK_ID=JS91115a826fda21ce15d0222873377ec59111")
//                                                 .authorization("f2e9f9df975adc6dc10d8c9a67b75412")
//                                                 .build();
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("keyWord", "");
//        map.put("page", "1");
//        map.put("pageSize", "10");
//        map.put("shopId", "10049608");
//        map.put("type", "1");
//        String jsonString = JSONObject.toJSONString(map);
//        System.out.println(jsonString);
//        System.out.println(map);
//
//        HttpConfig config = HttpConfig.custom()
//                                                .url(Url)
//                                                .headers(headers)
//                                                .map(map);
//        String result1 = HttpClientUtil.post(config);
//        String Cf = String.valueOf(config);
//        System.out.println(result1);
//        System.out.println(Cf);
//    }
//}
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
//        StringBuffer params = new StringBuffer();
//        params.append("shopName:");
//        params.append("startTime:2020-07-27");
//        params.append("endTime:2020-08-12");
//        params.append("feedbackFrom:1");
//        params.append("page:1");
//        params.append("pageSize:10");
//        params.append("sort:");
//        JSONObject map = new JSONObject();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("shopName", "");
        map.put("startTime", "2020-07-27");
        map.put("endTime", "2020-08-12");
        map.put("feedbackFrom", "1");
        map.put("page", 1);
        map.put("pageSize", 10);
        map.put("sort", "");
        String jsonString = JSONObject.toJSONString(map);
        System.out.println(jsonString);


//        JSONArray params = new JSONArray();
//        params.add(map);
//        JSONObject params = JSONObject.fromObject(map);

        HttpPost httpPost = new HttpPost("http://apidev.admindd.yiyitech.com/v1/feedbacks/search");
        httpPost.setHeader("Content-Type", "application/json;charset=utf8");
       // httpPost.setHeader("authorization", "f00c97adc9aecc4788887d376a08152f");
        httpPost.setHeader("cookie", "experimentation_subject_id=ImZkYzMzYzFmLTk0ZmMtNGE3Yi05ODZhLTMwZTUxYTI1M2E5ZiI%3D--0165edbdd5ed55fb8197475489c68d47e5c14f0a; 3AB9D23F7A4B3C9B=KHQLJ6NW5BDIOGJA3AYJLEUEXJUOYXW37UL4LAZGZAAMLTA44Q6CTIWGDNBDAHJVXTVLMTFS5QZP4TQLPLQP23PIPE; ARK_ID=JS91115a826fda21ce15d0222873377ec59111");
        httpPost.setHeader("token", "eyJhbGciOiJIUzI1NiJ9.eyJwYXRoIjpbInBvc3QvdjEvdXNlcnMiLCJkZWxldGUvdjEvdXNlcnMvLioiLCJwdXQvdjEvdXNlcnMvLioiLCJnZXQvdjEvdXNlcnMiLCJnZXQvdjEvdXNlcnMvLioiLCJnZXQvdjEvdmlzaXRlZC9tZXNzYWdlL2RldGlhbCIsImdldC92MS9kYXRhL3Nlc3Npb25Gb3JlY2FzdCIsImdldC92MS9kYXRhL2Z1bmN0aW9uRXZhbHVhdGUiLCJnZXQvdjEvZGF0YS9zaG9wcGluR3VpZGUiLCJnZXQvdjEvdmlzaXRlZC9tZXNzYWdlIiwicG9zdC92MS9mZWVkYmFja3Mvc2VhcmNoIiwicG9zdC92MS91c2VyL2xvZ2luL21lc3NhZ2UiLCJwb3N0L3YxL2xvZ2luL2FuYWx5emUiXSwibmFtZSI6Iua1i-ivlSIsImV4cCI6MTU5NzcxNTg1NiwiYWNjb3VudCI6InRlc3QwMDEifQ.YHhKca362SkZC2Od_sRdM_iD_hToO_yKoI7UnJ8uiv4");
        StringEntity questjson=new StringEntity(jsonString.toString(),"utf-8");
        httpPost.setEntity(questjson);
        CloseableHttpResponse response = null;
        try {
      //      由客户端执行(发送) Post请求
            response = httpClient.execute(httpPost);
        //    从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();

                System.out.println("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
                System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                System.out.println("响应内容为:" + EntityUtils.toString(responseEntity));
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // 释放资源
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
