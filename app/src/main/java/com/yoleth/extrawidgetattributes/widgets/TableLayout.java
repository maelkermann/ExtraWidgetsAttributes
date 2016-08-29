package com.yoleth.extrawidgetattributes.widgets;

import android.content.Context;
import android.util.AttributeSet;

import com.yoleth.extrawidgetattributes.utils.ViewUtils;

/**
 * Created by mael on 28/07/16.
 *
 */
public class TableLayout extends android.widget.TableLayout {

    private Context mContext;
    private AttributeSet mAttributeSet;

    public TableLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {

        mContext        = context;
        mAttributeSet   = attrs;

        ViewUtils.setBackground(this, context, attrs);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ViewUtils.setMinHeight(this, mContext, mAttributeSet, widthMeasureSpec, heightMeasureSpec);
        ViewUtils.setMaxHeight(this, mContext, mAttributeSet, widthMeasureSpec, heightMeasureSpec);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

}
