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

			// 第三步：给listview设置适配器（view）
			lv.setAdapter(adapter);

		};
	};

	/*----ListView MVC实现----*/
	// model
	List<String> data;
	List<String> newsUrl = new ArrayList<String>(16);
	// view
	ListView lv;
	// controller
	ArrayAdapter<String> adapter;
	int size = 1;

	// 初始化组件
	private void initWidget() {
		lv = (ListView) getActivity().findViewById(R.id.listView);
	}

	// 初始化绑定数据
	private void initData() {
		if (lv == null)
			return;
		// 第一步：获取数据源（model）
		// appendData();
		// 第二步：new一个适配器（controller）
		// 参数1：Context
		// 参数2：listview的item布局
		// 参数3：数据填充在item布局下的那个控件id
		// 参数4：填充的数据

	

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
				HttpClient httpClient = new DefaultHttpClient();// 创建httpClient对象
				HttpGet httpget = new HttpGet(url);// 以get方式请求该URL
				List<String> list = new ArrayList<String>();
//				newsUrl = new ArrayList<String>();
				try {
					HttpResponse responce = httpClient.execute(httpget);// 得到responce对象
					int resStatu = responce.getStatusLine().getStatusCode();// 返回码
					if (resStatu == HttpStatus.SC_OK) {// 200正常 其他就不对

						// 获得相应实体
						HttpEntity entity = responce.getEntity();
						if (entity != null) {
							Log.i("tag", (HttpStatus.SC_OK) + "");
							html = EntityUtils.toString(entity, "GBK");// 获得html源代码,"GBK"解决乱码
							Document doc = Jsoup.parseBodyFragment(html);
							Elements links = doc.select("a.link");
							// 加入标题和链接
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