package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ai {
    private static ai AFKeystoreWrapper = new ai();

    private ai() {
    }

    public static void AFInAppEventParameterName(String str, Context context) {
        File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb2 = new StringBuilder("Deleting ");
        sb2.append(str);
        sb2.append(" from cache");
        AFLogger.AFKeystoreWrapper(sb2.toString());
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e10) {
                StringBuilder sb3 = new StringBuilder("Could not delete ");
                sb3.append(str);
                sb3.append(" from cache");
                AFLogger.AFInAppEventParameterName(sb3.toString(), e10);
            }
        }
    }

    public static h AFKeystoreWrapper(File file) {
        FileReader fileReader;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
        } catch (Exception unused) {
            fileReader = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            char[] cArr = new char[(int) file.length()];
            fileReader.read(cArr);
            h hVar = new h(cArr);
            hVar.AFInAppEventParameterName = file.getName();
            try {
                fileReader.close();
            } catch (IOException e10) {
                AFLogger.AFInAppEventParameterName(e10);
            }
            return hVar;
        } catch (Exception unused2) {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e11) {
                    AFLogger.AFInAppEventParameterName(e11);
                    return null;
                }
                return null;
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileReader2 = fileReader;
            if (fileReader2 != null) {
                try {
                    fileReader2.close();
                } catch (IOException e12) {
                    AFLogger.AFInAppEventParameterName(e12);
                }
            }
            throw th;
        }
    }

    public static List<h> AFKeystoreWrapper(Context context) {
        File file;
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
            file = new File(context.getFilesDir(), "AFRequestCache");
        } catch (Exception e10) {
            AFLogger.AFInAppEventParameterName("Could not cache request", e10);
        }
        if (!file.exists()) {
            file.mkdir();
            return arrayList;
        }
        for (File file2 : file.listFiles()) {
            StringBuilder sb2 = new StringBuilder("Found cached request");
            sb2.append(file2.getName());
            AFLogger.AFKeystoreWrapper(sb2.toString());
            arrayList.add(AFKeystoreWrapper(file2));
        }
        return arrayList;
    }

    public static ai valueOf() {
        return AFKeystoreWrapper;
    }

    public static File values(Context context) {
        return new File(context.getFilesDir(), "AFRequestCache");
    }
}
