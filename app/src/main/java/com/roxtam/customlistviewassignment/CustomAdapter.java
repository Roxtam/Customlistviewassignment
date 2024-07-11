package com.roxtam.customlistviewassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Model> models;

    public CustomAdapter(Context context, ArrayList<Model> models) {
        this.context = context;
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int position) {
        return models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        Model currentItem = (Model) getItem(position);

        TextView nameTextView = convertView.findViewById(R.id.textViewName);
        TextView descriptionTextView = convertView.findViewById(R.id.textViewDescription);

        nameTextView.setText(currentItem.getName());
        descriptionTextView.setText(currentItem.getDescription());

        return convertView;
    }
}