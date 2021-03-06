package com.sip.gestibank.ui.credit;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CreditViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CreditViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}