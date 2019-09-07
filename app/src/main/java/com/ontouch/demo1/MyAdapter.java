package com.ontouch.demo1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.ontouch.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: preqel
 * Created on: 2019-09-07.
 * Description:
 */
public class MyAdapter extends PagerAdapter {

    private Context mcontext;
    private List<String> datas;

    public MyAdapter(Context mcontext) {
        this.mcontext = mcontext;
        datas = new ArrayList<>();
        datas.add("hello 1");
        datas.add("hello 2");
        datas.add("hello 3");
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ListView listView = (ListView) LayoutInflater.from(mcontext).inflate(R.layout.view_listview,
                null);
        listView.setAdapter(new MyListViewAdapter(mcontext, R.layout.item_listview_simple, datas));
        return listView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);
    }
}
