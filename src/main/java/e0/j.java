package e0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import d0.d;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class j extends k {
    @Override // e0.k
    public Typeface a(Context context, d.b bVar, Resources resources, int i10) {
        try {
            d.c[] cVarArr = bVar.f8596a;
            int length = cVarArr.length;
            FontFamily.Builder builder = null;
            int i11 = 0;
            while (true) {
                int i12 = 1;
                if (i11 >= length) {
                    break;
                }
                d.c cVar = cVarArr[i11];
                try {
                    Font.Builder weight = new Font.Builder(resources, cVar.f8601f).setWeight(cVar.f8598b);
                    if (!cVar.f8599c) {
                        i12 = 0;
                    }
                    Font build = weight.setSlant(i12).setTtcIndex(cVar.f8600e).setFontVariationSettings(cVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i11++;
            }
            if (builder == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
        if (r4 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        if ((r15 & 1) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
        r13 = 700;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r13 = 400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
        if ((r15 & 2) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
        return new android.graphics.Typeface.CustomFallbackBuilder(r4.build()).setStyle(new android.graphics.fonts.FontStyle(r13, r2)).build();
     */
    @Override // e0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Typeface b(android.content.Context r12, android.os.CancellationSignal r13, j0.l[] r14, int r15) {
        /*
            r11 = this;
            android.content.ContentResolver r12 = r12.getContentResolver()
            r0 = 0
            r10 = 4
            r10 = 3
            int r1 = r14.length     // Catch: java.lang.Exception -> L9e
            r10 = 3
            r10 = 0
            r2 = r10
            r4 = r0
            r3 = 0
            r10 = 7
        Le:
            r5 = 1
            r10 = 1
            if (r3 >= r1) goto L6d
            r10 = 5
            r6 = r14[r3]     // Catch: java.lang.Exception -> L9e
            android.net.Uri r7 = r6.f11121a     // Catch: java.io.IOException -> L69 java.lang.Exception -> L9e
            r10 = 4
            java.lang.String r10 = "r"
            r8 = r10
            android.os.ParcelFileDescriptor r10 = r12.openFileDescriptor(r7, r8, r13)     // Catch: java.io.IOException -> L69 java.lang.Exception -> L9e
            r7 = r10
            if (r7 != 0) goto L29
            if (r7 == 0) goto L69
            r10 = 2
        L25:
            r7.close()     // Catch: java.io.IOException -> L69 java.lang.Exception -> L9e
            goto L69
        L29:
            r10 = 2
            android.graphics.fonts.Font$Builder r8 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L5d
            r10 = 5
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L5d
            int r9 = r6.f11123c     // Catch: java.lang.Throwable -> L5d
            android.graphics.fonts.Font$Builder r8 = r8.setWeight(r9)     // Catch: java.lang.Throwable -> L5d
            boolean r9 = r6.d     // Catch: java.lang.Throwable -> L5d
            r10 = 3
            if (r9 == 0) goto L3d
            r10 = 2
            goto L40
        L3d:
            r10 = 6
            r10 = 0
            r5 = r10
        L40:
            android.graphics.fonts.Font$Builder r5 = r8.setSlant(r5)     // Catch: java.lang.Throwable -> L5d
            int r6 = r6.f11122b     // Catch: java.lang.Throwable -> L5d
            android.graphics.fonts.Font$Builder r10 = r5.setTtcIndex(r6)     // Catch: java.lang.Throwable -> L5d
            r5 = r10
            android.graphics.fonts.Font r5 = r5.build()     // Catch: java.lang.Throwable -> L5d
            if (r4 != 0) goto L59
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Throwable -> L5d
            r10 = 2
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L5d
            r4 = r6
            goto L25
        L59:
            r4.addFont(r5)     // Catch: java.lang.Throwable -> L5d
            goto L25
        L5d:
            r5 = move-exception
            r10 = 5
            r7.close()     // Catch: java.lang.Throwable -> L63
            goto L68
        L63:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.io.IOException -> L69 java.lang.Exception -> L9e
            r10 = 6
        L68:
            throw r5     // Catch: java.io.IOException -> L69 java.lang.Exception -> L9e
        L69:
            int r3 = r3 + 1
            r10 = 3
            goto Le
        L6d:
            r10 = 3
            if (r4 != 0) goto L71
            return r0
        L71:
            r10 = 7
            android.graphics.fonts.FontStyle r12 = new android.graphics.fonts.FontStyle     // Catch: java.lang.Exception -> L9e
            r13 = r15 & 1
            r10 = 4
            if (r13 == 0) goto L7e
            r10 = 1
            r10 = 700(0x2bc, float:9.81E-43)
            r13 = r10
            goto L80
        L7e:
            r13 = 400(0x190, float:5.6E-43)
        L80:
            r14 = r15 & 2
            r10 = 2
            if (r14 == 0) goto L86
            r2 = 1
        L86:
            r12.<init>(r13, r2)     // Catch: java.lang.Exception -> L9e
            r10 = 1
            android.graphics.Typeface$CustomFallbackBuilder r13 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L9e
            android.graphics.fonts.FontFamily r10 = r4.build()     // Catch: java.lang.Exception -> L9e
            r14 = r10
            r13.<init>(r14)     // Catch: java.lang.Exception -> L9e
            android.graphics.Typeface$CustomFallbackBuilder r10 = r13.setStyle(r12)     // Catch: java.lang.Exception -> L9e
            r12 = r10
            android.graphics.Typeface r12 = r12.build()     // Catch: java.lang.Exception -> L9e
            return r12
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.j.b(android.content.Context, android.os.CancellationSignal, j0.l[], int):android.graphics.Typeface");
    }

    @Override // e0.k
    public Typeface c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // e0.k
    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font build = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // e0.k
    public j0.l e(j0.l[] lVarArr, int i10) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
