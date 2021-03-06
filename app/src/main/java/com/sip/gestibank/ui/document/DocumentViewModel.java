package com.sip.gestibank.ui.document;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DocumentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DocumentViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }
}