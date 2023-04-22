package x8;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.zzat;
import t9.f2;
import t9.v0;

/* loaded from: classes2.dex */
public final class d extends AsyncTask<Uri, Long, Bitmap> {

    /* renamed from: c  reason: collision with root package name */
    public static final a9.b f18068c = new a9.b("FetchBitmapTask");

    /* renamed from: a  reason: collision with root package name */
    public final g f18069a;

    /* renamed from: b  reason: collision with root package name */
    public final b f18070b;

    public d(Context context, int i10, int i11, boolean z10, b bVar) {
        g gVar;
        this.f18070b = bVar;
        Context applicationContext = context.getApplicationContext();
        c cVar = new c(this);
        a9.b bVar2 = v0.f15359a;
        try {
            gVar = v0.a(applicationContext.getApplicationContext()).o0(new n9.b(this), cVar, i10, i11, false, 2097152L, 5, 333, 10000);
        } catch (RemoteException | zzat e10) {
            v0.f15359a.b(e10, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", f2.class.getSimpleName());
            gVar = null;
        }
        this.f18069a = gVar;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap doInBackground(Uri[] uriArr) {
        g gVar;
        Uri[] uriArr2 = uriArr;
        if (uriArr2.length == 1) {
            Uri uri = uriArr2[0];
            if (uri != null && (gVar = this.f18069a) != null) {
                try {
                    return gVar.F(uri);
                } catch (RemoteException e10) {
                    f18068c.b(e10, "Unable to call %s on %s.", "doFetch", g.class.getSimpleName());
                }
            }
            return null;
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        b bVar = this.f18070b;
        if (bVar != null) {
            bVar.f18065e = true;
            a aVar = bVar.f18066f;
            if (aVar != null) {
                aVar.i(bitmap2);
            }
            bVar.d = null;
        }
    }
}
