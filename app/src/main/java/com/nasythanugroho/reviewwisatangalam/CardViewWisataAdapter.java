package com.nasythanugroho.reviewwisatangalam;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewWisataAdapter extends RecyclerView.Adapter<CardViewWisataAdapter.CardViewViewHolder>{

    private ArrayList<WisataModel> listWisataModel;
    private Context context;

    public CardViewWisataAdapter(Context context){
        this.context = context;
    }
    public ArrayList<WisataModel> getListWisataModel(){
        return listWisataModel;
    }
    public void setListWisataModel(ArrayList<WisataModel> listWisataModel)
    {
        this.listWisataModel = listWisataModel;
    }

    @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_waterfall, parent, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewViewHolder holder, int position) {
        WisataModel p = getListWisataModel().get(position);
        Glide.with(context)
                .load(p.getPhoto())
                .override(350, 350)
                .into(holder.imgPhoto);

        holder.tvName.setText(p.getName());
        holder.tvPrice.setText(p.getPrice());
        holder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback()
        {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite "+ getListWisataModel().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));

        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View view, int position) {

                WisataModel wisataModel = listWisataModel.get(position);

                Intent intent = new Intent(view.getContext(), DetailWisata.class);

                intent.putExtra(DetailWisata.KEY_ITEM, wisataModel);
                view.getContext().startActivity(intent);

            }
        }));

    }

    @Override
    public int getItemCount() {
        return getListWisataModel().size();
    }


    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvPrice;
        Button btnFavorite, btnDetail;

        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvPrice = itemView.findViewById(R.id.tv_item_price);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnDetail = itemView.findViewById(R.id.btn_set_detail);
        }
    }
}
