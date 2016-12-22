package test.bawei.com.zhangfanfan20161222;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.List;

import test.bawei.com.zhangfanfan20161222.adapter.SimplerItemAdapter;
import test.bawei.com.zhangfanfan20161222.adapter.SimplerItemAdapterOne;
import test.bawei.com.zhangfanfan20161222.adapter.SimplerItemAdapterZero;
import test.bawei.com.zhangfanfan20161222.bean.MessageBean;

/**
 * zhangfanfan
 * 20161222
 * 主页
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler_vertical, recycler_horizontal,recycler_style;
   private Context context;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            List<MessageBean.RsBean> rsBeen = (List<MessageBean.RsBean>) msg.obj;
            SimplerItemAdapter   adapter = new SimplerItemAdapter(rsBeen, context);
            recycler_vertical.setAdapter(adapter);
//            Log.e("SimplerItemAdapter",rsBeen.get(0).dirName);
            SimplerItemAdapterZero  adaptera = new SimplerItemAdapterZero(rsBeen.get(0).children1.get(0).children2, context);
            recycler_horizontal.setAdapter(adaptera);
            textView1.setText(rsBeen.get(0).children1.get(0).dirName);
            SimplerItemAdapterOne    adapter1 = new SimplerItemAdapterOne(rsBeen.get(0).children1.get(1).children2, context);
            recycler_style.setAdapter(adapter1);
            textView2.setText(rsBeen.get(1).children1.get(1).dirName);
            adapterOnclick(adapter1,adaptera);
            //设置接口回调
            setOn(adapter,rsBeen);

        }
    };
    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件属性
        initViews();
        httpDataGet();
    }
    private void setOn(SimplerItemAdapter adapter, final List<MessageBean.RsBean>    rsBeen ) {
        adapter.setOnItemClickListener(new SimplerItemAdapter.OnRecyclerViewItemClickListener() {


            private SimplerItemAdapterOne adapter16;
            private SimplerItemAdapterZero adapter15;
            private SimplerItemAdapterOne adapter14;
            private SimplerItemAdapterZero adapter13;
            private SimplerItemAdapterOne adapter12;
            private SimplerItemAdapterZero adapter11;
            private SimplerItemAdapterOne adapter10;
            private SimplerItemAdapterZero adapter9;
            private SimplerItemAdapterOne adapter8;
            private SimplerItemAdapterZero adapter7;
            private SimplerItemAdapterOne adapter6;
            private SimplerItemAdapterZero adapter5;
            private SimplerItemAdapterOne adapter4;
            private SimplerItemAdapterZero adapter3;
            private SimplerItemAdapterOne adapter2;
            private SimplerItemAdapterZero adapter;
            private  SimplerItemAdapterOne adapter1;
            @Override
            public void onItemClick(View view, int position) {
                switch(position){
                    case 0:

                        adapter = new SimplerItemAdapterZero(rsBeen.get(0).children1.get(0).children2, context);
                        recycler_horizontal.setAdapter(adapter);
                        textView1.setText(rsBeen.get(position).children1.get(0).dirName);
                        adapter1 = new SimplerItemAdapterOne(rsBeen.get(0).children1.get(1).children2, context);
                        recycler_style.setAdapter(adapter1);
                        textView2.setText(rsBeen.get(position).children1.get(1).dirName);

                        adapterOnclick(adapter1,adapter);
                        break;
                    case 1:
                        adapter = new SimplerItemAdapterZero(rsBeen.get(1).children1.get(0).children2, context);
                        recycler_horizontal.setAdapter(this.adapter);
                        textView1.setText(rsBeen.get(position).children1.get(0).dirName);
                        adapter2 = new SimplerItemAdapterOne(rsBeen.get(1).children1.get(1).children2, context);
                        recycler_style.setAdapter(adapter2);
                        textView2.setText(rsBeen.get(position).children1.get(1).dirName);
                        adapterOnclick(adapter2,adapter);
                        break;
                    case 2:
                        adapter3 = new SimplerItemAdapterZero(rsBeen.get(2).children1.get(0).children2, context);
                        recycler_horizontal.setAdapter(adapter3);
                        textView1.setText(rsBeen.get(position).children1.get(0).dirName);
                        adapter4 = new SimplerItemAdapterOne(rsBeen.get(2).children1.get(1).children2, context);
                        recycler_style.setAdapter(adapter4);
                        textView2.setText(rsBeen.get(position).children1.get(1).dirName);
                        adapterOnclick(adapter4,adapter3);
                        break;
                    case 3:
                        adapter5 = new SimplerItemAdapterZero(rsBeen.get(3).children1.get(0).children2, context);
                        recycler_horizontal.setAdapter(adapter5);
                        textView1.setText(rsBeen.get(position).children1.get(0).dirName);
                        adapter6 = new SimplerItemAdapterOne(rsBeen.get(3).children1.get(1).children2, context);
                        recycler_style.setAdapter(adapter6);
                        textView2.setText(rsBeen.get(position).children1.get(1).dirName);
                        adapterOnclick(adapter6,adapter5);
                        break;
                    case 4:
                        adapter7 = new SimplerItemAdapterZero(rsBeen.get(4).children1.get(0).children2, context);
                        recycler_horizontal.setAdapter(adapter7);
                        textView1.setText(rsBeen.get(position).children1.get(0).dirName);
                        adapter8 = new SimplerItemAdapterOne(rsBeen.get(4).children1.get(1).children2, context);
                        recycler_style.setAdapter(adapter8);
                        textView2.setText(rsBeen.get(position).children1.get(1).dirName);
                        adapterOnclick(adapter8,adapter7);
                        break;
                    case 5:
                        adapter9 = new SimplerItemAdapterZero(rsBeen.get(5).children1.get(0).children2, context);
                        recycler_horizontal.setAdapter(adapter9);
                        textView1.setText(rsBeen.get(position).children1.get(0).dirName);
                        adapter10 = new SimplerItemAdapterOne(rsBeen.get(5).children1.get(1).children2, context);
                        recycler_style.setAdapter(adapter10);
                        textView2.setText(rsBeen.get(position).children1.get(1).dirName);
                        adapterOnclick(adapter10,adapter9);
                        break;
                    case 6:
                        adapter11 = new SimplerItemAdapterZero(rsBeen.get(6).children1.get(0).children2, context);
                        recycler_horizontal.setAdapter(adapter11);
                        textView1.setText(rsBeen.get(position).children1.get(0).dirName);
                        adapter12 = new SimplerItemAdapterOne(rsBeen.get(6).children1.get(1).children2, context);
                        recycler_style.setAdapter(adapter12);
                        textView2.setText(rsBeen.get(position).children1.get(1).dirName);
                        adapterOnclick(adapter12,adapter11);
                        break;
                    case 7:
                        adapter13 = new SimplerItemAdapterZero(rsBeen.get(7).children1.get(0).children2, context);
                        recycler_horizontal.setAdapter(adapter13);
                        textView1.setText(rsBeen.get(7).children1.get(0).dirName);
                        adapter14 = new SimplerItemAdapterOne(rsBeen.get(1).children1.get(1).children2, context);
                        recycler_style.setAdapter(adapter14);
                        textView2.setText(rsBeen.get(1).children1.get(1).dirName);
                        adapterOnclick(null,adapter13);
                        break;
                    case 8:
                        adapter15 = new SimplerItemAdapterZero(rsBeen.get(8).children1.get(0).children2, context);
                        recycler_horizontal.setAdapter(adapter13);
                        textView1.setText(rsBeen.get(8).children1.get(0).dirName);
                        adapter16 = new SimplerItemAdapterOne(rsBeen.get(1).children1.get(1).children2, context);
                        recycler_style.setAdapter(adapter14);
                        textView2.setText(rsBeen.get(8).children1.get(1).dirName);
                        adapterOnclick(adapter16,adapter15);
                        break;
                }
            }
        });
    }
    private void adapterOnclick(SimplerItemAdapterOne adapter1, SimplerItemAdapterZero adapter) {
        adapter1.setOnItemClick(new SimplerItemAdapterOne.OnClickOne() {
            @Override
            public void getPosition(int position) {
                Toast.makeText(context,""+position,Toast.LENGTH_SHORT).show();
            }
        });  adapter.setOnItemClick(new SimplerItemAdapterZero.OnClickZero() {
            @Override
            public void getPosition(int position) {
                Toast.makeText(context,""+position,Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void httpDataGet() {
        new Thread(){
            @Override
            public void run() {
                OkHttpClient  client=new OkHttpClient();
                String url="http://mock.eoapi.cn/success/4q69ckcRaBdxhdHySqp2Mnxdju5Z8Yr4";

                Request request=new Request.Builder().url(url).build();

                client.newCall(request).enqueue(new Callback() {
                    //请求失败回调方法
                    @Override
                    public void onFailure(Request request, IOException e) {

                    }
                    //请求成功回调方法
                    @Override
                    public void onResponse(Response response)  {
//                        Log.d("ooo",response.body().string());
                        String json = null;
                        try {
                            json = response.body().string();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        MessageBean bean = new Gson().fromJson(json,MessageBean.class);
                        List<MessageBean.RsBean>rsBeen = bean.rs;
                        Message msg = Message.obtain();
                        msg.obj = rsBeen;
                        handler.sendMessage(msg);
                    }
                });
            }
        }.start();
    }
    private void initViews() {
        context = this;
        textView1 = (TextView) findViewById(R.id.Recycler_horizontal_text);
        textView2 = (TextView) findViewById(R.id.Recycler_style_text);
        recycler_vertical = (RecyclerView) findViewById(R.id.Recycler_vertical);
        recycler_vertical.setHasFixedSize(true);
         RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(context);
        layoutManager1.setAutoMeasureEnabled(true);
        recycler_vertical.setLayoutManager(layoutManager1);


        recycler_horizontal = (RecyclerView) findViewById(R.id.Recycler_horizontal);
        recycler_horizontal.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(context);
        layoutManager2.setAutoMeasureEnabled(true);
        recycler_horizontal.setLayoutManager(layoutManager2);
        recycler_horizontal.setLayoutManager(new GridLayoutManager(this, 3));

        recycler_style = (RecyclerView) findViewById(R.id.Recycler_style);
        recycler_style.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager3 = new LinearLayoutManager(context);
        layoutManager3.setAutoMeasureEnabled(true);
        recycler_style.setHasFixedSize(true);
        recycler_style.setLayoutManager(new GridLayoutManager(this, 3));
    }
}