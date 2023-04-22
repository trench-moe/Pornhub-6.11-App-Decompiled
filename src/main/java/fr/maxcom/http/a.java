package fr.maxcom.http;

import java.net.ServerSocket;
import vd.e;
import vd.f;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final ServerSocket f9635a;

    /* renamed from: b  reason: collision with root package name */
    public final b f9636b;

    /* renamed from: c  reason: collision with root package name */
    public final f f9637c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public yd.b f9638e = new FileDataSource();

    /* renamed from: f  reason: collision with root package name */
    public Thread f9639f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f9640g;

    /* renamed from: h  reason: collision with root package name */
    public qd.a f9641h;

    /* renamed from: fr.maxcom.http.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0135a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9642a;

        static {
            try {
                new int[Diagnostic$Code.values().length][0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr = new int[d.values().length];
            f9642a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9642a[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public pd.a f9643a;

        public b(C0135a c0135a) {
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x011b  */
        @Override // vd.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(md.i r18, md.l r19, vd.a r20) {
            /*
                Method dump skipped, instructions count: 631
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.maxcom.http.a.b.a(md.i, md.l, vd.a):void");
        }

        public void b() {
            pd.a aVar = this.f9643a;
            if (aVar != null) {
                aVar.a().close();
                this.f9643a = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c(C0135a c0135a) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:118:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00bc, code lost:
            if (r12 >= ((int) (java.util.Calendar.getInstance().getTimeInMillis() / 1000))) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x01ae, code lost:
            if (r15.f9645c.f9635a.isClosed() != false) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x01b0, code lost:
            r15.f9645c.f9635a.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x01b9, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x01ba, code lost:
            android.util.Log.e("SingleHttpServer", "Error while closing the server socket", r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x01c1, code lost:
            return;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 450
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fr.maxcom.http.a.c.run():void");
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        LOCAL,
        /* JADX INFO: Fake field, exist only in values array */
        WIFI
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x013d, code lost:
        if (r4 < ((int) (java.util.Calendar.getInstance().getTimeInMillis() / 1000))) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(fr.maxcom.http.a.d r11) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.maxcom.http.a.<init>(fr.maxcom.http.a$d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r11 = "smb://"
            r0 = r11
            boolean r11 = r15.startsWith(r0)
            r0 = r11
            r1 = 0
            java.lang.String r12 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.lang.String r11 = "SingleHttpServer"
            r2 = r11
            r11 = 0
            r3 = r11
            if (r0 == 0) goto L24
            r12 = 3
            boolean r0 = r14.d
            r13 = 5
            if (r0 == 0) goto L1b
            r11 = 1
            r3 = r11
            goto L21
        L1b:
            java.lang.String r11 = "Missing the jCIFS Library. Get it at http://jcifs.samba.org"
            r0 = r11
            android.util.Log.e(r2, r0)
        L21:
            if (r3 != 0) goto L4f
            return r1
        L24:
            r12 = 6
            java.lang.String r0 = "asset://"
            r12 = 5
            boolean r11 = r15.startsWith(r0)
            r0 = r11
            if (r0 == 0) goto L30
            goto L4f
        L30:
            java.lang.String r11 = "http://"
            r0 = r11
            boolean r11 = r15.startsWith(r0)
            r0 = r11
            if (r0 != 0) goto L4f
            java.lang.String r11 = "https://"
            r0 = r11
            boolean r11 = r15.startsWith(r0)
            r0 = r11
            if (r0 != 0) goto L4f
            java.lang.String r0 = "ftp://"
            r12 = 3
            boolean r11 = r15.startsWith(r0)
            r0 = r11
            if (r0 == 0) goto L50
            r12 = 5
        L4f:
            r3 = 1
        L50:
            r12 = 6
            if (r3 == 0) goto L5b
            r12 = 5
            java.lang.String r11 = "/"
            r0 = r11
            java.lang.String r15 = a1.a.l(r0, r15)
        L5b:
            r8 = r15
            r11 = 0
            r9 = r11
            java.net.URI r15 = new java.net.URI     // Catch: java.net.URISyntaxException -> L82
            java.lang.String r11 = "http"
            r4 = r11
            r5 = 0
            r12 = 4
            java.net.ServerSocket r0 = r14.f9635a     // Catch: java.net.URISyntaxException -> L82
            java.net.InetAddress r11 = r0.getInetAddress()     // Catch: java.net.URISyntaxException -> L82
            r0 = r11
            java.lang.String r6 = r0.getHostAddress()     // Catch: java.net.URISyntaxException -> L82
            java.net.ServerSocket r0 = r14.f9635a     // Catch: java.net.URISyntaxException -> L82
            r12 = 5
            int r11 = r0.getLocalPort()     // Catch: java.net.URISyntaxException -> L82
            r7 = r11
            r10 = 0
            r3 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.net.URISyntaxException -> L82
            java.lang.String r1 = r15.toASCIIString()     // Catch: java.net.URISyntaxException -> L82
            goto L9a
        L82:
            r15 = move-exception
            java.lang.String r11 = "Unsupported URI syntax: "
            r0 = r11
            java.lang.StringBuilder r0 = a1.a.m(r0)
            java.lang.String r11 = r15.getMessage()
            r15 = r11
            r0.append(r15)
            java.lang.String r11 = r0.toString()
            r15 = r11
            android.util.Log.e(r2, r15)
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.maxcom.http.a.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:6|(4:8|(3:10|(1:12)|(5:14|15|16|17|18))|24|(9:26|27|28|29|30|31|(1:33)|34|35))|41|29|30|31|(0)|34|35) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
        android.util.Log.w("SingleHttpServer", "Interrupted while waiting for server stopping");
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            r10 = this;
            r6 = 0
            r0 = r6
            r10.f9640g = r0
            r7 = 6
            java.lang.Thread r1 = r10.f9639f
            r9 = 6
            java.lang.String r2 = "SingleHttpServer"
            if (r1 != 0) goto L12
            java.lang.String r0 = "Server is stopped without being started"
            android.util.Log.w(r2, r0)
            return
        L12:
            r1.interrupt()
            java.lang.Thread r1 = r10.f9639f
            r8 = 7
            boolean r6 = r1.isAlive()
            r1 = r6
            java.lang.String r3 = "Interrupted while waiting for server stopping"
            r8 = 6
            if (r1 == 0) goto L67
            r9 = 7
            qd.a r1 = r10.f9641h
            r7 = 5
            if (r1 == 0) goto L4e
            java.util.concurrent.atomic.AtomicReference r1 = r1.f14500t
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L32
            r6 = 1
            r0 = r6
        L32:
            if (r0 == 0) goto L4e
            r7 = 3
            qd.a r0 = r10.f9641h     // Catch: java.io.IOException -> L3c
            r7 = 2
            r0.h()     // Catch: java.io.IOException -> L3c
            goto L42
        L3c:
            r0 = move-exception
            java.lang.String r1 = "Error while closing the client connection"
            android.util.Log.e(r2, r1, r0)
        L42:
            r8 = 3
            java.lang.Thread r0 = r10.f9639f     // Catch: java.lang.InterruptedException -> L4b
            r4 = 100
            r0.join(r4)     // Catch: java.lang.InterruptedException -> L4b
            goto L4e
        L4b:
            android.util.Log.w(r2, r3)
        L4e:
            java.net.ServerSocket r0 = r10.f9635a
            boolean r6 = r0.isClosed()
            r0 = r6
            if (r0 != 0) goto L67
            r8 = 2
            r9 = 6
            java.net.ServerSocket r0 = r10.f9635a     // Catch: java.io.IOException -> L60
            r9 = 6
            r0.close()     // Catch: java.io.IOException -> L60
            goto L68
        L60:
            r0 = move-exception
            java.lang.String r1 = "Error while closing the server socket"
            r9 = 7
            android.util.Log.e(r2, r1, r0)
        L67:
            r7 = 1
        L68:
            java.lang.Thread r0 = r10.f9639f     // Catch: java.lang.InterruptedException -> L72
            r7 = 3
            r4 = 5000(0x1388, double:2.4703E-320)
            r9 = 6
            r0.join(r4)     // Catch: java.lang.InterruptedException -> L72
            goto L75
        L72:
            android.util.Log.w(r2, r3)
        L75:
            java.lang.Thread r0 = r10.f9639f
            r8 = 5
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L85
            r9 = 7
            java.lang.String r6 = "Server still alive"
            r0 = r6
            android.util.Log.e(r2, r0)
        L85:
            r8 = 3
            r0 = 0
            r8 = 7
            r10.f9639f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.maxcom.http.a.b():void");
    }
}
