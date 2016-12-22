package test.bawei.com.zhangfanfan20161222.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

import test.bawei.com.zhangfanfan20161222.R;
import test.bawei.com.zhangfanfan20161222.bean.MessageBean;

/**
 * Created by ZhangFanfan on 2016/12/22.
 * 适配器
 */
public class SimplerItemAdapterOne extends RecyclerView.Adapter<SimplerItemAdapterOne.SimpleItemViewHolder > {
    private OnClickOne clickOne;
    private List<MessageBean.ChidrenOne> items;
    private Context context;

    public void setOnItemClick(OnClickOne clickOne){
        this.clickOne = clickOne;
    }
    public SimplerItemAdapterOne(List<MessageBean.ChidrenOne> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override public SimpleItemViewHolder onCreateViewHolder (ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from( viewGroup.getContext ()).inflate(R.layout.one_layout, viewGroup, false );
        return new SimpleItemViewHolder(itemView);
    }

    @Override public void onBindViewHolder (SimpleItemViewHolder viewHolder, final int position) {
        viewHolder.textView .setText(items.get (position).dirName);
        ImageLoader.getInstance().displayImage(items.get(position).imgApp,viewHolder.imageView);
        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickOne.getPosition(position);
            }
        });
    }

    @Override public int getItemCount () {
        return (this.items != null) ? this .items. size() : 0 ;
    }

    protected final static class SimpleItemViewHolder extends RecyclerView.ViewHolder {
       TextView textView ;
      ImageView imageView;
        public SimpleItemViewHolder (View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById (R. id.one_text);
            imageView = (ImageView) itemView.findViewById(R.id.one_image);
        }
    }
    public interface OnClickOne{
        void getPosition(int position);
    }
}
