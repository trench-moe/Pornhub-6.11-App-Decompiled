package n5;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import n5.m;

/* loaded from: classes2.dex */
public class r<Data> implements m<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final m<Uri, Data> f13361a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f13362b;

    /* loaded from: classes2.dex */
    public static final class a implements n<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f13363a;

        public a(Resources resources) {
            this.f13363a = resources;
        }

        @Override // n5.n
        public m<Integer, AssetFileDescriptor> a(q qVar) {
            return new r(this.f13363a, qVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements n<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f13364a;

        public b(Resources resources) {
            this.f13364a = resources;
        }

        @Override // n5.n
        public m<Integer, ParcelFileDescriptor> a(q qVar) {
            return new r(this.f13364a, qVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements n<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f13365a;

        public c(Resources resources) {
            this.f13365a = resources;
        }

        @Override // n5.n
        public m<Integer, InputStream> a(q qVar) {
            return new r(this.f13365a, qVar.b(Uri.class, InputStream.class));
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements n<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f13366a;

        public d(Resources resources) {
            this.f13366a = resources;
        }

        @Override // n5.n
        public m<Integer, Uri> a(q qVar) {
            return new r(this.f13366a, t.f13368a);
        }
    }

    public r(Resources resources, m<Uri, Data> mVar) {
        this.f13362b = resources;
        this.f13361a = mVar;
    }

    @Override // n5.m
    public /* bridge */ /* synthetic */ boolean a(Integer num) {
        return true;
    }

    @Override // n5.m
    public m.a b(Integer num, int i10, int i11, h5.d dVar) {
        Uri uri;
        Integer num2 = num;
        try {
            uri = Uri.parse("android.resource://" + this.f13362b.getResourcePackageName(num2.intValue()) + '/' + this.f13362b.getResourceTypeName(num2.intValue()) + '/' + this.f13362b.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e10);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f13361a.b(uri, i10, i11, dVar);
    }
}
