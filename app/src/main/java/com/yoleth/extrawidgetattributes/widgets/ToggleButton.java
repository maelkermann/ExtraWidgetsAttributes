package com.yoleth.extrawidgetattributes.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;

import com.yoleth.extrawidgetattributes.R;
import com.yoleth.extrawidgetattributes.utils.ColorUtils;
import com.yoleth.extrawidgetattributes.utils.ViewUtils;

/**
 * Created by mael on 28/07/16.
 *
 */
public class ToggleButton extends android.widget.ToggleButton {

    public ToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public ToggleButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        ViewUtils.setTextColor(this, context, attrs);

        TypedArray a        = context.obtainStyledAttributes(attrs, R.styleable.ewa);
        final int off       = ColorUtils.getColor(a.getString(R.styleable.ewa_backgroundColorOff));
        final int on        = ColorUtils.getColor(a.getString(R.styleable.ewa_backgroundColor));
        final int texton    = ColorUtils.getColor(a.getString(R.styleable.ewa_textColor));
        final int textoff   = ColorUtils.getColor(a.getString(R.styleable.ewa_textColorOff));

        if ( off != 0 && on != 0 ){
            ViewUtils.setBackgroundColor(this, off);
            ViewUtils.setTextColor(this, textoff);
            this.setOnCheckedChangeListener(new OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    ViewUtils.setBackgroundColor(buttonView, isChecked ? on : off);
                    ViewUtils.setTextColor(buttonView, isChecked ? texton : textoff);
                }
            });
        }

        a.recycle();

    }

}
