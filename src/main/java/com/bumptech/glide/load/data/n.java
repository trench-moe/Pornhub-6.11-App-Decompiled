package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import java.io.InputStream;

/* loaded from: classes.dex */
public class n extends l<InputStream> {

    /* renamed from: m  reason: collision with root package name */
    public static final UriMatcher f5708m;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f5708m = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.l
    public void c(InputStream inputStream) {
        inputStream.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.bumptech.glide.load.data.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.InputStream f(android.net.Uri r7, android.content.ContentResolver r8) {
        /*
            r6 = this;
            r3 = r6
            android.content.UriMatcher r0 = com.bumptech.glide.load.data.n.f5708m
            int r5 = r0.match(r7)
            r0 = r5
            r5 = 1
            r1 = r5
            if (r0 == r1) goto L24
            r5 = 5
            r5 = 3
            r2 = r5
            if (r0 == r2) goto L1d
            r5 = 2
            r2 = 5
            r5 = 6
            if (r0 == r2) goto L24
            r5 = 3
            java.io.InputStream r5 = r8.openInputStream(r7)
            r8 = r5
            goto L30
        L1d:
            r5 = 4
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r8, r7, r1)
            r8 = r5
            goto L30
        L24:
            r5 = 5
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.lookupContact(r8, r7)
            if (r0 == 0) goto L42
            r5 = 3
            java.io.InputStream r8 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r8, r0, r1)
        L30:
            if (r8 == 0) goto L34
            r5 = 3
            return r8
        L34:
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException
            r5 = 5
            java.lang.String r5 = "InputStream is null for "
            r0 = r5
            java.lang.String r7 = android.support.v4.media.b.i(r0, r7)
            r8.<init>(r7)
            throw r8
        L42:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.String r5 = "Contact cannot be found"
            r8 = r5
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.n.f(android.net.Uri, android.content.ContentResolver):java.lang.Object");
    }
}
