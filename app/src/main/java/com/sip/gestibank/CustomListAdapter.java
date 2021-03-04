package com.sip.gestibank;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter{

    private List<ListeClientEnAttente> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListAdapter(Context aContext, List<ListeClientEnAttente> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();
            holder.ListeClientNom = (TextView) convertView.findViewById(R.id.textView_Name);
            holder.ListeClientEmail = (TextView) convertView.findViewById(R.id.textView_Email);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        ListeClientEnAttente listeClientEnAttente = this.listData.get(position);
        holder.ListeClientNom.setText(listeClientEnAttente.getName());
        holder.ListeClientEmail.setText(listeClientEnAttente.getEmail());
        return convertView;
    }

    static class ViewHolder {
        TextView ListeClientNom;
        TextView ListeClientEmail;
    }

}