package com.ontouch.demo1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ontouch.R;

import java.util.List;

/**
 * Author: preqel
 * Created on: 2019-09-07.
 * Description:
 */
public class MyListViewAdapter extends ArrayAdapter<String> {

    private List<String> datas;
    private int resourceId;

    public MyListViewAdapter(Context context, int resource, List<String> data) {
        super(context, resource);
        this.datas = data;
        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        TextView textView = view.findViewById(R.id.tv_simple);
        textView.setText(getContext().getString(R.string.simpletext));
        return view;
    }

    @Override
    public int getCount() {
        return datas.size();
    }


}
