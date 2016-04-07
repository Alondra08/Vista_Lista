package com.example.ftsoporte.vista_lista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ALONDRITA on 06/04/2016.
 */
public class ListViewAdapter extends BaseAdapter {
    Context alo;
    String[] title;
    int[] img;
    LayoutInflater inflater;

    public ListViewAdapter(Context alo, String[] title, int[] img){
        this.alo=alo;
        this.title=title;
        this.img=img;

    }
    @Override
    public int getCount() {
        return title.length;
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
        TextView txttitulo;
        ImageView imageView;

        inflater=(LayoutInflater)alo.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=inflater.inflate(R.layout.lis_row,parent,false);

        txttitulo=(TextView)itemView.findViewById(R.id.lis_row_text);
        imageView=(ImageView)itemView.findViewById(R.id.lis_row_img);
        txttitulo.setText(title[position]);
        imageView.setImageResource(img[position]);
        return itemView;
    }
}
