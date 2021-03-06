package com.sip.gestibank.ui.credit;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.sip.gestibank.R;

public class CreditFragment extends Fragment {

    private CreditViewModel creditViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        creditViewModel = new ViewModelProvider(this).get(CreditViewModel.class);
        View root = inflater.inflate(R.layout.fragment_credit, container, false);

        return root;
        //  }
    }
}