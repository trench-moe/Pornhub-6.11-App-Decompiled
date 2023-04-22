package x0;

import android.view.Choreographer;
import java.util.ArrayList;
import p.g;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadLocal<a> f17628g = new ThreadLocal<>();
    public c d;

    /* renamed from: a  reason: collision with root package name */
    public final g<b, Long> f17629a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f17630b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final C0290a f17631c = new C0290a();

    /* renamed from: e  reason: collision with root package name */
    public long f17632e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17633f = false;

    /* renamed from: x0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0290a {
        public C0290a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a() {
            /*
                r15 = this;
                r11 = r15
                x0.a r0 = x0.a.this
                java.lang.String r13 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                long r1 = android.os.SystemClock.uptimeMillis()
                r0.f17632e = r1
                x0.a r0 = x0.a.this
                r13 = 5
                long r1 = r0.f17632e
                long r3 = android.os.SystemClock.uptimeMillis()
                r13 = 0
                r5 = r13
                r6 = 0
            L17:
                java.util.ArrayList<x0.a$b> r7 = r0.f17630b
                r14 = 2
                int r7 = r7.size()
                if (r6 >= r7) goto L5c
                r13 = 3
                java.util.ArrayList<x0.a$b> r7 = r0.f17630b
                java.lang.Object r13 = r7.get(r6)
                r7 = r13
                x0.a$b r7 = (x0.a.b) r7
                r13 = 1
                if (r7 != 0) goto L2f
                r13 = 4
                goto L58
            L2f:
                r13 = 4
                p.g<x0.a$b, java.lang.Long> r8 = r0.f17629a
                r13 = 7
                r9 = 0
                java.lang.Object r8 = r8.getOrDefault(r7, r9)
                java.lang.Long r8 = (java.lang.Long) r8
                r13 = 1
                if (r8 != 0) goto L3f
                r13 = 5
                goto L4e
            L3f:
                long r8 = r8.longValue()
                int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r10 >= 0) goto L50
                r13 = 3
                p.g<x0.a$b, java.lang.Long> r8 = r0.f17629a
                r14 = 3
                r8.remove(r7)
            L4e:
                r8 = 1
                goto L52
            L50:
                r8 = 0
                r14 = 1
            L52:
                if (r8 == 0) goto L57
                r7.a(r1)
            L57:
                r13 = 3
            L58:
                int r6 = r6 + 1
                r14 = 5
                goto L17
            L5c:
                boolean r1 = r0.f17633f
                if (r1 == 0) goto L80
                java.util.ArrayList<x0.a$b> r1 = r0.f17630b
                r14 = 5
                int r14 = r1.size()
                r1 = r14
            L68:
                r13 = 5
            L69:
                int r1 = r1 + (-1)
                r14 = 6
                if (r1 < 0) goto L7e
                java.util.ArrayList<x0.a$b> r2 = r0.f17630b
                r14 = 7
                java.lang.Object r13 = r2.get(r1)
                r2 = r13
                if (r2 != 0) goto L68
                java.util.ArrayList<x0.a$b> r2 = r0.f17630b
                r2.remove(r1)
                goto L69
            L7e:
                r0.f17633f = r5
            L80:
                r13 = 4
                x0.a r0 = x0.a.this
                r14 = 3
                java.util.ArrayList<x0.a$b> r0 = r0.f17630b
                int r14 = r0.size()
                r0 = r14
                if (r0 <= 0) goto Lae
                x0.a r0 = x0.a.this
                x0.a$c r1 = r0.d
                if (r1 != 0) goto L9f
                r14 = 6
                x0.a$d r1 = new x0.a$d
                r14 = 3
                x0.a$a r2 = r0.f17631c
                r13 = 4
                r1.<init>(r2)
                r0.d = r1
            L9f:
                r13 = 4
                x0.a$c r0 = r0.d
                r14 = 5
                x0.a$d r0 = (x0.a.d) r0
                r14 = 3
                android.view.Choreographer r1 = r0.f17636b
                android.view.Choreographer$FrameCallback r0 = r0.f17637c
                r13 = 5
                r1.postFrameCallback(r0)
            Lae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x0.a.C0290a.a():void");
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        boolean a(long j10);
    }

    /* loaded from: classes2.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final C0290a f17635a;

        public c(C0290a c0290a) {
            this.f17635a = c0290a;
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final Choreographer f17636b;

        /* renamed from: c  reason: collision with root package name */
        public final Choreographer.FrameCallback f17637c;

        /* renamed from: x0.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class Choreographer$FrameCallbackC0291a implements Choreographer.FrameCallback {
            public Choreographer$FrameCallbackC0291a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                d.this.f17635a.a();
            }
        }

        public d(C0290a c0290a) {
            super(c0290a);
            this.f17636b = Choreographer.getInstance();
            this.f17637c = new Choreographer$FrameCallbackC0291a();
        }
    }

    public static a a() {
        ThreadLocal<a> threadLocal = f17628g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }
}
