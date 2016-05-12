package com.lpp.demo.redemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.daimajia.swipe.util.Attributes;
import com.lpp.demo.redemo.R;
import com.lpp.demo.redemo.bean.Article;

import java.util.ArrayList;

/**
 * Created by zhuzi on 16/5/3.
 */
public class ArticleAdapter extends BaseSwipeAdapter {
    public Context context;
    public ArrayList<Article.T1348648517839Entity> arrayList;

    public ArticleAdapter(Context context, ArrayList<Article.T1348648517839Entity> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        mItemManger.setMode(Attributes.Mode.Single);//设置当侧滑第二个的时候  关闭第一个。

    }


    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        ViewHolder viewHolder=new ViewHolder(convertView);
        viewHolder.text.setText(arrayList.get(position).getTitle());
        Glide.with(context).load(arrayList.get(position).getImgsrc()).into(viewHolder.images);
        return convertView;
    }

    @Override
    public int getSwipeLayoutResourceId(int i) {
        return 0;
    }

    public static class ViewHolder {
        public View rootView;
        public ImageView images;
        public TextView text;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.images = (ImageView) rootView.findViewById(R.id.images);
            this.text = (TextView) rootView.findViewById(R.id.text);
        }

    }
}
