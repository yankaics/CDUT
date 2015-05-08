package com.icdut.cdut.school;

import com.icdut.cdut.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SchoolContentActivity extends Activity{

	private final String URL="http://www.cdut.edu.cn/type/0203000117.html";
	
	private WebView webView;
	private Handler handler=new Handler(){
		public void handleMessage(android.os.Message msg) {
			//������·��Ϣ
			WebView webV=(WebView) msg.obj;
			setContentView(webV);
		};
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.school_content);
		init();
	}

	private void init() {
		// TODO Auto-generated method stub
		webView=(WebView) findViewById(R.id.webView);
		webView=new WebView(this);
//		webView.getSettings().setJavaScriptEnabled(true);
		// ���ÿ���֧������ 
		webView.getSettings().setSupportZoom(true); 
		//����Ӧ��Ļ
		webView.getSettings().setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
		webView.getSettings().setLoadWithOverviewMode(true);
		new Thread(){
			public void run() {
				//������·��Ϣ
				Looper.prepare();
				webView.loadUrl(URL);
				Message message=new Message();
				message.obj=webView;
				handler.sendMessage(message);
				Looper.loop();
			};
		}.start();
		webView.setWebViewClient(new HelloWebViewClient());
	}
	
	//��webView�е��������
	private class HelloWebViewClient extends WebViewClient{
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			// TODO Auto-generated method stub
			final WebView webView=view;
			final String urlNew=url;
			new Thread(){
				public void run() {
					//������·��Ϣ
					Looper.prepare();
					webView.loadUrl(urlNew);
					Message message=new Message();
					message.obj=webView;
					handler.sendMessage(message);
					Looper.loop();
				};
			}.start();
			return true;
		}
	}
	
	//��д����
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) { 
			webView.goBack(); //goBack()��ʾ����WebView����һҳ�� 
            return true; 
        } 
        return  super.onKeyDown(keyCode, event); 
	}
}
