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

    //COnstrutor da classe adapter
    public ProdutosAdapter(Context context, List<> listaProdutos) {
        this.context = context;
        ListaProdutos = listaProdutos;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgProduto() {
            return imgProduto;
        }

        public void setImgProduto(ImageView imgProduto) {
            this.imgProduto = imgProduto;
        }

        public TextView txtProduto() {
            return txtProduto;
        }

        public void setTxtProduto(TextView txtProduto) {
            this.txtProduto = txtProduto;
        }

        public MaterialCardView cardProduto() {
            return cardProduto;
        }

        public void setCardProduto(MaterialCardView cardProduto) {
            this.cardProduto = cardProduto;
        }

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