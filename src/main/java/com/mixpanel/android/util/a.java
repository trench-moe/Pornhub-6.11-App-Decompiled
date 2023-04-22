package com.mixpanel.android.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import cb.e;
import ed.f;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import kotlin.io.ConstantsKt;

/* loaded from: classes.dex */
public class a implements RemoteService {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f8329a;

    public static byte[] c(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr, 0, ConstantsKt.DEFAULT_BUFFER_SIZE);
            if (read == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @SuppressLint({"MissingPermission"})
    public boolean a(Context context, f fVar) {
        if (f8329a) {
            return false;
        }
        boolean z10 = true;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                e.h0("MixpanelAPI.Message", "A default network has not been set so we cannot be certain whether we are offline");
            } else {
                boolean isConnectedOrConnecting = activeNetworkInfo.isConnectedOrConnecting();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ConnectivityManager says we ");
                sb2.append(isConnectedOrConnecting ? "are" : "are not");
                sb2.append(" online");
                e.h0("MixpanelAPI.Message", sb2.toString());
                z10 = isConnectedOrConnecting;
            }
        } catch (SecurityException unused) {
            e.h0("MixpanelAPI.Message", "Don't have permission to check connectivity, will assume we are online");
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x015a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0020 A[EDGE_INSN: B:84:0x015a->B:145:0x0020 ?: BREAK  , LOOP:0: B:3:0x0020->B:145:0x0020, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] b(java.lang.String r13, java.util.Map<java.lang.String, java.lang.Object> r14, javax.net.ssl.SSLSocketFactory r15) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.util.a.b(java.lang.String, java.util.Map, javax.net.ssl.SSLSocketFactory):byte[]");
    }
}
