package com.alex.solidpresentation.SRP.good_way;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alex.solidpresentation.R;

import java.util.List;

/**
 * Created by Alex
 */

public class GoodAdapter extends RecyclerView.Adapter<GoodAdapter.ViewHolder> {

    private List<CustomerModel> items;

    public GoodAdapter(List<CustomerModel> items) {
        this.items = items;
    }

    @Override
    public GoodAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_bad_srp, parent, false);
        return new GoodAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(GoodAdapter.ViewHolder holder, int position) {
        CustomerModel customerModel = items.get(position);
        holder.name.setText(customerModel.getName());
        long total = 0;
        for (Integer item : customerModel.getOrdersOfPrices()) {
            total += item;
        }
        holder.orderTotal.setText(String.valueOf(total));
    }

    @Override public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView orderTotal;

        private ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            orderTotal = (TextView) itemView.findViewById(R.id.order_total);
        }
    }

}