package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;

/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public interface a {
        void b();

        void c(h5.b bVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, h5.b bVar2);

        void d(h5.b bVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource);
    }

    boolean a();

    void cancel();
}
