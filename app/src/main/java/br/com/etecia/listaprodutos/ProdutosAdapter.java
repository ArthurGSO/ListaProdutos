package br.com.etecia.listaprodutos;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

public class ProdutosAdapter {

    private Context context;
    private List<> ListaProdutos;
    public class ViewHolder extends RecyclerView.ViewHolder{
        //declarando as variáveis que vão representar o xml no java
        ImageView imgProduto;
        TextView txtProduto;
        MaterialCardView cardProduto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProduto = itemView.findViewById(R.id.idImgProduto);
            txtProduto = itemView.findViewById(R.id.txtDescrProdutos);
            cardProduto = itemView.findViewById(R.id.idCardProduto);

        }
    }





}