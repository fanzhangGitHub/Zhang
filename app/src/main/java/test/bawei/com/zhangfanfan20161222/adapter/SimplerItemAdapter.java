package test.bawei.com.zhangfanfan20161222.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import test.bawei.com.zhangfanfan20161222.R;
import test.bawei.com.zhangfanfan20161222.bean.MessageBean;

/**
 * Created by ZhangFanfan on 2016/12/22.
 * 适配器
 */
public class SimplerItemAdapter extends RecyclerView.Adapter<SimplerItemAdapter.SimpleItemViewHolder >{
    private OnRecyclerViewItemClickListener mOnItemClickListener = null;
    private List<MessageBean.RsBean> items;
   private Context context;

    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }
    public SimplerItemAdapter(List<MessageBean.RsBean> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override public SimpleItemViewHolder onCreateViewHolder (ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from( viewGroup.getContext ()).inflate(R.layout.vertical_layout, viewGroup, false );

        return new SimpleItemViewHolder(itemView);
    }

    @Override public void onBindViewHolder (final SimpleItemViewHolder viewHolder, final int position) {
//        Log.e("onBindViewHolder",items.get (position).dirName);
        viewHolder.textView .setText(items.get (position).dirName);
        viewHolder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnItemClickListener.onItemClick(viewHolder.textView,position);
            }
        });
    }

    @Override public int getItemCount () {
        return (this.items != null) ? this .items. size() : 0 ;
    }

    protected final static class SimpleItemViewHolder extends RecyclerView.ViewHolder {
         TextView textView ;
        public SimpleItemViewHolder (View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById (R. id.vertical_text);
        }
    }//define interface
    public static interface OnRecyclerViewItemClickListener {
        void onItemClick(View view , int  position);
    }

}