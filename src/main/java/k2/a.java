package k2;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes2.dex */
public class a implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    public final HttpURLConnection f11773c;

    public a(HttpURLConnection httpURLConnection) {
        this.f11773c = httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a() {
        /*
            r5 = this;
            r2 = r5
            java.lang.String r4 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.net.HttpURLConnection r0 = r2.f11773c     // Catch: java.io.IOException -> L12
            int r0 = r0.getResponseCode()     // Catch: java.io.IOException -> L12
            int r0 = r0 / 100
            r1 = 2
            r4 = 1
            if (r0 != r1) goto L12
            r4 = 1
            r0 = r4
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L18
            r4 = 1
            r0 = 0
            goto L50
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L51
            r4 = 3
            r0.<init>()     // Catch: java.io.IOException -> L51
            java.lang.String r1 = "Unable to fetch "
            r0.append(r1)     // Catch: java.io.IOException -> L51
            java.net.HttpURLConnection r1 = r2.f11773c     // Catch: java.io.IOException -> L51
            r4 = 3
            java.net.URL r1 = r1.getURL()     // Catch: java.io.IOException -> L51
            r0.append(r1)     // Catch: java.io.IOException -> L51
            java.lang.String r4 = ". Failed with "
            r1 = r4
            r0.append(r1)     // Catch: java.io.IOException -> L51
            java.net.HttpURLConnection r1 = r2.f11773c     // Catch: java.io.IOException -> L51
            int r1 = r1.getResponseCode()     // Catch: java.io.IOException -> L51
            r0.append(r1)     // Catch: java.io.IOException -> L51
            java.lang.String r1 = "\n"
            r4 = 1
            r0.append(r1)     // Catch: java.io.IOException -> L51
            java.net.HttpURLConnection r1 = r2.f11773c     // Catch: java.io.IOException -> L51
            java.lang.String r1 = r2.c(r1)     // Catch: java.io.IOException -> L51
            r0.append(r1)     // Catch: java.io.IOException -> L51
            java.lang.String r4 = r0.toString()     // Catch: java.io.IOException -> L51
            r0 = r4
        L50:
            return r0
        L51:
            r0 = move-exception
            java.lang.String r4 = "get error failed "
            r1 = r4
            m2.c.b(r1, r0)
            java.lang.String r0 = r0.getMessage()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.a.a():java.lang.String");
    }

    public final String c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb2.append(readLine);
                        sb2.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception e10) {
                    throw e10;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11773c.disconnect();
    }
}
