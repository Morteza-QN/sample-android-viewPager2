package com.example.sampleandroidviewpager2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SlideFragment extends Fragment {
    private static final String EXTRA_KEY_DATA = "data";

    static SlideFragment newInstance(String data) {
        Bundle        args     = new Bundle();
        SlideFragment fragment = new SlideFragment();
        args.putString(EXTRA_KEY_DATA, data);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_slide, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView slideTv = view.findViewById(R.id.tv_fragment_slide);
        slideTv.setText(getArguments() != null ? getArguments().getString(EXTRA_KEY_DATA) : "null");
    }
}
