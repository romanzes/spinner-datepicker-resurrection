package ru.romanzes.spinnerdatepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class Dialogs {
    public static DatePickerDialog createDatePicker(
            @NonNull Context context,
            @Nullable DatePickerDialog.OnDateSetListener listener,
            int year, int month, int dayOfMonth) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            return new DatePickerDialog(context, listener, year, month, dayOfMonth);
        } else {
            return new MarshmallowDatePickerDialog(context, listener, year, month, dayOfMonth);
        }
    }
}
