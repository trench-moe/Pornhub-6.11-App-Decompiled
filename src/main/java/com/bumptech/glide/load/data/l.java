package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: c  reason: collision with root package name */
    public final Uri f5705c;

    /* renamed from: f  reason: collision with root package name */
    public final ContentResolver f5706f;

    /* renamed from: j  reason: collision with root package name */
    public T f5707j;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f5706f = contentResolver;
        this.f5705c = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t2 = this.f5707j;
        if (t2 != null) {
            try {
                c(t2);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t2);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public DataSource d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(Priority priority, d.a<? super T> aVar) {
        try {
            T f10 = f(this.f5705c, this.f5706f);
            this.f5707j = f10;
            aVar.f(f10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }

    public abstract T f(Uri uri, ContentResolver contentResolver);
}
