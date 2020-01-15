package edu.tomerbu.lec7viewmodelspractice.ui.main;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import edu.tomerbu.lec7viewmodelspractice.R;

public class MainFragment extends Fragment {
    private Button btnSend;
    private LinearLayout layoutMessages;
    private EditText etMessage;

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.main_fragment, container, false);

        btnSend = v.findViewById(R.id.button_send);
        layoutMessages = v.findViewById(R.id.layout_messages);
        etMessage = v.findViewById(R.id.edit_message);

        btnSend.setOnClickListener(btn->{

        });

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

}
