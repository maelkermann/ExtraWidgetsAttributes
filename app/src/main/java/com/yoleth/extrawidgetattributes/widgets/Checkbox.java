package com.yoleth.extrawidgetattributes.widgets;

import android.content.Context;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;

import com.yoleth.extrawidgetattributes.utils.ViewUtils;


/**
 * Created by mael on 28/07/16.
 *
 */
public class Checkbox extends AppCompatCheckBox {

    public Checkbox(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public Checkbox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        ViewUtils.setBackground(this, context, attrs);
        ViewUtils.setHighlightColor(this, context, attrs);
        ViewUtils.setTextColor(this, context, attrs);
    }

}
