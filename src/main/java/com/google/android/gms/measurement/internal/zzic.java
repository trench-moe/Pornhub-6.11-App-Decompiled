package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzic {
    public static Object zza(Object obj) {
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        if (obj != null) {
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    } catch (Throwable th2) {
                        th = th2;
                        objectInputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    objectInputStream = null;
                    objectOutputStream = null;
                }
                try {
                    Object readObject = objectInputStream.readObject();
                    objectOutputStream.close();
                    objectInputStream.close();
                    return readObject;
                } catch (Throwable th4) {
                    th = th4;
                    if (objectOutputStream != null) {
                        objectOutputStream.close();
                    }
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    throw th;
                }
            } catch (IOException | ClassNotFoundException unused) {
            }
        }
        return null;
    }

    public static String zzb(String str, String[] strArr, String[] strArr2) {
        Objects.requireNonNull(strArr, "null reference");
        Objects.requireNonNull(strArr2, "null reference");
        int min = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            String str2 = strArr[i10];
            if (str == null && str2 == null) {
                return strArr2[i10];
            }
            if (str.equals(str2)) {
                return strArr2[i10];
            }
        }
        return null;
    }

    public static String zzc(Context context, String str, String str2) {
        Objects.requireNonNull(context, "null reference");
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = zzfj.zza(context);
        }
        return zzfj.zzb("google_app_id", resources, str2);
    }
}
