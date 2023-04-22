package jb;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f11658a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f11659b = Charset.forName("ISO-8859-1");

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f11660c = Charset.forName("UTF-8");
    public static final Charset d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f11661e;

    static {
        Charset.forName("UTF-16BE");
        d = Charset.forName("UTF-16LE");
        f11661e = Charset.forName("UTF-16");
    }
}
