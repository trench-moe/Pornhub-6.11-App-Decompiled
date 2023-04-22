package p8;

import android.content.Context;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzfa;
import com.google.android.gms.internal.gtm.zzfs;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f13826a;

    /* renamed from: b  reason: collision with root package name */
    public final i f13827b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f13828c;
    public o3.d d;

    /* renamed from: e  reason: collision with root package name */
    public c f13829e;

    public b(i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        Objects.requireNonNull(context, "context cannot be null");
        this.f13826a = uncaughtExceptionHandler;
        this.f13827b = iVar;
        this.d = new o3.d(context, new ArrayList());
        this.f13828c = context.getApplicationContext();
        String name = uncaughtExceptionHandler == null ? "null" : uncaughtExceptionHandler.getClass().getName();
        zzfa.zzd(name.length() != 0 ? "ExceptionReporter created, original handler is ".concat(name) : new String("ExceptionReporter created, original handler is "));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        String str;
        int length;
        if (this.d != null) {
            StackTraceElement stackTraceElement = null;
            String name = thread != null ? thread.getName() : null;
            o3.d dVar = this.d;
            Objects.requireNonNull(dVar);
            Throwable th2 = th;
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
            Throwable th3 = th;
            while (th3.getCause() != null) {
                th3 = th3.getCause();
            }
            StackTraceElement[] stackTrace = th3.getStackTrace();
            if (stackTrace != null && (r7 = stackTrace.length) != 0) {
                loop2: for (StackTraceElement stackTraceElement2 : stackTrace) {
                    String className = stackTraceElement2.getClassName();
                    Iterator it = ((TreeSet) dVar.f13543c).iterator();
                    while (it.hasNext()) {
                        if (className.startsWith((String) it.next())) {
                            stackTraceElement = stackTraceElement2;
                            break loop2;
                        }
                    }
                }
                stackTraceElement = stackTrace[0];
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(th2.getClass().getSimpleName());
            if (stackTraceElement != null) {
                String[] split = stackTraceElement.getClassName().split("\\.");
                sb2.append(String.format(" (@%s:%s:%s)", (split == null || (length = split.length) <= 0) ? "unknown" : split[length - 1], stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())));
            }
            if (name != null) {
                sb2.append(String.format(" {%s}", name));
            }
            str = sb2.toString();
        } else {
            str = "UncaughtException";
        }
        String valueOf = String.valueOf(str);
        zzfa.zzd(valueOf.length() != 0 ? "Reporting uncaught exception: ".concat(valueOf) : new String("Reporting uncaught exception: "));
        i iVar = this.f13827b;
        e eVar = new e();
        eVar.f13835a.put("&exd", str);
        eVar.f13835a.put("&exf", zzfs.zzc(true));
        iVar.c(eVar.a());
        if (this.f13829e == null) {
            this.f13829e = zzbv.zzg(this.f13828c).zzc();
        }
        c cVar = this.f13829e;
        cVar.d.zzf().zzc();
        cVar.d.zzf().zzn();
        if (this.f13826a != null) {
            zzfa.zzd("Passing exception to the original handler");
            this.f13826a.uncaughtException(thread, th);
        }
    }
}
