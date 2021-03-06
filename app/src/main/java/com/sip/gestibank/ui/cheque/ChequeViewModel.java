package com.sip.gestibank.ui.cheque;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChequeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ChequeViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}