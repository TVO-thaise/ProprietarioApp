package pooa20171.iff.br.proprietarioapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import io.realm.internal.Context;
import pooa20171.iff.br.proprietarioapp.R;
import pooa20171.iff.br.proprietarioapp.model.Proprietario;

/**
 * Created by thaisevilaca2013@gmail.com on 07/08/17.
 */

public class ProprietarioAdapter extends RecyclerView.Adapter{

    private List<Proprietario> proprietario;
        private Context context;
        private static ClickRecyclerViewListener clickRecyclerViewListener;

                public ProprietarioAdapter(List<Proprietario> proprietario, Context context,ClickRecyclerViewListener clickRecyclerViewListener) {

                        this.proprietario = proprietario;
                this.context = context;
                this.clickRecyclerViewListener = clickRecyclerViewListener
                }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_proprietario, parent, false);
        LivroViewHolder ProprietarioViewHolder = new ProprietarioViewHolder(view);
        return ProprietarioViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder,
                                 int position) {

        LivroViewHolder holder = (LivroViewHolder) viewHolder;

        Proprietario proprietario  = proprietario.get(position) ;

        holder.nomeProprietario.setText(proprietario.getNome());
        holder.enderecoProprietario.setText(proprietario.getEndereco());
        holder.bairroProprietario.setText(proprietario.getBairro());
        holder.cidadeProprietario.setText(proprietario.getCidade());
        holder.CNHProprietario.setText(proprietario.getCNH());
        holder.telefoneProprietario.setText(proprietario.getTelefone());
        holder.e_mailProprietario.setText(proprietario.getE_mail());
        holder.latitudeProprietario.setText(proprietario.getLatitude());
        holder.longitudeProprietario.setText(proprietario.getLongitude());
        Log.i("------XXXXXXXXX--", proprietario.getDescricao());


    }

    @Override
    public int getItemCount() {

        return proprietario.size();
    }

    private void updateItem(int position) {

    }

    // Método responsável por remover um usuário da lista.
    private void removerItem(int position) {

    }

    public class LivroViewHolder extends RecyclerView.ViewHolder {

        private final TextView nomeProprietario;
        private final TextView enderecoProprietario;
        private final TextView bairroProprietario;
        private final TextView cidadeProprietario;
        private final TextView CNHProprietario;
        private final TextView telefoneProprietario;
        private final TextView e_mailProprietario;
        private final TextView latitudeProprietario;
        private final TextView longitudeProprietario;



        public LivroViewHolder(View itemView) {
            super(itemView);
            nomeProprietario = (TextView) itemView.findViewById(R.id.nomeProprietario);
            enderecoProprietario = (TextView) itemView.findViewById(R.id.enderecoProprietario);
            bairroProprietario = (TextView) itemView.findViewById(R.id.bairroProprietario);
            cidadeProprietario = (TextView) itemView.findViewById(R.id.cidadeProprietario);
            CNHProprietario = (TextView) itemView.findViewById(R.id.CNHProprietario);
            telefoneProprietario = (TextView) itemView.findViewById(R.id.telefoneProprietario);
           e_mailProprietario = (TextView) itemView.findViewById(R.id.e_mailProprietario);
            latitudeProprietario = (TextView) itemView.findViewById(R.id.latitudeProprietario);
            longitudeProprietario = (TextView) itemView.findViewById(R.id.longitudeProprietario);
            descricao = (TextView) itemView.findViewById(R.id.descricao);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickRecyclerViewListener.onClick(livros.get(getLayoutPosition()));

                }
            });


        }
    }
}
