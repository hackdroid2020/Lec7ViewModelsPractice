package edu.tomerbu.lec7viewmodelspractice.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;


//the data we want to show:
public class MainViewModel extends ViewModel {
    //List<String>
    private MutableLiveData<List<String>> messages = new MutableLiveData<>();

    public void addMessage(String message) {

        List<String> mList = messages.getValue();
        if (mList != null)
            mList.add(message);
        messages.setValue(mList);
    }

    public LiveData<List<String>> getMessages() {
        return messages;
    }
}
