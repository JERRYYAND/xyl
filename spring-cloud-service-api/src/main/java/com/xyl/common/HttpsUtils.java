package com.xyl.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class HttpsUtils {

	/**
	 * @Description: 公共提交代码
	 *  @param Url 路径
	 *  @param datas    数据
	 * @return void  
	 * @throws
	 * @author 
	 * @date 2015-7-17
	 */
	public static String commonSendUrl(String Url,String param){
	   return sendPost(Url,param) ;
	}
	


	/**
	 * 向指定URL发送POST方法的请求
	 * 
	 * @param url
	 *            发送请求的URL
	 * @param param
	 *            请求参数，请求参数应该是name1=value1&name2=value2的形式。
	 * @return URL所代表远程资源的响应
	 */
	public static String sendPost(String url, String param) {
		OutputStreamWriter out = null;
		BufferedReader in = null;
		String result = ""; //$NON-NLS-1$
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*"); //$NON-NLS-1$ //$NON-NLS-2$
			conn.setRequestProperty("connection", "Keep-Alive"); //$NON-NLS-1$ //$NON-NLS-2$
			conn.setRequestProperty("user-agent", //$NON-NLS-1$
					"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)"); //$NON-NLS-1$
			conn.setRequestProperty("content-type","application/json");
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8"); //$NON-NLS-1$
			// 发送请求参数
			out.write(param);
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(
					conn.getInputStream(), "utf-8")); //$NON-NLS-1$
			String line;
			while ((line = in.readLine()) != null) {
				result += line; //$NON-NLS-1$
			}
		} catch (Exception e) {
			System.out.println("发送POST请求出现异常！" + e); //$NON-NLS-1$
			e.printStackTrace();
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
}
