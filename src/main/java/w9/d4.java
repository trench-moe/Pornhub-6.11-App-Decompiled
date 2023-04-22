package w9;

import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class d4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f17102a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f17103b;

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f17104c;
    public static final AtomicBoolean d;

    /* renamed from: e  reason: collision with root package name */
    public static HashMap f17105e;

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f17106f;

    /* renamed from: g  reason: collision with root package name */
    public static final HashMap f17107g;

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap f17108h;

    /* renamed from: i  reason: collision with root package name */
    public static final HashMap f17109i;

    /* renamed from: j  reason: collision with root package name */
    public static Object f17110j;

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f17111k;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f17103b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f17104c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        d = new AtomicBoolean();
        f17106f = new HashMap();
        f17107g = new HashMap();
        f17108h = new HashMap();
        f17109i = new HashMap();
        f17111k = new String[0];
    }

    public static void a(Object obj, String str, String str2) {
        synchronized (d4.class) {
            if (obj == f17110j) {
                f17105e.put(str, str2);
            }
        }
    }
}
