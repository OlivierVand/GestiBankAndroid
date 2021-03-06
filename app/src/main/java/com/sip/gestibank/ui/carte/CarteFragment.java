package com.sip.gestibank.ui.carte;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.sip.gestibank.R;

public class CarteFragment extends Fragment {

    private CarteViewModel carteViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        carteViewModel = new ViewModelProvider(this).get(CarteViewModel.class);
        View root = inflater.inflate(R.layout.fragment_carte, container, false);

        return root;
        //  }
    }
}