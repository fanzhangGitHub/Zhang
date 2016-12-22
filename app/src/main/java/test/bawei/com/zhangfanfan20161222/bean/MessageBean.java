package test.bawei.com.zhangfanfan20161222.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ZhangFanfan on 2016/12/22.
 * bean类
 */

public class MessageBean {
    public List<RsBean>rs;
    public class RsBean{
    public String dirName;
        @SerializedName("children")
    public List<ChidrenBean>children1;
    }
    public class ChidrenBean{
        @SerializedName("children")
       public List<ChidrenOne>children2;
        public String dirName;
    }
    public class ChidrenOne{
        public String dirName;
        public String imgApp;
    }
}
