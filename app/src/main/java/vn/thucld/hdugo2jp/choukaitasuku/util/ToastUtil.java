package vn.thucld.hdugo2jp.choukaitasuku.util;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    public ToastUtil() {
    }

    public static void showShort(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void showLong(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

}
