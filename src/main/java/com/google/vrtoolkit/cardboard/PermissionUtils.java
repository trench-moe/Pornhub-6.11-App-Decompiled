package com.google.vrtoolkit.cardboard;

import android.content.Context;
import android.os.Process;

/* loaded from: classes.dex */
public class PermissionUtils {
    public static boolean hasPermission(Context context, String str) {
        return (context == null || str == null || context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) ? false : true;
    }
}
