package com.example.firstapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class FormFragment extends Fragment {

    private EditText feedbackEditText;
    private Button submitFeedbackButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_form, container, false);


        feedbackEditText = view.findViewById(R.id.feedbackEditText);
        submitFeedbackButton = view.findViewById(R.id.submitFeedbackButton);


        submitFeedbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String feedback = feedbackEditText.getText().toString();


                if (!feedback.isEmpty()) {

                    Toast.makeText(getActivity(), "Feedback submitted: ", Toast.LENGTH_SHORT).show();


                    feedbackEditText.getText().clear();
                } else {

                    Toast.makeText(getActivity(), "Please enter your feedback", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }
}