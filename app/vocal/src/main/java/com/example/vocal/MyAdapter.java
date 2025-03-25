package com.example.vocal;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Vocab> data;

    // Constructor để khởi tạo Adapter với dữ liệu và Context
    public MyAdapter(Context context, ArrayList<Vocab> data) {
        this.context = context;
        this.data = data;
    }

    // Tạo ViewHolder cho mỗi mục trong danh sách
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        String item = data.get(position).term;
        holder.textView.setText(item);
    }

    // Trả về số lượng mục trong danh sách
    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
            textView.setOnClickListener(v -> {
                // Xử lý sự kiện khi mục được nhấn
                int position = getAdapterPosition();
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(data.get(position).term);
                builder.setMessage(data.get(position).def + "\n" + data.get(position).ipa);
                builder.setCancelable(false);
                builder.setPositiveButton("Đóng", (dialog, which) -> dialog.dismiss());
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            });
        }
    }
}