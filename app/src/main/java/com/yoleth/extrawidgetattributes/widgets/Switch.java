package com.yoleth.extrawidgetattributes.widgets;

import android.content.Context;
import android.util.AttributeSet;

import com.yoleth.extrawidgetattributes.utils.ViewUtils;


/**
 * Created by mael on 28/07/16.
 *
 */
public class Switch extends android.widget.Switch {

    private final static String TAG = Switch.class.getSimpleName();

    public Switch(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public Switch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        ViewUtils.setSwitchColor(this, context, attrs);
    }

}
