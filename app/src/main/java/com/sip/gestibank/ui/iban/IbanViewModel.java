package com.sip.gestibank.ui.iban;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IbanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public IbanViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}