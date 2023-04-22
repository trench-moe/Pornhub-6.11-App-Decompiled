package com.mixpanel.android.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Base64;
import android.util.LruCache;
import cb.e;
import cd.c;
import ed.d;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class ImageStore {

    /* renamed from: e  reason: collision with root package name */
    public static LruCache<String, Bitmap> f8325e;

    /* renamed from: a  reason: collision with root package name */
    public final File f8326a;

    /* renamed from: b  reason: collision with root package name */
    public final RemoteService f8327b;

    /* renamed from: c  reason: collision with root package name */
    public final MessageDigest f8328c;
    public final c d;

    /* loaded from: classes.dex */
    public static class CantGetImageException extends Exception {
        public CantGetImageException(String str) {
            super(str);
        }

        public CantGetImageException(String str, Throwable th) {
            super(str, th);
        }
    }

    public ImageStore(Context context, String str) {
        MessageDigest messageDigest;
        String l10 = a1.a.l("MixpanelAPI.Images.", str);
        a aVar = new a();
        this.f8326a = context.getDir(l10, 0);
        this.f8327b = aVar;
        this.d = c.b(context);
        try {
            messageDigest = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException unused) {
            e.j0("MixpanelAPI.ImageStore", "Images won't be stored because this platform doesn't supply a SHA1 hash function");
            messageDigest = null;
        }
        this.f8328c = messageDigest;
        if (f8325e == null) {
            synchronized (ImageStore.class) {
                if (f8325e == null) {
                    f8325e = new d(this, ((int) (Runtime.getRuntime().maxMemory() / 1024)) / this.d.f4050u);
                }
            }
        }
    }

    public static Bitmap a(String str) {
        Bitmap bitmap;
        synchronized (f8325e) {
            bitmap = f8325e.get(str);
        }
        return bitmap;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public android.graphics.Bitmap b(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.util.ImageStore.b(java.lang.String):android.graphics.Bitmap");
    }

    public final File c(String str) {
        MessageDigest messageDigest = this.f8328c;
        if (messageDigest == null) {
            return null;
        }
        byte[] digest = messageDigest.digest(str.getBytes());
        StringBuilder m10 = a1.a.m("MP_IMG_");
        m10.append(Base64.encodeToString(digest, 10));
        return new File(this.f8326a, m10.toString());
    }
}
