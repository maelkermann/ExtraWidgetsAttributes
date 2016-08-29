package com.yoleth.extrawidgetattributes.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import com.yoleth.extrawidgetattributes.R;
import com.yoleth.extrawidgetattributes.widgets.EditText;
import com.yoleth.extrawidgetattributes.widgets.RatingBar;
import com.yoleth.extrawidgetattributes.widgets.Switch;
import com.yoleth.extrawidgetattributes.widgets.TextView;

/**
 * Created by mael on 01/08/16.
 *
 */
public class ViewUtils {

    public static void setBackground(View view, Context context, AttributeSet attrs){

        TypedArray a    = context.obtainStyledAttributes(attrs, R.styleable.ewa);
        int color       = ColorUtils.getColor(a.getString(R.styleable.ewa_backgroundColor));

        if ( color != 0 ){
            view.setBackgroundColor(color);
        }

        a.recycle();

    }

    public static void setHighlightColor(AppCompatCheckBox view, Context context, AttributeSet attrs){

        TypedArray a    = context.obtainStyledAttributes(attrs, R.styleable.ewa);
        int color       = ColorUtils.getColor(a.getString(R.styleable.ewa_highlightColor));

        if ( color != 0 ){
            view.setSupportButtonTintList(ColorUtils.getColorStateList());
        }

        a.recycle();

    }

    public static void setHighlightColor(AppCompatRadioButton view, Context context, AttributeSet attrs){

        TypedArray a    = context.obtainStyledAttributes(attrs, R.styleable.ewa);
        int color       = ColorUtils.getColor(a.getString(R.styleable.ewa_highlightColor));

        if ( color != 0 ){
            view.setSupportButtonTintList(ColorUtils.getColorStateList());
        }

        a.recycle();

    }

    public static void setTextColor(TextView view, Context context, AttributeSet attrs) {

        TypedArray a    = context.obtainStyledAttributes(attrs, R.styleable.ewa);
        int color       = ColorUtils.getColor(a.getString(R.styleable.ewa_textColor));

        if ( color != 0 ){
            view.setTextColor(color);
        }

        a.recycle();

    }

    public static void setTextColor(Button view, Context context, AttributeSet attrs) {

        TypedArray a    = context.obtainStyledAttributes(attrs, R.styleable.ewa);
        int color       = ColorUtils.getColor(a.getString(R.styleable.ewa_textColor));

        if ( color != 0 ){
            view.setTextColor(color);
        }

        a.recycle();

    }

    public static void setTextColor(EditText view, Context context, AttributeSet attrs) {

        TypedArray a    = context.obtainStyledAttributes(attrs, R.styleable.ewa);
        int color       = ColorUtils.getColor(a.getString(R.styleable.ewa_textColor));

        if ( color != 0 ){
            view.setTextColor(color);
        }

        a.recycle();

    }

    public static void setHintColor(EditText view, Context context, AttributeSet attrs) {

        TypedArray a    = context.obtainStyledAttributes(attrs, R.styleable.ewa);
        int color       = ColorUtils.getColor(a.getString(R.styleable.ewa_hintColor));

        if ( color != 0 ){
            view.setHintTextColor(color);
        }

        a.recycle();

    }

    public static void setMinHeight(View view, Context context, AttributeSet attrs, int widthMeasureSpec, int heightMeasureSpec){

        TypedArray a    = context.obtainStyledAttributes(attrs, R.styleable.ewa);
        int minHeight   = a.getDimensionPixelSize(R.styleable.ewa_minHeight, 0);

        if ( minHeight != 0 ){

            int hSize = View.MeasureSpec.getSize(heightMeasureSpec);
            int hMode = View.MeasureSpec.getMode(heightMeasureSpec);

            switch (hMode){
                case View.MeasureSpec.AT_MOST:
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(hSize, minHeight), View.MeasureSpec.AT_MOST);
                    break;
                case View.MeasureSpec.UNSPECIFIED:
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(minHeight, View.MeasureSpec.AT_MOST);
                    break;
                case View.MeasureSpec.EXACTLY:
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(hSize, minHeight), View.MeasureSpec.EXACTLY);
                    break;
            }

        }

        a.recycle();

    }

    public static void setMaxHeight(View view, Context context, AttributeSet attrs, int widthMeasureSpec, int heightMeasureSpec){

        TypedArray a    = context.obtainStyledAttributes(attrs, R.styleable.ewa);
        int maxHeight   = a.getDimensionPixelSize(R.styleable.ewa_maxHeight, 0);

        if ( maxHeight != 0 ){

            int hSize = View.MeasureSpec.getSize(heightMeasureSpec);
            int hMode = View.MeasureSpec.getMode(heightMeasureSpec);

            switch (hMode){
                case View.MeasureSpec.AT_MOST:
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(hSize, maxHeight), View.MeasureSpec.AT_MOST);
                    break;
                case View.MeasureSpec.UNSPECIFIED:
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(maxHeight, View.MeasureSpec.AT_MOST);
                    break;
                case View.MeasureSpec.EXACTLY:
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(hSize, maxHeight), View.MeasureSpec.EXACTLY);
                    break;
            }

        }

        a.recycle();

    }

    public static void setSwitchColor(Switch view, Context context, AttributeSet attrs) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ewa);
            int color = ColorUtils.getColor(a.getString(R.styleable.ewa_highlightColor));

            if (color != 0) {
                view.getThumbDrawable().setColorFilter(color, PorterDuff.Mode.MULTIPLY);
                view.getTrackDrawable().setColorFilter(color, PorterDuff.Mode.MULTIPLY);
            }

            a.recycle();
        }

    }

    public static void setRatingColor(RatingBar view, Context context, AttributeSet attrs){

        TypedArray a    = context.obtainStyledAttributes(attrs, R.styleable.ewa);
        int color       = ColorUtils.getColor(a.getString(R.styleable.ewa_highlightColor));

        if ( color != 0 ){
            LayerDrawable stars = (LayerDrawable) view.getProgressDrawable();
            stars.getDrawable(2).setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }

        a.recycle();

    }

    public static void setBackgroundColor(View view, int color){
        view.setBackgroundColor(color);
    }

    public static void setTextColor(Button view, int color){
        view.setTextColor(color);
    }

}
