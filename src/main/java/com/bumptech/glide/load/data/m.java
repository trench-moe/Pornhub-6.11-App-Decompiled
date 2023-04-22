package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.InputStream;

/* loaded from: classes.dex */
public class m extends b<InputStream> {
    public m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.b
    public void c(InputStream inputStream) {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.b
    public InputStream f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
