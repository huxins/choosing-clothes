package cn.inxiny.util;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import org.json.JSONException;


import java.io.IOException;

public class SMSUtil {


    public void sendSMS(String phoneNumber,String[] params) {
        // 短信应用SDK AppID     // 1400开头
        int appid = 1400118371;
        // 短信应用SDK AppKey
        String appkey = "4c91da14a22a4e75f9e6fb4c352707c4";
        // 需要发送短信的手机号码
        // phoneNumber = "13999999999";
        // 短信模板ID，需要在短信应用中申请
        int templateId = 164606;
        // 签名，使用的是`签名内容`，而不是`签名ID`
        String smsSign = "inxiny";
        try {
            //String[] params = {};//参数，验证码为5678，30秒内填写
            //String[] params = {"123456","100"};//参数，验证码为123456，100秒内填写
            SmsSingleSender ssender = new SmsSingleSender(appid, appkey);
            SmsSingleSenderResult result = ssender.sendWithParam("86", phoneNumber,
                    templateId, params, smsSign, "", "");  // 签名参数未提供或者为空时，会使用默认签名发送短信
            System.out.println(result);
        } catch (HTTPException e) {
            // HTTP响应码错误
            e.printStackTrace();

        } catch (JSONException e) {
            // json解析错误
            e.printStackTrace();
        } catch (IOException e) {
            // 网络IO错误
            e.printStackTrace();
        }catch (Exception e) {
            // 网络IO错误
            e.printStackTrace();
        }
    }
}