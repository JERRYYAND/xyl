package test;









import com.alibaba.fastjson.JSONObject;
import com.xyl.common.HttpsUtil;
import com.xyl.common.HttpsUtils;
import com.xyl.request.Request;
import com.xyl.response.Response;


public class Test {

	public static void main(String[] args)throws Exception {
        
		String url = "http://localhost:9201/hello-word-service";
		Request re = new Request();
		re.setMemberId(349);
		re.setSession("");
		re.setTimestamp(System.currentTimeMillis());
		
		JSONObject jsonObject = new JSONObject();
		re.setBizContent(jsonObject.toJSONString());
		
		String requestJSON = JSONObject.toJSONString(re);
		System.out.println("request:" + requestJSON);
		
		
		String resultJson ="";
		if(url.indexOf("https") == 0){ //https接口
			resultJson = HttpsUtil.post(url, requestJSON,"UTF-8");
		}else{
			resultJson = HttpsUtils.commonSendUrl(url, requestJSON);
		}
		System.err.println("response:"+resultJson);
		Response rs = JSONObject.parseObject(resultJson, Response.class);
		String code = rs.getCode();
	
	}
}
