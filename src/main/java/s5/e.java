package s5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import j5.i;
import java.util.List;

/* loaded from: classes2.dex */
public class e implements h5.e<Uri, Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14844a;

    public e(Context context) {
        this.f14844a = context.getApplicationContext();
    }

    @Override // h5.e
    public /* bridge */ /* synthetic */ i<Drawable> a(Uri uri, int i10, int i11, h5.d dVar) {
        return c(uri);
    }

    @Override // h5.e
    public boolean b(Uri uri, h5.d dVar) {
        return uri.getScheme().equals("android.resource");
    }

    public i c(Uri uri) {
        Context context;
        int parseInt;
        String authority = uri.getAuthority();
        if (authority.equals(this.f14844a.getPackageName())) {
            context = this.f14844a;
        } else {
            try {
                context = this.f14844a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e10) {
                if (!authority.contains(this.f14844a.getPackageName())) {
                    throw new IllegalArgumentException(android.support.v4.media.b.i("Failed to obtain context or unrecognized Uri format for: ", uri), e10);
                }
                context = this.f14844a;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            parseInt = context.getResources().getIdentifier(str2, str, authority2);
            if (parseInt == 0) {
                parseInt = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (parseInt == 0) {
                throw new IllegalArgumentException(android.support.v4.media.b.i("Failed to find resource id for: ", uri));
            }
        } else if (pathSegments.size() != 1) {
            throw new IllegalArgumentException(android.support.v4.media.b.i("Unrecognized Uri format: ", uri));
        } else {
            try {
                parseInt = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException(android.support.v4.media.b.i("Unrecognized Uri format: ", uri), e11);
            }
        }
        Drawable a10 = b.a(this.f14844a, context, parseInt, null);
        if (a10 != null) {
            return new d(a10);
        }
        return null;
    }
}
