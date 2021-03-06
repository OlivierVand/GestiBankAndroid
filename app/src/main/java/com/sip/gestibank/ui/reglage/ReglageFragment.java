package com.sip.gestibank.ui.reglage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.sip.gestibank.R;
import com.sip.gestibank.ui.carte.CarteViewModel;

public class ReglageFragment extends Fragment {

    private ReglageViewModel reglageViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        reglageViewModel = new ViewModelProvider(this).get(ReglageViewModel.class);
        View root = inflater.inflate(R.layout.fragment_reglage, container, false);

        return root;
        //  }
    }
}