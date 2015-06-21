package com.icdut.cdut;

import java.util.ArrayList;
import java.util.List;

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

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.icdut.cdut.school.FragmentNewsDetail;

public class FragmentNews extends Fragment implements OnItemClickListener {

	private Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			List<String> mList = (List<String>) msg.obj;
			for (int i = 0; i < mList.size(); i = i + 2) {
				data.add(mList.get(i));
				// Log.i("data", data.get(i));
			}
			for (int i = 1; i < mList.size(); i = i + 2) {
				newsUrl.add(mList.get(i));
			}
			Log.i("data", data.toString());
			adapter = new ArrayAdapter<String>(getActivity(),
					R.layout.my_listitem, R.id.text1, data);

			// ����������listview������������view��
			lv.setAdapter(adapter);

		};
	};

	/*----ListView MVCʵ��----*/
	// model
	List<String> data;
	List<String> newsUrl = new ArrayList<String>(16);
	// view
	ListView lv;
	// controller
	ArrayAdapter<String> adapter;
	int size = 1;

	// ��ʼ�����
	private void initWidget() {
		lv = (ListView) getActivity().findViewById(R.id.listView);
	}

	// ��ʼ��������
	private void initData() {
		if (lv == null)
			return;
		// ��һ������ȡ����Դ��model��
		// appendData();
		// �ڶ�����newһ����������controller��
		// ����1��Context
		// ����2��listview��item����
		// ����3�����������item�����µ��Ǹ��ؼ�id
		// ����4����������

	

		lv.setOnItemClickListener(this);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_news, container, false);
		return view;
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		initWidget();
		loadNews();
		initData();
	}

	private void loadNews() {
		// TODO Auto-generated method stub
		data = new ArrayList<String>();
		new Thread() {
			public void run() {
				Looper.prepare();
				Message message = new Message();
				String html = null;
				String url = new String(
						"http://www.aao.cdut.edu.cn/aao/aao.php?sort=389&sorid=391&from=more");
				HttpClient httpClient = new DefaultHttpClient();// ����httpClient����
				HttpGet httpget = new HttpGet(url);// ��get��ʽ�����URL
				List<String> list = new ArrayList<String>();
//				newsUrl = new ArrayList<String>();
				try {
					HttpResponse responce = httpClient.execute(httpget);// �õ�responce����
					int resStatu = responce.getStatusLine().getStatusCode();// ������
					if (resStatu == HttpStatus.SC_OK) {// 200���� �����Ͳ���

						// �����Ӧʵ��
						HttpEntity entity = responce.getEntity();
						if (entity != null) {
							Log.i("tag", (HttpStatus.SC_OK) + "");
							html = EntityUtils.toString(entity, "GBK");// ���htmlԴ����,"GBK"�������
							Document doc = Jsoup.parseBodyFragment(html);
							Elements links = doc.select("a.link");
							// ������������
							String[] title = new String[links.size()];
							String[] textUrl = new String[links.size()];
							for (int i = 0; i < links.size(); i++) {
								Element ele = links.get(i);
								title[i] = ele.text();
								textUrl[i] = "http://www.aao.cdut.edu.cn"
										+ ele.attr("href");
								Log.i("title1", title[i]);
							}
							for (int j = 1; j < 17; j++) {
								list.add(title[j]);
								list.add(textUrl[j]);
							}
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					httpClient.getConnectionManager().shutdown();
				}
				message.obj = list;
				handler.sendMessage(message);
				Looper.loop();
			}

		}.start();
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		Intent intent = new Intent(getActivity(), FragmentNewsDetail.class);
		Bundle bundle = new Bundle();
		for(int i=0;i<newsUrl.size();i++){
			Log.i("url", i+" = "+newsUrl.get(i));
		}
		
		switch (position) {
		case 0:
			bundle.putString("news1", newsUrl.get(0).toString());
			break;
		case 1:
			bundle.putString("news1", newsUrl.get(1).toString());
			break;
		case 2:
			bundle.putString("news1", newsUrl.get(2).toString());
			break;
		case 3:
			bundle.putString("news1", newsUrl.get(3).toString());
			break;
		case 4:
			bundle.putString("news1", newsUrl.get(4).toString());
			break;
		case 5:
			bundle.putString("news1", newsUrl.get(5).toString());
			break;
		case 6:
			bundle.putString("news1", newsUrl.get(6).toString());
			break;
		case 7:
			bundle.putString("news1", newsUrl.get(7).toString());
			break;
		case 8:
			bundle.putString("news1", newsUrl.get(8).toString());
			break;
		case 9:
			bundle.putString("news1", newsUrl.get(9).toString());
			break;
		case 10:
			bundle.putString("news1", newsUrl.get(10).toString());
			break;
		case 11:
			bundle.putString("news1", newsUrl.get(11).toString());
			break;
		case 12:
			bundle.putString("news1", newsUrl.get(12).toString());
			break;
		case 13:
			bundle.putString("news1", newsUrl.get(13).toString());
			break;
		case 14:
			bundle.putString("news1", newsUrl.get(14).toString());
			break;
		case 15:
			bundle.putString("news1", newsUrl.get(15).toString());
			break;
		}
		intent.putExtras(bundle);
		startActivity(intent);
	}

}