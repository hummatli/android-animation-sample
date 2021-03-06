package com.mobapphome.animation.sample;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class AboutFragment extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout lytMain = (LinearLayout) inflater.inflate(R.layout.fragment_about, container, false);
        lytMain.findViewById(R.id.btnBack).setOnClickListener(this);
        return lytMain;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        if (v.getId() == R.id.btnBack) {
            try {
                getActivity().getSupportFragmentManager().popBackStack();
            } catch (NullPointerException npe) {
                return;
            }
        }
    }
}