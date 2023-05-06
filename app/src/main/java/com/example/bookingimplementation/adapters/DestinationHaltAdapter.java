package com.example.bookingimplementation.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookingimplementation.R;
import com.example.bookingimplementation.apiservice.response.HaltsResponse;
import com.example.bookingimplementation.models.Halts;

import java.util.List;

public class DestinationHaltAdapter extends RecyclerView.Adapter<DestinationHaltAdapter.ViewHolder> {

    private final List<Halts> destinations;
    private final ViewHolder.OnItemClickListener listener;

    public DestinationHaltAdapter(List<Halts> destinations, ViewHolder.OnItemClickListener listener) {
        this.destinations = destinations;
        this.listener = listener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.halt_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Halts destination = destinations.get(position);
        holder.bind(destination, listener);
    }


    @Override
    public int getItemCount() {
        return destinations.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView destinationName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            destinationName = itemView.findViewById(R.id.textView_halt_name);
        }

        public void bind(final Halts destination, final OnItemClickListener listener) {
            destinationName.setText(destination.getName());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(destination);
                }
            });
        }

        public interface OnItemClickListener {
            void onItemClick(Halts destination);
        }
    }
}
