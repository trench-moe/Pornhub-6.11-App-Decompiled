package q5;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f14385g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f14386h;

    /* renamed from: i  reason: collision with root package name */
    public static final File f14387i;

    /* renamed from: j  reason: collision with root package name */
    public static volatile n f14388j;

    /* renamed from: k  reason: collision with root package name */
    public static volatile int f14389k;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14390a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14391b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14392c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14393e = true;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f14394f = new AtomicBoolean(false);

    static {
        int i10 = Build.VERSION.SDK_INT;
        f14385g = i10 < 29;
        f14386h = i10 >= 26;
        f14387i = new File("/proc/self/fd");
        f14389k = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
        if ((android.os.Build.VERSION.SDK_INT != 27 ? false : java.util.Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(android.os.Build.MODEL)) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n() {
        /*
            r26 = this;
            r0 = r26
            r26.<init>()
            r1 = 1
            r0.f14393e = r1
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            r0.f14394f = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r2 == r4) goto L17
            goto L5b
        L17:
            java.lang.String r5 = "SC-04J"
            java.lang.String r6 = "SM-N935"
            java.lang.String r7 = "SM-J720"
            java.lang.String r8 = "SM-G570F"
            java.lang.String r9 = "SM-G570M"
            java.lang.String r10 = "SM-G960"
            java.lang.String r11 = "SM-G965"
            java.lang.String r12 = "SM-G935"
            java.lang.String r13 = "SM-G930"
            java.lang.String r14 = "SM-A520"
            java.lang.String r15 = "SM-A720F"
            java.lang.String r16 = "moto e5"
            java.lang.String r17 = "moto e5 play"
            java.lang.String r18 = "moto e5 plus"
            java.lang.String r19 = "moto e5 cruise"
            java.lang.String r20 = "moto g(6) forge"
            java.lang.String r21 = "moto g(6) play"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = android.os.Build.MODEL
            boolean r4 = r5.startsWith(r4)
            if (r4 == 0) goto L45
            r2 = 1
            goto L5c
        L5b:
            r2 = 0
        L5c:
            if (r2 != 0) goto La1
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 27
            if (r2 == r4) goto L66
            r2 = 0
            goto L9e
        L66:
            java.lang.String r5 = "LG-M250"
            java.lang.String r6 = "LG-M320"
            java.lang.String r7 = "LG-Q710AL"
            java.lang.String r8 = "LG-Q710PL"
            java.lang.String r9 = "LGM-K121K"
            java.lang.String r10 = "LGM-K121L"
            java.lang.String r11 = "LGM-K121S"
            java.lang.String r12 = "LGM-X320K"
            java.lang.String r13 = "LGM-X320L"
            java.lang.String r14 = "LGM-X320S"
            java.lang.String r15 = "LGM-X401L"
            java.lang.String r16 = "LGM-X401S"
            java.lang.String r17 = "LM-Q610.FG"
            java.lang.String r18 = "LM-Q610.FGN"
            java.lang.String r19 = "LM-Q617.FG"
            java.lang.String r20 = "LM-Q617.FGN"
            java.lang.String r21 = "LM-Q710.FG"
            java.lang.String r22 = "LM-Q710.FGN"
            java.lang.String r23 = "LM-X220PM"
            java.lang.String r24 = "LM-X220QMA"
            java.lang.String r25 = "LM-X410PM"
            java.lang.String[] r2 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r4 = android.os.Build.MODEL
            boolean r2 = r2.contains(r4)
        L9e:
            if (r2 != 0) goto La1
            goto La2
        La1:
            r1 = 0
        La2:
            r0.f14390a = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lb1
            r1 = 20000(0x4e20, float:2.8026E-41)
            r0.f14391b = r1
            r0.f14392c = r3
            goto Lb9
        Lb1:
            r1 = 700(0x2bc, float:9.81E-43)
            r0.f14391b = r1
            r1 = 128(0x80, float:1.8E-43)
            r0.f14392c = r1
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.n.<init>():void");
    }

    public static n a() {
        if (f14388j == null) {
            synchronized (n.class) {
                if (f14388j == null) {
                    f14388j = new n();
                }
            }
        }
        return f14388j;
    }

    public boolean b(int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!this.f14390a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        } else if (!f14386h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else {
            if (f14385g && !this.f14394f.get()) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                }
                return false;
            } else if (z11) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                }
                return false;
            } else {
                int i12 = this.f14392c;
                if (i10 < i12) {
                    if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
                    }
                    return false;
                } else if (i11 < i12) {
                    if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
                    }
                    return false;
                } else {
                    synchronized (this) {
                        int i13 = this.d + 1;
                        this.d = i13;
                        if (i13 >= 50) {
                            this.d = 0;
                            int length = f14387i.list().length;
                            long j10 = f14389k != -1 ? f14389k : this.f14391b;
                            boolean z13 = ((long) length) < j10;
                            this.f14393e = z13;
                            if (!z13 && Log.isLoggable("Downsampler", 5)) {
                                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j10);
                            }
                        }
                        z12 = this.f14393e;
                    }
                    if (z12) {
                        return true;
                    }
                    if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                    }
                    return false;
                }
            }
        }
    }
}
