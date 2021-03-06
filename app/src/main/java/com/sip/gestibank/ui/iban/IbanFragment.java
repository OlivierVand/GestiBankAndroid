package com.sip.gestibank.ui.iban;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.sip.gestibank.R;
import com.sip.gestibank.ui.carte.CarteViewModel;

public class IbanFragment extends Fragment {

    private IbanViewModel ibanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ibanViewModel = new ViewModelProvider(this).get(IbanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_iban, container, false);

        return root;
        //  }
    }
}