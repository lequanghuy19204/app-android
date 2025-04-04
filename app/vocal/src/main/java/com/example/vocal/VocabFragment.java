package com.example.vocal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class VocabFragment {
    Vocab vocab;
    VocabFragment(Vocab vocab){
        this.vocab = vocab;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.vocab_layout, container, false);
        TextView defTextView = rootView.findViewById(R.id.defTextView);
        defTextView.setText(vocab.def);
        TextView ipaTextView = rootView.findViewById(R.id.ipaTextView);
        ipaTextView.setText(vocab.ipa);
        return rootView;
    }
}
