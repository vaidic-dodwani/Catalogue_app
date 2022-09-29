package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    Context context;
    String[] itemName;
    int[] image;
    String[] prices;
    LayoutInflater inflater;

    public GridAdapter(Context context, String[] itemName, int[] image, String[] itemPrices) {
        this.context = context;
        this.itemName = itemName;
        this.image = image;
        this.prices = itemPrices;
    }

    @Override
    public int getCount() {
        return itemName.length;
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

        if (inflater == null)
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null){

            convertView = inflater.inflate(R.layout.grid_item,null);

        }

        ImageView imageView = convertView.findViewById(R.id.grid_image);
        TextView textView = convertView.findViewById(R.id.item_name);
        TextView textpriceView = convertView.findViewById(R.id.prices);

        imageView.setImageResource(image[position]);
        textView.setText(itemName[position]);
        textpriceView.setText(prices[position]);

        return convertView;
    }
}
