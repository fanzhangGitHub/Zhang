package test.bawei.com.zhangfanfan20161222.app;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by ZhangFanfan on 2016/12/22.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化imageloader
        ImageLoaderConfiguration configuration = ImageLoaderConfiguration.createDefault(getApplicationContext());
        ImageLoader.getInstance().init(configuration);
    }
}
