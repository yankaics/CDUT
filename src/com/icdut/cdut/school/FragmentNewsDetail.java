package com.icdut.cdut.school;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import com.icdut.cdut.R;

public class FragmentNewsDetail extends Activity {

	private JustifyTextView tv_news_details;
	
	private Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			String s=msg.obj.toString();
			tv_news_details.setText(s);
		};
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news_details);
		tv_news_details=(JustifyTextView) findViewById(R.id.tv_news_details);
		// 获取到新闻所传回来的链接
		chooseItem();
	}

	private void chooseItem() {
		// TODO Auto-generated method stub
		Bundle bundle = getIntent().getExtras();
		// 根据字符串取链接
		String news1 = bundle.getString("news1");	
		loadNewDetails(news1);
	}

	private void loadNewDetails(String news1) {
		// TODO Auto-generated method stub
		final String url = news1;
		new Thread() {
			public void run() {
				Looper.prepare();
				Message message = new Message();
				String html = null;
				StringBuffer sb = new StringBuffer("		");
				HttpClient httpClient = new DefaultHttpClient();// 创建httpClient对象
				HttpGet httpget = new HttpGet(url);// 以get方式请求该URL
				try {
					HttpResponse responce = httpClient.execute(httpget);// 得到responce对象
					int resStatu = responce.getStatusLine().getStatusCode();// 返回码
					Log.i("tag", resStatu+"");
					if (resStatu == HttpStatus.SC_OK) {// 200正常 其他就不对
						// 获得相应实体
						HttpEntity entity = responce.getEntity();
						Log.i("what", "what");
						if (entity != null) {
							Log.i("tag", (HttpStatus.SC_OK) + "");
							html = EntityUtils.toString(entity, "GBK");// 获得html源代码,"GBK"解决乱码
							Document doc = Jsoup.parseBodyFragment(html);
							Elements links = doc.select("div#text");
							for (Element link : links) {
								 sb.append(link.text());
								 Log.i("text", sb.toString());
							}
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					httpClient.getConnectionManager().shutdown();
				}
				message.obj=sb;
				Log.i("sb", sb.toString());
				handler.sendMessage(message);
				sb.delete(0, sb.length());
				Looper.loop();
			};
		}.start();
	}

}
