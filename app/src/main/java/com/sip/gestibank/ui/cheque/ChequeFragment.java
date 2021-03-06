package com.sip.gestibank.ui.cheque;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.sip.gestibank.R;

public class ChequeFragment extends Fragment {

    private ChequeViewModel chequeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        chequeViewModel = new ViewModelProvider(this).get(ChequeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cheque, container, false);

        return root;
        //  }
    }
}