package com.bumptech.glide.load.engine;

import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class GlideException extends Exception {

    /* renamed from: c  reason: collision with root package name */
    public static final StackTraceElement[] f5735c = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;
    private Exception exception;
    private h5.b key;

    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: c  reason: collision with root package name */
        public final Appendable f5736c;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5737f = true;

        public a(Appendable appendable) {
            this.f5736c = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c10) {
            if (this.f5737f) {
                this.f5737f = false;
                this.f5736c.append("  ");
            }
            this.f5737f = c10 == '\n';
            this.f5736c.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            boolean z10 = false;
            if (this.f5737f) {
                this.f5737f = false;
                this.f5736c.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
                z10 = true;
            }
            this.f5737f = z10;
            this.f5736c.append(charSequence, i10, i11);
            return this;
        }
    }

    public GlideException(String str) {
        List<Throwable> emptyList = Collections.emptyList();
        this.detailMessage = str;
        setStackTrace(f5735c);
        this.causes = emptyList;
    }

    public GlideException(String str, Throwable th) {
        List<Throwable> singletonList = Collections.singletonList(th);
        this.detailMessage = str;
        setStackTrace(f5735c);
        this.causes = singletonList;
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(f5735c);
        this.causes = list;
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            appendable.append("Cause (").append(String.valueOf(i11)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i10);
            if (th instanceof GlideException) {
                ((GlideException) th).f(appendable);
            } else {
                d(th, appendable);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void a(Throwable th, List<Throwable> list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        for (Throwable th2 : ((GlideException) th).causes) {
            a(th2, list);
        }
    }

    public void e(String str) {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder m10 = a1.a.m("Root cause (");
            int i11 = i10 + 1;
            m10.append(i11);
            m10.append(" of ");
            m10.append(size);
            m10.append(")");
            Log.i(str, m10.toString(), (Throwable) arrayList.get(i10));
            i10 = i11;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.causes, new a(appendable));
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(h5.b bVar, DataSource dataSource) {
        this.key = bVar;
        this.dataSource = dataSource;
        this.dataClass = null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.detailMessage);
        Class<?> cls = this.dataClass;
        String str3 = BuildConfig.FLAVOR;
        if (cls != null) {
            StringBuilder m10 = a1.a.m(", ");
            m10.append(this.dataClass);
            str = m10.toString();
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb2.append(str);
        if (this.dataSource != null) {
            StringBuilder m11 = a1.a.m(", ");
            m11.append(this.dataSource);
            str2 = m11.toString();
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        sb2.append(str2);
        if (this.key != null) {
            StringBuilder m12 = a1.a.m(", ");
            m12.append(this.key);
            str3 = m12.toString();
        }
        sb2.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public void h(h5.b bVar, DataSource dataSource, Class<?> cls) {
        this.key = bVar;
        this.dataSource = dataSource;
        this.dataClass = cls;
    }

    public void i(Exception exc) {
        this.exception = exc;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        f(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }
}
