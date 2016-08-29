package com.yoleth.extrawidgetattributes.utils;

import android.content.res.ColorStateList;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mael on 28/07/16.
 *
 */
public class ColorUtils {

    private static Map<String, Integer> mColors = new HashMap<>();

    private static ColorStateList colorStateList;

    public static void init(Map<String, Integer> colors, int[] stateColors){
        mColors             = colors;
        colorStateList      = new ColorStateList(
                new int[][]{
                        new int[]{-android.R.attr.state_checked},
                        new int[]{android.R.attr.state_checked}
                },
                stateColors
        );
    }

    public static void init(Map<String, Integer> colors){
        mColors = colors;
    }

    public static void init(int[] stateColors){
        colorStateList = new ColorStateList(
                new int[][]{
                        new int[]{-android.R.attr.state_checked},
                        new int[]{android.R.attr.state_checked}
                },
                stateColors
        );
    }

    public static int getColor(String color){
        return mColors.get(color) == null ? 0 : mColors.get(color);
    }

    public static ColorStateList getColorStateList() {
        return  colorStateList;
    }

}
