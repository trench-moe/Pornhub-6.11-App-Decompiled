package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import com.app.pornhub.R;
import java.util.HashSet;
import java.util.Objects;
import q1.a;
import q1.b;

/* loaded from: classes.dex */
public final class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            a b10 = a.b(context);
            Objects.requireNonNull(b10);
            try {
                try {
                    Trace.beginSection("Startup");
                    Bundle bundle = b10.f14174c.getPackageManager().getProviderInfo(new ComponentName(b10.f14174c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                    String string = b10.f14174c.getString(R.string.androidx_startup);
                    if (bundle != null) {
                        HashSet hashSet = new HashSet();
                        loop0: while (true) {
                            for (String str : bundle.keySet()) {
                                if (string.equals(bundle.getString(str, null))) {
                                    Class<?> cls = Class.forName(str);
                                    if (b.class.isAssignableFrom(cls)) {
                                        b10.f14173b.add(cls);
                                        b10.a(cls, hashSet);
                                    }
                                }
                            }
                            break loop0;
                        }
                    }
                    return true;
                } catch (PackageManager.NameNotFoundException | ClassNotFoundException e10) {
                    throw new StartupException(e10);
                }
            } finally {
                Trace.endSection();
            }
        }
        throw new StartupException("Context cannot be null");
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
