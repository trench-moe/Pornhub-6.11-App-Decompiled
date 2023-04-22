package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: c  reason: collision with root package name */
    public final String f5684c;

    /* renamed from: f  reason: collision with root package name */
    public final AssetManager f5685f;

    /* renamed from: j  reason: collision with root package name */
    public T f5686j;

    public b(AssetManager assetManager, String str) {
        this.f5685f = assetManager;
        this.f5684c = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t2 = this.f5686j;
        if (t2 == null) {
            return;
        }
        try {
            c(t2);
        } catch (IOException unused) {
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
    public void e(Priority priority, d.a<? super T> aVar) {
        try {
            T f10 = f(this.f5685f, this.f5684c);
            this.f5686j = f10;
            aVar.f(f10);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.c(e10);
        }
    }

    public abstract T f(AssetManager assetManager, String str);
}
