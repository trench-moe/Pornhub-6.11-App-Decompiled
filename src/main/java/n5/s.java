package n5;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import n5.m;

/* loaded from: classes2.dex */
public class s<Data> implements m<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final m<Uri, Data> f13367a;

    /* loaded from: classes2.dex */
    public static final class a implements n<String, AssetFileDescriptor> {
        @Override // n5.n
        public m<String, AssetFileDescriptor> a(q qVar) {
            return new s(qVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements n<String, ParcelFileDescriptor> {
        @Override // n5.n
        public m<String, ParcelFileDescriptor> a(q qVar) {
            return new s(qVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes2.dex */
    public static class c implements n<String, InputStream> {
        @Override // n5.n
        public m<String, InputStream> a(q qVar) {
            return new s(qVar.b(Uri.class, InputStream.class));
        }
    }

    public s(m<Uri, Data> mVar) {
        this.f13367a = mVar;
    }

    @Override // n5.m
    public /* bridge */ /* synthetic */ boolean a(String str) {
        return true;
    }

    @Override // n5.m
    public m.a b(String str, int i10, int i11, h5.d dVar) {
        Uri fromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            fromFile = null;
        } else if (str2.charAt(0) == '/') {
            fromFile = Uri.fromFile(new File(str2));
        } else {
            Uri parse = Uri.parse(str2);
            fromFile = parse.getScheme() == null ? Uri.fromFile(new File(str2)) : parse;
        }
        if (fromFile != null) {
            r1 = this.f13367a.a(fromFile) ? this.f13367a.b(fromFile, i10, i11, dVar) : null;
            return r1;
        }
        return r1;
    }
}
