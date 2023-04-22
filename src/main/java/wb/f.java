package wb;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes2.dex */
public class f implements wb.a {
    public static final Charset d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final File f17451a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17452b;

    /* renamed from: c  reason: collision with root package name */
    public e f17453c;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f17454a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17455b;

        public a(byte[] bArr, int i10) {
            this.f17454a = bArr;
            this.f17455b = i10;
        }
    }

    public f(File file, int i10) {
        this.f17451a = file;
        this.f17452b = i10;
    }

    @Override // wb.a
    public void a() {
        CommonUtils.a(this.f17453c, "There was a problem closing the Crashlytics log file.");
        this.f17453c = null;
    }

    @Override // wb.a
    public String b() {
        byte[] d10 = d();
        if (d10 != null) {
            return new String(d10, d);
        }
        return null;
    }

    @Override // wb.a
    public void c(long j10, String str) {
        int i10;
        e();
        if (this.f17453c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > this.f17452b / 4) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f17453c.c(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(d));
            while (!this.f17453c.f() && this.f17453c.s() > this.f17452b) {
                this.f17453c.k();
            }
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] d() {
        /*
            r13 = this;
            java.io.File r0 = r13.f17451a
            r12 = 1
            boolean r10 = r0.exists()
            r0 = r10
            r10 = 0
            r1 = r10
            r10 = 0
            r2 = r10
            if (r0 != 0) goto L11
            r12 = 7
        Lf:
            r4 = r1
            goto L83
        L11:
            r11 = 2
            r13.e()
            wb.e r0 = r13.f17453c
            if (r0 != 0) goto L1b
            r12 = 4
            goto Lf
        L1b:
            r12 = 1
            r10 = 1
            r3 = r10
            int[] r3 = new int[r3]
            r3[r2] = r2
            int r10 = r0.s()
            r0 = r10
            byte[] r0 = new byte[r0]
            r11 = 2
            wb.e r4 = r13.f17453c     // Catch: java.io.IOException -> L72
            monitor-enter(r4)     // Catch: java.io.IOException -> L72
            r12 = 7
            wb.e$b r5 = r4.f17443m     // Catch: java.lang.Throwable -> L6f
            r11 = 1
            int r5 = r5.f17446a     // Catch: java.lang.Throwable -> L6f
            r11 = 5
            r10 = 0
            r6 = r10
        L36:
            int r7 = r4.f17442j     // Catch: java.lang.Throwable -> L6f
            r11 = 3
            if (r6 >= r7) goto L6a
            wb.e$b r5 = r4.h(r5)     // Catch: java.lang.Throwable -> L6f
            wb.e$c r7 = new wb.e$c     // Catch: java.lang.Throwable -> L6f
            r7.<init>(r5, r1)     // Catch: java.lang.Throwable -> L6f
            r12 = 2
            int r8 = r5.f17447b     // Catch: java.lang.Throwable -> L6f
            r11 = 7
            r9 = r3[r2]     // Catch: java.lang.Throwable -> L64
            r7.read(r0, r9, r8)     // Catch: java.lang.Throwable -> L64
            r9 = r3[r2]     // Catch: java.lang.Throwable -> L64
            int r9 = r9 + r8
            r3[r2] = r9     // Catch: java.lang.Throwable -> L64
            r7.close()     // Catch: java.lang.Throwable -> L6f
            int r7 = r5.f17446a     // Catch: java.lang.Throwable -> L6f
            int r7 = r7 + 4
            int r5 = r5.f17447b     // Catch: java.lang.Throwable -> L6f
            int r7 = r7 + r5
            r11 = 3
            int r5 = r4.t(r7)     // Catch: java.lang.Throwable -> L6f
            int r6 = r6 + 1
            goto L36
        L64:
            r5 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L6f
            r11 = 4
            throw r5     // Catch: java.lang.Throwable -> L6f
        L6a:
            r12 = 3
            r11 = 1
            monitor-exit(r4)     // Catch: java.io.IOException -> L72
            r12 = 3
            goto L7b
        L6f:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.io.IOException -> L72
            throw r5     // Catch: java.io.IOException -> L72
        L72:
            r4 = move-exception
            java.lang.String r5 = "A problem occurred while reading the Crashlytics log file."
            java.lang.String r10 = "FirebaseCrashlytics"
            r6 = r10
            android.util.Log.e(r6, r5, r4)
        L7b:
            wb.f$a r4 = new wb.f$a
            r3 = r3[r2]
            r12 = 4
            r4.<init>(r0, r3)
        L83:
            if (r4 != 0) goto L87
            r12 = 1
            return r1
        L87:
            r12 = 3
            int r0 = r4.f17455b
            r12 = 1
            byte[] r1 = new byte[r0]
            r11 = 5
            byte[] r3 = r4.f17454a
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wb.f.d():byte[]");
    }

    public final void e() {
        if (this.f17453c == null) {
            try {
                this.f17453c = new e(this.f17451a);
            } catch (IOException e10) {
                StringBuilder m10 = a1.a.m("Could not open log file: ");
                m10.append(this.f17451a);
                Log.e("FirebaseCrashlytics", m10.toString(), e10);
            }
        }
    }
}
