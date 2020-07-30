package com.example.atmconsultoria.ui.sobre;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {


    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_sobre, container, false);

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

        return new AboutPage(getActivity()).setImage(R.drawable.logo)
                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br","Envie um e-mail")
                .addWebsite("www.google.com","Acesse nosso site")
                .addGroup("Redes Sociais")
                .addFacebook("olavolicursi","Facebook")
                .addTwitter("_emilllys","Twitter")
                .addInstagram("_emilllys","Instagram")

                .create();


    }

}
