package com.example.hamdi.contactmanager;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hamdi on 18/04/15.
 */
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.contactViewHolder> {

    ArrayList<Contact> contacts ;
    ContactAdapter( ArrayList<Contact> contacts ) {

        this.contacts = contacts;
    }
    @Override
    public contactViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);

        return new contactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(contactViewHolder contactViewHolder, int i) {

        Contact contact = contacts.get(i);

        Log.d("nom", i + "");
        contactViewHolder.nom.setText(contact.getNom());
        contactViewHolder.numTel.setText(contact.getNumTel());

    }

    public void addItem(Contact data) {
        contacts.add(data);
        notifyItemInserted(getItemCount());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public static class  contactViewHolder extends  RecyclerView.ViewHolder{
        TextView nom;
        TextView numTel;
        public contactViewHolder(View itemView) {
            super(itemView);
            nom = (TextView) itemView.findViewById(R.id.TextNom);
            numTel = (TextView) itemView.findViewById(R.id.TextNumTel);
        }
    }
}
