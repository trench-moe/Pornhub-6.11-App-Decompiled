package e0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import d0.d;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class k {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<Long, d.b> f8990a = new ConcurrentHashMap<>();

    public Typeface a(Context context, d.b bVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, j0.l[] lVarArr, int i10) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File c10 = l.c(context);
        if (c10 == null) {
            return null;
        }
        try {
            if (l.b(c10, inputStream)) {
                return Typeface.createFromFile(c10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            c10.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File c10 = l.c(context);
        if (c10 == null) {
            return null;
        }
        try {
            if (l.a(c10, resources, i10)) {
                return Typeface.createFromFile(c10.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            c10.delete();
        }
    }

    public j0.l e(j0.l[] lVarArr, int i10) {
        int i11;
        int i12 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        j0.l lVar = null;
        int i13 = IntCompanionObject.MAX_VALUE;
        for (j0.l lVar2 : lVarArr) {
            int abs = (Math.abs(lVar2.f11123c - i12) * 2) + (lVar2.d == z10 ? 0 : 1);
            i11 = (lVar != null && i13 <= abs) ? i11 + 1 : 0;
            lVar = lVar2;
            i13 = abs;
        }
        return lVar;
    }
}
