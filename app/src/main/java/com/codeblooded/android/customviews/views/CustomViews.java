package com.codeblooded.android.customviews.views;

import android.content.Context;
import android.util.AttributeSet;


import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;


public class CustomViews extends AppCompatButton {
    Context context;

    public CustomViews(Context context) {
        super(context);
        this.context = context;
        init(null);
    }

    public CustomViews(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init(null);
    }

    public CustomViews(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init(null);
    }


    public void init(@Nullable AttributeSet attributeSet){
        //Toast.makeText(context.getApplicationContext(), "this is CuastomViewToast", Toast.LENGTH_SHORT).show();



    }


}
